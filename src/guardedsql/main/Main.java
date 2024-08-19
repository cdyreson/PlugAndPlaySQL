package guardedsql.main;


import guardedsql.RetrieveData;
import guardedsql.database.DB;
import guardedsql.grammar.MyListener;
import guardedsql.grammar.SQLiteLexer;
import guardedsql.grammar.SQLiteParser;
import guardedsql.grammar.ThrowingErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class Main  {


    public static void main(String[] args) {
        try {
            String query = "GUARD ! { name { hr ? { namefirst { foo! }, namelast } } } SELECT DISTINCT nameFirst, nameLast WHERE name like '%Montreal Expos%';";
            System.out.println(" doing " + query);
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
            System.out.println(" Walking ");
            ParseTreeWalker.DEFAULT.walk(extractor, tree);
            System.out.println(" Walked ");
            RetrieveData rd = new RetrieveData();
            rd.setParser(parser);
            rd.retrieveData();
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
}
