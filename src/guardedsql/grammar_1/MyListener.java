/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.grammar;

import guardedsql.database.DB;
// import guardedsql.database.ForeignKey;
import guardedsql.joingraph.Graph;
import guardedsql.tree.PatternTree;
import guardedsql.tree.TreePath;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

/**
 * @author Curtis Dyreson
 */
public class MyListener extends SQLiteBaseListener {

    Boolean verbose = false;
    // SQLiteParser parser;
    String selectClause;

    private static PatternTree tree;
    private static DB db;
    private static Stack<PatternTree> treeStack;
    private static Graph joinGraph;
    public static List<TreePath> finalRoutes;
    public static String selectClauseText = "SELECT *";
    public static String whereClauseText = "WHERE true";
    public static String fromClauseText = "FROM ";
    public static Map<String,String> aggregateMap = new HashMap();
    public static Set<String> aggregateComparisonSet = new HashSet();
    public static int labelCount = 990;
    public static boolean hasAggregate = false;

    public MyListener(SQLiteParser parser) {
        //this.parser = parser;
    }
    
    private String generateLabel() {
        return "generatedLabel" + labelCount++;
    }

    @Override
    public void enterParse(SQLiteParser.ParseContext ctx) {
        if (verbose) {
            System.out.println("Enter parse " + ctx.getText());
        }
    }

    @Override
    public void exitParse(SQLiteParser.ParseContext ctx) {
        if (verbose) {
            System.out.println("Exit parse " + ctx.getText());
        }
        try {
            finalRoutes = tree.figureTreePaths(joinGraph);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx) {
    }

    @Override
    public void enterSelect_clause(SQLiteParser.Select_clauseContext ctx) {
    }
    
    @Override
    public void exitSelect_clause(SQLiteParser.Select_clauseContext ctx) {
        // Replace word SELECT with SELECT and a space
        String s = getRawText(ctx);
        selectClauseText = s; //"SELECT " + s.substring(6);
        /*
        for (ParseTree t : ctx.children) {
            System.out.println("z " + t.getText() + " z");
        }
        */
    }
    
    @Override
    public void exitWhere_clause(SQLiteParser.Where_clauseContext ctx) {
        // Replace word SELECT with SELECT and a space
        String s = getRawText(ctx);
        whereClauseText = s; // "WHERE " + s.substring(5);
        /*
        for (ParseTree t : ctx.children) {
            System.out.println("z " + t.getText() + " z");
        }
        */
    }

    @Override
    public void enterSelect_or_values(SQLiteParser.Select_or_valuesContext ctx) {
    }


    @Override
    public void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx) {
        List<String> keywords = new ArrayList<>();
        if (verbose) {
            System.out.println("Enter SQL statement " + ctx.getText());
        }
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
    }

