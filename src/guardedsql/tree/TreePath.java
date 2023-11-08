package guardedsql.tree;

import guardedsql.database.ForeignKey;
import guardedsql.joingraph.Edge;
import guardedsql.joingraph.Path;

import java.util.*;

/**
 *
 * @author Curt
 */
public class TreePath {
    Set<ForeignKey> fks;
    List<String> tables;
    List<String> columns;
    Set<Path> paths;
    
    public TreePath(String table, String column, Set<ForeignKey> fk, Path path) {
        System.out.println("TreePath: " + table + "." + column);
        fks = fk;
        tables = new ArrayList();
        tables.add(table);
        columns = new ArrayList();
        columns.add(column);
        this.paths = new HashSet();
        paths.add(path);
    }
    
    public TreePath(List<String> tables, List<String> columns, Set<ForeignKey> fk, Set<Path> paths) {
        System.out.println("TreePath: " + tables + "." + columns);
        fks = fk;
        this.tables = tables;
        this.columns = columns;
        this.paths = paths;
    }
    
    public double computeCompleteness() {
        double completeness = 1.0;
        for (Path path : paths) {
            completeness *= path.computeCompleteness();
        }
        return completeness;
    }
    
    public void addTable(String table, String column) {
        System.out.println("TreePath: addoing " + table + "." + column);
        tables.add(table);
        columns.add(column);
    }
    
    public String getFormattedColumns() {
        String s = "";
        String prefix = "";
        for (int i = 0; i < columns.size(); i++) {
            s += prefix + tables.get(i) + "." + columns.get(i);
            prefix = ", ";
        }
        return s;
    }
    
    public String getFormattedTables() {
        String s = "";
        String prefix = "";
        for (String tab : tables) {
            s += prefix + tab;
            prefix = ", ";
        }
        return s;
    }
    
    public String getFormattedFKs() {
        String s = "";
        String prefix = "";
        for (ForeignKey fk : fks) {
            s = s + "(" + fk.getFromTable() + " LEFT OUTER JOIN " + fk.getToTable() +
                    " ON (" + fk.generateJoinCondition() + ")) A";
            prefix = " AND ";
        }
        return s;
    }
    
    public String getFormattedPaths() {
        String s = tables.get(0);
        Set<String> tablesSoFar = new HashSet();
        String prefix = "";
        if (paths.size() == 0) {
            // No path is a self edge
            //s = tables.get(0);
            tablesSoFar.add(s);
        } else {
            for (Path path : paths) {
                List<Edge> edges = path.getEdges();
                for (int i = 0; i < edges.size(); i++) {
                    Edge e = edges.get(i);
                    ForeignKey fk = e.getForeignKey();
                    if (tablesSoFar.contains(e.getToTable())) {
                        continue;
                    }
                    tablesSoFar.add(e.getToTable());
                    if (i == 0) {
                        s = e.getFromTable();
                        tablesSoFar.add(e.getFromTable());
                    } 
                    s = s + "\n   LEFT OUTER JOIN " + e.getToTable()
                            + " ON (" + fk.generateJoinCondition() + ")";
                }
            }
        }
        return s;
    }
    
    public void addFks(Set<ForeignKey> fk) {
        fks = fk;
    }
    
}
