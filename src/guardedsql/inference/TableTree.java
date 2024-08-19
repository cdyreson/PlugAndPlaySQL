/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guardedsql.inference;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Curt
 */
public class TableTree implements Comparable<TableTree> {
    TreeNode root = null;
    List<TableTree> children;
    private final static String INDENTATION = "  ";
    
    public TableTree(String n, int w) {
        root = new TreeNode(n, w);
        children = new ArrayList();
    }
    
    // Returns added child
    public TableTree addChild(String n, int w) {
        TableTree t = new TableTree(n, w);
        children.add(t);
        return t;
    }
    
    public String getRootName() {
        return root.name;
    }
    
    public String toString() {
        return this.toString("");
    }
    
    public String toGuardString() {
        return this.toGuardString(INDENTATION);
    }
    
    public String toString(String indent) {
        String result = indent + root.name + " " + root.weight + "\n";
        for (TableTree child: children) {
            result += child.toString(INDENTATION + indent);
        }
        return result;
    }
    
    public String toGuardString(String indent) {
        String result = indent + root.name;
        if (children.isEmpty()) {
            return result;
        }
        
        boolean first = true;
        result += " {\n";
        for (TableTree child: children) {
            if (!first) {
                result += ",\n"; 
            }
            first = false;
            result += child.toGuardString(INDENTATION + indent);
        }
        result += "\n" + indent + "}";
        //result += indent;
        return result;
    }
    
    // Returns added child
    public TableTree addTreeChild(TableTree child) {
        children.add(child);
        return child;
    }
    
    @Override
    public int compareTo(TableTree o) {
        int v1 = this.sum();
        int v2 = o.sum();
        if (v1 == v2) return 0;
        if (v1 < v2) return -1;
        return 1;
    }
    
    public int sum() {
        int result = root.weight;
        for (TableTree child: children) {
            result += child.sum();
        }
        return result;
    }
    
}

class TreeNode {
    String name;
    int weight;
    int initialWeight;

    
    TreeNode(String n, int w) {
        this.name = n;
        this.weight = w;
        this.initialWeight = w;
    }
}
