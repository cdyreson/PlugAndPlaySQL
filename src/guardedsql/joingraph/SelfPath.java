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
public class SelfPath extends Path {

    public SelfPath() {
        path = new ArrayList();
        cost = 0;
    }

    public SelfPath(SelfPath clone) {
        this();
        path.addAll(clone.path);
        cost = 0;
    }

    public String getStart() {
        Edge e = path.get(0);
        return e.getFromTable();
    }

    public String getEnd() {
        Edge e = path.get(path.size() - 1);
        return e.getToTable();
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
    
    public Set<ForeignKey> getAllFKs() {
        Set<ForeignKey> result = new HashSet();
        for (Edge e : path) {
            result.add(e.getForeignKey());
        }
        return result;
    }

    public void push(Edge e) {
        path.add(e);
    }


}
