/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.inference.grammar;

import guardedsql.database.DB;
import guardedsql.inference.TableTree;

// import guardedsql.database.ForeignKey;
import guardedsql.joingraph.Graph;
import guardedsql.tree.PatternTree;
import guardedsql.tree.TreePath;

import java.util.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author Curtis Dyreson
 */
public class MyListener extends SQLiteBaseListener {

    Boolean verbose = false;
    // SQLiteParser parser;
    String selectClause;
    Map<String, TableTree> tableTreesMap = new HashMap();

    //private static PatternTree tree;
    private static DB db;
    //private static Stack<PatternTree> treeStack;
    //private static Graph joinGraph;
    //public static List<TreePath> finalRoutes;
    //public static String selectClauseText = "SELECT *";
    //public static String whereClauseText = "WHERE true";
    //public static String fromClauseText = "FROM ";
    //public static Map<String,String> aggregateMap = new HashMap();
    //public static Set<String> aggregateComparisonSet = new HashSet();
    public static int labelCount = 990;
    //public static boolean hasAggregate = false;
    
    // Added for inference
    public static Map<String,Map<String, Integer>> tableMap = new HashMap();
    public static String UNKNOWN_TABLE_NAME = "__unknown";
    public static int GROUP_BY_WEIGHT = 5;
    public static int SELECT_WEIGHT = 5;
    public static int WHERE_WEIGHT = 1;
    public static int currentWeight = 0;
    public static Map<String, Set<String>> relatedMap = new HashMap();
    public static Map<String, Set<String>> innerJoinMap = new HashMap();
    public static Map<String, Set<String>> relatedMapTC = new HashMap();
    public static Map<String, String> aliasMap = new HashMap();

    public MyListener(SQLiteParser parser) {
        //this.parser = parser;
    }
    
    private String generateLabel() {
        return "generatedLabel" + labelCount++;
    }

