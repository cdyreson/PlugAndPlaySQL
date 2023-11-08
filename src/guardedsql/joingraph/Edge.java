/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.joingraph;

import guardedsql.database.ForeignKey;

/**
 * An Edge is a FK relationship in the Graph
 *
 * @author Curt
 */
public class  Edge {
    ForeignKey foreignKey;
    String fromTable;
    String toTable;
    int cost;

    public Edge(ForeignKey fk) {
        cost = 1;
        foreignKey = fk;
        fromTable = fk.getFromTable();
        toTable = fk.getToTable();
    }
    
    public Edge(ForeignKey fk, boolean reversed) {
        foreignKey = fk;
        cost = 1;
        toTable = fk.getFromTable();
        fromTable = fk.getToTable();
    }
    
    public String getFromTable() {
        return fromTable;
    }
    
    public String getToTable() {
        return toTable;
    }
    
    public ForeignKey getForeignKey() {
        return foreignKey;
    }
    

}
