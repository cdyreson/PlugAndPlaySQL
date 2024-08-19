/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardedsql.database;

import guardedsql.Globals;
import java.sql.*;
import java.util.*;
// import org.postgresql.util.PSQLException;

/**
 * The DB class encapsulates the database actions.
 *
 * @author Curtis Dyreson & Shubham Swami
 */
public class DB {
    private static DB db_single_instance = null;
    public static String jdbcUrl;
    public static String databaseName;
    public static String userName;
    public static String password;
    Connection conn;
    Statement stmt = null;
    ResultSet rs = null;
    DatabaseMetaData metadata = null;
    Map<String, Set<String>> columnLookup = new HashMap();
    Set<String> tableSet;
    List<ForeignKey> fks;
    Map<String, Set<String>> fkColumns;
    Map<String, Integer> tableSizes;
    List<Table> tableInfo;
    Boolean verbose = Globals.verbose;
    Boolean dbIsNull = true;

    public static void setDatabaseName(String databaseName) {
        DB.databaseName = databaseName;
    }

    public static void setUserName(String userName) {
        DB.userName = userName;
    }

    public static void setPassword(String password) {
        DB.password = password;
    }


    private DB() throws SQLException {
        if (verbose) {
            System.out.println("Building a new DB.");
        }
        

        try {
            if (verbose) {
                System.out.println("connection string (approx) is " + jdbcUrl + "/" + databaseName + "/" + userName + "/" +  password);
            }
            if (jdbcUrl != null) {
                this.dbIsNull = false;
                this.conn = DriverManager.getConnection(jdbcUrl + databaseName, userName, password);
                metadata = conn.getMetaData();
                tableSet = new HashSet();
                List<String> tables = this.getTableNames();
                tableSet.addAll(tables);
                countRows();
                buildFKs();
                estimateFKCompleteness();
                columnLookup = new HashMap();
                for (String table : tables) {
                    List<String> names = this.getColumnNames(table);
                    for (String col : names) {
                        if (fkColumns.containsKey(table)) {
                            if (fkColumns.get(table).contains(col)) {
                                continue;
                            }
                        }
                        if (!columnLookup.containsKey(col)) {
                            columnLookup.put(col, new HashSet());
                        }
                        Set<String> colTables = columnLookup.get(col);
                        colTables.add(table);
                        //System.out.println("Adding column '" + col + "'");

                    }
                }
                if (verbose) {
                    System.out.println("database opened");
                }

            }
        } catch (SQLException e) {
            System.err.println("There was an error getting the metadata: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }

    }

    public static void setJdbcUrl(String url) {
        jdbcUrl = url;
    }


    public static DB getInstance() throws SQLException {
        if (db_single_instance == null) {
            // System.out.println("DB single instance created");
            db_single_instance = new DB();
        }
        return db_single_instance;
    }

    public List<String> getTableNames() throws SQLException {
        if (verbose) {
                    System.out.println("Getting table names " + this.dbIsNull);
        }
        if (this.dbIsNull) {
            return new ArrayList<>();
        }
        tableInfo = new ArrayList<>();
        String[] table = {"TABLE"};
        List<String> tables = null;
        rs = metadata.getTables(null, null, null, table);
        tables = new ArrayList();
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));

            tableInfo.add(new Table(
                    rs.getString("TABLE_CAT"),
                    rs.getString("TABLE_SCHEM"),
                    rs.getString("TABLE_NAME")
            ));
        }
        if (verbose) {
            //System.out.println("Tables names are ");
            //for (String t: tables) {
            //    System.out.println("  " + t);
            //}
        }
        return tables;
    }
    
    public void countRows() {
        if (verbose) {
            System.out.println("DB: Counting rows " + this.dbIsNull);
        }
        if (this.dbIsNull) {
            return;
        }
        this.tableSizes = new HashMap();
        if (verbose) {
            System.out.println("DB: table numbers " + this.tableSet.size());
        }
        for (String table: this.tableSet) {
            try {
                String query = "SELECT count(*) FROM " + table;
                rs = this.executeQuery(query);
                int size = 0;
                while (rs.next()) {
                    size = rs.getInt(1);
                }
                tableSizes.put(table, size);
            } catch (Exception e) {
                System.err.println("There was an error in counting table query: " +  e.getMessage());
                e.printStackTrace();             
            }
        }
    }
    
    private String joinString(List<String> names) {
        String s = "";
        for (String name: names) {
            s += name + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    public boolean tableIsEmpty(String s) {
        if (this.dbIsNull) {
            return true;
        }
        return tableSizes.get(s) == 0;
    }
    
    public void estimateFKCompleteness() {
        if (this.dbIsNull) {
            return;
        }
        for (ForeignKey fk : this.fks) {
            try {
                String fromColumns = joinString(fk.fromColumns);
                String toColumns = joinString(fk.toColumns);
                int toTableSize = tableSizes.get(fk.toTable);
                int fromTableSize = tableSizes.get(fk.fromTable);
                if (fromTableSize == 0) {
                    continue;
                }
                int toKeySize = 0;
                int fromKeySize = 0;
                String query = "SELECT count(*) FROM (SELECT DISTINCT " + 
                               fromColumns +
                               " FROM " + fk.fromTable + ") A";
                rs = this.executeQuery(query);
                while (rs.next()) {
                    fromKeySize = rs.getInt(1);
                }
                query = "SELECT count(*) FROM " + 
                        fk.fromTable + 
                        " WHERE " + fk.fromColumns.get(0) + " IS NOT NULL";
                rs = this.executeQuery(query);
                while (rs.next()) {
                    toKeySize = rs.getInt(1);
                }
                fk.computeCompleteness(fromTableSize, fromKeySize, toTableSize, toKeySize);
                if (verbose) {
                  System.out.println("FK id is " + fk.getId());
                  System.out.println("From " + fk.fromTable + " "
                        + fromColumns + " has "
                        + fromKeySize + " " + tableSizes.get(fk.fromTable)
                        + " comp " + fk.fromCompleteness);
                  System.out.println("To " + fk.toTable
                        + toColumns + " has "
                        + toKeySize + " " + tableSizes.get(fk.toTable)
                        + " comp " + fk.toCompleteness);
                }
            } catch (Exception e) {
                System.err.println("There was an error in fk estimate query: " +  e.getMessage());
                e.printStackTrace();   
            }
        }
    }
        
    public List<ForeignKey> getForeignKeys() {
        if (this.dbIsNull) {
            return new ArrayList<>();
        }
        return fks;
    }

    public Set<String> stringLookup(String key) {
        if (this.dbIsNull) {
            return new HashSet<>();
        }
        Set<String> result = columnLookup(key);
        if (result.isEmpty()) {
            result.add(tableLookup(key));
        }
        return result;
    }

    public String tableLookup(String key) {
        if (this.dbIsNull) {
            return key;
        }
        if (tableSet.contains(key)) {
            return key;
        }
        System.err.println("Table not found in tableLookup: " + key);
        return key;
    }

    public Set<String> columnLookup(String key) {
        if (this.dbIsNull) {
            return new HashSet<>();
        }
        key = key.toLowerCase();
        //System.out.println("Looking up column " + key + " " + columnLookup.keySet());
        if (verbose) System.out.println("Inside column lookup");

        if (columnLookup.containsKey(key)) {
            //System.out.println("Found column " + key);
            return columnLookup.get(key);
        } else {
            System.err.println("table not found in columnLookup: " + key);
            return new HashSet();
        }
    }

    public ResultSet executeQuery(String query) throws SQLException {
        if (this.dbIsNull) {
            return null;
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(query);
        return rs;
    }

    public ResultSet executeQuery(String query, int timeOut) throws SQLException {
        if (this.dbIsNull) {
            return null;
        }
        stmt = conn.createStatement();
        stmt.setQueryTimeout(timeOut);
        rs = stmt.executeQuery(query);
        return rs;
    }

    public List<ForeignKey> buildFKs() throws SQLException {
        if (this.dbIsNull) {
            return new ArrayList<>();
        }
        fks = new ArrayList(10);
        Map<String, ForeignKey> keyMap = new HashMap();
        fkColumns = new HashMap();
        for (Table table : tableInfo) {
            rs = (table != null) ? metadata.getImportedKeys(table.getCatalog(), table.getSchema(), table.getTableName()) : null;
            while (rs.next()) {
                String name = rs.getString("FK_NAME");
                String tabName = rs.getString("FKTABLE_NAME");
                String tabFromName = rs.getString("PKTABLE_NAME");
                // Skip this unless the foreign key actually has data
                if (this.tableSizes.get(tabName) != 0 && this.tableSizes.get(tabFromName) != 0) {
                    name = tabName + "." + name;
                    if (keyMap.containsKey(name)) {
                        ForeignKey fk = keyMap.get(name);
                        fk.addFromColumn(rs.getString("PKCOLUMN_NAME"));
                        fk.addToColumn(rs.getString("FKCOLUMN_NAME"));
                    } else {
                        List<String> fc = new ArrayList(1);
                        List<String> tc = new ArrayList(1);
                        fc.add(rs.getString("PKCOLUMN_NAME"));
                        tc.add(rs.getString("FKCOLUMN_NAME"));
                        // keyMap.put(name, new ForeignKey(rs.getString("PKTABLE_NAME"), rs.getString("FKTABLE_NAME"), fc, tc));
                        keyMap.put(name, new ForeignKey(rs.getString("FKTABLE_NAME"), rs.getString("PKTABLE_NAME"), tc, fc));

                    }
                    String colName = rs.getString("FKCOLUMN_NAME");

                    if (!tabName.equals(tabFromName)) {
                        if (!fkColumns.containsKey(tabName)) {
                            fkColumns.put(tabName, new HashSet());
                        }
                        fkColumns.get(tabName).add(colName);
                    }
                }
            }
        }

        Map<String, ForeignKey> reversedKeyMap = new HashMap();
        for (String name : keyMap.keySet()) {
            ForeignKey fk = keyMap.get(name);
            String ft = fk.getFromTable();
            String tt = fk.getToTable();
            List<String> fc = fk.fromColumns;
            List<String> tc = fk.toColumns;

            String newName = name + " reversed";
            int count = 0;
            while (keyMap.containsKey(newName)) {
                newName += count++;
            }
            // Disable as not used
            // reversedKeyMap.put(newName, new ForeignKey(tt, ft, tc, fc));
        }

        for (String name : reversedKeyMap.keySet()) {
            keyMap.put(name, reversedKeyMap.get(name));
        }

        for (String key : keyMap.keySet()) {
            fks.add(keyMap.get(key));
        }
        return fks;
    }

    public List<String> getColumnNames(String table) throws SQLException {
        if (this.dbIsNull) {
            return new ArrayList<>();
        }
        List<String> names = new ArrayList();
        rs = metadata.getColumns(null, null, table, null);
        while (rs.next()) {
            names.add(rs.getString("COLUMN_NAME"));
        }
        return names;
    }

    public String getPrimaryKey(String table) {
        if (this.dbIsNull) {
            return "";
        }
        String query = "SELECT c.column_name, c.data_type\n" +
                "FROM information_schema.table_constraints tc \n" +
                "JOIN information_schema.constraint_column_usage AS ccu USING (constraint_schema, constraint_name) \n" +
                "JOIN information_schema.columns AS c ON c.table_schema = tc.constraint_schema\n" +
                "  AND tc.table_name = c.table_name AND ccu.column_name = c.column_name\n" +
                "WHERE constraint_type = 'PRIMARY KEY' and tc.table_name = '" + table + "';";
        try (ResultSet resultSet = executeQuery(query)) {
            resultSet.next();
            return resultSet.getString("COLUMN_NAME");
        } catch (SQLException e) {
            System.err.println("Query not executed");
        }
        return "";
    }


}
