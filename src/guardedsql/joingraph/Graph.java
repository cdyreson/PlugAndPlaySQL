/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.joingraph;

import guardedsql.database.DB;
import guardedsql.database.ForeignKey;

import java.sql.SQLException;
import java.util.*;

/**
 * The Graph is the graph of join relationships established by foreign keys. Use
 * this package to create joins.
 *
 * @author Curt
 */
public class Graph {

    private final Map<String, List<Edge>> fromEdges;
    private final Map<String, List<Edge>> toEdges;
    private PathsTable shortestPaths = null;


    public Graph(DB db) {
        fromEdges = new HashMap<>();
        toEdges = new HashMap<>();
        try {
            List<String> tables = db.getTableNames();
            for (String s : tables) this.addTable(s);
            List<ForeignKey> fks = db.getForeignKeys();
            if (fks != null) {
                 for (ForeignKey fk : fks) this.addFK(fk);
            }
            this.computeShortestPaths();
        } catch (SQLException e) {
            System.err.println("There was an error getting the metadata: "
                    + e.getMessage());
            e.printStackTrace();
        }
    }

    public void addTable(String table) {
        if (fromEdges.containsKey(table)) {
            // System.err.println("JoinGraph: Adding Table that already exists " + table);
            return;
        }
        fromEdges.put(table, new ArrayList<>());
        toEdges.put(table, new ArrayList<>());
    }

    public void addFK(ForeignKey fk) {
        String fromTable = fk.getFromTable();
        String toTable = fk.getToTable();
        if (!fromEdges.containsKey(fromTable)) {
            addTable(fromTable);
        }
        if (!fromEdges.containsKey(toTable)) {
            addTable(toTable);
        }
        Edge edge = new Edge(fk);
        Edge reversedEdge = new Edge(fk, true);
        fromEdges.get(fromTable).add(edge);
        toEdges.get(toTable).add(edge);
        // Add the reverse edges
        fromEdges.get(toTable).add(reversedEdge);
        toEdges.get(fromTable).add(reversedEdge);
        /*
        if (fromTable.equals("taxa") || toTable.equals("taxa")) {
            System.out.println("Edge from " + fromTable + " to " + toTable);
        }
        */
    }

    public List<Path> getPaths(String fromTable, String toTable) {
        List<Path> paths = shortestPaths.getPaths(fromTable, toTable);
        if (paths == null) {
            // System.err.println("No path between " + fromTable + " and " + toTable);
        }
        return paths;
    }

    public void computeShortestPaths() {
        List<Path> newPaths = new ArrayList<>();
        if (shortestPaths == null) {
            shortestPaths = new PathsTable();
            Set<String> allNodes = new HashSet<>();
            allNodes.addAll(fromEdges.keySet());
            //allNodes.addAll(toEdges.keySet());
            for (String table : allNodes) {
                List<Edge> edges = new ArrayList<>();
                if (fromEdges.containsKey(table)) {
                    edges.addAll(fromEdges.get(table));
                }                
                // Adding the reverse edges
                //if (toEdges.containsKey(table)) {
                //    edges.addAll(toEdges.get(table));
                //}
                for (Edge edge : edges) {
                    String toTable = edge.getToTable();
                    Path path = new Path();
                    path.push(edge);
                    shortestPaths.addPath(table, toTable, path);
                    newPaths.add(path);
                    // Add reverse edges
                    /*
                    String fromTable = fk.getFromTable();
                    Path fromPath = new Path();
                    fromPath.push(fk);
                    shortestPaths.addPath(table, fromTable, fromPath);
                    newPaths.add(fromPath);
                    */
                }
            }
        }
        computeShortestPaths(newPaths);
    }

    private void computeShortestPaths(List<Path> newPaths) {
        if (newPaths.size() == 0)
            return;
        List<Path> computedPaths = new ArrayList<>();
        for (Path path : newPaths) {
            String pathStartTable = path.getStart();
            String pathEndTable = path.getEnd();
            if (fromEdges.containsKey(pathEndTable)) {
                List<Edge> edges = fromEdges.get(pathEndTable);
                for (Edge edge : edges) {
                    String possibleEndTable = edge.getToTable();
                    if (!shortestPaths.contains(pathStartTable, possibleEndTable) && !pathStartTable.equals(possibleEndTable)) {
                        Path tempPath = new Path(path);
                        tempPath.push(edge);
                        computedPaths.add(tempPath);
                    }
                }
            }
        }
        for (Path path : computedPaths) {
            shortestPaths.addPath(path);
        }
        computeShortestPaths(computedPaths);
    }
}