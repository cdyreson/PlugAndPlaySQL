/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.tree;

import guardedsql.database.DB;
import guardedsql.database.ForeignKey;
import guardedsql.datapull.SQLPull;
import guardedsql.grammar.MyListener;
import guardedsql.joingraph.Graph;
import guardedsql.joingraph.Path;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * This class represents a pattern tree. A pattern tree is constructed when a
 * JSON patter is parsed. The tree consists of different kinds of nodes: array,
 * object, and key/value pair.
 *
 * @author Curtis Dyreson & Shubham Swami
 */
public class PatternTree {

    private List<PatternTree> children;
    private final String label;
    private String value;
    private String table;
    private Set<String> tables;
    private final PatternTree parent;
    private static DB db;
    private String remainingQuery;
    private static String[] generatedQueries;
    private boolean verbose = true;
    boolean isRoot = false;
    
    public PatternTree(DB db) {
        label = "root";
        value = null;
        parent = null;
        PatternTree.db = db;
        table = null;
        tables = new HashSet<String>();
        children = new ArrayList();
        isRoot = true;
    }

    public PatternTree(DB db, PatternTree p, String s) {
        label = s;
        value = null;
        parent = p;
        PatternTree.db = db;
        table = null;
        tables = new HashSet<String>();
        children = new ArrayList();
    }
    
    public PatternTree(DB db, PatternTree p, String s, String t) {
        label = s;
        value = null;
        parent = p;
        PatternTree.db = db;
        table = t;
        tables = new HashSet<String>();
        tables.add(t);
        children = new ArrayList();
    }

    public static String[] getGeneratedQueries() {
        return generatedQueries;
    }

    public void setRemainingQuery(String remainingQuery) {
        this.remainingQuery = remainingQuery;
    }

    private void setValue(String s) {
        value = s;
    }

    private boolean hasChildren() {
        return !children.isEmpty();
    }

    private boolean hasChildren(PatternTree patternTree) {
        return !patternTree.children.isEmpty();
    }

    private boolean isNotRoot() {
        return parent != null;
    }

    private boolean isNotRoot(PatternTree tree) {
        return !tree.label.equals("root");
    }

    public void addChild(PatternTree t) {
        if (children == null) {
            children = new ArrayList<>(3);
        }
        children.add(t);
    }

    private PatternTree getRoot() {
        PatternTree rootNode = children.get(0);
        while (isNotRoot(rootNode)) {
            rootNode = rootNode.parent;
        }
        return rootNode;
    }

    public String getLabel() {
        return label;
    }
    
    private List<String> listTables() {
        PatternTree root = getRoot();
        HashSet<String> tables = new HashSet<>();
        listOfTablesInTree(root, tables);
        return new ArrayList<>(tables);
    }

    private void listOfTablesInTree(PatternTree tree, HashSet<String> result) {
        if (isNotRoot()) {
            if (table != null) {
                result.add(table);
            }
        }
        if (hasChildren()) {
            for (PatternTree child : tree.children) {
                child.listOfTablesInTree(child, result);
            }
        }
    }

    private List<String> listColumns() {
        List<String> columns = new ArrayList<>();
        PatternTree root = getRoot();
        listOfColumnsInTree(root, columns);
        return new ArrayList<>(columns);
    }

    private void listOfColumnsInTree(PatternTree tree, List<String> result) {
        if (isNotRoot()) {
            if (table != null) {
                result.add(table + ".\"" + value + "\"");
            }
        }
        if (hasChildren()) {
            for (PatternTree child : tree.children) {
                child.listOfColumnsInTree(child, result);
            }
        }
    }