    @Override
    public void enterParse(SQLiteParser.ParseContext ctx) {
        if (verbose) {
            System.out.println("enterParse, query is");
            System.out.println("   " + ctx.getText());
        }
        try {
            if (db == null) {
                db = DB.getInstance();
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Override
    public void exitParse(SQLiteParser.ParseContext ctx) {
        if (verbose) {
            System.out.println("Exit parse ");
        }
        /*
        try {
            finalRoutes = tree.figureTreePaths(joinGraph);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
*/
        // Process the _unknown
        Map<String,Integer> unknownMap = tableMap.get(UNKNOWN_TABLE_NAME);
        if (unknownMap != null) {
            // Remove unknowns
            tableMap.remove(UNKNOWN_TABLE_NAME);

            // Add the columns to some other table 
            if (tableMap.size() == 1) {
                // Only one other table, add as children
                for (String name : tableMap.keySet()) {
                    Map<String, Integer> onlyMap = tableMap.get(name);
                    for (String key : unknownMap.keySet()) {
                        if (onlyMap.containsKey(key)) {
                            onlyMap.put(key, onlyMap.get(key) + unknownMap.get(key));
                        } else {
                            onlyMap.put(key, unknownMap.get(key));
                        }
                    }
                }
            } else {
                // Other tables
                if (!unknownMap.isEmpty() && tableMap.isEmpty()) {
                    // Semantic error no tables
                    System.err.println("Semantic error in query, no tables for columns: " + tableMap.keySet());
                    System.exit(-1);
                }
                // For each column let's figure out the tables
                for (String name : unknownMap.keySet()) {
                    //System.out.println("Trying name " + name);
                    Set<String> tableNames = db.columnLookup(name);
                    //System.out.println("Table names are " + tableNames);
                    boolean added = false;
                    for (String tableName : tableNames) {
                        if (tableMap.containsKey(tableName)) {
                            if (added) {
                                // Semantic error ambiguous tables
                                System.err.println("Semantic error in query, two tables for column: " + name);
                                System.exit(-1);
                            }
                            added = true;
                            Map<String, Integer> tempMap = tableMap.get(tableName);
                            if (tempMap.containsKey(name)) {
                                tempMap.put(name, tempMap.get(name) + unknownMap.get(name));
                            } else {
                                tempMap.put(name, unknownMap.get(name));
                            }
                        }
                    }
                    if (!added) {
                        // Semantic error
                        System.err.println("Semantic error in query, no table for column: " + name);
                        System.exit(-1);
                    }
                    //System.out.println("Name is " + name);
                    //Map<String, Integer> onlyMap = tableMap.get(name);
                    //for (String key : unknownMap.keySet()) {
                    //    onlyMap.put(key, unknownMap.get(key));
                    //}
                }
            }
        }

        // Process the aliases
        //System.out.println("processing aliasmap");
        for (String alias: aliasMap.keySet()) {
            ///System.out.println("processing alias " + alias);
            Map<String, Integer> aMap = tableMap.get(alias);
            tableMap.remove(alias);
            for (String aliasColumn : aMap.keySet()) {
                //System.out.println("processing alias column " + aliasColumn + " " + aliasMap.get(alias));
                Map<String, Integer> tempMap = tableMap.get(aliasMap.get(alias));
                if (tempMap.containsKey(aliasColumn)) {
                    tempMap.put(aliasColumn, tempMap.get(aliasColumn) + aMap.get(aliasColumn));
                } else {
                    tempMap.put(aliasColumn, aMap.get(aliasColumn));
                }
            }
        }

        // Now let's try to figure out trees
        // First merge alias trees
        // Next form table trees
        List<TableTree> tableTrees = new ArrayList();
        for (String key : tableMap.keySet()) {
            TableTree tree = new TableTree(key,0);
            Map<String,Integer> columnMap = tableMap.get(key);
            for (String column : columnMap.keySet()) {
                tree.addChild(column, columnMap.get(column));
            }
            tableTrees.add(tree);
        }
        
        // Sum each table tree and place in a Priority queue
        System.out.println("Table trees are listed below.");
        PriorityQueue<TableTree> queue = new PriorityQueue(Collections.reverseOrder());
        for (TableTree tree: tableTrees) {
            queue.add(tree);
            System.out.println("----\n" + tree.toString());
        }
        
        //System.out.println("Queue size is " + queue.size());
        // Now Merge table trees from the bottom up
        List<TableTree> trees = new ArrayList();
        while (!queue.isEmpty()) {
            // Grab a tree to work with
            TableTree top = queue.poll();
            List<TableTree> newTrees = new ArrayList();
            // Go through the trees, if related then add that tree as a child
            boolean added = false;
            Set<String> toNodes = relatedMap.get(top.getRootName());
            for (TableTree child: trees) {
                if (!added && toNodes != null && toNodes.contains(child.getRootName())) {
                    top.addTreeChild(child);
                    newTrees.add(top);
                    added = true;
                } else {
                    newTrees.add(child);
                }
            }
            if (!added) newTrees.add(top);
            trees = newTrees;
        }
        
        System.out.println("Guard is given below");
        System.out.println("++++++++++++");
        String guard = "GUARD {";
        boolean first = true;
        for (TableTree tree: trees) {
            //System.out.println("Inferred Guard is ");
            if (!first) {
                guard += ",\n";
            }
            first = false;
            //System.out.println(tree.toString());
            guard += tree.toGuardString();
        }
        guard += "}";
        System.out.println(guard);
        
    }

    @Override
    public void enterCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx) {
    }

    @Override
    public void enterSelect_clause(SQLiteParser.Select_clauseContext ctx) {
        if (verbose) {
            System.out.println("enterSelect_clause");
        }
        currentWeight = SELECT_WEIGHT;
    }
    
    @Override
    public void exitSelect_clause(SQLiteParser.Select_clauseContext ctx) {
        if (verbose) {
            System.out.println("exitSelect_clause");
        }
        // Replace word SELECT with SELECT and a space
        String s = getRawText(ctx);
        //System.out.println("SELECTZ " + s.substring(6));

                
        /*
        for (ParseTree t : ctx.children) {
            System.out.println("z " + t.getText() + " z");
        }
        */
        currentWeight = 0;
    }
    
    @Override
    public void exitWhere_clause(SQLiteParser.Where_clauseContext ctx) {
        if (verbose) {
            System.out.println("exitWhere_clause");
        }
        // Replace word SELECT with SELECT and a space
        //String s = getRawText(ctx);
        
        /*
        if (ctx.children != null) {
            for (ParseTree t : ctx.children) {
                System.out.println("w " + t.getText() + " z");
            }
        }  
        */
        currentWeight = 0;
    }
    
    @Override
    public void enterWhere_clause(SQLiteParser.Where_clauseContext ctx) {
        if (verbose) {
            System.out.println("enterWhere_clause");
        }
        currentWeight = WHERE_WEIGHT;
    }

    @Override
    public void enterJoin_clause(SQLiteParser.Join_clauseContext ctx) {
        if (verbose) {
            System.out.println("enterJoin_clause");
        }
    }

    @Override
    public void exitJoin_clause(SQLiteParser.Join_clauseContext ctx) {
        if (verbose) {
            System.out.println("exitJoin_clause");
        }
        List<ParseTree> pieces = ctx.constraints.children;
        String table1 = (ctx.op1.t != null)? getRawText(ctx.op1.t) : null;
        String table2 = (ctx.op2.t != null)? getRawText(ctx.op2.t) : null;
        
        if (ctx.join_operator(0).K_INNER() != null) {
            // This is an inner join
        } else if (ctx.join_operator(0).K_LEFT() != null) {
            // This is a left outer join
        } else if (ctx.join_operator(0).K_JOIN() != null) {
            // We have an inner join
        } else {
            // Some other kind of join
        }
        
        // Test if this is K_USING or K_ON
        if (ctx.constraints.e == null) {
            // It is K_USING, deal with the list of column names
            for (ParseTree p : pieces) {
                //System.out.println("class is " + p.getClass());
                String className = p.getClass().toString();
                if (className.endsWith("Column_nameContext")) {
                    System.out.println("class is " + p.getText());
                }
            }
        } else {
            // This is an EXPR using K_ON
            Map<String,String> tempMap = new HashMap();
            tempMap = processOnExpr(ctx.constraints.e, tempMap);
            if (tempMap == null) {
                if (verbose) {
                    System.out.println("On expression not an equi-join");
                }
            } else {
                if (verbose) {
                    System.out.println("On expression is an equi-join, here are relations");
                    for (String key: tempMap.keySet()) {
                        System.out.println(key + " related to " + tempMap.get(key));
                    }
                    if (!relatedMap.containsKey(table1)) {
                        relatedMap.put(table1, new HashSet());
                    }
                    if (!relatedMap.containsKey(table2)) {
                        relatedMap.put(table2, new HashSet());
                    }  
                    if (!relatedMapTC.containsKey(table1)) {
                        relatedMapTC.put(table1, new HashSet());
                    }
                    if (!relatedMapTC.containsKey(table2)) {
                        relatedMapTC.put(table2, new HashSet());
                    }
                    
                    // Add the edge both ways
                    Set<String> toNodes = relatedMap.get(table1);
                    toNodes.add(table2);
                    
                    toNodes = relatedMap.get(table2);
                    toNodes.add(table1);                   
                }
            }
        }

        if (ctx.op.K_CROSS() != null) {
            // Ignore cross join
        } else if (ctx.op.K_INNER() != null) {
            
        } else if (ctx.op.K_NATURAL() != null) {
            
        } else if (ctx.op.K_LEFT() != null) {
            
        } else if (ctx.op.K_JOIN() != null) {
            
        } else {
            // no known kind of join do nothing
        }
    }

    private Map<String,String> processOnExpr(SQLiteParser.ExprContext ctx, Map<String,String> mapSoFar) {
        if (verbose) {
            System.out.println("on EXPR is " + getRawText(ctx));
        }
        
        if (ctx.literal_value() != null) {
            return null;
        } else if (ctx.function_name() != null) {
            return null;
        } else if (ctx.comp_op() != null) {
            // Only process if an equality comparison on coloumns
            if (getRawText(ctx.comp_op()).equals("=")) {
                if (ctx.expr(0).column_name() != null) {
                    if (ctx.expr(1).column_name() != null) {
                        if (mapSoFar != null) {
                           mapSoFar.put(getRawText(ctx.expr(0).column_name()), getRawText(ctx.expr(1).column_name()));
                           return mapSoFar;
                        }
                    }
                }
            }
            return null;
        } else if (ctx.K_AND() != null) {
            mapSoFar = processOnExpr(ctx.expr(0),mapSoFar);
            mapSoFar = processOnExpr(ctx.expr(1),mapSoFar);
            return mapSoFar;
        } else if (ctx.K_OR() != null) {
            return null;
        } else if (ctx.column_name() != null) {
            return null;
        }
        return mapSoFar;
    }

    @Override
    public void enterSelect_or_values(SQLiteParser.Select_or_valuesContext ctx) {
    }


    @Override
    public void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx) {
        
        if (verbose) {
            System.out.println("Enter SQL statement ");
        }
        /*
        List<String> keywords = new ArrayList<>();
        keywords.addAll(Arrays.asList(new String[]{"SELECT", "DISTINCT", "LIKE", "WHERE", "GROUPBY"}));
        selectClause = ctx.getText();
        int indx = selectClause.indexOf("SELECT");
        if (indx >= 0)
            selectClause = selectClause.substring(indx);
        selectClause = selectClause.replaceAll(",", ", ");
        for (String keyword : keywords) {
            if (selectClause.contains(keyword))
                selectClause = selectClause.replace(keyword, (" " + keyword + " "));
            else if (selectClause.contains(keyword.toLowerCase()))
                selectClause = selectClause.replace(keyword.toLowerCase(), (" " + keyword + " "));
        }
        selectClause = selectClause.trim();
        */
    }

    @Override
    public void enterSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx) {
    }
        
