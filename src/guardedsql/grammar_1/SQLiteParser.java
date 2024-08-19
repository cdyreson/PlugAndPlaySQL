// Generated from SQLite.g4 by ANTLR 4.7.1

    package guardedsql.grammar;
    import guardedsql.database.DB;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SCOL=3, DOT=4, OPEN_PAR=5, CLOSE_PAR=6, COMMA=7, ASSIGN=8, 
		STAR=9, PLUS=10, MINUS=11, TILDE=12, PIPE2=13, DIV=14, MOD=15, LT2=16, 
		GT2=17, AMP=18, PIPE=19, LT=20, LT_EQ=21, GT=22, GT_EQ=23, EQ=24, NOT_EQ1=25, 
		NOT_EQ2=26, K_SEMANTICS=27, K_MINTIME=28, K_MAXTIME=29, K_NOTVIABLE=30, 
		K_TIME=31, K_MAX=32, K_MIN=33, K_ABORT=34, K_ACTION=35, K_ADD=36, K_AFTER=37, 
		K_ALL=38, K_ALTER=39, K_ANALYZE=40, K_AND=41, K_AS=42, K_ASC=43, K_ATTACH=44, 
		K_AUTOINCREMENT=45, K_BEFORE=46, K_BEGIN=47, K_BETWEEN=48, K_BY=49, K_CASCADE=50, 
		K_CASE=51, K_CAST=52, K_CHECK=53, K_COLLATE=54, K_COLUMN=55, K_COMMIT=56, 
		K_CONFLICT=57, K_CONSTRAINT=58, K_CREATE=59, K_CROSS=60, K_CURRENT_DATE=61, 
		K_CURRENT_TIME=62, K_CURRENT_TIMESTAMP=63, K_DATABASE=64, K_DEFAULT=65, 
		K_DEFERRABLE=66, K_DEFERRED=67, K_DELETE=68, K_DESC=69, K_DETACH=70, K_DISTINCT=71, 
		K_DROP=72, K_EACH=73, K_ELSE=74, K_END=75, K_ESCAPE=76, K_EXCEPT=77, K_EXCLUSIVE=78, 
		K_EXISTS=79, K_EXPLAIN=80, K_FAIL=81, K_FOR=82, K_FOREIGN=83, K_FROM=84, 
		K_FULL=85, K_GLOB=86, K_GROUP=87, K_GUARD=88, K_HAVING=89, K_IF=90, K_IGNORE=91, 
		K_IMMEDIATE=92, K_IN=93, K_INDEX=94, K_INDEXED=95, K_INITIALLY=96, K_INNER=97, 
		K_INSERT=98, K_INSTEAD=99, K_INTERSECT=100, K_INTO=101, K_IS=102, K_ISNULL=103, 
		K_JOIN=104, K_KEY=105, K_LEFT=106, K_LIKE=107, K_LIMIT=108, K_MATCH=109, 
		K_NATURAL=110, K_NO=111, K_NOT=112, K_NOTNULL=113, K_NULL=114, K_OF=115, 
		K_OFFSET=116, K_ON=117, K_OR=118, K_ORDER=119, K_OUTER=120, K_PLAN=121, 
		K_PRAGMA=122, K_PRIMARY=123, K_QUERY=124, K_RAISE=125, K_RECURSIVE=126, 
		K_REFERENCES=127, K_REGEXP=128, K_REINDEX=129, K_RELEASE=130, K_RENAME=131, 
		K_REPLACE=132, K_RESTRICT=133, K_RIGHT=134, K_ROLLBACK=135, K_ROW=136, 
		K_SAVEPOINT=137, K_SELECT=138, K_SET=139, K_TABLE=140, K_TEMP=141, K_TEMPORARY=142, 
		K_THEN=143, K_TO=144, K_TRANSACTION=145, K_TRIGGER=146, K_UNION=147, K_UNIQUE=148, 
		K_UPDATE=149, K_USING=150, K_VACUUM=151, K_VALUES=152, K_VIEW=153, K_VIRTUAL=154, 
		K_WHEN=155, K_WHERE=156, K_WITH=157, K_WITHOUT=158, K_COMPOSE=159, IDENTIFIER=160, 
		NUMERIC_LITERAL=161, BIND_PARAMETER=162, SEMANTICS_LITERAL=163, STRING_LITERAL=164, 
		AT_SYMBOL=165, BLOB_LITERAL=166, SINGLE_LINE_COMMENT=167, MULTILINE_COMMENT=168, 
		SPACES=169, WHITE_SPACE=170, UNEXPECTED_CHAR=171;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_compound_select_stmt = 4, RULE_simple_select_stmt = 5, RULE_select_stmt = 6, 
		RULE_select_or_values = 7, RULE_type_name = 8, RULE_path_expr = 9, RULE_expr = 10, 
		RULE_outer_guard_clause = 11, RULE_guard_clause = 12, RULE_guard_comma = 13, 
		RULE_opening_brace = 14, RULE_closing_brace = 15, RULE_comp_op = 16, RULE_with_clause = 17, 
		RULE_qualified_table_name = 18, RULE_ordering_term = 19, RULE_pragma_value = 20, 
		RULE_common_table_expression = 21, RULE_result_column = 22, RULE_table_or_subquery = 23, 
		RULE_join_clause = 24, RULE_join_operator = 25, RULE_join_constraint = 26, 
		RULE_select_core = 27, RULE_having_clause = 28, RULE_groupby_clause = 29, 
		RULE_groupby_expr = 30, RULE_select_clause = 31, RULE_from_clause = 32, 
		RULE_where_clause = 33, RULE_compound_operator = 34, RULE_cte_table_name = 35, 
		RULE_signed_number = 36, RULE_literal_value = 37, RULE_unary_operator = 38, 
		RULE_error_message = 39, RULE_module_argument = 40, RULE_column_alias = 41, 
		RULE_keyword = 42, RULE_name = 43, RULE_function_name = 44, RULE_database_name = 45, 
		RULE_table_name = 46, RULE_table_or_index_name = 47, RULE_new_table_name = 48, 
		RULE_column_name = 49, RULE_collation_name = 50, RULE_foreign_table = 51, 
		RULE_index_name = 52, RULE_trigger_name = 53, RULE_view_name = 54, RULE_module_name = 55, 
		RULE_pragma_name = 56, RULE_savepoint_name = 57, RULE_table_alias = 58, 
		RULE_transaction_name = 59, RULE_any_name = 60, RULE_guard_key_name = 61;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "compound_select_stmt", 
		"simple_select_stmt", "select_stmt", "select_or_values", "type_name", 
		"path_expr", "expr", "outer_guard_clause", "guard_clause", "guard_comma", 
		"opening_brace", "closing_brace", "comp_op", "with_clause", "qualified_table_name", 
		"ordering_term", "pragma_value", "common_table_expression", "result_column", 
		"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
		"select_core", "having_clause", "groupby_clause", "groupby_expr", "select_clause", 
		"from_clause", "where_clause", "compound_operator", "cte_table_name", 
		"signed_number", "literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "function_name", "database_name", "table_name", 
		"table_or_index_name", "new_table_name", "column_name", "collation_name", 
		"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
		"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name", 
		"guard_key_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", 
		"'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", 
		"STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", 
		"AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", 
		"K_SEMANTICS", "K_MINTIME", "K_MAXTIME", "K_NOTVIABLE", "K_TIME", "K_MAX", 
		"K_MIN", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", 
		"K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", 
		"K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", 
		"K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", 
		"K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
		"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", 
		"K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", 
		"K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", 
		"K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_GUARD", "K_HAVING", 
		"K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
		"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
		"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", 
		"K_WITHOUT", "K_COMPOSE", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
		"SEMANTICS_LITERAL", "STRING_LITERAL", "AT_SYMBOL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "SPACES", "WHITE_SPACE", "UNEXPECTED_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  public DB db;

	  public void unsupported(String msg) {
	    System.err.println("Unsupported Feature: " + msg + " is not yet supported");
	    System.exit(-1);
	  }


	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==K_GUARD || _la==K_SELECT || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (K_VALUES - 152)) | (1L << (K_WITH - 152)) | (1L << (UNEXPECTED_CHAR - 152)))) != 0)) {
				{
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_GUARD:
				case K_SELECT:
				case K_VALUES:
				case K_WITH:
					{
					setState(124);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(125);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt_list(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(136);
				match(SCOL);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			sql_stmt();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(143);
						match(SCOL);
						}
						}
						setState(146); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(148);
					sql_stmt();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					match(SCOL);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(160);
				simple_select_stmt();
				}
				break;
			case 2:
				{
				setState(161);
				select_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SQLiteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLiteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLiteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLiteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLiteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLiteParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLiteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLiteParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_select_stmt(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(164);
				match(K_WITH);
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(165);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(168);
				common_table_expression();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(169);
					match(COMMA);
					setState(170);
					common_table_expression();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(178);
			select_core();
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(179);
					match(K_UNION);
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(180);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(183);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(184);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187);
				select_core();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(192);
				match(K_ORDER);
				setState(193);
				match(K_BY);
				setState(194);
				ordering_term();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(195);
					match(COMMA);
					setState(196);
					ordering_term();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(204);
				match(K_LIMIT);
				setState(205);
				expr(0);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(206);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(207);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSimple_select_stmt(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(212);
				match(K_WITH);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(213);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(216);
				common_table_expression();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(217);
					match(COMMA);
					setState(218);
					common_table_expression();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(226);
			select_core();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(227);
				match(K_ORDER);
				setState(228);
				match(K_BY);
				setState(229);
				ordering_term();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(230);
					match(COMMA);
					setState(231);
					ordering_term();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(239);
				match(K_LIMIT);
				setState(240);
				expr(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(241);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(242);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(247);
				match(K_WITH);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(248);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(251);
				common_table_expression();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(252);
					match(COMMA);
					setState(253);
					common_table_expression();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(261);
			select_or_values();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(262);
				compound_operator();
				setState(263);
				select_or_values();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(270);
				match(K_ORDER);
				setState(271);
				match(K_BY);
				setState(272);
				ordering_term();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					ordering_term();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(282);
				match(K_LIMIT);
				setState(283);
				expr(0);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(284);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(285);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public Outer_guard_clauseContext outer_guard_clause() {
			return getRuleContext(Outer_guard_clauseContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_or_values(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select_or_values);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_GUARD:
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GUARD) {
					{
					setState(290);
					outer_guard_clause(db);
					}
				}

				setState(293);
				match(K_SELECT);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(294);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(297);
				result_column();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(298);
					match(COMMA);
					setState(299);
					result_column();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(305);
					match(K_FROM);
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(306);
						table_or_subquery();
						setState(311);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(307);
							match(COMMA);
							setState(308);
							table_or_subquery();
							}
							}
							setState(313);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(314);
						join_clause();
						}
						break;
					}
					}
				}

				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(319);
					match(K_WHERE);
					setState(320);
					expr(0);
					}
				}

				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(323);
					match(K_GROUP);
					setState(324);
					match(K_BY);
					setState(325);
					expr(0);
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(326);
						match(COMMA);
						setState(327);
						expr(0);
						}
						}
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(333);
						match(K_HAVING);
						setState(334);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(K_VALUES);
				setState(340);
				match(OPEN_PAR);
				setState(341);
				expr(0);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(342);
					match(COMMA);
					setState(343);
					expr(0);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				match(CLOSE_PAR);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(350);
					match(COMMA);
					setState(351);
					match(OPEN_PAR);
					setState(352);
					expr(0);
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(353);
						match(COMMA);
						setState(354);
						expr(0);
						}
						}
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(360);
					match(CLOSE_PAR);
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(369);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(374);
				match(OPEN_PAR);
				setState(375);
				signed_number();
				setState(376);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(378);
				match(OPEN_PAR);
				setState(379);
				signed_number();
				setState(380);
				match(COMMA);
				setState(381);
				signed_number();
				setState(382);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_exprContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Path_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPath_expr(this);
		}
	}

	public final Path_exprContext path_expr() throws RecognitionException {
		Path_exprContext _localctx = new Path_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_path_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			any_name();
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					match(DOT);
					setState(388);
					any_name();
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Path_exprContext path_expr() {
			return getRuleContext(Path_exprContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(395);
				literal_value();
				}
				break;
			case 2:
				{
				setState(396);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(397);
						database_name();
						setState(398);
						match(DOT);
						}
						break;
					}
					setState(402);
					table_name();
					setState(403);
					match(DOT);
					}
					break;
				}
				setState(407);
				column_name();
				}
				break;
			case 4:
				{
				setState(408);
				path_expr();
				}
				break;
			case 5:
				{
				setState(409);
				unary_operator();
				setState(410);
				expr(16);
				}
				break;
			case 6:
				{
				setState(412);
				function_name();
				setState(413);
				match(OPEN_PAR);
				setState(426);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_GUARD:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(414);
						match(K_DISTINCT);
						}
						break;
					}
					setState(417);
					expr(0);
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(418);
						match(COMMA);
						setState(419);
						expr(0);
						}
						}
						setState(424);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(425);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(428);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(430);
				match(OPEN_PAR);
				setState(431);
				expr(0);
				setState(432);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(434);
				match(K_CAST);
				setState(435);
				match(OPEN_PAR);
				setState(436);
				expr(0);
				setState(437);
				match(K_AS);
				setState(438);
				type_name();
				setState(439);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(441);
						match(K_NOT);
						}
					}

					setState(444);
					match(K_EXISTS);
					}
				}

				setState(447);
				match(OPEN_PAR);
				setState(448);
				select_stmt();
				setState(449);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(451);
				match(K_CASE);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(452);
					expr(0);
					}
					break;
				}
				setState(460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(455);
					match(K_WHEN);
					setState(456);
					expr(0);
					setState(457);
					match(K_THEN);
					setState(458);
					expr(0);
					}
					}
					setState(462); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(464);
					match(K_ELSE);
					setState(465);
					expr(0);
					}
				}

				setState(468);
				match(K_END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(546);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(472);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(473);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(474);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(475);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(476);
						comp_op();
						setState(477);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(479);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(480);
						match(K_AND);
						setState(481);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(482);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(483);
						match(K_OR);
						setState(484);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(485);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(486);
						match(K_IS);
						setState(488);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(487);
							match(K_NOT);
							}
							break;
						}
						setState(490);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(491);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(493);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(492);
							match(K_NOT);
							}
						}

						setState(495);
						match(K_BETWEEN);
						setState(496);
						expr(0);
						setState(497);
						match(K_AND);
						setState(498);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(500);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(501);
						match(K_COLLATE);
						setState(502);
						collation_name();
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(503);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(505);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(504);
							match(K_NOT);
							}
						}

						setState(507);
						_la = _input.LA(1);
						if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_GLOB - 86)) | (1L << (K_LIKE - 86)) | (1L << (K_MATCH - 86)) | (1L << (K_REGEXP - 86)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(508);
						expr(0);
						setState(511);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
						case 1:
							{
							setState(509);
							match(K_ESCAPE);
							setState(510);
							expr(0);
							}
							break;
						}
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(513);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(518);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(514);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(515);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(516);
							match(K_NOT);
							setState(517);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(520);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(522);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(521);
							match(K_NOT);
							}
						}

						setState(524);
						match(K_IN);
						setState(544);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(525);
							match(OPEN_PAR);
							setState(535);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
							case 1:
								{
								setState(526);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(527);
								expr(0);
								setState(532);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(528);
									match(COMMA);
									setState(529);
									expr(0);
									}
									}
									setState(534);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(537);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(541);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
							case 1:
								{
								setState(538);
								database_name();
								setState(539);
								match(DOT);
								}
								break;
							}
							setState(543);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Outer_guard_clauseContext extends ParserRuleContext {
		public DB db;
		public TerminalNode K_GUARD() { return getToken(SQLiteParser.K_GUARD, 0); }
		public Guard_clauseContext guard_clause() {
			return getRuleContext(Guard_clauseContext.class,0);
		}
		public Outer_guard_clauseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Outer_guard_clauseContext(ParserRuleContext parent, int invokingState, DB db) {
			super(parent, invokingState);
			this.db = db;
		}
		@Override public int getRuleIndex() { return RULE_outer_guard_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOuter_guard_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOuter_guard_clause(this);
		}
	}

	public final Outer_guard_clauseContext outer_guard_clause(DB db) throws RecognitionException {
		Outer_guard_clauseContext _localctx = new Outer_guard_clauseContext(_ctx, getState(), db);
		enterRule(_localctx, 22, RULE_outer_guard_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(K_GUARD);
			setState(552);
			guard_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_clauseContext extends ParserRuleContext {
		public List<Guard_key_nameContext> guard_key_name() {
			return getRuleContexts(Guard_key_nameContext.class);
		}
		public Guard_key_nameContext guard_key_name(int i) {
			return getRuleContext(Guard_key_nameContext.class,i);
		}
		public List<Opening_braceContext> opening_brace() {
			return getRuleContexts(Opening_braceContext.class);
		}
		public Opening_braceContext opening_brace(int i) {
			return getRuleContext(Opening_braceContext.class,i);
		}
		public List<Guard_clauseContext> guard_clause() {
			return getRuleContexts(Guard_clauseContext.class);
		}
		public Guard_clauseContext guard_clause(int i) {
			return getRuleContext(Guard_clauseContext.class,i);
		}
		public List<Closing_braceContext> closing_brace() {
			return getRuleContexts(Closing_braceContext.class);
		}
		public Closing_braceContext closing_brace(int i) {
			return getRuleContext(Closing_braceContext.class,i);
		}
		public List<Guard_commaContext> guard_comma() {
			return getRuleContexts(Guard_commaContext.class);
		}
		public Guard_commaContext guard_comma(int i) {
			return getRuleContext(Guard_commaContext.class,i);
		}
		public Guard_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGuard_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGuard_clause(this);
		}
	}

	public final Guard_clauseContext guard_clause() throws RecognitionException {
		Guard_clauseContext _localctx = new Guard_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_guard_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(554);
					guard_key_name();
					setState(562);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						{
						setState(555);
						opening_brace();
						setState(556);
						guard_clause();
						setState(557);
						closing_brace();
						}
						}
						break;
					case COMMA:
						{
						{
						setState(559);
						guard_comma();
						setState(560);
						guard_clause();
						}
						}
						break;
					case T__1:
					case OPEN_PAR:
					case K_ABORT:
					case K_ACTION:
					case K_ADD:
					case K_AFTER:
					case K_ALL:
					case K_ALTER:
					case K_ANALYZE:
					case K_AND:
					case K_AS:
					case K_ASC:
					case K_ATTACH:
					case K_AUTOINCREMENT:
					case K_BEFORE:
					case K_BEGIN:
					case K_BETWEEN:
					case K_BY:
					case K_CASCADE:
					case K_CASE:
					case K_CAST:
					case K_CHECK:
					case K_COLLATE:
					case K_COLUMN:
					case K_COMMIT:
					case K_CONFLICT:
					case K_CONSTRAINT:
					case K_CREATE:
					case K_CROSS:
					case K_CURRENT_DATE:
					case K_CURRENT_TIME:
					case K_CURRENT_TIMESTAMP:
					case K_DATABASE:
					case K_DEFAULT:
					case K_DEFERRABLE:
					case K_DEFERRED:
					case K_DELETE:
					case K_DESC:
					case K_DETACH:
					case K_DISTINCT:
					case K_DROP:
					case K_EACH:
					case K_ELSE:
					case K_END:
					case K_ESCAPE:
					case K_EXCEPT:
					case K_EXCLUSIVE:
					case K_EXISTS:
					case K_EXPLAIN:
					case K_FAIL:
					case K_FOR:
					case K_FOREIGN:
					case K_FROM:
					case K_FULL:
					case K_GLOB:
					case K_GROUP:
					case K_GUARD:
					case K_HAVING:
					case K_IF:
					case K_IGNORE:
					case K_IMMEDIATE:
					case K_IN:
					case K_INDEX:
					case K_INDEXED:
					case K_INITIALLY:
					case K_INNER:
					case K_INSERT:
					case K_INSTEAD:
					case K_INTERSECT:
					case K_INTO:
					case K_IS:
					case K_ISNULL:
					case K_JOIN:
					case K_KEY:
					case K_LEFT:
					case K_LIKE:
					case K_LIMIT:
					case K_MATCH:
					case K_NATURAL:
					case K_NO:
					case K_NOT:
					case K_NOTNULL:
					case K_NULL:
					case K_OF:
					case K_OFFSET:
					case K_ON:
					case K_OR:
					case K_ORDER:
					case K_OUTER:
					case K_PLAN:
					case K_PRAGMA:
					case K_PRIMARY:
					case K_QUERY:
					case K_RAISE:
					case K_RECURSIVE:
					case K_REFERENCES:
					case K_REGEXP:
					case K_REINDEX:
					case K_RELEASE:
					case K_RENAME:
					case K_REPLACE:
					case K_RESTRICT:
					case K_RIGHT:
					case K_ROLLBACK:
					case K_ROW:
					case K_SAVEPOINT:
					case K_SELECT:
					case K_SET:
					case K_TABLE:
					case K_TEMP:
					case K_TEMPORARY:
					case K_THEN:
					case K_TO:
					case K_TRANSACTION:
					case K_TRIGGER:
					case K_UNION:
					case K_UNIQUE:
					case K_UPDATE:
					case K_USING:
					case K_VACUUM:
					case K_VALUES:
					case K_VIEW:
					case K_VIRTUAL:
					case K_WHEN:
					case K_WHERE:
					case K_WITH:
					case K_WITHOUT:
					case IDENTIFIER:
					case STRING_LITERAL:
						break;
					default:
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(566); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_commaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Guard_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGuard_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGuard_comma(this);
		}
	}

	public final Guard_commaContext guard_comma() throws RecognitionException {
		Guard_commaContext _localctx = new Guard_commaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_guard_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opening_braceContext extends ParserRuleContext {
		public Opening_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opening_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOpening_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOpening_brace(this);
		}
	}

	public final Opening_braceContext opening_brace() throws RecognitionException {
		Opening_braceContext _localctx = new Opening_braceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opening_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closing_braceContext extends ParserRuleContext {
		public Closing_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closing_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterClosing_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitClosing_brace(this);
		}
	}

	public final Closing_braceContext closing_brace() throws RecognitionException {
		Closing_braceContext _localctx = new Closing_braceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_closing_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comp_op);
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(PIPE2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(LT2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(GT2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(577);
				match(AMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(578);
				match(PIPE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(579);
				match(LT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(580);
				match(LT_EQ);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(581);
				match(GT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(582);
				match(GT_EQ);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(583);
				match(ASSIGN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(584);
				match(EQ);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(585);
				match(NOT_EQ1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(586);
				match(NOT_EQ2);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(587);
				match(K_IS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(588);
				match(K_IS);
				setState(589);
				match(K_NOT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(590);
				match(K_IN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(591);
				match(K_LIKE);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(592);
				match(K_GLOB);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(593);
				match(K_MATCH);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(594);
				match(K_REGEXP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLiteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SQLiteParser.K_AS, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_clause(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(K_WITH);
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(598);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(601);
			cte_table_name();
			setState(602);
			match(K_AS);
			setState(603);
			match(OPEN_PAR);
			setState(604);
			select_stmt();
			setState(605);
			match(CLOSE_PAR);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(606);
				match(COMMA);
				setState(607);
				cte_table_name();
				setState(608);
				match(K_AS);
				setState(609);
				match(OPEN_PAR);
				setState(610);
				select_stmt();
				setState(611);
				match(CLOSE_PAR);
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitQualified_table_name(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(618);
				database_name();
				setState(619);
				match(DOT);
				}
				break;
			}
			setState(623);
			table_name();
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(624);
				match(K_INDEXED);
				setState(625);
				match(K_BY);
				setState(626);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(627);
				match(K_NOT);
				setState(628);
				match(K_INDEXED);
				}
				break;
			case EOF:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrdering_term(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			expr(0);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(632);
				match(K_COLLATE);
				setState(633);
				collation_name();
				}
			}

			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(636);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_value(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pragma_value);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(641);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommon_table_expression(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			table_name();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(645);
				match(OPEN_PAR);
				setState(646);
				column_name();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(647);
					match(COMMA);
					setState(648);
					column_name();
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(654);
				match(CLOSE_PAR);
				}
			}

			setState(658);
			match(K_AS);
			setState(659);
			match(OPEN_PAR);
			setState(660);
			select_stmt();
			setState(661);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_result_column);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				table_name();
				setState(665);
				match(DOT);
				setState(666);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				expr(0);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(669);
						match(K_AS);
						}
					}

					setState(672);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext t;
		public Table_aliasContext alias;
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_subquery(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_table_or_subquery);
		int _la;
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(677);
					database_name();
					setState(678);
					match(DOT);
					}
					break;
				}
				setState(682);
				((Table_or_subqueryContext)_localctx).t = table_name();
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(684);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(683);
						match(K_AS);
						}
						break;
					}
					setState(686);
					((Table_or_subqueryContext)_localctx).alias = table_alias();
					}
					break;
				}
				setState(694);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(689);
					match(K_INDEXED);
					setState(690);
					match(K_BY);
					setState(691);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(692);
					match(K_NOT);
					setState(693);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_CROSS:
				case K_EXCEPT:
				case K_GROUP:
				case K_GUARD:
				case K_INNER:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_SELECT:
				case K_UNION:
				case K_USING:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(OPEN_PAR);
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(697);
					table_or_subquery();
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(698);
						match(COMMA);
						setState(699);
						table_or_subquery();
						}
						}
						setState(704);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(705);
					join_clause();
					}
					break;
				}
				setState(708);
				match(CLOSE_PAR);
				setState(713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(710);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(709);
						match(K_AS);
						}
						break;
					}
					setState(712);
					((Table_or_subqueryContext)_localctx).alias = table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				match(OPEN_PAR);
				setState(716);
				select_stmt();
				setState(717);
				match(CLOSE_PAR);
				setState(722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(719);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(718);
						match(K_AS);
						}
						break;
					}
					setState(721);
					((Table_or_subqueryContext)_localctx).alias = table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_clause(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			table_or_subquery();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (K_INNER - 97)) | (1L << (K_JOIN - 97)) | (1L << (K_LEFT - 97)) | (1L << (K_NATURAL - 97)))) != 0)) {
				{
				{
				setState(727);
				join_operator();
				setState(728);
				table_or_subquery();
				setState(729);
				join_constraint();
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_operator(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_join_operator);
		int _la;
		try {
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(737);
					match(K_NATURAL);
					}
				}

				setState(746);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(740);
					match(K_LEFT);
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(741);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(744);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(745);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(748);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_constraint(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(751);
				match(K_ON);
				setState(752);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(753);
				match(K_USING);
				setState(754);
				match(OPEN_PAR);
				setState(755);
				column_name();
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(756);
					match(COMMA);
					setState(757);
					column_name();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_CROSS:
			case K_EXCEPT:
			case K_GROUP:
			case K_GUARD:
			case K_INNER:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_SELECT:
			case K_UNION:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public Outer_guard_clauseContext guard;
		public Select_clauseContext select;
		public From_clauseContext from;
		public Where_clauseContext where;
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Outer_guard_clauseContext outer_guard_clause() {
			return getRuleContext(Outer_guard_clauseContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_core(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_select_core);
		int _la;
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_GUARD:
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GUARD) {
					{
					setState(767);
					((Select_coreContext)_localctx).guard = outer_guard_clause(db);
					}
				}

				setState(770);
				((Select_coreContext)_localctx).select = select_clause();
				setState(771);
				((Select_coreContext)_localctx).from = from_clause();
				setState(772);
				((Select_coreContext)_localctx).where = where_clause();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(773);
					groupby_clause();
					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				match(K_VALUES);
				setState(777);
				match(OPEN_PAR);
				setState(778);
				expr(0);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(779);
					match(COMMA);
					setState(780);
					expr(0);
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(786);
				match(CLOSE_PAR);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(787);
					match(COMMA);
					setState(788);
					match(OPEN_PAR);
					setState(789);
					expr(0);
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(790);
						match(COMMA);
						setState(791);
						expr(0);
						}
						}
						setState(796);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(797);
					match(CLOSE_PAR);
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(K_HAVING);
			setState(807);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Groupby_exprContext> groupby_expr() {
			return getRuleContexts(Groupby_exprContext.class);
		}
		public Groupby_exprContext groupby_expr(int i) {
			return getRuleContext(Groupby_exprContext.class,i);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGroupby_clause(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(K_GROUP);
			setState(810);
			match(K_BY);
			setState(811);
			groupby_expr();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(812);
				match(COMMA);
				setState(813);
				groupby_expr();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_HAVING) {
				{
				setState(819);
				having_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Groupby_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGroupby_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGroupby_expr(this);
		}
	}

	public final Groupby_exprContext groupby_expr() throws RecognitionException {
		Groupby_exprContext _localctx = new Groupby_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_groupby_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_clause(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(K_SELECT);
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(825);
				_la = _input.LA(1);
				if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(828);
			result_column();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(829);
				match(COMMA);
				setState(830);
				result_column();
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(836);
				match(K_FROM);
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(837);
					table_or_subquery();
					setState(842);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(838);
						match(COMMA);
						setState(839);
						table_or_subquery();
						}
						}
						setState(844);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(845);
					join_clause();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_where_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(850);
				match(K_WHERE);
				setState(851);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_operator(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_compound_operator);
		try {
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(K_UNION);
				setState(856);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				match(K_EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCte_table_name(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			table_name();
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(862);
				match(OPEN_PAR);
				setState(863);
				column_name();
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(864);
					match(COMMA);
					setState(865);
					column_name();
					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(871);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(875);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(878);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (K_NULL - 114)) | (1L << (NUMERIC_LITERAL - 114)) | (1L << (STRING_LITERAL - 114)) | (1L << (BLOB_LITERAL - 114)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError_message(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_argument(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_module_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_GUARD() { return getToken(SQLiteParser.K_GUARD, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (K_ABORT - 34)) | (1L << (K_ACTION - 34)) | (1L << (K_ADD - 34)) | (1L << (K_AFTER - 34)) | (1L << (K_ALL - 34)) | (1L << (K_ALTER - 34)) | (1L << (K_ANALYZE - 34)) | (1L << (K_AND - 34)) | (1L << (K_AS - 34)) | (1L << (K_ASC - 34)) | (1L << (K_ATTACH - 34)) | (1L << (K_AUTOINCREMENT - 34)) | (1L << (K_BEFORE - 34)) | (1L << (K_BEGIN - 34)) | (1L << (K_BETWEEN - 34)) | (1L << (K_BY - 34)) | (1L << (K_CASCADE - 34)) | (1L << (K_CASE - 34)) | (1L << (K_CAST - 34)) | (1L << (K_CHECK - 34)) | (1L << (K_COLLATE - 34)) | (1L << (K_COLUMN - 34)) | (1L << (K_COMMIT - 34)) | (1L << (K_CONFLICT - 34)) | (1L << (K_CONSTRAINT - 34)) | (1L << (K_CREATE - 34)) | (1L << (K_CROSS - 34)) | (1L << (K_CURRENT_DATE - 34)) | (1L << (K_CURRENT_TIME - 34)) | (1L << (K_CURRENT_TIMESTAMP - 34)) | (1L << (K_DATABASE - 34)) | (1L << (K_DEFAULT - 34)) | (1L << (K_DEFERRABLE - 34)) | (1L << (K_DEFERRED - 34)) | (1L << (K_DELETE - 34)) | (1L << (K_DESC - 34)) | (1L << (K_DETACH - 34)) | (1L << (K_DISTINCT - 34)) | (1L << (K_DROP - 34)) | (1L << (K_EACH - 34)) | (1L << (K_ELSE - 34)) | (1L << (K_END - 34)) | (1L << (K_ESCAPE - 34)) | (1L << (K_EXCEPT - 34)) | (1L << (K_EXCLUSIVE - 34)) | (1L << (K_EXISTS - 34)) | (1L << (K_EXPLAIN - 34)) | (1L << (K_FAIL - 34)) | (1L << (K_FOR - 34)) | (1L << (K_FOREIGN - 34)) | (1L << (K_FROM - 34)) | (1L << (K_FULL - 34)) | (1L << (K_GLOB - 34)) | (1L << (K_GROUP - 34)) | (1L << (K_GUARD - 34)) | (1L << (K_HAVING - 34)) | (1L << (K_IF - 34)) | (1L << (K_IGNORE - 34)) | (1L << (K_IMMEDIATE - 34)) | (1L << (K_IN - 34)) | (1L << (K_INDEX - 34)) | (1L << (K_INDEXED - 34)) | (1L << (K_INITIALLY - 34)) | (1L << (K_INNER - 34)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (K_INSERT - 98)) | (1L << (K_INSTEAD - 98)) | (1L << (K_INTERSECT - 98)) | (1L << (K_INTO - 98)) | (1L << (K_IS - 98)) | (1L << (K_ISNULL - 98)) | (1L << (K_JOIN - 98)) | (1L << (K_KEY - 98)) | (1L << (K_LEFT - 98)) | (1L << (K_LIKE - 98)) | (1L << (K_LIMIT - 98)) | (1L << (K_MATCH - 98)) | (1L << (K_NATURAL - 98)) | (1L << (K_NO - 98)) | (1L << (K_NOT - 98)) | (1L << (K_NOTNULL - 98)) | (1L << (K_NULL - 98)) | (1L << (K_OF - 98)) | (1L << (K_OFFSET - 98)) | (1L << (K_ON - 98)) | (1L << (K_OR - 98)) | (1L << (K_ORDER - 98)) | (1L << (K_OUTER - 98)) | (1L << (K_PLAN - 98)) | (1L << (K_PRAGMA - 98)) | (1L << (K_PRIMARY - 98)) | (1L << (K_QUERY - 98)) | (1L << (K_RAISE - 98)) | (1L << (K_RECURSIVE - 98)) | (1L << (K_REFERENCES - 98)) | (1L << (K_REGEXP - 98)) | (1L << (K_REINDEX - 98)) | (1L << (K_RELEASE - 98)) | (1L << (K_RENAME - 98)) | (1L << (K_REPLACE - 98)) | (1L << (K_RESTRICT - 98)) | (1L << (K_RIGHT - 98)) | (1L << (K_ROLLBACK - 98)) | (1L << (K_ROW - 98)) | (1L << (K_SAVEPOINT - 98)) | (1L << (K_SELECT - 98)) | (1L << (K_SET - 98)) | (1L << (K_TABLE - 98)) | (1L << (K_TEMP - 98)) | (1L << (K_TEMPORARY - 98)) | (1L << (K_THEN - 98)) | (1L << (K_TO - 98)) | (1L << (K_TRANSACTION - 98)) | (1L << (K_TRIGGER - 98)) | (1L << (K_UNION - 98)) | (1L << (K_UNIQUE - 98)) | (1L << (K_UPDATE - 98)) | (1L << (K_USING - 98)) | (1L << (K_VACUUM - 98)) | (1L << (K_VALUES - 98)) | (1L << (K_VIEW - 98)) | (1L << (K_VIRTUAL - 98)) | (1L << (K_WHEN - 98)) | (1L << (K_WHERE - 98)) | (1L << (K_WITH - 98)) | (1L << (K_WITHOUT - 98)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDatabase_name(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_index_name(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNew_table_name(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCollation_name(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_table(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTrigger_name(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitView_name(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_name(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_name(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_name(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTransaction_name(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_any_name);
		try {
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_GUARD:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(929);
				match(OPEN_PAR);
				setState(930);
				any_name();
				setState(931);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_key_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Guard_key_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_key_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGuard_key_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGuard_key_name(this);
		}
	}

	public final Guard_key_nameContext guard_key_name() throws RecognitionException {
		Guard_key_nameContext _localctx = new Guard_key_nameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_guard_key_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(935);
					database_name();
					setState(936);
					match(DOT);
					}
					break;
				}
				setState(940);
				table_name();
				setState(941);
				match(DOT);
				}
				break;
			}
			setState(945);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ad\u03b6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\7\4\u008c\n\4\f\4\16\4\u008f\13\4\3\4\3\4\6\4\u0093\n\4\r\4\16"+
		"\4\u0094\3\4\7\4\u0098\n\4\f\4\16\4\u009b\13\4\3\4\7\4\u009e\n\4\f\4\16"+
		"\4\u00a1\13\4\3\5\3\5\5\5\u00a5\n\5\3\6\3\6\5\6\u00a9\n\6\3\6\3\6\3\6"+
		"\7\6\u00ae\n\6\f\6\16\6\u00b1\13\6\5\6\u00b3\n\6\3\6\3\6\3\6\5\6\u00b8"+
		"\n\6\3\6\3\6\5\6\u00bc\n\6\3\6\6\6\u00bf\n\6\r\6\16\6\u00c0\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u00c8\n\6\f\6\16\6\u00cb\13\6\5\6\u00cd\n\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00d3\n\6\5\6\u00d5\n\6\3\7\3\7\5\7\u00d9\n\7\3\7\3\7\3\7\7\7"+
		"\u00de\n\7\f\7\16\7\u00e1\13\7\5\7\u00e3\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u00eb\n\7\f\7\16\7\u00ee\13\7\5\7\u00f0\n\7\3\7\3\7\3\7\3\7\5\7\u00f6"+
		"\n\7\5\7\u00f8\n\7\3\b\3\b\5\b\u00fc\n\b\3\b\3\b\3\b\7\b\u0101\n\b\f\b"+
		"\16\b\u0104\13\b\5\b\u0106\n\b\3\b\3\b\3\b\3\b\7\b\u010c\n\b\f\b\16\b"+
		"\u010f\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u0116\n\b\f\b\16\b\u0119\13\b\5\b"+
		"\u011b\n\b\3\b\3\b\3\b\3\b\5\b\u0121\n\b\5\b\u0123\n\b\3\t\5\t\u0126\n"+
		"\t\3\t\3\t\5\t\u012a\n\t\3\t\3\t\3\t\7\t\u012f\n\t\f\t\16\t\u0132\13\t"+
		"\3\t\3\t\3\t\3\t\7\t\u0138\n\t\f\t\16\t\u013b\13\t\3\t\5\t\u013e\n\t\5"+
		"\t\u0140\n\t\3\t\3\t\5\t\u0144\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u014b\n\t\f"+
		"\t\16\t\u014e\13\t\3\t\3\t\5\t\u0152\n\t\5\t\u0154\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u015b\n\t\f\t\16\t\u015e\13\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0166"+
		"\n\t\f\t\16\t\u0169\13\t\3\t\3\t\7\t\u016d\n\t\f\t\16\t\u0170\13\t\5\t"+
		"\u0172\n\t\3\n\6\n\u0175\n\n\r\n\16\n\u0176\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0183\n\n\3\13\3\13\3\13\7\13\u0188\n\13\f\13\16\13"+
		"\u018b\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0193\n\f\3\f\3\f\3\f\5\f\u0198"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01a2\n\f\3\f\3\f\3\f\7\f\u01a7"+
		"\n\f\f\f\16\f\u01aa\13\f\3\f\5\f\u01ad\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01bd\n\f\3\f\5\f\u01c0\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u01c8\n\f\3\f\3\f\3\f\3\f\3\f\6\f\u01cf\n\f\r\f\16"+
		"\f\u01d0\3\f\3\f\5\f\u01d5\n\f\3\f\3\f\5\f\u01d9\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01eb\n\f\3\f\3\f\3"+
		"\f\5\f\u01f0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01fc\n\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0202\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0209\n\f\3\f\3"+
		"\f\5\f\u020d\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0215\n\f\f\f\16\f\u0218"+
		"\13\f\5\f\u021a\n\f\3\f\3\f\3\f\3\f\5\f\u0220\n\f\3\f\5\f\u0223\n\f\7"+
		"\f\u0225\n\f\f\f\16\f\u0228\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0235\n\16\6\16\u0237\n\16\r\16\16\16\u0238\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0256"+
		"\n\22\3\23\3\23\5\23\u025a\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u0268\n\23\f\23\16\23\u026b\13\23\3\24\3\24"+
		"\3\24\5\24\u0270\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0278\n\24\3"+
		"\25\3\25\3\25\5\25\u027d\n\25\3\25\5\25\u0280\n\25\3\26\3\26\3\26\5\26"+
		"\u0285\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u028c\n\27\f\27\16\27\u028f"+
		"\13\27\3\27\3\27\5\27\u0293\n\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u02a1\n\30\3\30\5\30\u02a4\n\30\5\30\u02a6"+
		"\n\30\3\31\3\31\3\31\5\31\u02ab\n\31\3\31\3\31\5\31\u02af\n\31\3\31\5"+
		"\31\u02b2\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u02b9\n\31\3\31\3\31\3\31"+
		"\3\31\7\31\u02bf\n\31\f\31\16\31\u02c2\13\31\3\31\5\31\u02c5\n\31\3\31"+
		"\3\31\5\31\u02c9\n\31\3\31\5\31\u02cc\n\31\3\31\3\31\3\31\3\31\5\31\u02d2"+
		"\n\31\3\31\5\31\u02d5\n\31\5\31\u02d7\n\31\3\32\3\32\3\32\3\32\3\32\7"+
		"\32\u02de\n\32\f\32\16\32\u02e1\13\32\3\33\3\33\5\33\u02e5\n\33\3\33\3"+
		"\33\5\33\u02e9\n\33\3\33\3\33\5\33\u02ed\n\33\3\33\5\33\u02f0\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02f9\n\34\f\34\16\34\u02fc\13\34"+
		"\3\34\3\34\5\34\u0300\n\34\3\35\5\35\u0303\n\35\3\35\3\35\3\35\3\35\5"+
		"\35\u0309\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u0310\n\35\f\35\16\35\u0313"+
		"\13\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u031b\n\35\f\35\16\35\u031e"+
		"\13\35\3\35\3\35\7\35\u0322\n\35\f\35\16\35\u0325\13\35\5\35\u0327\n\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u0331\n\37\f\37\16\37\u0334"+
		"\13\37\3\37\5\37\u0337\n\37\3 \3 \3!\3!\5!\u033d\n!\3!\3!\3!\7!\u0342"+
		"\n!\f!\16!\u0345\13!\3\"\3\"\3\"\3\"\7\"\u034b\n\"\f\"\16\"\u034e\13\""+
		"\3\"\5\"\u0351\n\"\5\"\u0353\n\"\3#\3#\5#\u0357\n#\3$\3$\3$\3$\3$\5$\u035e"+
		"\n$\3%\3%\3%\3%\3%\7%\u0365\n%\f%\16%\u0368\13%\3%\3%\5%\u036c\n%\3&\5"+
		"&\u036f\n&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3"+
		">\5>\u03a8\n>\3?\3?\3?\5?\u03ad\n?\3?\3?\3?\5?\u03b2\n?\3?\3?\3?\2\3\26"+
		"@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\f\4\2\t\tvv\4\2((II\4\2\13\r\20\21\6\2"+
		"XXmmoo\u0082\u0082\4\2--GG\3\2\f\r\7\2?Att\u00a3\u00a3\u00a6\u00a6\u00a8"+
		"\u00a8\4\2\f\16rr\4\2\u00a2\u00a2\u00a6\u00a6\3\2$\u00a0\2\u0429\2\u0082"+
		"\3\2\2\2\4\u0087\3\2\2\2\6\u008d\3\2\2\2\b\u00a4\3\2\2\2\n\u00b2\3\2\2"+
		"\2\f\u00e2\3\2\2\2\16\u0105\3\2\2\2\20\u0171\3\2\2\2\22\u0174\3\2\2\2"+
		"\24\u0184\3\2\2\2\26\u01d8\3\2\2\2\30\u0229\3\2\2\2\32\u0236\3\2\2\2\34"+
		"\u023a\3\2\2\2\36\u023c\3\2\2\2 \u023e\3\2\2\2\"\u0255\3\2\2\2$\u0257"+
		"\3\2\2\2&\u026f\3\2\2\2(\u0279\3\2\2\2*\u0284\3\2\2\2,\u0286\3\2\2\2."+
		"\u02a5\3\2\2\2\60\u02d6\3\2\2\2\62\u02d8\3\2\2\2\64\u02ef\3\2\2\2\66\u02ff"+
		"\3\2\2\28\u0326\3\2\2\2:\u0328\3\2\2\2<\u032b\3\2\2\2>\u0338\3\2\2\2@"+
		"\u033a\3\2\2\2B\u0352\3\2\2\2D\u0356\3\2\2\2F\u035d\3\2\2\2H\u035f\3\2"+
		"\2\2J\u036e\3\2\2\2L\u0372\3\2\2\2N\u0374\3\2\2\2P\u0376\3\2\2\2R\u0378"+
		"\3\2\2\2T\u037a\3\2\2\2V\u037c\3\2\2\2X\u037e\3\2\2\2Z\u0380\3\2\2\2\\"+
		"\u0382\3\2\2\2^\u0384\3\2\2\2`\u0386\3\2\2\2b\u0388\3\2\2\2d\u038a\3\2"+
		"\2\2f\u038c\3\2\2\2h\u038e\3\2\2\2j\u0390\3\2\2\2l\u0392\3\2\2\2n\u0394"+
		"\3\2\2\2p\u0396\3\2\2\2r\u0398\3\2\2\2t\u039a\3\2\2\2v\u039c\3\2\2\2x"+
		"\u039e\3\2\2\2z\u03a7\3\2\2\2|\u03b1\3\2\2\2~\u0081\5\6\4\2\177\u0081"+
		"\5\4\3\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u0088\7\u00ad\2\2\u0088\u0089\b\3"+
		"\1\2\u0089\5\3\2\2\2\u008a\u008c\7\5\2\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0099\5\b\5\2\u0091\u0093\7\5\2\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\5\b\5\2\u0097\u0092\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009f\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009e\7\5\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\7\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a5\5\f\7\2\u00a3\u00a5\5\16\b\2\u00a4\u00a2\3\2\2\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\t\3\2\2\2\u00a6\u00a8\7\u009f\2\2\u00a7\u00a9"+
		"\7\u0080\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2"+
		"\2\u00aa\u00af\5,\27\2\u00ab\u00ac\7\t\2\2\u00ac\u00ae\5,\27\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00be\58\35\2\u00b5\u00b7\7\u0095\2\2\u00b6"+
		"\u00b8\7(\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2"+
		"\2\2\u00b9\u00bc\7f\2\2\u00ba\u00bc\7O\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\58\35\2\u00be"+
		"\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00cc\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7\63\2\2\u00c4"+
		"\u00c9\5(\25\2\u00c5\u00c6\7\t\2\2\u00c6\u00c8\5(\25\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d2\5\26\f\2\u00d0"+
		"\u00d1\t\2\2\2\u00d1\u00d3\5\26\f\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\13\3\2\2\2\u00d6\u00d8\7\u009f\2\2\u00d7\u00d9\7\u0080\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00df\5,\27\2\u00db"+
		"\u00dc\7\t\2\2\u00dc\u00de\5,\27\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00ef\58\35\2\u00e5\u00e6\7y\2\2\u00e6\u00e7\7\63\2\2\u00e7"+
		"\u00ec\5(\25\2\u00e8\u00e9\7\t\2\2\u00e9\u00eb\5(\25\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f7\3\2\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f5\5\26\f\2\u00f3"+
		"\u00f4\t\2\2\2\u00f4\u00f6\5\26\f\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\r\3\2\2\2\u00f9\u00fb\7\u009f\2\2\u00fa\u00fc\7\u0080\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0102\5,\27\2\u00fe"+
		"\u00ff\7\t\2\2\u00ff\u0101\5,\27\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u00f9\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u010d\5\20\t\2\u0108\u0109\5F$\2\u0109\u010a\5\20\t\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u011a\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\7y\2\2\u0111\u0112\7\63\2\2\u0112\u0117\5(\25\2\u0113\u0114\7\t"+
		"\2\2\u0114\u0116\5(\25\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u0110\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0122\3\2\2\2\u011c"+
		"\u011d\7n\2\2\u011d\u0120\5\26\f\2\u011e\u011f\t\2\2\2\u011f\u0121\5\26"+
		"\f\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u011c\3\2\2\2\u0122\u0123\3\2\2\2\u0123\17\3\2\2\2\u0124\u0126\5\30\r"+
		"\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129"+
		"\7\u008c\2\2\u0128\u012a\t\3\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012b\u0130\5.\30\2\u012c\u012d\7\t\2\2\u012d\u012f"+
		"\5.\30\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u013f\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u013d\7V"+
		"\2\2\u0134\u0139\5\60\31\2\u0135\u0136\7\t\2\2\u0136\u0138\5\60\31\2\u0137"+
		"\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013e\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\5\62\32\2\u013d"+
		"\u0134\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0133\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u0142\7\u009e\2\2\u0142"+
		"\u0144\5\26\f\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0153\3"+
		"\2\2\2\u0145\u0146\7Y\2\2\u0146\u0147\7\63\2\2\u0147\u014c\5\26\f\2\u0148"+
		"\u0149\7\t\2\2\u0149\u014b\5\26\f\2\u014a\u0148\3\2\2\2\u014b\u014e\3"+
		"\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0151\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7[\2\2\u0150\u0152\5\26\f\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0145\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0172\3\2\2\2\u0155\u0156\7\u009a\2\2\u0156\u0157"+
		"\7\7\2\2\u0157\u015c\5\26\f\2\u0158\u0159\7\t\2\2\u0159\u015b\5\26\f\2"+
		"\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u016e\7\b\2\2\u0160"+
		"\u0161\7\t\2\2\u0161\u0162\7\7\2\2\u0162\u0167\5\26\f\2\u0163\u0164\7"+
		"\t\2\2\u0164\u0166\5\26\f\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u016a\u016b\7\b\2\2\u016b\u016d\3\2\2\2\u016c\u0160\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0172\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0171\u0125\3\2\2\2\u0171\u0155\3\2\2\2\u0172"+
		"\21\3\2\2\2\u0173\u0175\5X-\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0182\3\2\2\2\u0178\u0179"+
		"\7\7\2\2\u0179\u017a\5J&\2\u017a\u017b\7\b\2\2\u017b\u0183\3\2\2\2\u017c"+
		"\u017d\7\7\2\2\u017d\u017e\5J&\2\u017e\u017f\7\t\2\2\u017f\u0180\5J&\2"+
		"\u0180\u0181\7\b\2\2\u0181\u0183\3\2\2\2\u0182\u0178\3\2\2\2\u0182\u017c"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\23\3\2\2\2\u0184\u0189\5z>\2\u0185"+
		"\u0186\7\6\2\2\u0186\u0188\5z>\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2"+
		"\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\25\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018c\u018d\b\f\1\2\u018d\u01d9\5L\'\2\u018e\u01d9\7\u00a4\2"+
		"\2\u018f\u0190\5\\/\2\u0190\u0191\7\6\2\2\u0191\u0193\3\2\2\2\u0192\u018f"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\5^\60\2\u0195"+
		"\u0196\7\6\2\2\u0196\u0198\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\u01d9\5d\63\2\u019a\u01d9\5\24\13\2\u019b"+
		"\u019c\5N(\2\u019c\u019d\5\26\f\22\u019d\u01d9\3\2\2\2\u019e\u019f\5Z"+
		".\2\u019f\u01ac\7\7\2\2\u01a0\u01a2\7I\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a8\5\26\f\2\u01a4\u01a5\7\t\2\2"+
		"\u01a5\u01a7\5\26\f\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ad\7\13\2\2\u01ac\u01a1\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3"+
		"\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\7\b\2\2\u01af\u01d9\3\2\2\2\u01b0"+
		"\u01b1\7\7\2\2\u01b1\u01b2\5\26\f\2\u01b2\u01b3\7\b\2\2\u01b3\u01d9\3"+
		"\2\2\2\u01b4\u01b5\7\66\2\2\u01b5\u01b6\7\7\2\2\u01b6\u01b7\5\26\f\2\u01b7"+
		"\u01b8\7,\2\2\u01b8\u01b9\5\22\n\2\u01b9\u01ba\7\b\2\2\u01ba\u01d9\3\2"+
		"\2\2\u01bb\u01bd\7r\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c0\7Q\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\7\7\2\2\u01c2\u01c3\5\16\b\2\u01c3"+
		"\u01c4\7\b\2\2\u01c4\u01d9\3\2\2\2\u01c5\u01c7\7\65\2\2\u01c6\u01c8\5"+
		"\26\f\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ce\3\2\2\2\u01c9"+
		"\u01ca\7\u009d\2\2\u01ca\u01cb\5\26\f\2\u01cb\u01cc\7\u0091\2\2\u01cc"+
		"\u01cd\5\26\f\2\u01cd\u01cf\3\2\2\2\u01ce\u01c9\3\2\2\2\u01cf\u01d0\3"+
		"\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2"+
		"\u01d3\7L\2\2\u01d3\u01d5\5\26\f\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7M\2\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u018c\3\2\2\2\u01d8\u018e\3\2\2\2\u01d8\u0197\3\2\2\2\u01d8\u019a\3\2"+
		"\2\2\u01d8\u019b\3\2\2\2\u01d8\u019e\3\2\2\2\u01d8\u01b0\3\2\2\2\u01d8"+
		"\u01b4\3\2\2\2\u01d8\u01bf\3\2\2\2\u01d8\u01c5\3\2\2\2\u01d9\u0226\3\2"+
		"\2\2\u01da\u01db\f\21\2\2\u01db\u01dc\t\4\2\2\u01dc\u0225\5\26\f\22\u01dd"+
		"\u01de\f\20\2\2\u01de\u01df\5\"\22\2\u01df\u01e0\5\26\f\21\u01e0\u0225"+
		"\3\2\2\2\u01e1\u01e2\f\17\2\2\u01e2\u01e3\7+\2\2\u01e3\u0225\5\26\f\20"+
		"\u01e4\u01e5\f\16\2\2\u01e5\u01e6\7x\2\2\u01e6\u0225\5\26\f\17\u01e7\u01e8"+
		"\f\7\2\2\u01e8\u01ea\7h\2\2\u01e9\u01eb\7r\2\2\u01ea\u01e9\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u0225\5\26\f\b\u01ed\u01ef\f"+
		"\6\2\2\u01ee\u01f0\7r\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f2\7\62\2\2\u01f2\u01f3\5\26\f\2\u01f3\u01f4\7"+
		"+\2\2\u01f4\u01f5\5\26\f\7\u01f5\u0225\3\2\2\2\u01f6\u01f7\f\n\2\2\u01f7"+
		"\u01f8\78\2\2\u01f8\u0225\5f\64\2\u01f9\u01fb\f\t\2\2\u01fa\u01fc\7r\2"+
		"\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe"+
		"\t\5\2\2\u01fe\u0201\5\26\f\2\u01ff\u0200\7N\2\2\u0200\u0202\5\26\f\2"+
		"\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0225\3\2\2\2\u0203\u0208"+
		"\f\b\2\2\u0204\u0209\7i\2\2\u0205\u0209\7s\2\2\u0206\u0207\7r\2\2\u0207"+
		"\u0209\7t\2\2\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0209\u0225\3\2\2\2\u020a\u020c\f\5\2\2\u020b\u020d\7r\2\2\u020c"+
		"\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0222\7_"+
		"\2\2\u020f\u0219\7\7\2\2\u0210\u021a\5\16\b\2\u0211\u0216\5\26\f\2\u0212"+
		"\u0213\7\t\2\2\u0213\u0215\5\26\f\2\u0214\u0212\3\2\2\2\u0215\u0218\3"+
		"\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0219\u0210\3\2\2\2\u0219\u0211\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u0223\7\b\2\2\u021c\u021d\5\\/\2\u021d"+
		"\u021e\7\6\2\2\u021e\u0220\3\2\2\2\u021f\u021c\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0223\5^\60\2\u0222\u020f\3\2\2\2\u0222"+
		"\u021f\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u01da\3\2\2\2\u0224\u01dd\3\2"+
		"\2\2\u0224\u01e1\3\2\2\2\u0224\u01e4\3\2\2\2\u0224\u01e7\3\2\2\2\u0224"+
		"\u01ed\3\2\2\2\u0224\u01f6\3\2\2\2\u0224\u01f9\3\2\2\2\u0224\u0203\3\2"+
		"\2\2\u0224\u020a\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\27\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7Z\2\2"+
		"\u022a\u022b\5\32\16\2\u022b\31\3\2\2\2\u022c\u0234\5|?\2\u022d\u022e"+
		"\5\36\20\2\u022e\u022f\5\32\16\2\u022f\u0230\5 \21\2\u0230\u0235\3\2\2"+
		"\2\u0231\u0232\5\34\17\2\u0232\u0233\5\32\16\2\u0233\u0235\3\2\2\2\u0234"+
		"\u022d\3\2\2\2\u0234\u0231\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2"+
		"\2\2\u0236\u022c\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\33\3\2\2\2\u023a\u023b\7\t\2\2\u023b\35\3\2\2\2\u023c"+
		"\u023d\7\3\2\2\u023d\37\3\2\2\2\u023e\u023f\7\4\2\2\u023f!\3\2\2\2\u0240"+
		"\u0256\7\17\2\2\u0241\u0256\7\22\2\2\u0242\u0256\7\23\2\2\u0243\u0256"+
		"\7\24\2\2\u0244\u0256\7\25\2\2\u0245\u0256\7\26\2\2\u0246\u0256\7\27\2"+
		"\2\u0247\u0256\7\30\2\2\u0248\u0256\7\31\2\2\u0249\u0256\7\n\2\2\u024a"+
		"\u0256\7\32\2\2\u024b\u0256\7\33\2\2\u024c\u0256\7\34\2\2\u024d\u0256"+
		"\7h\2\2\u024e\u024f\7h\2\2\u024f\u0256\7r\2\2\u0250\u0256\7_\2\2\u0251"+
		"\u0256\7m\2\2\u0252\u0256\7X\2\2\u0253\u0256\7o\2\2\u0254\u0256\7\u0082"+
		"\2\2\u0255\u0240\3\2\2\2\u0255\u0241\3\2\2\2\u0255\u0242\3\2\2\2\u0255"+
		"\u0243\3\2\2\2\u0255\u0244\3\2\2\2\u0255\u0245\3\2\2\2\u0255\u0246\3\2"+
		"\2\2\u0255\u0247\3\2\2\2\u0255\u0248\3\2\2\2\u0255\u0249\3\2\2\2\u0255"+
		"\u024a\3\2\2\2\u0255\u024b\3\2\2\2\u0255\u024c\3\2\2\2\u0255\u024d\3\2"+
		"\2\2\u0255\u024e\3\2\2\2\u0255\u0250\3\2\2\2\u0255\u0251\3\2\2\2\u0255"+
		"\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256#\3\2\2\2"+
		"\u0257\u0259\7\u009f\2\2\u0258\u025a\7\u0080\2\2\u0259\u0258\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\5H%\2\u025c\u025d\7,\2"+
		"\2\u025d\u025e\7\7\2\2\u025e\u025f\5\16\b\2\u025f\u0269\7\b\2\2\u0260"+
		"\u0261\7\t\2\2\u0261\u0262\5H%\2\u0262\u0263\7,\2\2\u0263\u0264\7\7\2"+
		"\2\u0264\u0265\5\16\b\2\u0265\u0266\7\b\2\2\u0266\u0268\3\2\2\2\u0267"+
		"\u0260\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2"+
		"\2\2\u026a%\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d\5\\/\2\u026d\u026e"+
		"\7\6\2\2\u026e\u0270\3\2\2\2\u026f\u026c\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0277\5^\60\2\u0272\u0273\7a\2\2\u0273\u0274\7\63"+
		"\2\2\u0274\u0278\5j\66\2\u0275\u0276\7r\2\2\u0276\u0278\7a\2\2\u0277\u0272"+
		"\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\'\3\2\2\2\u0279"+
		"\u027c\5\26\f\2\u027a\u027b\78\2\2\u027b\u027d\5f\64\2\u027c\u027a\3\2"+
		"\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0280\t\6\2\2\u027f"+
		"\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280)\3\2\2\2\u0281\u0285\5J&\2\u0282"+
		"\u0285\5X-\2\u0283\u0285\7\u00a6\2\2\u0284\u0281\3\2\2\2\u0284\u0282\3"+
		"\2\2\2\u0284\u0283\3\2\2\2\u0285+\3\2\2\2\u0286\u0292\5^\60\2\u0287\u0288"+
		"\7\7\2\2\u0288\u028d\5d\63\2\u0289\u028a\7\t\2\2\u028a\u028c\5d\63\2\u028b"+
		"\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u0290\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\7\b\2\2\u0291"+
		"\u0293\3\2\2\2\u0292\u0287\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0295\7,\2\2\u0295\u0296\7\7\2\2\u0296\u0297\5\16\b\2\u0297"+
		"\u0298\7\b\2\2\u0298-\3\2\2\2\u0299\u02a6\7\13\2\2\u029a\u029b\5^\60\2"+
		"\u029b\u029c\7\6\2\2\u029c\u029d\7\13\2\2\u029d\u02a6\3\2\2\2\u029e\u02a3"+
		"\5\26\f\2\u029f\u02a1\7,\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a4\5T+\2\u02a3\u02a0\3\2\2\2\u02a3\u02a4\3\2\2"+
		"\2\u02a4\u02a6\3\2\2\2\u02a5\u0299\3\2\2\2\u02a5\u029a\3\2\2\2\u02a5\u029e"+
		"\3\2\2\2\u02a6/\3\2\2\2\u02a7\u02a8\5\\/\2\u02a8\u02a9\7\6\2\2\u02a9\u02ab"+
		"\3\2\2\2\u02aa\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02b1\5^\60\2\u02ad\u02af\7,\2\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\5v<\2\u02b1\u02ae\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u02b8\3\2\2\2\u02b3\u02b4\7a\2\2\u02b4\u02b5\7\63\2\2\u02b5"+
		"\u02b9\5j\66\2\u02b6\u02b7\7r\2\2\u02b7\u02b9\7a\2\2\u02b8\u02b3\3\2\2"+
		"\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02d7\3\2\2\2\u02ba\u02c4"+
		"\7\7\2\2\u02bb\u02c0\5\60\31\2\u02bc\u02bd\7\t\2\2\u02bd\u02bf\5\60\31"+
		"\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c5\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\5\62\32\2"+
		"\u02c4\u02bb\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02cb"+
		"\7\b\2\2\u02c7\u02c9\7,\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cc\5v<\2\u02cb\u02c8\3\2\2\2\u02cb\u02cc\3\2\2"+
		"\2\u02cc\u02d7\3\2\2\2\u02cd\u02ce\7\7\2\2\u02ce\u02cf\5\16\b\2\u02cf"+
		"\u02d4\7\b\2\2\u02d0\u02d2\7,\2\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\5v<\2\u02d4\u02d1\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02aa\3\2\2\2\u02d6\u02ba\3\2\2\2\u02d6"+
		"\u02cd\3\2\2\2\u02d7\61\3\2\2\2\u02d8\u02df\5\60\31\2\u02d9\u02da\5\64"+
		"\33\2\u02da\u02db\5\60\31\2\u02db\u02dc\5\66\34\2\u02dc\u02de\3\2\2\2"+
		"\u02dd\u02d9\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0"+
		"\3\2\2\2\u02e0\63\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02f0\7\t\2\2\u02e3"+
		"\u02e5\7p\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02ec\3\2"+
		"\2\2\u02e6\u02e8\7l\2\2\u02e7\u02e9\7z\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9"+
		"\3\2\2\2\u02e9\u02ed\3\2\2\2\u02ea\u02ed\7c\2\2\u02eb\u02ed\7>\2\2\u02ec"+
		"\u02e6\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\7j\2\2\u02ef\u02e2\3\2\2\2\u02ef"+
		"\u02e4\3\2\2\2\u02f0\65\3\2\2\2\u02f1\u02f2\7w\2\2\u02f2\u0300\5\26\f"+
		"\2\u02f3\u02f4\7\u0098\2\2\u02f4\u02f5\7\7\2\2\u02f5\u02fa\5d\63\2\u02f6"+
		"\u02f7\7\t\2\2\u02f7\u02f9\5d\63\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\3\2"+
		"\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fd\u02fe\7\b\2\2\u02fe\u0300\3\2\2\2\u02ff\u02f1\3\2"+
		"\2\2\u02ff\u02f3\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\67\3\2\2\2\u0301\u0303"+
		"\5\30\r\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2\2\2"+
		"\u0304\u0305\5@!\2\u0305\u0306\5B\"\2\u0306\u0308\5D#\2\u0307\u0309\5"+
		"<\37\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0327\3\2\2\2\u030a"+
		"\u030b\7\u009a\2\2\u030b\u030c\7\7\2\2\u030c\u0311\5\26\f\2\u030d\u030e"+
		"\7\t\2\2\u030e\u0310\5\26\f\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2"+
		"\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311"+
		"\3\2\2\2\u0314\u0323\7\b\2\2\u0315\u0316\7\t\2\2\u0316\u0317\7\7\2\2\u0317"+
		"\u031c\5\26\f\2\u0318\u0319\7\t\2\2\u0319\u031b\5\26\f\2\u031a\u0318\3"+
		"\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\7\b\2\2\u0320\u0322\3\2"+
		"\2\2\u0321\u0315\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0302\3\2"+
		"\2\2\u0326\u030a\3\2\2\2\u03279\3\2\2\2\u0328\u0329\7[\2\2\u0329\u032a"+
		"\5\26\f\2\u032a;\3\2\2\2\u032b\u032c\7Y\2\2\u032c\u032d\7\63\2\2\u032d"+
		"\u0332\5> \2\u032e\u032f\7\t\2\2\u032f\u0331\5> \2\u0330\u032e\3\2\2\2"+
		"\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0336"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0337\5:\36\2\u0336\u0335\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337=\3\2\2\2\u0338\u0339\5\26\f\2\u0339?\3\2\2\2\u033a"+
		"\u033c\7\u008c\2\2\u033b\u033d\t\3\2\2\u033c\u033b\3\2\2\2\u033c\u033d"+
		"\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0343\5.\30\2\u033f\u0340\7\t\2\2\u0340"+
		"\u0342\5.\30\2\u0341\u033f\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2"+
		"\2\2\u0343\u0344\3\2\2\2\u0344A\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0350"+
		"\7V\2\2\u0347\u034c\5\60\31\2\u0348\u0349\7\t\2\2\u0349\u034b\5\60\31"+
		"\2\u034a\u0348\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u0351\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0351\5\62\32\2"+
		"\u0350\u0347\3\2\2\2\u0350\u034f\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0346"+
		"\3\2\2\2\u0352\u0353\3\2\2\2\u0353C\3\2\2\2\u0354\u0355\7\u009e\2\2\u0355"+
		"\u0357\5\26\f\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357E\3\2\2\2"+
		"\u0358\u035e\7\u0095\2\2\u0359\u035a\7\u0095\2\2\u035a\u035e\7(\2\2\u035b"+
		"\u035e\7f\2\2\u035c\u035e\7O\2\2\u035d\u0358\3\2\2\2\u035d\u0359\3\2\2"+
		"\2\u035d\u035b\3\2\2\2\u035d\u035c\3\2\2\2\u035eG\3\2\2\2\u035f\u036b"+
		"\5^\60\2\u0360\u0361\7\7\2\2\u0361\u0366\5d\63\2\u0362\u0363\7\t\2\2\u0363"+
		"\u0365\5d\63\2\u0364\u0362\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2"+
		"\2\2\u0366\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0366\3\2\2\2\u0369"+
		"\u036a\7\b\2\2\u036a\u036c\3\2\2\2\u036b\u0360\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036cI\3\2\2\2\u036d\u036f\t\7\2\2\u036e\u036d\3\2\2\2\u036e\u036f"+
		"\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\7\u00a3\2\2\u0371K\3\2\2\2\u0372"+
		"\u0373\t\b\2\2\u0373M\3\2\2\2\u0374\u0375\t\t\2\2\u0375O\3\2\2\2\u0376"+
		"\u0377\7\u00a6\2\2\u0377Q\3\2\2\2\u0378\u0379\5\26\f\2\u0379S\3\2\2\2"+
		"\u037a\u037b\t\n\2\2\u037bU\3\2\2\2\u037c\u037d\t\13\2\2\u037dW\3\2\2"+
		"\2\u037e\u037f\5z>\2\u037fY\3\2\2\2\u0380\u0381\5z>\2\u0381[\3\2\2\2\u0382"+
		"\u0383\5z>\2\u0383]\3\2\2\2\u0384\u0385\5z>\2\u0385_\3\2\2\2\u0386\u0387"+
		"\5z>\2\u0387a\3\2\2\2\u0388\u0389\5z>\2\u0389c\3\2\2\2\u038a\u038b\5z"+
		">\2\u038be\3\2\2\2\u038c\u038d\5z>\2\u038dg\3\2\2\2\u038e\u038f\5z>\2"+
		"\u038fi\3\2\2\2\u0390\u0391\5z>\2\u0391k\3\2\2\2\u0392\u0393\5z>\2\u0393"+
		"m\3\2\2\2\u0394\u0395\5z>\2\u0395o\3\2\2\2\u0396\u0397\5z>\2\u0397q\3"+
		"\2\2\2\u0398\u0399\5z>\2\u0399s\3\2\2\2\u039a\u039b\5z>\2\u039bu\3\2\2"+
		"\2\u039c\u039d\5z>\2\u039dw\3\2\2\2\u039e\u039f\5z>\2\u039fy\3\2\2\2\u03a0"+
		"\u03a8\7\u00a2\2\2\u03a1\u03a8\5V,\2\u03a2\u03a8\7\u00a6\2\2\u03a3\u03a4"+
		"\7\7\2\2\u03a4\u03a5\5z>\2\u03a5\u03a6\7\b\2\2\u03a6\u03a8\3\2\2\2\u03a7"+
		"\u03a0\3\2\2\2\u03a7\u03a1\3\2\2\2\u03a7\u03a2\3\2\2\2\u03a7\u03a3\3\2"+
		"\2\2\u03a8{\3\2\2\2\u03a9\u03aa\5\\/\2\u03aa\u03ab\7\6\2\2\u03ab\u03ad"+
		"\3\2\2\2\u03ac\u03a9\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03af\5^\60\2\u03af\u03b0\7\6\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03ac\3\2"+
		"\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\5d\63\2\u03b4"+
		"}\3\2\2\2\u0080\u0080\u0082\u008d\u0094\u0099\u009f\u00a4\u00a8\u00af"+
		"\u00b2\u00b7\u00bb\u00c0\u00c9\u00cc\u00d2\u00d4\u00d8\u00df\u00e2\u00ec"+
		"\u00ef\u00f5\u00f7\u00fb\u0102\u0105\u010d\u0117\u011a\u0120\u0122\u0125"+
		"\u0129\u0130\u0139\u013d\u013f\u0143\u014c\u0151\u0153\u015c\u0167\u016e"+
		"\u0171\u0176\u0182\u0189\u0192\u0197\u01a1\u01a8\u01ac\u01bc\u01bf\u01c7"+
		"\u01d0\u01d4\u01d8\u01ea\u01ef\u01fb\u0201\u0208\u020c\u0216\u0219\u021f"+
		"\u0222\u0224\u0226\u0234\u0238\u0255\u0259\u0269\u026f\u0277\u027c\u027f"+
		"\u0284\u028d\u0292\u02a0\u02a3\u02a5\u02aa\u02ae\u02b1\u02b8\u02c0\u02c4"+
		"\u02c8\u02cb\u02d1\u02d4\u02d6\u02df\u02e4\u02e8\u02ec\u02ef\u02fa\u02ff"+
		"\u0302\u0308\u0311\u031c\u0323\u0326\u0332\u0336\u033c\u0343\u034c\u0350"+
		"\u0352\u0356\u035d\u0366\u036b\u036e\u03a7\u03ac\u03b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}