    public void buildPotentialLabels(String s) {
        setValue(s);
        // Fill in the table only if it is not already specified
        if (table == null) {
            Set<String> temp = db.stringLookup(s);
            this.tables = new HashSet();
            // Prune empty tables
            for (String key : temp) {
                if (!db.tableIsEmpty(key)) {
                    this.tables.add(key);
                }
            }
            //this.tables = db.stringLookup(s);
            if (verbose) {
                System.out.println("PatternTree: labels " + s + " " + this.tables.size() + " " + this.tables);
            }
            // Probably don't need the following
            if (this.tables != null) {
                for (String tab : this.tables) {
                    this.table = tab;
                }
            }
        }
    }
    
   public List<TreePath> figureTreePaths(Graph joinGraph) throws IOException, SQLException {
       List<TreePath> results = computeTreePaths(joinGraph, null);

       int min = 1000000;
       for (TreePath result : results) {
           if (result.fks.size() < min) {
               min = result.fks.size();
           }
       }
       List<TreePath> pruned = new ArrayList();
       for (TreePath result : results) {
           if (result.fks.size() == min) {
               pruned.add(result);
           }
       }
       if (pruned.size() > 0) {        
           System.out.println("PatternTree: figured this many paths " + results.size());
           System.out.println("Pruning " + min + " " + results.size() + " " + pruned.size());
           for (TreePath keys : pruned) {
               System.out.println("----");
               for (int i = 0; i < keys.tables.size(); i++) {
                   System.out.println(keys.tables.get(i) + "." + keys.columns.get(i));
               }
               System.out.println("Path completeness is " + keys.computeCompleteness());
               for (ForeignKey key : keys.fks) {
                   System.out.print(" ");
                   System.out.print(key.getId() + " ");
                   System.out.print(key.getFromCompleteness() + " ");
                   System.out.print(key.getToCompleteness() + " ");
                   System.out.println(key.generateJoinCondition() + " ");
                   // System.out.print(key.getToTable() + " ");
               }
               System.out.println("+++");
           }
       }

       generateQueries(pruned);
       return pruned;
   }