    // Helper function to get the raw text for a token
    private String getRawText(ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        CharStream input = ctx.start.getInputStream();
        return input.getText(interval);
    }
    
    private boolean exprIsAggregate(ParserRuleContext ctx) {
        String s = ctx.getText().toLowerCase();
        return exprIsAggregateText(s);    
    }
    
    private boolean exprIsAggregateText(String x) {
        String s = x.toLowerCase();
        return (s.startsWith("count(") ||
                s.startsWith("sum(") ||
                s.startsWith("average(") ||
                s.startsWith("max(") ||
                s.startsWith("min("));    
    }
    
    @Override
    public void exitExpr(SQLiteParser.ExprContext ctx) {
        if (verbose) {
            System.out.println("exitExpr EXPR is " + getRawText(ctx));
        }

        if (verbose) {
            System.out.println("exit expression " + ctx.getText());
        }
        if (ctx.literal_value() != null) {
            if (verbose) {
                System.out.println("literal " + ctx.literal_value().getText());
            }
        } else if (ctx.function_name() != null) {
            if (exprIsAggregate(ctx)) {
                //hasAggregate = true;
            }
            // System.out.println("EXPR with function " + ctx.getText());
        } else if (ctx.comp_op() != null) {
            if (verbose) {
                System.out.println("expr " + ctx.expr(0).getText());
                System.out.println("comp_op " + ctx.comp_op().getText());
                System.out.println("expr " + ctx.expr(1).getText());
            }
            if (exprIsAggregateText(ctx.expr(0).getText()) ||
                exprIsAggregateText(ctx.expr(1).getText())) {
            }
        } else if (ctx.K_AND() != null) {
            if (verbose) {
                System.out.println("expr " + ctx.expr(0).getText());
                System.out.println("AND ");
                System.out.println("expr " + ctx.expr(1).getText());
            }

        } else if (ctx.K_OR() != null) {
            if (verbose) {
                System.out.println("expr " + ctx.expr(0).getText());
                System.out.println("OR ");
                System.out.println("expr " + ctx.expr(1).getText());
            }

        } else if (ctx.column_name() != null) {
            // We have a column, let's see if it has a table name
            String tableName = UNKNOWN_TABLE_NAME;
            if (ctx.table_name() != null) {
                    tableName = ctx.table_name().getText();
            }
            
            String columnName = ctx.column_name().getText();
            Map<String,Integer> columnMap = addTable(tableName);
            if (!columnMap.containsKey(columnName)) {
                columnMap.put(columnName,currentWeight);
            } else {
                columnMap.put(columnName, columnMap.get(columnName) + currentWeight);   
            }

            if (verbose) {
                System.out.println("Column name " + tableName + "." + columnName + " " + columnMap.get(columnName));
            }
        }
    }

