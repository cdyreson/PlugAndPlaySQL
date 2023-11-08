package guardedsql.joingraph;

import guardedsql.database.ForeignKey;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * A Cartesian Product path has no connecting edges between the from and to tables
 * @author Curtis Dyreson
 */
public class CartesianProductPath extends Path {


    public CartesianProductPath() {
        path = new ArrayList();
        cost = 10000;
    }

    public CartesianProductPath(CartesianProductPath clone) {
        this();
        path.addAll(clone.path);
        cost = 10000;
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
  
    public void push(Edge e) {
        path.add(e);
    }

}