    @Override
    public void enterSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx) {
    }
    
    @Override
    public void exitGuard_key_name(SQLiteParser.Guard_key_nameContext ctx) {
        if (ctx.column_name() != null) {
            System.out.println("Ctx expr " + ctx.getText());
        } else if (ctx.table_name() != null) {
            System.out.println("table name+ " + ctx.table_name().getText());
        } else {
            System.out.println("null");
        }
    }
        
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
        System.out.println("EXPR is " + getRawText(ctx));

        if (verbose) {
            System.out.println("exit expression " + ctx.getText());
        }
        if (ctx.literal_value() != null) {
            if (verbose) {
                System.out.println("literal " + ctx.literal_value().getText());
            }
        } else if (ctx.function_name() != null) {
            if (exprIsAggregate(ctx)) {
                aggregateMap.put(generateLabel(), getRawText(ctx));
                hasAggregate = true;
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
                aggregateComparisonSet.add(getRawText(ctx));
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
            String name = ((ctx.table_name() == null) ? "" : ctx.table_name().getText() + ".") + ctx.column_name().getText();
            if (verbose) {
                System.out.println("Column name " + name);
            }
        }
    }

    @Override
    public void exitGroupby_clause(SQLiteParser.Groupby_clauseContext ctx) {
    }

    @Override
    public void exitGroupby_expr(SQLiteParser.Groupby_exprContext ctx) {
        if (ctx.expr() != null) {

            if (verbose) {

            }
        }
    }

    @Override
    public void exitHaving_clause(SQLiteParser.Having_clauseContext ctx) {
        if (verbose) {

        }
    }

    @Override
    public void exitResult_column(SQLiteParser.Result_columnContext ctx) {
        if (ctx.expr() != null) {
            System.out.println("Ctx expr " + ctx.expr().getText());
        } else if (ctx.table_name() != null) {
            System.out.println("table name+ " + ctx.table_name().getText());
        } else {
            System.out.println("null");
        }
    }

    @Override
    public void enterOuter_guard_clause(SQLiteParser.Outer_guard_clauseContext ctx) {
        if (verbose) {
            System.out.println("Enter outer guard clause " + ctx.getText());
        }
        treeStack = new Stack<>();
        db = ctx.db;
        try {
          db = (db == null) ? DB.getInstance() : db;
        } catch (SQLException e) {
            // Error is printed elsewhere so ignore here
        }
        // System.out.println("New pattern tree");
        tree = new PatternTree(db);
        // treeStack.push(tree);
        tree.setRemainingQuery(selectClause);
        joinGraph = new Graph(db);
    }

    @Override
    public void exitOuter_guard_clause(SQLiteParser.Outer_guard_clauseContext ctx) {
        if (verbose) {
            System.out.println("Exit outer guard clause " + ctx.getText());
        }
        //try {
            while (!treeStack.isEmpty()) {
                System.out.println(" TTT " + tree.getLabel() + " ");
                tree = treeStack.pop();
                System.out.println(" TTV " + tree.getLabel() + " ");
            }
            //finalRoutes = tree.figureTreePaths(joinGraph);
        //} catch (IOException | SQLException e) {
        //    e.printStackTrace();
        //}
    }

    @Override
    public void enterGuard_clause(SQLiteParser.Guard_clauseContext ctx) {
        if (verbose) {
            System.out.println("Enter guard clause " + ctx.getText());
        }
        int numberOfChild = ctx.getChildCount();
        for (int i = 0; i < numberOfChild; i++) {
            if (verbose) {
                System.out.println("Processing child " + i + " " + ctx.guard_key_name(i));
            }
            if (ctx.guard_key_name(i) != null) {
                String columnName = ctx.guard_key_name(i).column_name().getText();
                String tableName = null;
                if (ctx.guard_key_name(i).table_name() != null ) {
                    tableName = ctx.guard_key_name(i).table_name().getText();
                } 
                // String tableName = ctx.guard_key_name(i).toStringTree();
                // tableName = tableName.replaceAll("[^a-zA-Z]", "");
                if (verbose) {
                    System.out.println("Table name is " + i + " " + tableName);
                }
                if (verbose) {
                    System.out.println("Column name is " + i + " " + columnName);
                }
                if (treeStack.isEmpty()) {
                    if (verbose) {
                        System.out.println("Tree stack is empty ");
                    }
                    treeStack.push(tree);
                    System.out.println(" TT Parent is " + tree.getLabel() + " " + columnName);
                    PatternTree child = new PatternTree(db, tree, columnName, tableName);
                    if (tableName == null) child.buildPotentialLabels(columnName);
                    tree.addChild(child);
                    tree = child;
                    treeStack.push(tree);
                    // treeStack.push(child);
                    // tree = child;
                } else {
                    if (verbose) {
                        System.out.println("Tree stack is not empty ");
                    }
                    // tree = treeStack.peek();
                    PatternTree child;
                    if (tableName != null) {
                        System.out.println(" YY Parent is " + tree.getLabel() + " " + columnName);
                        child = new PatternTree(db, tree, columnName, tableName);
                    } else {                    
                        System.out.println(" ZZ Parent is " + tree.getLabel() + " " + columnName);
                        child = new PatternTree(db, tree, columnName);
                        child.buildPotentialLabels(columnName);
                    }
                    tree.addChild(child);
                    treeStack.push(tree);
                    tree = child;
                }
            }

        }
    }

    @Override
    public void exitGuard_clause(SQLiteParser.Guard_clauseContext ctx) {
        if (verbose) {
            System.out.println("Exit guard clause " + ctx.getText());
        }
        int numberOfChild = ctx.getChildCount();
        for (int i = 0; i < numberOfChild; i++) {
            if (ctx.guard_key_name(i) != null) {
                String tableName = ctx.guard_key_name(i).toStringTree();
                tableName = tableName.replaceAll("[^a-zA-Z]", "");
                if (verbose) {
                    System.out.println("Building tree " + tableName);
                }
                if (!treeStack.isEmpty()) {
                    // tree = treeStack.pop();
                    // tree.buildPotentialLabels(tableName);
                }
            }
        }
    }

    @Override
    public void enterOpening_brace(SQLiteParser.Opening_braceContext ctx) {
        // treeStack.push(tree);
    }

    @Override
    public void exitOpening_brace(SQLiteParser.Opening_braceContext ctx) {
        tree = treeStack.pop();
    }
    
    @Override
    public void exitGuard_comma(SQLiteParser.Guard_commaContext ctx) {
        tree = treeStack.pop();
    }

    @Override
    public void enterClosing_brace(SQLiteParser.Closing_braceContext ctx) {
    }

    @Override
    public void exitClosing_brace(SQLiteParser.Closing_braceContext ctx) {
    }


}
