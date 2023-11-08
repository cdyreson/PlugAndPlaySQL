/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.joingraph;

import guardedsql.database.ForeignKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A Paths table represents the paths (usually shortest) that connect pairs of
 * nodes
 *
 * @author Curt
 */
public class PathsTable {
    boolean verbose = false;

    Map<String, Map<String, List<Path>>> table;

    public PathsTable() {
        table = new HashMap();
    }

    public Boolean contains(String fromTable, String toTable) {
        if (!table.containsKey(fromTable)) {
            return false;
        }
        Map<String, List<Path>> map = table.get(fromTable);
        return map.containsKey(toTable);
    }

    public List<Path> getPaths(String fromTable, String toTable) {
        if (verbose) {
            System.out.println("PathsTable: from " + fromTable + " " + toTable);
        }
        if (!table.containsKey(fromTable)) {
            return null;
        }
        if (verbose) {
            System.out.println("PathsTable: has key ");
        }
        Map<String, List<Path>> map = table.get(fromTable);
        if (!map.containsKey(toTable)) {
            return null;
        }
        if (verbose) {
            System.out.println("PathsTable: has map " + map.get(toTable));
        }
        return map.get(toTable);
    }

    public void addPath(Path path) {
        addPath(path.getStart(), path.getEnd(), path);
    }

    public void addPath(String fromTable, String toTable, Path path) {
        /*
        if (fromTable.equals(toTable)) {
            // Don't add if to itself
            return; 
        }
        */
        /*
        if (fromTable.equals("taxa")) {
            System.out.println("PathsTable: " + path.length() + " from " + fromTable + " " + toTable);
        }
        if (fromTable.equals("omoccurrences")) {
            System.out.println("PathsTable: " + path.length() + " from " + fromTable + " " + toTable);
        }
        */
        if (verbose) {
            System.out.println("PathsTable: addPath " + fromTable + " " + toTable + " " + path);
        }

        if (!table.containsKey(fromTable)) {
            table.put(fromTable, new HashMap());
        }
        Map<String, List<Path>> map = table.get(fromTable);
        if (!map.containsKey(toTable)) {
            map.put(toTable, new ArrayList());
        }
        List<Path> paths = map.get(toTable);
        paths.add(path);
        /*
        if (fromTable.equals("taxa")) {
            System.out.print("Path - ");
            for (Edge e : path.getEdges()) {
                System.out.print(e.getToTable() + ",");
            }
            System.out.println("");
        }
        */

    }

}