    public List<TreePath> computeTreePaths(Graph joinGraph, String parentTable) throws IOException, SQLException {
        List<TreePath> allResults = new ArrayList();
        System.out.println("LABEL IS " + label + " " + isRoot + " " + parentTable);
        if (isRoot) {
            if (verbose) System.out.println("PatternTree: computing tree path for root ");
            // Root has a single child go to it
            PatternTree child = children.get(0);
            allResults = child.computeTreePaths(joinGraph, null);
            /*
            if (child.tables != null) {
                for (String table : child.tables) {
                    System.out.println("root is " + table + "." + label);
                    List<TreePath> results = child.computeTreePaths(joinGraph, table);
                    allResults.addAll(results);
                }
            }
            */
        /* }  else if (parentTable == null) {
            // This is the top child in the pattern
            for (String myTable : tables) {
                System.out.println("self is " + myTable + "." + label + " " + children.size());
                for (PatternTree child : children) {
                    List<TreePath> results = child.computeTreePaths(joinGraph, myTable);
                    for (TreePath treePath : results) {
                        treePath.addTable(myTable, label);
                    }
                    allResults.addAll(results);
                }
            }
        */
        } else {
            // System.out.println(" HERE " + label + " " + this.tables );
            if (this.tables != null) {
                for (String myTable : this.tables) {
                    // if (verbose) System.out.println("PatternTree: computing tree path for " + parentTable + " to " + myTable);
                    List<Path> paths = null;
                    // Only extend if a different table
                    if (parentTable != null && !myTable.equals(parentTable)) {
                        paths = joinGraph.getPaths(parentTable, myTable);
                        // if (verbose) System.out.println("Found paths " + paths);
                    } else {
                        paths = new ArrayList();
                    }
                    // Only continue if we have paths
                    if (paths != null) {
                        if (children.isEmpty()) {
                            // This is a leaf, add to results
                            List<TreePath> results = new ArrayList();
                            if (myTable.equals(parentTable)) {
                                results.add(new TreePath(myTable, this.label, new HashSet(), new Path()));
                            } else {
                                for (Path path : paths) {
                                    results.add(new TreePath(myTable, this.label, path.getAllFKs(), path));
                                }
                            }

                            allResults.addAll(results);
                        } else {
                            // Build up the union of all of the children
                            System.out.println(" UNIONON THE CHILDREN " + 
                                    children.size() + " " + label + " myTable " + myTable);
                            List<TreePath> newResults = new ArrayList();
                            boolean isFirstChild = true;
                            for (PatternTree child : children) {
                                if (verbose) {
                                    System.out.println("Child tables are " + child.tables);
                                }
                                // Get all of the children sets of foreign keys
                                // System.out.println(" Children of " + myTable + ' ' + child.getLabel());
                                List<TreePath> childResults = child.computeTreePaths(joinGraph, myTable);
                                if (isFirstChild) {
                                    // System.out.println(" First child ");
                                    newResults = childResults;
                                    isFirstChild = false;
                                } else {
                                    // Union this child with the next child
                                    System.out.println("Doing union " + newResults.size() + " " + childResults.size());
                                    List<TreePath> tempResults = new ArrayList();
                                    for (TreePath newResult : newResults) {
                                        for (TreePath childResult : childResults) {
                                            System.out.println(" got one ");
                                            Set<ForeignKey> newFKs = new HashSet();
                                            newFKs.addAll(newResult.fks);
                                            newFKs.addAll(childResult.fks);
                                            List<String> newTables = new ArrayList();
                                            List<String> newColumns = new ArrayList();
                                            newTables.addAll(newResult.tables);
                                            newTables.addAll(childResult.tables);
                                            newColumns.addAll(newResult.columns);
                                            newColumns.addAll(childResult.columns);
                                            System.out.println(" Tables are " + newTables);
                                            System.out.println(" Columns are " + newColumns );
                                            Set<Path> newPaths = new HashSet();
                                            newPaths.addAll(newResult.paths);
                                            newPaths.addAll(childResult.paths);
                                            tempResults.add(new TreePath(newTables, newColumns, newFKs, newPaths));
                                        }
                                    }
                                    newResults = tempResults;
                                }
                            }
                            System.out.println(" new results size is " + newResults.size());
                            for (TreePath newResult : newResults) {
                                newResult.addTable(myTable, label);
                                if (myTable.equals(parentTable)) {
                                    // No new path to extend
                                    System.out.println(" NO NEW TABLE " + myTable);
                                } else {
                                    System.out.println(" NEW TABLE " + myTable + paths.size());
                                    for (Path path : paths) {
                                        newResult.fks.addAll(path.getAllFKs());
                                    }
                                }
                            }
                            allResults.addAll(newResults);
                        }  
                    }
                }
            }           
        }
        if (verbose) System.out.println("PatternTree: result size is " + allResults.size());
        return allResults;
        }