    @Override
    public void enterGroupby_clause(SQLiteParser.Groupby_clauseContext ctx) {
        if (verbose) {
            System.out.println("enterGroupBy_clause");
        }
        currentWeight = GROUP_BY_WEIGHT;
    }
    
    @Override
    public void exitGroupby_clause(SQLiteParser.Groupby_clauseContext ctx) {
        if (verbose) {
            System.out.println("exitGroupBy_clause");
        }
        currentWeight = 0;
    }

    @Override
    public void exitGroupby_expr(SQLiteParser.Groupby_exprContext ctx) {
        if (ctx.expr() != null) {

            if (verbose) {

            }
        }
    }

    @Override
    public void enterFrom_clause(SQLiteParser.From_clauseContext ctx) {
        if (verbose) {
            System.out.println("enterFrom_clause");
        }
    }
    
    @Override
    public void exitFrom_clause(SQLiteParser.From_clauseContext ctx) {
        if (verbose) {
            System.out.println("exitFrom_clause");
        }
    }
    
    @Override
    public void enterTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx) {
        if (verbose) {
            System.out.println("enterTable_or_subquery " 
//                    + ctx.ralias.getText()
                    + " "
            + getRawText(ctx));
        }
        
        String tableName = getRawText(ctx.t);
        String alias = (ctx.ralias != null)? getRawText(ctx.ralias) : null;
        //System.out.println("Alias is " + alias);
        if (alias != null) {
            // Add the alias as a table name
            addTable(alias);
            aliasMap.put(alias, tableName);
        }
        addTable(tableName);
    }
    
    private Map<String,Integer> addTable(String tableName) {
        if (!tableMap.containsKey(tableName)) {
            tableMap.put(tableName, new HashMap());
            if (verbose) {
                System.out.println("Adding empty table " + tableName);
            }
        } else {
            if (verbose) {
                System.out.println("Table exists " + tableName);
            }
        }
        return tableMap.get(tableName);
    }
    
    @Override
    public void exitTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx) {
        if (verbose) {
            System.out.println("exitTable_or_subquery");
        }
    }
    
    
    @Override
    public void enterHaving_clause(SQLiteParser.Having_clauseContext ctx) {
        if (verbose) {
            System.out.println("enterHaving_clause");
        }
    }
    
    @Override
    public void exitHaving_clause(SQLiteParser.Having_clauseContext ctx) {
        if (verbose) {
            System.out.println("exitHaving_clause");
        }
    }

        @Override
    public void enterResult_column(SQLiteParser.Result_columnContext ctx) {
        if (verbose) {
            System.out.println("enterResult_column");
        }
    }
   
    @Override
    public void exitResult_column(SQLiteParser.Result_columnContext ctx) {
        if (verbose) {
            System.out.println("exitResult_column");
        }
        String tableName = (ctx.e.tableName == null)? null : getRawText(ctx.e.tableName);
        String columnName = (ctx.e.columnName == null)? null : getRawText(ctx.e.columnName);
        String alias = (ctx.alias == null)? null : getRawText(ctx.alias);
        String allColumnsTableName = (ctx.allColumnsTableName == null)? null : getRawText(ctx.allColumnsTableName);
        boolean wantAllColumns = ctx.allColumns != null;
        if (wantAllColumns) {
            // Get all the columns
        } else if (allColumnsTableName != null) {
            // of the form name.*

        } else {
            /* This is handled by expr
            // A column with potentially an alias
            if (tableName != null) {
                // Add the table if needed
                if (!tableMap.containsKey(tableName)) {
                    tableMap.put(tableName, new HashMap());
                    if (verbose) {
                        System.out.println("Adding empty table " + tableName);
                    }
                } else {
                    if (verbose) {
                        System.out.println("Table exists " + tableName);
                    }
                }
            }
            
            // Add column name to map
            if (!tableMap.containsKey(tableName)) {
                tableMap.put(tableName,new HashMap());
            }
                       
            Map<String,Integer> columnMap = tableMap.get(tableName);
            if (!columnMap.containsKey(columnName)) {
                columnMap.put(columnName,currentWeight);
            } else {
                columnMap.put(columnName, columnMap.get(columnName) + currentWeight);   
            }

            if (verbose) {
                System.out.println("Column name " + tableName + "." + columnName + " " + columnMap.get(columnName));
            }
            */
            // TODO ignore the alias for now, need in recursive queries
            if (alias != null) {

            }
        }
        
        /*
        if (ctx.expr() != null)
            System.out.println("Ctx expr " + ctx.expr().getText());
        } else if (ctx.table_name() != null) {
            System.out.println("table name+ " + ctx.table_name().getText());
        } else {
            System.out.println("null");
        }
*/
    }
    

}
