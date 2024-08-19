/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.tree;

import guardedsql.Globals;
import guardedsql.database.DB;
import guardedsql.database.ForeignKey;
//import guardedsql.datapull.SQLPull;
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
    private boolean verbose = Globals.verbose;
    boolean isRoot = false;
    boolean isOuterJoin = true; // by default use outerjoins
    
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
        tables = new HashSet();
        tables.add(t);
        children = new ArrayList();
    }

    public static String[] getGeneratedQueries() {
        return generatedQueries;
    }
    
    public void setOuterJoin() {
        isOuterJoin = true;
    }
    
    public void setInnerJoin() {
        isOuterJoin = false;
    }
    
    public boolean isOuterJoin() {
        return isOuterJoin;
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
        if (Globals.verbose) System.out.println("LABEL IS " + label + " " + isRoot + " " + parentTable + " " + this.isOuterJoin);
        if (isRoot) {
            if (verbose) System.out.println("PatternTree: computing tree path for root ");
            // Root has a single child go to it
            PatternTree child = children.get(0);
            allResults = child.computeTreePaths(joinGraph, null);
        } else {
            // System.out.println(" HERE " + label + " " + this.tables );
            if (this.tables != null) {
                for (String myTable : this.tables) {
                    // if (verbose) System.out.println("PatternTree: computing tree path for " + parentTable + " to " + myTable);
                    List<Path> paths = new ArrayList();
                    // Only extend if a different table
                    if (parentTable != null && !myTable.equals(parentTable)) {
                        paths = joinGraph.getPaths(parentTable, myTable);
                        // if (verbose) System.out.println("Found paths " + paths);
                    } 
                    // Only continue if we have paths
                    if (paths != null) {
                        if (children.isEmpty()) {
                            // This is a leaf, add to results
                            List<TreePath> results = new ArrayList();
                            if (myTable.equals(parentTable)) {
                                results.add(new TreePath(myTable, this.label, new HashSet(), new Path(), isOuterJoin));
                            } else {
                                for (Path path : paths) {
                                    results.add(new TreePath(myTable, this.label, path.getAllFKs(), path, isOuterJoin));
                                }
                            }

                            allResults.addAll(results);
                        } else {
                            // Build up the union of all of the children
                            if (Globals.verbose) System.out.println(" UNIONON THE CHILDREN " + 
                                    children.size() + " " + label + " myTable " + myTable);
                            List<TreePath> newResults = new ArrayList();
                            boolean isFirstChild = true;
                            for (PatternTree child : children) {
                                if (verbose) {
                                    System.out.println("PatternTree: Child tables are " + child.tables);
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
                                    System.out.println("PatternTree: Doing union " + newResults.size() + " " + childResults.size());
                                    List<TreePath> tempResults = new ArrayList();
                                    for (TreePath newResult : newResults) {
                                        for (TreePath childResult : childResults) {
                                            System.out.println(" got one ");
                                            Set<ForeignKey> newFKs = new HashSet();
                                            newFKs.addAll(newResult.fks);
                                            newFKs.addAll(childResult.fks);
                                            List<String> newTables = new ArrayList();
                                            List<String> newColumns = new ArrayList();
                                            List<Boolean> isOuterJoins = new ArrayList();
                                            isOuterJoins.addAll(newResult.isOuterJoin);
                                            newTables.addAll(newResult.tables);
                                            newTables.addAll(childResult.tables);
                                            newColumns.addAll(newResult.columns);
                                            newColumns.addAll(childResult.columns);
                                            System.out.println(" Tables are " + newTables);
                                            System.out.println(" Columns are " + newColumns );
                                            Set<Path> newPaths = new HashSet();
                                            newPaths.addAll(newResult.paths);
                                            newPaths.addAll(childResult.paths);
                                            tempResults.add(new TreePath(newTables, newColumns, newFKs, newPaths, isOuterJoins));
                                        }
                                    }
                                    newResults = tempResults;
                                }
                            }
                            if (Globals.verbose) System.out.println(" new results size is " + newResults.size());
                            for (TreePath newResult : newResults) {
                                newResult.addTable(myTable, label, isOuterJoin);
                                if (myTable.equals(parentTable)) {
                                    // No new path to extend
                                    if (Globals.verbose) System.out.println(" NO NEW TABLE " + myTable);
                                } else {
                                    if (Globals.verbose) System.out.println(" NEW TABLE " + myTable + paths.size());
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