    public List<Set<ForeignKey>> computeTreePaths3(Graph joinGraph, String parentTable) throws IOException, SQLException {
        // Set<ForeignKey> result = new HashSet();
        List<Set<ForeignKey>> allResults = new ArrayList();
        if (isRoot) {
            if (verbose) System.out.println("PatternTree: computing tree path for root ");
            // Root has a single child go to it
            PatternTree child = children.get(0);
            if (child.tables != null) {
                for (String table : child.tables) {
                    List<Set<ForeignKey>> results = child.computeTreePaths3(joinGraph, table);
                    allResults.addAll(results);
                }
            }
        } else {
            if (this.tables != null) {
                for (String childTable : this.tables) {
                    if (verbose) System.out.println("PatternTree: computing tree path for " + parentTable + " to " + childTable);
                    List<Path> paths = null;
                    // Only extend if a different table
                    if (!childTable.equals(parentTable)) {
                        paths = joinGraph.getPaths(parentTable, childTable);
                        if (verbose) System.out.println("Found paths " + paths);
                    } else {
                        paths = new ArrayList();
                    }
                    // Only continue if we have paths
                    if (paths != null) {
                        if (children.isEmpty()) {
                            // This is a leaf, add to results
                            List<Set<ForeignKey>> results = new ArrayList();
                            for (Path path : paths) {
                                results.add(path.getAllFKs());
                            }
                            allResults.addAll(results);
                        } else {
                            for (PatternTree child : children) {
                                if (verbose) {
                                    System.out.println("Child tables are " + child.tables);
                                }
                                // Get all of the children sets of foreign keys
                                // List<Set<ForeignKey>> results = child.computeTreePaths(joinGraph, );
                                List<Set<ForeignKey>> childResults = child.computeTreePaths3(joinGraph, childTable);

                                List<Set<ForeignKey>> newResults = new ArrayList();
                                for (Set<ForeignKey> result : childResults) {
                                    Set<ForeignKey> newResult = new HashSet();
                                    newResult.addAll(result);
                                    if (childTable.equals(parentTable)) {
                                        // No new path to extend
                                    } else {
                                        for (Path path : paths) {
                                            newResult.addAll(path.getAllFKs());
                                        }
                                    }

                                    newResults.add(newResult);
                                }
                                allResults.addAll(newResults);
                            }
                        }  
                    }
                }
            }           
        }
        if (verbose) System.out.println("PatternTree: result size is " + allResults.size());
        return allResults;
        /*
            // Next, navigate between children
            if (children.size() > 1) {
                PatternTree previousChild = null;
                for (PatternTree child : children) {
                    if (previousChild != null) {
                        if (child.table != null) {
                            if (!child.table.equals(previousChild.table)) {
                                // Needs to be a different child
                                List<Path> paths = joinGraph.getPaths(previousChild.table, child.table);
                                System.out.println("Found sibling paths " + paths);
                                if (paths != null) {
                                    result.addAll(paths.get(0).getFKs());
                                }
                                previousChild = child;
                            }
                        }
                    } else {
                        previousChild = child;
                    }
                }
            }
        */
        }

