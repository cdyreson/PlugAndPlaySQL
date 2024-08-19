package guardedsql.main;


import guardedsql.Globals;
import guardedsql.database.DB;
import guardedsql.inference.grammar.MyListener;
import guardedsql.inference.grammar.SQLiteLexer;
import guardedsql.inference.grammar.SQLiteParser;
import guardedsql.inference.grammar.ThrowingErrorListener;
import static gui.Controller.url;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class InferenceMain  {
    static DB db;

    public static void main(String[] args) {
        System.out.println("Reading query file");
        String queryFileName = args[0];
        String dbConfigFileName = args[1];
        String query = "";
        try {
            File myObj = new File(queryFileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                query += myReader.nextLine() + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred readubg " + queryFileName);
            e.printStackTrace();
            System.exit(-1);
        }
        System.out.println("Query is\n " + query);
        System.out.println("Opening database");
        String dbHost = "";
        String dbPort = "";
        String dbName = "";
        String dbUser = "";
        String dbPassword = "";
        try {
            File myObjDB = new File(dbConfigFileName);
            Scanner myReaderDB = new Scanner(myObjDB);
            dbHost = myReaderDB.nextLine();
            dbPort = myReaderDB.nextLine();
            dbName = myReaderDB.nextLine();
            dbUser = myReaderDB.nextLine();
            dbPassword = myReaderDB.nextLine();
            myReaderDB.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred readubg " + queryFileName);
            e.printStackTrace();
            System.exit(-1);
        }
        System.out.println("Connecting to the database.");
        //InferenceMain.connectDatabase();
        try {
            if (db == null) {
                configureDB(dbHost, dbPort, dbName, dbUser, dbPassword);
                if (db == null) {
                    db = DB.getInstance();
                }
            }
            //RetrieveData retrieveData = new RetrieveData();;
            //retrieveData.retrieveData();
            System.out.println("Parsing the query.");
            //String query = "select b.a from c JOIN aa ON f = z AND q = b AND c = g";
            //System.out.println(query);
            CharStream charStream = CharStreams.fromString(query);
            SQLiteLexer lexer = new SQLiteLexer(charStream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
            CommonTokenStream ts = new CommonTokenStream(lexer);
            SQLiteParser parser = new SQLiteParser(ts);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            ParserRuleContext tree = parser.parse();
            MyListener extractor = new MyListener(parser);
            System.out.println("Walking the parse tree.");
            ParseTreeWalker.DEFAULT.walk(extractor, tree);
            //System.out.println("Inferring the guard.");
            //retrieveData.setParser(parser);
            // System.out.println(" Parsing ");
            //retrieveData.retrieveData();
            // System.out.println(" fff ");
            //showGeneratedQueries();
        } catch (ParseCancellationException e) {
            // Ignore the EOF error
            if (!e.toString().contains("<EOF>")) {
                System.err.println("Syntax error " + e);
            } else {
                //parsed = true;
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
    private static void configureDB(String dbHost, String dbPort, String dbName, String dbUser, String dbPassword) {
        url = "jdbc:postgresql://" + dbHost + ":" + dbPort + "/";
        if (Globals.verbose) System.out.println(url + " " + dbName + " " + dbUser + " " + dbPassword);
        DB.setJdbcUrl(url);
        DB.setUserName(dbUser);
        DB.setPassword(dbPassword);
        DB.setDatabaseName(dbName);
    }
}
