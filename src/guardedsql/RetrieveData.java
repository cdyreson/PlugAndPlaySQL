/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql;

import guardedsql.database.DB;
import guardedsql.database.ForeignKey;
import guardedsql.grammar.SQLiteParser;
import guardedsql.joingraph.Graph;
import guardedsql.joingraph.Path;

import java.sql.SQLException;
import java.util.*;

/**
 * This class was previously used as guardedSQL.Main
 *
 * @author Curtis Dyreson and Shubham Swami
 */
public class RetrieveData {

    Set<String> tableSet;
    SQLiteParser parser;
    DB db;

    public RetrieveData() {
        tableSet = new HashSet<>();
        try {
          db = DB.getInstance();
        } catch ( SQLException e)  {
            // error is handled elsewhere so ignore here
        }
    }

    public void setParser(SQLiteParser parser) {
        this.parser = parser;
        parser.outer_guard_clause(db);
    }

    public void retrieveData() {
        Map<String, List<String>> columnLookup = new HashMap();

        try {
            List<String> tables = db.getTableNames();
            tableSet.addAll(tables);

            for (String table : tables) {
                List<String> names = db.getColumnNames(table);
                for (String col : names) {
                    if (!columnLookup.containsKey(col)) {
                        columnLookup.put(col, new ArrayList());
                    }
                    List<String> colTables = columnLookup.get(col);
                    colTables.add(table);
                    //System.out.println("Adding column " + col + " " + table);
                }
            }
            List<ForeignKey> fks = db.getForeignKeys();
            Graph joinGraph = new Graph(db);
            for (String s : tables) {
                joinGraph.addTable(s);
            }

            for (ForeignKey fk : fks) {
                joinGraph.addFK(fk);
            }

            joinGraph.computeShortestPaths();

            for (String fromTable : tables) {
                for (String toTable : tables) {
                    if (fromTable.equals(toTable)) {
                        continue;
                    }
                    List<Path> paths = joinGraph.getPaths(fromTable, toTable);
                    if (paths == null) {
                        continue;
                    }
                    for (Path path : paths) {
                        path.generateJoinCondition();
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("There was an error getting the metadata: "
                    + e.getMessage());
            e.printStackTrace();
        }
    }
}