    public void computeTreePaths2(Graph joinGraph) throws IOException, SQLException {
        if (verbose) {
            System.out.println("PatternTree: Computing tree paths ");
        }
        SQLPull sqlPull = new SQLPull();
        HashMap<Integer, Set<ForeignKey>> allPaths = new HashMap<>();
        HashMap<String, Integer> queryAndNumberRows = new HashMap<>();
        boolean containsDuplicates = containsDuplicate();
        List<ForeignKey> fks = db.getForeignKeys();
        if (fks.isEmpty() || fks == null) {
            fks = db.buildFKs();
        }
        
        if (verbose) {
            System.out.println("PatternTree: number of fks " + fks.size());
        }

        if (hasChildren()) {
            PatternTree rootNode = getRoot();
            allPaths = savePaths(joinGraph, rootNode, allPaths);
            if (verbose) {
                System.out.println("PatternTree: haschildren " + rootNode.children.size() + " allPaths " + allPaths.size());
            }
            if (rootNode.children.size() == 1 || allPaths.isEmpty()) {
                String query = sqlPull.generateRowsEstimation(new HashSet<>(), listColumns().toString(), listTables());
                if (verbose) {
                    System.out.println("PatternTree: query " + query);
                }
                if (containsDuplicates) {
                    String colJoin = "";
                    boolean flag = true;
                    String duplicateTableJoin = getDuplicateTableJoin();
                    String table = Objects.requireNonNull(duplicateTableJoin).split("\\.")[0];
                    List<String> list = new ArrayList<>(listColumns());
                    Set<ForeignKey> set = new HashSet<>();
                    if (verbose) {
                        System.out.println("PatternTree: has duplicates " + fks.size());
                    }
                    for (ForeignKey fk : fks) {
                        if (fk.getFromTable().equals(table)) {
                            if (flag) {
                                flag = false;
                                colJoin = db.getPrimaryKey(fk.getToTable());
                                set.add(fk);
                                if (fk.generateJoinCondition().split(" = ")[0].split("\\.")[0].equals(fk.getToTable()))
                                    list.add(fk.generateJoinCondition().split(" = ")[0].split("\\.")[0] + ".\"" + colJoin + "\"");
                                else
                                    list.add(fk.generateJoinCondition().split(" = ")[1].split("\\.")[0] + ".\"" + colJoin + "\"");
                            }
                        }
                    }
                    if (fks.size() == 0 || colJoin.equals(""))
                        colJoin = nonDuplicateColumn();

                    String tempQuery = sqlPull.generateQuery(set, new HashSet<>(list).toString(), listTables());
                    query = sqlPull.changeQueryToAddSecondTable(tempQuery, listColumns(), colJoin);
                    queryAndNumberRows.put(query + "!!!" + listColumns().get(0), getRowsNumberFromOutput("EXPLAIN " + query));
                } else {
                    queryAndNumberRows.put(query.split("EXPLAIN ")[1] + "!!!" + listTables().get(0),
                            getRowsNumberFromOutput(query));
                }
            }
        }

        if (verbose) {
            System.out.println("PatternTree: allpaths " + allPaths.size());
        }
        String queryOrderBy = "";
        boolean flag = true;
        for (Integer i : allPaths.keySet()) {
            Set<ForeignKey> set = new HashSet<>(allPaths.get(i));
            String addPath = sqlPull.createAddPaths(new ArrayList<>(allPaths.get(i)));
            String query = sqlPull.generateRowsEstimation(set, listColumns().toString(), listTables());
            if (containsDuplicates) {
                String colJoin = null;
                String duplicateTableJoin = getDuplicateTableJoin();
                String table = Objects.requireNonNull(duplicateTableJoin).split("\\.")[0];
                List<String> tempCol = listColumns();
                boolean flagDuplicate = true;
                for (ForeignKey fk : fks) {
                    if (fk.getFromTable().equals(table)) {
                        if (fk.getToTable().equals(table)) {
                            String firstCol = fk.generateJoinCondition().split(" = ")[0].replaceAll(" ", "");
                            String secondCol = fk.generateJoinCondition().split(" = ")[1].replaceAll(" ", "");
                            tempCol.add(firstCol);
                            tempCol.add(secondCol);
                            Set<String> strings = new HashSet<>(listColumns());
                            flagDuplicate = false;
                            if (strings.add(firstCol))
                                colJoin = firstCol.split("\\.")[1].replaceAll("\"", "");
                            else colJoin = secondCol.split("\\.")[1].replaceAll("\"", "");
                        }
                    }
                }
                if (flagDuplicate) {
                    for (ForeignKey fk : fks) {
                        if (fk.getFromTable().equals(table)) {
                            set.add(fk);
                            String firstCol = fk.generateJoinCondition().split(" = ")[0].replaceAll(" ", "");
                            String secondCol = fk.generateJoinCondition().split(" = ")[1].replaceAll(" ", "");
                            Set<String> strings = new HashSet<>();
                            for (String s : listColumns()) {
                                strings.add(s.split("\\.")[1]);
                            }
                            if (strings.add(firstCol.split("\\.")[1]))
                                tempCol.add(firstCol);
                            if (strings.add(secondCol.split("\\.")[1]))
                                tempCol.add(secondCol);
                            Set<String> strings1 = new HashSet<>(listColumns());
                            if (strings1.add(firstCol))
                                colJoin = firstCol.split("\\.")[1].replaceAll("\"", "");
                            else colJoin = secondCol.split("\\.")[1].replaceAll("\"", "");
                        }
                    }
                }
                if (colJoin == null) {
                    colJoin = nonDuplicateColumn();
                }
                String tempQuery = sqlPull.generateQuery(set, new HashSet<>(tempCol).toString(), listTables());
                query = sqlPull.changeQueryToAddSecondTable(tempQuery, listColumns(), colJoin);
                queryAndNumberRows.put(query + "!!!" + addPath, getRowsNumberFromOutput("EXPLAIN " + query));
            } else {
                if (flag) {
                    queryOrderBy = query.split("EXPLAIN ")[1].split("ORDER BY")[1];
                    flag = false;
                }
                queryAndNumberRows.put(query.split("EXPLAIN ")[1] + "!!!" + addPath,
                        getRowsNumberFromOutput(query));
            }
        }
        HashMap<String, Integer> temp = sortByValue(queryAndNumberRows);
        String queryList = sqlPull.writeToFile(queryOrderBy, temp, allPaths);
        showqueries(queryList);
    }

