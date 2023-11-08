/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.database;

import java.util.List;

/**
 * @author Curt
 */
public class ForeignKey implements Comparable {

    String fromTable;
    String toTable;
    int fromTableSize;
    int toTableSize;
    int fromKeySize;
    int toKeySize;
    double fromCompleteness;
    double toCompleteness;
    List<String> fromColumns;
    List<String> toColumns;
    private int id;
    private static int count = 0;

    public ForeignKey(String fromTable, String toTable, List<String> fromColumns, List<String> toColumns) {
        // System.out.println(" Constructing FK " + count);
        this.fromTable = fromTable;
        this.toTable = toTable;
        this.fromColumns = fromColumns;
        this.toColumns = toColumns;
        id = count++;
    }

    /*
    public ForeignKey(int id, String fromTable, String toTable, List<String> fromColumns, List<String> toColumns) {
        this.fromTable = fromTable;
        this.toTable = toTable;
        this.fromColumns = fromColumns;
        this.toColumns = toColumns;
        this.id = id;
    }
    */

    public void computeCompleteness(int fromTableSize, int fromKeySize, int toTableSize, int toKeySize) {
        this.fromTableSize = fromTableSize;
        this.toTableSize = toTableSize;
        this.fromKeySize = fromKeySize;
        this.toKeySize = toKeySize;
        this.fromCompleteness = (toTableSize == 0) ? 0 : (fromKeySize * 1.0) /toTableSize;
        this.toCompleteness = (fromTableSize == 0) ? 0 : (toKeySize * 1.0)/fromTableSize;
    }
    
    public void addFromColumn(String col) {
        fromColumns.add(col);
    }

    public void addToColumn(String col) {
        toColumns.add(col);
    }

    public int getId() {
        return id;
    }

    public String getFromTable() {
        return fromTable;
    }

    public String getToTable() {
        return toTable;
    }
    
    public double getToCompleteness() {
        return toCompleteness;
    }

    public double getFromCompleteness() {
        return fromCompleteness;
    }
    
    public String generateJoinCondition() {
        String result = "";
        int size = fromColumns.size();
        while (size-- > 0) {
            result += fromTable + "." + fromColumns.get(size) + " = " + toTable + "." + toColumns.get(size);
            if (size > 0) {
                result += " AND ";
            }
        }

        return result;
    }

    public String getColumnJoin() {
        return fromColumns.get(0);
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int compareTo(ForeignKey f) {
        return (this.id == f.id) ? 0 : (this.id > f.id) ? this.id : f.id;
    }
}
