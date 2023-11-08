/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.joingraph;

import guardedsql.database.ForeignKey;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * A Path is a list of edges
 * @author Curtis Dyreson
 */
public class Path {

    List<Edge> path = null;
    int cost = 1;

    public Path() {
        path = new ArrayList();
    }

    public Path(Path clone) {
        this();
        path.addAll(clone.path);
    }

    public String getStart() {
        Edge e = path.get(0);
        return e.getFromTable();
    }

    public String getEnd() {
        Edge e = path.get(path.size() - 1);
        return e.getToTable();
    }

    public int length() {
        return path.size();
    }
    
    public String generateJoinCondition() {
        int count = 0;
        String result = "";
        for (Edge e : path) {
            if (count++ > 0) {
                result += " AND ";
            }
            result += e.getForeignKey().generateJoinCondition();
        }
        return result;
    }
    
    public double computeCompleteness() {
        double completeness = 1.0;
        for (Edge e : path) {
            ForeignKey fk = e.foreignKey;
            if (fk.getFromTable().equals(e.fromTable)) {
                completeness *= fk.getFromCompleteness();
            } else {
                completeness *= fk.getToCompleteness();
            }
        }
        return completeness;
    }
    
    public Set<ForeignKey> getAllFKs() {
        Set<ForeignKey> result = new HashSet();
        for (Edge e : path) {
            result.add(e.getForeignKey());
        }
        return result;
    }

    public List<Edge> getEdges() {
        return path;
    }

    public void push(Edge e) {
        path.add(e);
    }


}