    public void generateQueries(List<TreePath> paths) {
        generatedQueries = new String[paths.size()];
        for (int i = 0; i < paths.size(); i++) {
            TreePath path = paths.get(i);
            generatedQueries[i] = generateQuery(path);
        }
    }
    
    public String generateQuery(TreePath path) {
        String query = "";
        if (MyListener.hasAggregate) {
            query += "SELECT " + path.getFormattedColumns();
            for (String key : MyListener.aggregateMap.keySet()) {
                query += ", " + MyListener.aggregateMap.get(key) + " AS " + key;
            }
            query += "\nFROM " + path.getFormattedPaths(); 
            String s = MyListener.whereClauseText;
            for (String r : MyListener.aggregateComparisonSet) {
                // Replace the aggregate in the WHERE clause
                s = s.replace(r, "true");
            } 
            query += s;
            query += "\nGROUP BY " + path.getFormattedColumns();
        } else {
            query += "SELECT " + path.getFormattedColumns()
                    + "\nFROM " + path.getFormattedPaths();
        }
        return query; 
    }
    
    public void showqueries(String str) {
        String[] queries = str.split("!!!");
        String[] pathQueries = new String[(queries.length - 1) / 3 + 1];
        int j = 0;
        for (int i = 0; i < queries.length - 1; i++) {
            if (i % 3 == 0)
                pathQueries[j++] = queries[i];
        }
        StringBuilder result = new StringBuilder();
        for (String pathQuery : pathQueries) {
            if (pathQuery != null) {
                int index = pathQuery.lastIndexOf("ORDER BY");
                if (result.toString().equals("") && index >= 0) {
                    result.append(pathQuery, 0, index);
                } else result.append(" UNION \n").append(pathQuery, 0, index);
            }
        }
        result.append(queries[queries.length - 1]);
        String fromClause = result.toString();
        String[] multipleQueries = fromClause.split("UNION");
        for (int i = 0; i < multipleQueries.length; i++) {
            String alias = "generatedFromClause" + i;
            multipleQueries[i] = "FROM ( " + multipleQueries[i] + " ) AS " + alias;
            String[] splitArray = remainingQuery.split("WHERE");
            multipleQueries[i] = splitArray[0] + " " + multipleQueries[i] + " WHERE " + splitArray[1];
        }
        generatedQueries = new String[multipleQueries.length];
        generatedQueries = multipleQueries.clone();
    }

    public static ResultSet executegeneratedQueries(String execute) {
        ResultSet multipleQueryResult = null;
        try {
            multipleQueryResult = db.executeQuery(execute, 8);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println(throwables);
            System.out.println("Query Timeout");
        }

        if (multipleQueryResult == null)
            System.out.println("Query Execution Result is null");
        return multipleQueryResult;

    }


    private String nonDuplicateColumn() {
        List<String> list = listColumns();
        for (String s : list) {
            if (Collections.frequency(list, s) == 1) {
                return s.split("\\.")[1].replaceAll("\"", "");
            }
        }
        return null;
    }

    private boolean containsDuplicate() {
        List<String> list = listColumns();
        Set<String> set = new HashSet<>(list);
        return (set.size() < list.size());
    }

    private String getDuplicateTableJoin() {
        List<String> list = listColumns();
        Set<String> strings = new HashSet<>();
        for (String l : list) {
            if (!strings.add(l)) {
                return l.split("\\.")[0];
            }
        }
        return null;
    }

    private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
        list.sort((val1, val2) -> (val2.getValue()).compareTo(val1.getValue()));
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> l : list) temp.put(l.getKey(), l.getValue());
        return temp;
    }

    private HashMap<Integer, Set<ForeignKey>> savePaths(Graph joinGraph, PatternTree objRoot,
                                                        HashMap<Integer, Set<ForeignKey>> allPaths) {
        if (hasChildren(objRoot)) {
            if (verbose) {
                System.out.println("PatternTree: savePath haschildren " + objRoot.children.size());
            }
            for (PatternTree child : objRoot.children) {
                if (verbose) {
                    System.out.println("PatternTree: child " + child.table + " " + child.value);
                }
                if (child.table != null) {
                    if (isNotRoot(objRoot)) {
                        List<Path> paths;
                        if (parent.children.get(0).value != null) {
                            if (!parent.children.get(0).table.equals(child.table)) {
                                paths = joinGraph.getPaths(parent.children.get(0).table, child.table);
                                if (verbose) {
                                    if (paths == null) {
                                        System.out.println("PatternTree: savePath paths  is null ");
                                    } else {
                                       System.out.println("PatternTree: savePath paths " + paths.size()); 
                                    }

                                }
                                if (paths != null) {
                                    if (paths.size() > 0) {
                                        allPaths = listBestPaths(paths, allPaths);
                                    }
                                }
                            }
                        }
                    }
                    allPaths = child.savePaths(joinGraph, child, allPaths);
                } else {
                    allPaths = child.savePaths(joinGraph, child, allPaths);
                }
            }

            if (objRoot.children.size() > 1) {
                PatternTree previousChild = null;
                for (PatternTree child : objRoot.children) {
                    if (previousChild != null) {
                        if (child.table != null) {
                            if (!child.table.equals(previousChild.table)) {
                                List<Path> paths = joinGraph.getPaths(previousChild.table, child.table);
                                if (paths != null) {
                                    if (parent != null) {
                                        if (!parent.children.get(0).table.equals(child.table)) {
                                            paths = joinGraph.getPaths(previousChild.table, child.table);
                                            if (paths.size() > 0) {
                                                allPaths = listBestPaths(paths, allPaths);
                                            }
                                        }
                                    } else {
                                        if (paths.size() > 0) {
                                            allPaths = listBestPaths(paths, allPaths);
                                        }
                                    }
                                }
                                previousChild = child;
                            }
                        }
                    } else {
                        previousChild = child;
                    }
                }
            }
        }
        return allPaths;
    }

    private HashMap<Integer, Set<ForeignKey>> listBestPaths(List<Path> paths,
                                                            HashMap<Integer, Set<ForeignKey>> allPaths) {
        HashMap<Integer, Set<ForeignKey>> tempAllPaths = new HashMap<>();
        int count = 0;
        for (Path path : paths) {
            if (allPaths.size() > 0) {
                for (Integer integer : allPaths.keySet()) {
                    HashSet<ForeignKey> tempHash = new HashSet<>();
                    tempHash.addAll(allPaths.get(integer));
                    tempHash.addAll(path.getAllFKs());
                    tempAllPaths.put(count++, tempHash);
                }
            } else {
                HashSet<ForeignKey> tempHash = new HashSet<>(path.getAllFKs());
                tempAllPaths.put(count++, tempHash);
            }
        }
        return tempAllPaths;
    }

    private int getRowsNumberFromOutput(String query) {
        try (ResultSet resultSet = db.executeQuery(query)) {
            resultSet.next();
            String toParse = resultSet.getString("QUERY PLAN");
            int queryOutput = parseQueryOutput(toParse);
            return queryOutput;
        } catch (SQLException e) {
            System.out.println(query);
            System.err.println("Query not executed");
        }
        return Integer.parseInt("0");
    }

    private int parseQueryOutput(String row) {
        return Integer.parseInt(row.split(" ")[3].split("=")[1]);
    }

}


