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
		T__0=1, T__1=2, T__2=3, T__3=4, SCOL=5, DOT=6, OPEN_PAR=7, CLOSE_PAR=8, 
		COMMA=9, ASSIGN=10, STAR=11, PLUS=12, MINUS=13, TILDE=14, PIPE2=15, DIV=16, 
		MOD=17, LT2=18, GT2=19, AMP=20, PIPE=21, LT=22, LT_EQ=23, GT=24, GT_EQ=25, 
		EQ=26, NOT_EQ1=27, NOT_EQ2=28, K_SEMANTICS=29, K_MINTIME=30, K_MAXTIME=31, 
		K_NOTVIABLE=32, K_TIME=33, K_MAX=34, K_MIN=35, K_ABORT=36, K_ACTION=37, 
		K_ADD=38, K_AFTER=39, K_ALL=40, K_ALTER=41, K_ANALYZE=42, K_AND=43, K_AS=44, 
		K_ASC=45, K_ATTACH=46, K_AUTOINCREMENT=47, K_BEFORE=48, K_BEGIN=49, K_BETWEEN=50, 
		K_BY=51, K_CASCADE=52, K_CASE=53, K_CAST=54, K_CHECK=55, K_COLLATE=56, 
		K_COLUMN=57, K_COMMIT=58, K_CONFLICT=59, K_CONSTRAINT=60, K_CREATE=61, 
		K_CROSS=62, K_CURRENT_DATE=63, K_CURRENT_TIME=64, K_CURRENT_TIMESTAMP=65, 
		K_DATABASE=66, K_DEFAULT=67, K_DEFERRABLE=68, K_DEFERRED=69, K_DELETE=70, 
		K_DESC=71, K_DETACH=72, K_DISTINCT=73, K_DROP=74, K_EACH=75, K_ELSE=76, 
		K_END=77, K_ESCAPE=78, K_EXCEPT=79, K_EXCLUSIVE=80, K_EXISTS=81, K_EXPLAIN=82, 
		K_FAIL=83, K_FOR=84, K_FOREIGN=85, K_FROM=86, K_FULL=87, K_GLOB=88, K_GROUP=89, 
		K_GUARD=90, K_HAVING=91, K_IF=92, K_IGNORE=93, K_IMMEDIATE=94, K_IN=95, 
		K_INDEX=96, K_INDEXED=97, K_INITIALLY=98, K_INNER=99, K_INSERT=100, K_INSTEAD=101, 
		K_INTERSECT=102, K_INTO=103, K_IS=104, K_ISNULL=105, K_JOIN=106, K_KEY=107, 
		K_LEFT=108, K_LIKE=109, K_LIMIT=110, K_MATCH=111, K_NATURAL=112, K_NO=113, 
		K_NOT=114, K_NOTNULL=115, K_NULL=116, K_OF=117, K_OFFSET=118, K_ON=119, 
		K_OR=120, K_ORDER=121, K_OUTER=122, K_PLAN=123, K_PRAGMA=124, K_PRIMARY=125, 
		K_QUERY=126, K_RAISE=127, K_RECURSIVE=128, K_REFERENCES=129, K_REGEXP=130, 
		K_REINDEX=131, K_RELEASE=132, K_RENAME=133, K_REPLACE=134, K_RESTRICT=135, 
		K_RIGHT=136, K_ROLLBACK=137, K_ROW=138, K_SAVEPOINT=139, K_SELECT=140, 
		K_SET=141, K_TABLE=142, K_TEMP=143, K_TEMPORARY=144, K_THEN=145, K_TO=146, 
		K_TRANSACTION=147, K_TRIGGER=148, K_UNION=149, K_UNIQUE=150, K_UPDATE=151, 
		K_USING=152, K_VACUUM=153, K_VALUES=154, K_VIEW=155, K_VIRTUAL=156, K_WHEN=157, 
		K_WHERE=158, K_WITH=159, K_WITHOUT=160, K_COMPOSE=161, IDENTIFIER=162, 
		NUMERIC_LITERAL=163, BIND_PARAMETER=164, SEMANTICS_LITERAL=165, STRING_LITERAL=166, 
		AT_SYMBOL=167, BLOB_LITERAL=168, SINGLE_LINE_COMMENT=169, MULTILINE_COMMENT=170, 
		SPACES=171, WHITE_SPACE=172, UNEXPECTED_CHAR=173;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_compound_select_stmt = 4, RULE_simple_select_stmt = 5, RULE_select_stmt = 6, 
		RULE_select_or_values = 7, RULE_type_name = 8, RULE_path_expr = 9, RULE_expr = 10, 
		RULE_outer_guard_clause = 11, RULE_guard_obj = 12, RULE_guard_pair = 13, 
		RULE_guard_join_type = 14, RULE_guard_comma = 15, RULE_opening_brace = 16, 
		RULE_closing_brace = 17, RULE_comp_op = 18, RULE_with_clause = 19, RULE_qualified_table_name = 20, 
		RULE_ordering_term = 21, RULE_pragma_value = 22, RULE_common_table_expression = 23, 
		RULE_result_column = 24, RULE_table_or_subquery = 25, RULE_join_clause = 26, 
		RULE_join_operator = 27, RULE_join_constraint = 28, RULE_select_core = 29, 
		RULE_having_clause = 30, RULE_groupby_clause = 31, RULE_groupby_expr = 32, 
		RULE_select_clause = 33, RULE_from_clause = 34, RULE_where_clause = 35, 
		RULE_compound_operator = 36, RULE_cte_table_name = 37, RULE_signed_number = 38, 
		RULE_literal_value = 39, RULE_unary_operator = 40, RULE_error_message = 41, 
		RULE_module_argument = 42, RULE_column_alias = 43, RULE_keyword = 44, 
		RULE_name = 45, RULE_function_name = 46, RULE_database_name = 47, RULE_table_name = 48, 
		RULE_table_or_index_name = 49, RULE_new_table_name = 50, RULE_column_name = 51, 
		RULE_collation_name = 52, RULE_foreign_table = 53, RULE_index_name = 54, 
		RULE_trigger_name = 55, RULE_view_name = 56, RULE_module_name = 57, RULE_pragma_name = 58, 
		RULE_savepoint_name = 59, RULE_table_alias = 60, RULE_transaction_name = 61, 
		RULE_any_name = 62, RULE_guard_key_name = 63;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "compound_select_stmt", 
		"simple_select_stmt", "select_stmt", "select_or_values", "type_name", 
		"path_expr", "expr", "outer_guard_clause", "guard_obj", "guard_pair", 
		"guard_join_type", "guard_comma", "opening_brace", "closing_brace", "comp_op", 
		"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
		"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "select_core", "having_clause", "groupby_clause", 
		"groupby_expr", "select_clause", "from_clause", "where_clause", "compound_operator", 
		"cte_table_name", "signed_number", "literal_value", "unary_operator", 
		"error_message", "module_argument", "column_alias", "keyword", "name", 
		"function_name", "database_name", "table_name", "table_or_index_name", 
		"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
		"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
		"table_alias", "transaction_name", "any_name", "guard_key_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", "'!'", "'{'", "'}'", "';'", "'.'", "'('", "')'", "','", "'='", 
		"'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
		"'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", null, null, 
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
		null, null, null, null, "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", 
		"COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", 
		"LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", 
		"NOT_EQ2", "K_SEMANTICS", "K_MINTIME", "K_MAXTIME", "K_NOTVIABLE", "K_TIME", 
		"K_MAX", "K_MIN", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", 
		"K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", 
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
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==K_GUARD || _la==K_SELECT || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (K_VALUES - 154)) | (1L << (K_WITH - 154)) | (1L << (UNEXPECTED_CHAR - 154)))) != 0)) {
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_GUARD:
				case K_SELECT:
				case K_VALUES:
				case K_WITH:
					{
					setState(128);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(129);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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
			setState(137);
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(140);
				match(SCOL);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			sql_stmt();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(147);
						match(SCOL);
						}
						}
						setState(150); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(152);
					sql_stmt();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					match(SCOL);
					}
					} 
				}
				setState(163);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(164);
				simple_select_stmt();
				}
				break;
			case 2:
				{
				setState(165);
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
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(168);
				match(K_WITH);
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(169);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(172);
				common_table_expression();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173);
					match(COMMA);
					setState(174);
					common_table_expression();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182);
			select_core();
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(183);
					match(K_UNION);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(184);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(187);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(188);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191);
				select_core();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(196);
				match(K_ORDER);
				setState(197);
				match(K_BY);
				setState(198);
				ordering_term();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(199);
					match(COMMA);
					setState(200);
					ordering_term();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(208);
				match(K_LIMIT);
				setState(209);
				expr(0);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(210);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(211);
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
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(216);
				match(K_WITH);
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(217);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(220);
				common_table_expression();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221);
					match(COMMA);
					setState(222);
					common_table_expression();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(230);
			select_core();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(231);
				match(K_ORDER);
				setState(232);
				match(K_BY);
				setState(233);
				ordering_term();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(234);
					match(COMMA);
					setState(235);
					ordering_term();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(243);
				match(K_LIMIT);
				setState(244);
				expr(0);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(245);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(246);
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
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(251);
				match(K_WITH);
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(252);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(255);
				common_table_expression();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(256);
					match(COMMA);
					setState(257);
					common_table_expression();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(265);
			select_or_values();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(266);
				compound_operator();
				setState(267);
				select_or_values();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(274);
				match(K_ORDER);
				setState(275);
				match(K_BY);
				setState(276);
				ordering_term();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(277);
					match(COMMA);
					setState(278);
					ordering_term();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(286);
				match(K_LIMIT);
				setState(287);
				expr(0);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(288);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(289);
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
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_GUARD:
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GUARD) {
					{
					setState(294);
					outer_guard_clause(db);
					}
				}

				setState(297);
				match(K_SELECT);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(298);
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
				setState(301);
				result_column();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(302);
					match(COMMA);
					setState(303);
					result_column();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(309);
					match(K_FROM);
					setState(319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(310);
						table_or_subquery();
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(311);
							match(COMMA);
							setState(312);
							table_or_subquery();
							}
							}
							setState(317);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(318);
						join_clause();
						}
						break;
					}
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(323);
					match(K_WHERE);
					setState(324);
					expr(0);
					}
				}

				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(327);
					match(K_GROUP);
					setState(328);
					match(K_BY);
					setState(329);
					expr(0);
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(330);
						match(COMMA);
						setState(331);
						expr(0);
						}
						}
						setState(336);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(337);
						match(K_HAVING);
						setState(338);
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
				setState(343);
				match(K_VALUES);
				setState(344);
				match(OPEN_PAR);
				setState(345);
				expr(0);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(346);
					match(COMMA);
					setState(347);
					expr(0);
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353);
				match(CLOSE_PAR);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(354);
					match(COMMA);
					setState(355);
					match(OPEN_PAR);
					setState(356);
					expr(0);
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(357);
						match(COMMA);
						setState(358);
						expr(0);
						}
						}
						setState(363);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(364);
					match(CLOSE_PAR);
					}
					}
					setState(370);
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
			setState(374); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(373);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(376); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(378);
				match(OPEN_PAR);
				setState(379);
				signed_number();
				setState(380);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(382);
				match(OPEN_PAR);
				setState(383);
				signed_number();
				setState(384);
				match(COMMA);
				setState(385);
				signed_number();
				setState(386);
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
			setState(390);
			any_name();
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					match(DOT);
					setState(392);
					any_name();
					}
					} 
				}
				setState(397);
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
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(399);
				literal_value();
				}
				break;
			case 2:
				{
				setState(400);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(404);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(401);
						database_name();
						setState(402);
						match(DOT);
						}
						break;
					}
					setState(406);
					table_name();
					setState(407);
					match(DOT);
					}
					break;
				}
				setState(411);
				column_name();
				}
				break;
			case 4:
				{
				setState(412);
				path_expr();
				}
				break;
			case 5:
				{
				setState(413);
				unary_operator();
				setState(414);
				expr(16);
				}
				break;
			case 6:
				{
				setState(416);
				function_name();
				setState(417);
				match(OPEN_PAR);
				setState(430);
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
					setState(419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(418);
						match(K_DISTINCT);
						}
						break;
					}
					setState(421);
					expr(0);
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(422);
						match(COMMA);
						setState(423);
						expr(0);
						}
						}
						setState(428);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(429);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(432);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(434);
				match(OPEN_PAR);
				setState(435);
				expr(0);
				setState(436);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(438);
				match(K_CAST);
				setState(439);
				match(OPEN_PAR);
				setState(440);
				expr(0);
				setState(441);
				match(K_AS);
				setState(442);
				type_name();
				setState(443);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(445);
						match(K_NOT);
						}
					}

					setState(448);
					match(K_EXISTS);
					}
				}

				setState(451);
				match(OPEN_PAR);
				setState(452);
				select_stmt();
				setState(453);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(455);
				match(K_CASE);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(456);
					expr(0);
					}
					break;
				}
				setState(464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(459);
					match(K_WHEN);
					setState(460);
					expr(0);
					setState(461);
					match(K_THEN);
					setState(462);
					expr(0);
					}
					}
					setState(466); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(468);
					match(K_ELSE);
					setState(469);
					expr(0);
					}
				}

				setState(472);
				match(K_END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(550);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(476);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(477);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(478);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(479);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(480);
						comp_op();
						setState(481);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(483);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(484);
						match(K_AND);
						setState(485);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(486);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(487);
						match(K_OR);
						setState(488);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(489);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(490);
						match(K_IS);
						setState(492);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(491);
							match(K_NOT);
							}
							break;
						}
						setState(494);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(495);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(497);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(496);
							match(K_NOT);
							}
						}

						setState(499);
						match(K_BETWEEN);
						setState(500);
						expr(0);
						setState(501);
						match(K_AND);
						setState(502);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(504);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(505);
						match(K_COLLATE);
						setState(506);
						collation_name();
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(507);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(509);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(508);
							match(K_NOT);
							}
						}

						setState(511);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_GLOB - 88)) | (1L << (K_LIKE - 88)) | (1L << (K_MATCH - 88)) | (1L << (K_REGEXP - 88)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(512);
						expr(0);
						setState(515);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
						case 1:
							{
							setState(513);
							match(K_ESCAPE);
							setState(514);
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
						setState(517);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(522);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(518);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(519);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(520);
							match(K_NOT);
							setState(521);
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
						setState(524);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(526);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(525);
							match(K_NOT);
							}
						}

						setState(528);
						match(K_IN);
						setState(548);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(529);
							match(OPEN_PAR);
							setState(539);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
							case 1:
								{
								setState(530);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(531);
								expr(0);
								setState(536);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(532);
									match(COMMA);
									setState(533);
									expr(0);
									}
									}
									setState(538);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(541);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(545);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
							case 1:
								{
								setState(542);
								database_name();
								setState(543);
								match(DOT);
								}
								break;
							}
							setState(547);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(554);
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
		public Guard_objContext guard_obj() {
			return getRuleContext(Guard_objContext.class,0);
		}
		public Guard_join_typeContext guard_join_type() {
			return getRuleContext(Guard_join_typeContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(K_GUARD);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(556);
				guard_join_type();
				}
			}

			setState(559);
			guard_obj();
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

	public static class Guard_objContext extends ParserRuleContext {
		public Opening_braceContext opening_brace() {
			return getRuleContext(Opening_braceContext.class,0);
		}
		public List<Guard_pairContext> guard_pair() {
			return getRuleContexts(Guard_pairContext.class);
		}
		public Guard_pairContext guard_pair(int i) {
			return getRuleContext(Guard_pairContext.class,i);
		}
		public Closing_braceContext closing_brace() {
			return getRuleContext(Closing_braceContext.class,0);
		}
		public List<Guard_commaContext> guard_comma() {
			return getRuleContexts(Guard_commaContext.class);
		}
		public Guard_commaContext guard_comma(int i) {
			return getRuleContext(Guard_commaContext.class,i);
		}
		public Guard_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGuard_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGuard_obj(this);
		}
	}

	public final Guard_objContext guard_obj() throws RecognitionException {
		Guard_objContext _localctx = new Guard_objContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_guard_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			opening_brace();
			setState(562);
			guard_pair();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(563);
				guard_comma();
				setState(564);
				guard_pair();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			closing_brace();
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

	public static class Guard_pairContext extends ParserRuleContext {
		public Guard_key_nameContext guard_key_name() {
			return getRuleContext(Guard_key_nameContext.class,0);
		}
		public Guard_join_typeContext guard_join_type() {
			return getRuleContext(Guard_join_typeContext.class,0);
		}
		public Guard_objContext guard_obj() {
			return getRuleContext(Guard_objContext.class,0);
		}
		public Guard_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGuard_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGuard_pair(this);
		}
	}

	public final Guard_pairContext guard_pair() throws RecognitionException {
		Guard_pairContext _localctx = new Guard_pairContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_guard_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			guard_key_name();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(574);
				guard_join_type();
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(577);
				guard_obj();
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

	public static class Guard_join_typeContext extends ParserRuleContext {
		public Guard_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGuard_join_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGuard_join_type(this);
		}
	}

	public final Guard_join_typeContext guard_join_type() throws RecognitionException {
		Guard_join_typeContext _localctx = new Guard_join_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_guard_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		enterRule(_localctx, 30, RULE_guard_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
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
		enterRule(_localctx, 32, RULE_opening_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(T__2);
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
		enterRule(_localctx, 34, RULE_closing_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(T__3);
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
		enterRule(_localctx, 36, RULE_comp_op);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(PIPE2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(LT2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				match(GT2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(AMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				match(PIPE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
				match(LT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(594);
				match(LT_EQ);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(595);
				match(GT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(596);
				match(GT_EQ);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(597);
				match(ASSIGN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(598);
				match(EQ);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(599);
				match(NOT_EQ1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(600);
				match(NOT_EQ2);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(601);
				match(K_IS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(602);
				match(K_IS);
				setState(603);
				match(K_NOT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(604);
				match(K_IN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(605);
				match(K_LIKE);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(606);
				match(K_GLOB);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(607);
				match(K_MATCH);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(608);
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
		enterRule(_localctx, 38, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(K_WITH);
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(612);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(615);
			cte_table_name();
			setState(616);
			match(K_AS);
			setState(617);
			match(OPEN_PAR);
			setState(618);
			select_stmt();
			setState(619);
			match(CLOSE_PAR);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(620);
				match(COMMA);
				setState(621);
				cte_table_name();
				setState(622);
				match(K_AS);
				setState(623);
				match(OPEN_PAR);
				setState(624);
				select_stmt();
				setState(625);
				match(CLOSE_PAR);
				}
				}
				setState(631);
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
		enterRule(_localctx, 40, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(632);
				database_name();
				setState(633);
				match(DOT);
				}
				break;
			}
			setState(637);
			table_name();
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(638);
				match(K_INDEXED);
				setState(639);
				match(K_BY);
				setState(640);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(641);
				match(K_NOT);
				setState(642);
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
		enterRule(_localctx, 42, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			expr(0);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(646);
				match(K_COLLATE);
				setState(647);
				collation_name();
				}
			}

			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(650);
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
		enterRule(_localctx, 44, RULE_pragma_value);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
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
		enterRule(_localctx, 46, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			table_name();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(659);
				match(OPEN_PAR);
				setState(660);
				column_name();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(661);
					match(COMMA);
					setState(662);
					column_name();
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(668);
				match(CLOSE_PAR);
				}
			}

			setState(672);
			match(K_AS);
			setState(673);
			match(OPEN_PAR);
			setState(674);
			select_stmt();
			setState(675);
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
		enterRule(_localctx, 48, RULE_result_column);
		int _la;
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				table_name();
				setState(679);
				match(DOT);
				setState(680);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				expr(0);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(684);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(683);
						match(K_AS);
						}
					}

					setState(686);
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
		enterRule(_localctx, 50, RULE_table_or_subquery);
		int _la;
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(691);
					database_name();
					setState(692);
					match(DOT);
					}
					break;
				}
				setState(696);
				((Table_or_subqueryContext)_localctx).t = table_name();
				setState(701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(698);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(697);
						match(K_AS);
						}
						break;
					}
					setState(700);
					((Table_or_subqueryContext)_localctx).alias = table_alias();
					}
					break;
				}
				setState(708);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(703);
					match(K_INDEXED);
					setState(704);
					match(K_BY);
					setState(705);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(706);
					match(K_NOT);
					setState(707);
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
				setState(710);
				match(OPEN_PAR);
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(711);
					table_or_subquery();
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(712);
						match(COMMA);
						setState(713);
						table_or_subquery();
						}
						}
						setState(718);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(719);
					join_clause();
					}
					break;
				}
				setState(722);
				match(CLOSE_PAR);
				setState(727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(724);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(723);
						match(K_AS);
						}
						break;
					}
					setState(726);
					((Table_or_subqueryContext)_localctx).alias = table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(729);
				match(OPEN_PAR);
				setState(730);
				select_stmt();
				setState(731);
				match(CLOSE_PAR);
				setState(736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(733);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(732);
						match(K_AS);
						}
						break;
					}
					setState(735);
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
		enterRule(_localctx, 52, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			table_or_subquery();
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (K_INNER - 99)) | (1L << (K_JOIN - 99)) | (1L << (K_LEFT - 99)) | (1L << (K_NATURAL - 99)))) != 0)) {
				{
				{
				setState(741);
				join_operator();
				setState(742);
				table_or_subquery();
				setState(743);
				join_constraint();
				}
				}
				setState(749);
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
		enterRule(_localctx, 54, RULE_join_operator);
		int _la;
		try {
			setState(763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
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
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(751);
					match(K_NATURAL);
					}
				}

				setState(760);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(754);
					match(K_LEFT);
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(755);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(758);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(759);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(762);
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
		enterRule(_localctx, 56, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(765);
				match(K_ON);
				setState(766);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(767);
				match(K_USING);
				setState(768);
				match(OPEN_PAR);
				setState(769);
				column_name();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(770);
					match(COMMA);
					setState(771);
					column_name();
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(777);
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
		enterRule(_localctx, 58, RULE_select_core);
		int _la;
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_GUARD:
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GUARD) {
					{
					setState(781);
					((Select_coreContext)_localctx).guard = outer_guard_clause(db);
					}
				}

				setState(784);
				((Select_coreContext)_localctx).select = select_clause();
				setState(785);
				((Select_coreContext)_localctx).from = from_clause();
				setState(786);
				((Select_coreContext)_localctx).where = where_clause();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(787);
					groupby_clause();
					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(K_VALUES);
				setState(791);
				match(OPEN_PAR);
				setState(792);
				expr(0);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(793);
					match(COMMA);
					setState(794);
					expr(0);
					}
					}
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(800);
				match(CLOSE_PAR);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(801);
					match(COMMA);
					setState(802);
					match(OPEN_PAR);
					setState(803);
					expr(0);
					setState(808);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(804);
						match(COMMA);
						setState(805);
						expr(0);
						}
						}
						setState(810);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(811);
					match(CLOSE_PAR);
					}
					}
					setState(817);
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
		enterRule(_localctx, 60, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(K_HAVING);
			setState(821);
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
		enterRule(_localctx, 62, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(K_GROUP);
			setState(824);
			match(K_BY);
			setState(825);
			groupby_expr();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(826);
				match(COMMA);
				setState(827);
				groupby_expr();
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_HAVING) {
				{
				setState(833);
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
		enterRule(_localctx, 64, RULE_groupby_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
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
		enterRule(_localctx, 66, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(K_SELECT);
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(839);
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
			setState(842);
			result_column();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(843);
				match(COMMA);
				setState(844);
				result_column();
				}
				}
				setState(849);
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
		enterRule(_localctx, 68, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(850);
				match(K_FROM);
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(851);
					table_or_subquery();
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(852);
						match(COMMA);
						setState(853);
						table_or_subquery();
						}
						}
						setState(858);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(859);
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
		enterRule(_localctx, 70, RULE_where_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(864);
				match(K_WHERE);
				setState(865);
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
		enterRule(_localctx, 72, RULE_compound_operator);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(K_UNION);
				setState(870);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(871);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(872);
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
		enterRule(_localctx, 74, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			table_name();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(876);
				match(OPEN_PAR);
				setState(877);
				column_name();
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(878);
					match(COMMA);
					setState(879);
					column_name();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
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
		enterRule(_localctx, 76, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(889);
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

			setState(892);
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
		enterRule(_localctx, 78, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (K_CURRENT_DATE - 63)) | (1L << (K_CURRENT_TIME - 63)) | (1L << (K_CURRENT_TIMESTAMP - 63)) | (1L << (K_NULL - 63)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NUMERIC_LITERAL - 163)) | (1L << (STRING_LITERAL - 163)) | (1L << (BLOB_LITERAL - 163)))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
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
		enterRule(_localctx, 82, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
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
		enterRule(_localctx, 84, RULE_module_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
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
		enterRule(_localctx, 86, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
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
		enterRule(_localctx, 88, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (K_ABORT - 36)) | (1L << (K_ACTION - 36)) | (1L << (K_ADD - 36)) | (1L << (K_AFTER - 36)) | (1L << (K_ALL - 36)) | (1L << (K_ALTER - 36)) | (1L << (K_ANALYZE - 36)) | (1L << (K_AND - 36)) | (1L << (K_AS - 36)) | (1L << (K_ASC - 36)) | (1L << (K_ATTACH - 36)) | (1L << (K_AUTOINCREMENT - 36)) | (1L << (K_BEFORE - 36)) | (1L << (K_BEGIN - 36)) | (1L << (K_BETWEEN - 36)) | (1L << (K_BY - 36)) | (1L << (K_CASCADE - 36)) | (1L << (K_CASE - 36)) | (1L << (K_CAST - 36)) | (1L << (K_CHECK - 36)) | (1L << (K_COLLATE - 36)) | (1L << (K_COLUMN - 36)) | (1L << (K_COMMIT - 36)) | (1L << (K_CONFLICT - 36)) | (1L << (K_CONSTRAINT - 36)) | (1L << (K_CREATE - 36)) | (1L << (K_CROSS - 36)) | (1L << (K_CURRENT_DATE - 36)) | (1L << (K_CURRENT_TIME - 36)) | (1L << (K_CURRENT_TIMESTAMP - 36)) | (1L << (K_DATABASE - 36)) | (1L << (K_DEFAULT - 36)) | (1L << (K_DEFERRABLE - 36)) | (1L << (K_DEFERRED - 36)) | (1L << (K_DELETE - 36)) | (1L << (K_DESC - 36)) | (1L << (K_DETACH - 36)) | (1L << (K_DISTINCT - 36)) | (1L << (K_DROP - 36)) | (1L << (K_EACH - 36)) | (1L << (K_ELSE - 36)) | (1L << (K_END - 36)) | (1L << (K_ESCAPE - 36)) | (1L << (K_EXCEPT - 36)) | (1L << (K_EXCLUSIVE - 36)) | (1L << (K_EXISTS - 36)) | (1L << (K_EXPLAIN - 36)) | (1L << (K_FAIL - 36)) | (1L << (K_FOR - 36)) | (1L << (K_FOREIGN - 36)) | (1L << (K_FROM - 36)) | (1L << (K_FULL - 36)) | (1L << (K_GLOB - 36)) | (1L << (K_GROUP - 36)) | (1L << (K_GUARD - 36)) | (1L << (K_HAVING - 36)) | (1L << (K_IF - 36)) | (1L << (K_IGNORE - 36)) | (1L << (K_IMMEDIATE - 36)) | (1L << (K_IN - 36)) | (1L << (K_INDEX - 36)) | (1L << (K_INDEXED - 36)) | (1L << (K_INITIALLY - 36)) | (1L << (K_INNER - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (K_INSERT - 100)) | (1L << (K_INSTEAD - 100)) | (1L << (K_INTERSECT - 100)) | (1L << (K_INTO - 100)) | (1L << (K_IS - 100)) | (1L << (K_ISNULL - 100)) | (1L << (K_JOIN - 100)) | (1L << (K_KEY - 100)) | (1L << (K_LEFT - 100)) | (1L << (K_LIKE - 100)) | (1L << (K_LIMIT - 100)) | (1L << (K_MATCH - 100)) | (1L << (K_NATURAL - 100)) | (1L << (K_NO - 100)) | (1L << (K_NOT - 100)) | (1L << (K_NOTNULL - 100)) | (1L << (K_NULL - 100)) | (1L << (K_OF - 100)) | (1L << (K_OFFSET - 100)) | (1L << (K_ON - 100)) | (1L << (K_OR - 100)) | (1L << (K_ORDER - 100)) | (1L << (K_OUTER - 100)) | (1L << (K_PLAN - 100)) | (1L << (K_PRAGMA - 100)) | (1L << (K_PRIMARY - 100)) | (1L << (K_QUERY - 100)) | (1L << (K_RAISE - 100)) | (1L << (K_RECURSIVE - 100)) | (1L << (K_REFERENCES - 100)) | (1L << (K_REGEXP - 100)) | (1L << (K_REINDEX - 100)) | (1L << (K_RELEASE - 100)) | (1L << (K_RENAME - 100)) | (1L << (K_REPLACE - 100)) | (1L << (K_RESTRICT - 100)) | (1L << (K_RIGHT - 100)) | (1L << (K_ROLLBACK - 100)) | (1L << (K_ROW - 100)) | (1L << (K_SAVEPOINT - 100)) | (1L << (K_SELECT - 100)) | (1L << (K_SET - 100)) | (1L << (K_TABLE - 100)) | (1L << (K_TEMP - 100)) | (1L << (K_TEMPORARY - 100)) | (1L << (K_THEN - 100)) | (1L << (K_TO - 100)) | (1L << (K_TRANSACTION - 100)) | (1L << (K_TRIGGER - 100)) | (1L << (K_UNION - 100)) | (1L << (K_UNIQUE - 100)) | (1L << (K_UPDATE - 100)) | (1L << (K_USING - 100)) | (1L << (K_VACUUM - 100)) | (1L << (K_VALUES - 100)) | (1L << (K_VIEW - 100)) | (1L << (K_VIRTUAL - 100)) | (1L << (K_WHEN - 100)) | (1L << (K_WHERE - 100)) | (1L << (K_WITH - 100)) | (1L << (K_WITHOUT - 100)))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_name);
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
		enterRule(_localctx, 92, RULE_function_name);
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
		enterRule(_localctx, 94, RULE_database_name);
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
		enterRule(_localctx, 96, RULE_table_name);
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
		enterRule(_localctx, 98, RULE_table_or_index_name);
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
		enterRule(_localctx, 100, RULE_new_table_name);
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
		enterRule(_localctx, 102, RULE_column_name);
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
		enterRule(_localctx, 104, RULE_collation_name);
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
		enterRule(_localctx, 106, RULE_foreign_table);
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
		enterRule(_localctx, 108, RULE_index_name);
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
		enterRule(_localctx, 110, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
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
		enterRule(_localctx, 112, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
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
		enterRule(_localctx, 114, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
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
		enterRule(_localctx, 116, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
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
		enterRule(_localctx, 118, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
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
		enterRule(_localctx, 120, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
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
		enterRule(_localctx, 122, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
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
		enterRule(_localctx, 124, RULE_any_name);
		try {
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
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
				setState(941);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(943);
				match(OPEN_PAR);
				setState(944);
				any_name();
				setState(945);
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
		enterRule(_localctx, 126, RULE_guard_key_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(949);
					database_name();
					setState(950);
					match(DOT);
					}
					break;
				}
				setState(954);
				table_name();
				setState(955);
				match(DOT);
				}
				break;
			}
			setState(959);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00af\u03c4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\7\2\u0085\n\2\f\2\16\2\u0088\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\7\4\u0090\n\4\f\4\16\4\u0093\13\4\3\4\3\4\6\4\u0097"+
		"\n\4\r\4\16\4\u0098\3\4\7\4\u009c\n\4\f\4\16\4\u009f\13\4\3\4\7\4\u00a2"+
		"\n\4\f\4\16\4\u00a5\13\4\3\5\3\5\5\5\u00a9\n\5\3\6\3\6\5\6\u00ad\n\6\3"+
		"\6\3\6\3\6\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\5\6\u00b7\n\6\3\6\3\6\3\6"+
		"\5\6\u00bc\n\6\3\6\3\6\5\6\u00c0\n\6\3\6\6\6\u00c3\n\6\r\6\16\6\u00c4"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u00cc\n\6\f\6\16\6\u00cf\13\6\5\6\u00d1\n\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00d7\n\6\5\6\u00d9\n\6\3\7\3\7\5\7\u00dd\n\7\3\7\3"+
		"\7\3\7\7\7\u00e2\n\7\f\7\16\7\u00e5\13\7\5\7\u00e7\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00ef\n\7\f\7\16\7\u00f2\13\7\5\7\u00f4\n\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00fa\n\7\5\7\u00fc\n\7\3\b\3\b\5\b\u0100\n\b\3\b\3\b\3\b\7\b\u0105"+
		"\n\b\f\b\16\b\u0108\13\b\5\b\u010a\n\b\3\b\3\b\3\b\3\b\7\b\u0110\n\b\f"+
		"\b\16\b\u0113\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u011a\n\b\f\b\16\b\u011d\13"+
		"\b\5\b\u011f\n\b\3\b\3\b\3\b\3\b\5\b\u0125\n\b\5\b\u0127\n\b\3\t\5\t\u012a"+
		"\n\t\3\t\3\t\5\t\u012e\n\t\3\t\3\t\3\t\7\t\u0133\n\t\f\t\16\t\u0136\13"+
		"\t\3\t\3\t\3\t\3\t\7\t\u013c\n\t\f\t\16\t\u013f\13\t\3\t\5\t\u0142\n\t"+
		"\5\t\u0144\n\t\3\t\3\t\5\t\u0148\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u014f\n\t"+
		"\f\t\16\t\u0152\13\t\3\t\3\t\5\t\u0156\n\t\5\t\u0158\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u015f\n\t\f\t\16\t\u0162\13\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u016a"+
		"\n\t\f\t\16\t\u016d\13\t\3\t\3\t\7\t\u0171\n\t\f\t\16\t\u0174\13\t\5\t"+
		"\u0176\n\t\3\n\6\n\u0179\n\n\r\n\16\n\u017a\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0187\n\n\3\13\3\13\3\13\7\13\u018c\n\13\f\13\16\13"+
		"\u018f\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0197\n\f\3\f\3\f\3\f\5\f\u019c"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01a6\n\f\3\f\3\f\3\f\7\f\u01ab"+
		"\n\f\f\f\16\f\u01ae\13\f\3\f\5\f\u01b1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01c1\n\f\3\f\5\f\u01c4\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u01cc\n\f\3\f\3\f\3\f\3\f\3\f\6\f\u01d3\n\f\r\f\16"+
		"\f\u01d4\3\f\3\f\5\f\u01d9\n\f\3\f\3\f\5\f\u01dd\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01ef\n\f\3\f\3\f\3"+
		"\f\5\f\u01f4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0200\n\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0206\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u020d\n\f\3\f\3"+
		"\f\5\f\u0211\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0219\n\f\f\f\16\f\u021c"+
		"\13\f\5\f\u021e\n\f\3\f\3\f\3\f\3\f\5\f\u0224\n\f\3\f\5\f\u0227\n\f\7"+
		"\f\u0229\n\f\f\f\16\f\u022c\13\f\3\r\3\r\5\r\u0230\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u0239\n\16\f\16\16\16\u023c\13\16\3\16\3\16\3"+
		"\17\3\17\5\17\u0242\n\17\3\17\5\17\u0245\n\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0264\n\24\3\25"+
		"\3\25\5\25\u0268\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0276\n\25\f\25\16\25\u0279\13\25\3\26\3\26\3\26\5\26"+
		"\u027e\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0286\n\26\3\27\3\27\3"+
		"\27\5\27\u028b\n\27\3\27\5\27\u028e\n\27\3\30\3\30\3\30\5\30\u0293\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u029a\n\31\f\31\16\31\u029d\13\31\3\31"+
		"\3\31\5\31\u02a1\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u02af\n\32\3\32\5\32\u02b2\n\32\5\32\u02b4\n\32\3\33\3"+
		"\33\3\33\5\33\u02b9\n\33\3\33\3\33\5\33\u02bd\n\33\3\33\5\33\u02c0\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u02c7\n\33\3\33\3\33\3\33\3\33\7\33\u02cd"+
		"\n\33\f\33\16\33\u02d0\13\33\3\33\5\33\u02d3\n\33\3\33\3\33\5\33\u02d7"+
		"\n\33\3\33\5\33\u02da\n\33\3\33\3\33\3\33\3\33\5\33\u02e0\n\33\3\33\5"+
		"\33\u02e3\n\33\5\33\u02e5\n\33\3\34\3\34\3\34\3\34\3\34\7\34\u02ec\n\34"+
		"\f\34\16\34\u02ef\13\34\3\35\3\35\5\35\u02f3\n\35\3\35\3\35\5\35\u02f7"+
		"\n\35\3\35\3\35\5\35\u02fb\n\35\3\35\5\35\u02fe\n\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\7\36\u0307\n\36\f\36\16\36\u030a\13\36\3\36\3\36\5"+
		"\36\u030e\n\36\3\37\5\37\u0311\n\37\3\37\3\37\3\37\3\37\5\37\u0317\n\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u031e\n\37\f\37\16\37\u0321\13\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u0329\n\37\f\37\16\37\u032c\13\37\3\37"+
		"\3\37\7\37\u0330\n\37\f\37\16\37\u0333\13\37\5\37\u0335\n\37\3 \3 \3 "+
		"\3!\3!\3!\3!\3!\7!\u033f\n!\f!\16!\u0342\13!\3!\5!\u0345\n!\3\"\3\"\3"+
		"#\3#\5#\u034b\n#\3#\3#\3#\7#\u0350\n#\f#\16#\u0353\13#\3$\3$\3$\3$\7$"+
		"\u0359\n$\f$\16$\u035c\13$\3$\5$\u035f\n$\5$\u0361\n$\3%\3%\5%\u0365\n"+
		"%\3&\3&\3&\3&\3&\5&\u036c\n&\3\'\3\'\3\'\3\'\3\'\7\'\u0373\n\'\f\'\16"+
		"\'\u0376\13\'\3\'\3\'\5\'\u037a\n\'\3(\5(\u037d\n(\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3@\5@\u03b6\n@\3A\3A\3A\5A\u03bb\n"+
		"A\3A\3A\3A\5A\u03c0\nA\3A\3A\3A\2\3\26B\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\2\r\4\2\13\13xx\4\2**KK\4\2\r\17\22\23\6\2ZZooqq\u0084\u0084\3\2\3\4"+
		"\4\2//II\3\2\16\17\7\2ACvv\u00a5\u00a5\u00a8\u00a8\u00aa\u00aa\4\2\16"+
		"\20tt\4\2\u00a4\u00a4\u00a8\u00a8\3\2&\u00a2\2\u0436\2\u0086\3\2\2\2\4"+
		"\u008b\3\2\2\2\6\u0091\3\2\2\2\b\u00a8\3\2\2\2\n\u00b6\3\2\2\2\f\u00e6"+
		"\3\2\2\2\16\u0109\3\2\2\2\20\u0175\3\2\2\2\22\u0178\3\2\2\2\24\u0188\3"+
		"\2\2\2\26\u01dc\3\2\2\2\30\u022d\3\2\2\2\32\u0233\3\2\2\2\34\u023f\3\2"+
		"\2\2\36\u0246\3\2\2\2 \u0248\3\2\2\2\"\u024a\3\2\2\2$\u024c\3\2\2\2&\u0263"+
		"\3\2\2\2(\u0265\3\2\2\2*\u027d\3\2\2\2,\u0287\3\2\2\2.\u0292\3\2\2\2\60"+
		"\u0294\3\2\2\2\62\u02b3\3\2\2\2\64\u02e4\3\2\2\2\66\u02e6\3\2\2\28\u02fd"+
		"\3\2\2\2:\u030d\3\2\2\2<\u0334\3\2\2\2>\u0336\3\2\2\2@\u0339\3\2\2\2B"+
		"\u0346\3\2\2\2D\u0348\3\2\2\2F\u0360\3\2\2\2H\u0364\3\2\2\2J\u036b\3\2"+
		"\2\2L\u036d\3\2\2\2N\u037c\3\2\2\2P\u0380\3\2\2\2R\u0382\3\2\2\2T\u0384"+
		"\3\2\2\2V\u0386\3\2\2\2X\u0388\3\2\2\2Z\u038a\3\2\2\2\\\u038c\3\2\2\2"+
		"^\u038e\3\2\2\2`\u0390\3\2\2\2b\u0392\3\2\2\2d\u0394\3\2\2\2f\u0396\3"+
		"\2\2\2h\u0398\3\2\2\2j\u039a\3\2\2\2l\u039c\3\2\2\2n\u039e\3\2\2\2p\u03a0"+
		"\3\2\2\2r\u03a2\3\2\2\2t\u03a4\3\2\2\2v\u03a6\3\2\2\2x\u03a8\3\2\2\2z"+
		"\u03aa\3\2\2\2|\u03ac\3\2\2\2~\u03b5\3\2\2\2\u0080\u03bf\3\2\2\2\u0082"+
		"\u0085\5\6\4\2\u0083\u0085\5\4\3\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\2\2\3\u008a\3\3\2\2\2"+
		"\u008b\u008c\7\u00af\2\2\u008c\u008d\b\3\1\2\u008d\5\3\2\2\2\u008e\u0090"+
		"\7\7\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u009d\5\b"+
		"\5\2\u0095\u0097\7\7\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\5\b"+
		"\5\2\u009b\u0096\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a3\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\7"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\5\f\7\2"+
		"\u00a7\u00a9\5\16\b\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\t"+
		"\3\2\2\2\u00aa\u00ac\7\u00a1\2\2\u00ab\u00ad\7\u0082\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b3\5\60\31\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\u00b2\5\60\31\2\u00b1\u00af\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00c2\5<\37\2\u00b9\u00bb\7\u0097\2\2\u00ba\u00bc\7*\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00c0\7h"+
		"\2\2\u00be\u00c0\7Q\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\5<\37\2\u00c2\u00bf\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00d0\3\2\2\2\u00c6\u00c7\7{\2\2\u00c7\u00c8\7\65\2\2\u00c8\u00cd\5,"+
		"\27\2\u00c9\u00ca\7\13\2\2\u00ca\u00cc\5,\27\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d8\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d6\5\26\f\2\u00d4\u00d5\t\2"+
		"\2\2\u00d5\u00d7\5\26\f\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\13\3\2\2"+
		"\2\u00da\u00dc\7\u00a1\2\2\u00db\u00dd\7\u0082\2\2\u00dc\u00db\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e3\5\60\31\2\u00df\u00e0"+
		"\7\13\2\2\u00e0\u00e2\5\60\31\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00f3\5<\37\2\u00e9\u00ea\7{\2\2\u00ea\u00eb\7\65\2\2\u00eb\u00f0\5,"+
		"\27\2\u00ec\u00ed\7\13\2\2\u00ed\u00ef\5,\27\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00fb\3\2\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f9\5\26\f\2\u00f7\u00f8\t\2"+
		"\2\2\u00f8\u00fa\5\26\f\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\r\3\2\2\2"+
		"\u00fd\u00ff\7\u00a1\2\2\u00fe\u0100\7\u0082\2\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0106\5\60\31\2\u0102\u0103\7"+
		"\13\2\2\u0103\u0105\5\60\31\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u00fd\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0111\5\20\t\2\u010c\u010d\5J&\2\u010d\u010e\5\20\t\2\u010e\u0110\3\2"+
		"\2\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u011e\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7{"+
		"\2\2\u0115\u0116\7\65\2\2\u0116\u011b\5,\27\2\u0117\u0118\7\13\2\2\u0118"+
		"\u011a\5,\27\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0114\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0126\3\2\2\2\u0120\u0121\7p"+
		"\2\2\u0121\u0124\5\26\f\2\u0122\u0123\t\2\2\2\u0123\u0125\5\26\f\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0120\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\17\3\2\2\2\u0128\u012a\5\30\r\2\u0129\u0128"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\7\u008e\2"+
		"\2\u012c\u012e\t\3\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0134\5\62\32\2\u0130\u0131\7\13\2\2\u0131\u0133\5\62\32"+
		"\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0143\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0141\7X\2\2\u0138"+
		"\u013d\5\64\33\2\u0139\u013a\7\13\2\2\u013a\u013c\5\64\33\2\u013b\u0139"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0142\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\5\66\34\2\u0141\u0138\3"+
		"\2\2\2\u0141\u0140\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0137\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0146\7\u00a0\2\2\u0146\u0148"+
		"\5\26\f\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0157\3\2\2\2"+
		"\u0149\u014a\7[\2\2\u014a\u014b\7\65\2\2\u014b\u0150\5\26\f\2\u014c\u014d"+
		"\7\13\2\2\u014d\u014f\5\26\f\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0155\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0153\u0154\7]\2\2\u0154\u0156\5\26\f\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0149\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0176\3\2\2\2\u0159\u015a\7\u009c\2\2\u015a\u015b\7\t\2\2\u015b"+
		"\u0160\5\26\f\2\u015c\u015d\7\13\2\2\u015d\u015f\5\26\f\2\u015e\u015c"+
		"\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0172\7\n\2\2\u0164\u0165\7\13"+
		"\2\2\u0165\u0166\7\t\2\2\u0166\u016b\5\26\f\2\u0167\u0168\7\13\2\2\u0168"+
		"\u016a\5\26\f\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\7\n\2\2\u016f\u0171\3\2\2\2\u0170\u0164\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0129\3\2\2\2\u0175\u0159\3\2\2\2\u0176\21\3\2\2"+
		"\2\u0177\u0179\5\\/\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0186\3\2\2\2\u017c\u017d\7\t\2\2\u017d"+
		"\u017e\5N(\2\u017e\u017f\7\n\2\2\u017f\u0187\3\2\2\2\u0180\u0181\7\t\2"+
		"\2\u0181\u0182\5N(\2\u0182\u0183\7\13\2\2\u0183\u0184\5N(\2\u0184\u0185"+
		"\7\n\2\2\u0185\u0187\3\2\2\2\u0186\u017c\3\2\2\2\u0186\u0180\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\23\3\2\2\2\u0188\u018d\5~@\2\u0189\u018a\7\b\2\2"+
		"\u018a\u018c\5~@\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\25\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0191\b\f\1\2\u0191\u01dd\5P)\2\u0192\u01dd\7\u00a6\2\2\u0193\u0194\5"+
		"`\61\2\u0194\u0195\7\b\2\2\u0195\u0197\3\2\2\2\u0196\u0193\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\5b\62\2\u0199\u019a\7\b"+
		"\2\2\u019a\u019c\3\2\2\2\u019b\u0196\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u01dd\5h\65\2\u019e\u01dd\5\24\13\2\u019f\u01a0\5"+
		"R*\2\u01a0\u01a1\5\26\f\22\u01a1\u01dd\3\2\2\2\u01a2\u01a3\5^\60\2\u01a3"+
		"\u01b0\7\t\2\2\u01a4\u01a6\7K\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ac\5\26\f\2\u01a8\u01a9\7\13\2\2\u01a9"+
		"\u01ab\5\26\f\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3"+
		"\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b1\7\r\2\2\u01b0\u01a5\3\2\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7\n\2\2\u01b3\u01dd\3\2\2\2\u01b4"+
		"\u01b5\7\t\2\2\u01b5\u01b6\5\26\f\2\u01b6\u01b7\7\n\2\2\u01b7\u01dd\3"+
		"\2\2\2\u01b8\u01b9\78\2\2\u01b9\u01ba\7\t\2\2\u01ba\u01bb\5\26\f\2\u01bb"+
		"\u01bc\7.\2\2\u01bc\u01bd\5\22\n\2\u01bd\u01be\7\n\2\2\u01be\u01dd\3\2"+
		"\2\2\u01bf\u01c1\7t\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c4\7S\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7\t\2\2\u01c6\u01c7\5\16\b\2\u01c7"+
		"\u01c8\7\n\2\2\u01c8\u01dd\3\2\2\2\u01c9\u01cb\7\67\2\2\u01ca\u01cc\5"+
		"\26\f\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d2\3\2\2\2\u01cd"+
		"\u01ce\7\u009f\2\2\u01ce\u01cf\5\26\f\2\u01cf\u01d0\7\u0093\2\2\u01d0"+
		"\u01d1\5\26\f\2\u01d1\u01d3\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d7\7N\2\2\u01d7\u01d9\5\26\f\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7O\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u0190\3\2\2\2\u01dc\u0192\3\2\2\2\u01dc\u019b\3\2\2\2\u01dc\u019e\3\2"+
		"\2\2\u01dc\u019f\3\2\2\2\u01dc\u01a2\3\2\2\2\u01dc\u01b4\3\2\2\2\u01dc"+
		"\u01b8\3\2\2\2\u01dc\u01c3\3\2\2\2\u01dc\u01c9\3\2\2\2\u01dd\u022a\3\2"+
		"\2\2\u01de\u01df\f\21\2\2\u01df\u01e0\t\4\2\2\u01e0\u0229\5\26\f\22\u01e1"+
		"\u01e2\f\20\2\2\u01e2\u01e3\5&\24\2\u01e3\u01e4\5\26\f\21\u01e4\u0229"+
		"\3\2\2\2\u01e5\u01e6\f\17\2\2\u01e6\u01e7\7-\2\2\u01e7\u0229\5\26\f\20"+
		"\u01e8\u01e9\f\16\2\2\u01e9\u01ea\7z\2\2\u01ea\u0229\5\26\f\17\u01eb\u01ec"+
		"\f\7\2\2\u01ec\u01ee\7j\2\2\u01ed\u01ef\7t\2\2\u01ee\u01ed\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u0229\5\26\f\b\u01f1\u01f3\f"+
		"\6\2\2\u01f2\u01f4\7t\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\7\64\2\2\u01f6\u01f7\5\26\f\2\u01f7\u01f8\7"+
		"-\2\2\u01f8\u01f9\5\26\f\7\u01f9\u0229\3\2\2\2\u01fa\u01fb\f\n\2\2\u01fb"+
		"\u01fc\7:\2\2\u01fc\u0229\5j\66\2\u01fd\u01ff\f\t\2\2\u01fe\u0200\7t\2"+
		"\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\t\5\2\2\u0202\u0205\5\26\f\2\u0203\u0204\7P\2\2\u0204\u0206\5\26\f\2"+
		"\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0229\3\2\2\2\u0207\u020c"+
		"\f\b\2\2\u0208\u020d\7k\2\2\u0209\u020d\7u\2\2\u020a\u020b\7t\2\2\u020b"+
		"\u020d\7v\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u0229\3\2\2\2\u020e\u0210\f\5\2\2\u020f\u0211\7t\2\2\u0210"+
		"\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0226\7a"+
		"\2\2\u0213\u021d\7\t\2\2\u0214\u021e\5\16\b\2\u0215\u021a\5\26\f\2\u0216"+
		"\u0217\7\13\2\2\u0217\u0219\5\26\f\2\u0218\u0216\3\2\2\2\u0219\u021c\3"+
		"\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021e\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u0214\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f\u0227\7\n\2\2\u0220\u0221\5`\61\2\u0221"+
		"\u0222\7\b\2\2\u0222\u0224\3\2\2\2\u0223\u0220\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225\u0227\5b\62\2\u0226\u0213\3\2\2\2\u0226"+
		"\u0223\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u01de\3\2\2\2\u0228\u01e1\3\2"+
		"\2\2\u0228\u01e5\3\2\2\2\u0228\u01e8\3\2\2\2\u0228\u01eb\3\2\2\2\u0228"+
		"\u01f1\3\2\2\2\u0228\u01fa\3\2\2\2\u0228\u01fd\3\2\2\2\u0228\u0207\3\2"+
		"\2\2\u0228\u020e\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\27\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022f\7\\\2"+
		"\2\u022e\u0230\5\36\20\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0232\5\32\16\2\u0232\31\3\2\2\2\u0233\u0234\5\""+
		"\22\2\u0234\u023a\5\34\17\2\u0235\u0236\5 \21\2\u0236\u0237\5\34\17\2"+
		"\u0237\u0239\3\2\2\2\u0238\u0235\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u023e\5$\23\2\u023e\33\3\2\2\2\u023f\u0241\5\u0080A\2\u0240\u0242\5\36"+
		"\20\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243"+
		"\u0245\5\32\16\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\35\3\2"+
		"\2\2\u0246\u0247\t\6\2\2\u0247\37\3\2\2\2\u0248\u0249\7\13\2\2\u0249!"+
		"\3\2\2\2\u024a\u024b\7\5\2\2\u024b#\3\2\2\2\u024c\u024d\7\6\2\2\u024d"+
		"%\3\2\2\2\u024e\u0264\7\21\2\2\u024f\u0264\7\24\2\2\u0250\u0264\7\25\2"+
		"\2\u0251\u0264\7\26\2\2\u0252\u0264\7\27\2\2\u0253\u0264\7\30\2\2\u0254"+
		"\u0264\7\31\2\2\u0255\u0264\7\32\2\2\u0256\u0264\7\33\2\2\u0257\u0264"+
		"\7\f\2\2\u0258\u0264\7\34\2\2\u0259\u0264\7\35\2\2\u025a\u0264\7\36\2"+
		"\2\u025b\u0264\7j\2\2\u025c\u025d\7j\2\2\u025d\u0264\7t\2\2\u025e\u0264"+
		"\7a\2\2\u025f\u0264\7o\2\2\u0260\u0264\7Z\2\2\u0261\u0264\7q\2\2\u0262"+
		"\u0264\7\u0084\2\2\u0263\u024e\3\2\2\2\u0263\u024f\3\2\2\2\u0263\u0250"+
		"\3\2\2\2\u0263\u0251\3\2\2\2\u0263\u0252\3\2\2\2\u0263\u0253\3\2\2\2\u0263"+
		"\u0254\3\2\2\2\u0263\u0255\3\2\2\2\u0263\u0256\3\2\2\2\u0263\u0257\3\2"+
		"\2\2\u0263\u0258\3\2\2\2\u0263\u0259\3\2\2\2\u0263\u025a\3\2\2\2\u0263"+
		"\u025b\3\2\2\2\u0263\u025c\3\2\2\2\u0263\u025e\3\2\2\2\u0263\u025f\3\2"+
		"\2\2\u0263\u0260\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264"+
		"\'\3\2\2\2\u0265\u0267\7\u00a1\2\2\u0266\u0268\7\u0082\2\2\u0267\u0266"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5L\'\2\u026a"+
		"\u026b\7.\2\2\u026b\u026c\7\t\2\2\u026c\u026d\5\16\b\2\u026d\u0277\7\n"+
		"\2\2\u026e\u026f\7\13\2\2\u026f\u0270\5L\'\2\u0270\u0271\7.\2\2\u0271"+
		"\u0272\7\t\2\2\u0272\u0273\5\16\b\2\u0273\u0274\7\n\2\2\u0274\u0276\3"+
		"\2\2\2\u0275\u026e\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278)\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\5`\61\2"+
		"\u027b\u027c\7\b\2\2\u027c\u027e\3\2\2\2\u027d\u027a\3\2\2\2\u027d\u027e"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0285\5b\62\2\u0280\u0281\7c\2\2\u0281"+
		"\u0282\7\65\2\2\u0282\u0286\5n8\2\u0283\u0284\7t\2\2\u0284\u0286\7c\2"+
		"\2\u0285\u0280\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286+"+
		"\3\2\2\2\u0287\u028a\5\26\f\2\u0288\u0289\7:\2\2\u0289\u028b\5j\66\2\u028a"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028e\t\7"+
		"\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e-\3\2\2\2\u028f\u0293"+
		"\5N(\2\u0290\u0293\5\\/\2\u0291\u0293\7\u00a8\2\2\u0292\u028f\3\2\2\2"+
		"\u0292\u0290\3\2\2\2\u0292\u0291\3\2\2\2\u0293/\3\2\2\2\u0294\u02a0\5"+
		"b\62\2\u0295\u0296\7\t\2\2\u0296\u029b\5h\65\2\u0297\u0298\7\13\2\2\u0298"+
		"\u029a\5h\65\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2"+
		"\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e"+
		"\u029f\7\n\2\2\u029f\u02a1\3\2\2\2\u02a0\u0295\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7.\2\2\u02a3\u02a4\7\t\2\2\u02a4"+
		"\u02a5\5\16\b\2\u02a5\u02a6\7\n\2\2\u02a6\61\3\2\2\2\u02a7\u02b4\7\r\2"+
		"\2\u02a8\u02a9\5b\62\2\u02a9\u02aa\7\b\2\2\u02aa\u02ab\7\r\2\2\u02ab\u02b4"+
		"\3\2\2\2\u02ac\u02b1\5\26\f\2\u02ad\u02af\7.\2\2\u02ae\u02ad\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\5X-\2\u02b1\u02ae\3\2\2"+
		"\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02a7\3\2\2\2\u02b3\u02a8"+
		"\3\2\2\2\u02b3\u02ac\3\2\2\2\u02b4\63\3\2\2\2\u02b5\u02b6\5`\61\2\u02b6"+
		"\u02b7\7\b\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02b5\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bf\5b\62\2\u02bb\u02bd\7.\2\2\u02bc"+
		"\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\5z"+
		">\2\u02bf\u02bc\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c6\3\2\2\2\u02c1"+
		"\u02c2\7c\2\2\u02c2\u02c3\7\65\2\2\u02c3\u02c7\5n8\2\u02c4\u02c5\7t\2"+
		"\2\u02c5\u02c7\7c\2\2\u02c6\u02c1\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02e5\3\2\2\2\u02c8\u02d2\7\t\2\2\u02c9\u02ce\5\64\33\2"+
		"\u02ca\u02cb\7\13\2\2\u02cb\u02cd\5\64\33\2\u02cc\u02ca\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d3\3\2"+
		"\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\5\66\34\2\u02d2\u02c9\3\2\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d9\7\n\2\2\u02d5\u02d7\7."+
		"\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02da\5z>\2\u02d9\u02d6\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e5\3\2\2"+
		"\2\u02db\u02dc\7\t\2\2\u02dc\u02dd\5\16\b\2\u02dd\u02e2\7\n\2\2\u02de"+
		"\u02e0\7.\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2"+
		"\2\2\u02e1\u02e3\5z>\2\u02e2\u02df\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5"+
		"\3\2\2\2\u02e4\u02b8\3\2\2\2\u02e4\u02c8\3\2\2\2\u02e4\u02db\3\2\2\2\u02e5"+
		"\65\3\2\2\2\u02e6\u02ed\5\64\33\2\u02e7\u02e8\58\35\2\u02e8\u02e9\5\64"+
		"\33\2\u02e9\u02ea\5:\36\2\u02ea\u02ec\3\2\2\2\u02eb\u02e7\3\2\2\2\u02ec"+
		"\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\67\3\2\2"+
		"\2\u02ef\u02ed\3\2\2\2\u02f0\u02fe\7\13\2\2\u02f1\u02f3\7r\2\2\u02f2\u02f1"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02fa\3\2\2\2\u02f4\u02f6\7n\2\2\u02f5"+
		"\u02f7\7|\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fb\3\2"+
		"\2\2\u02f8\u02fb\7e\2\2\u02f9\u02fb\7@\2\2\u02fa\u02f4\3\2\2\2\u02fa\u02f8"+
		"\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fe\7l\2\2\u02fd\u02f0\3\2\2\2\u02fd\u02f2\3\2\2\2\u02fe9\3\2\2\2\u02ff"+
		"\u0300\7y\2\2\u0300\u030e\5\26\f\2\u0301\u0302\7\u009a\2\2\u0302\u0303"+
		"\7\t\2\2\u0303\u0308\5h\65\2\u0304\u0305\7\13\2\2\u0305\u0307\5h\65\2"+
		"\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\7\n\2\2\u030c"+
		"\u030e\3\2\2\2\u030d\u02ff\3\2\2\2\u030d\u0301\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e;\3\2\2\2\u030f\u0311\5\30\r\2\u0310\u030f\3\2\2\2\u0310\u0311"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\5D#\2\u0313\u0314\5F$\2\u0314"+
		"\u0316\5H%\2\u0315\u0317\5@!\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2"+
		"\u0317\u0335\3\2\2\2\u0318\u0319\7\u009c\2\2\u0319\u031a\7\t\2\2\u031a"+
		"\u031f\5\26\f\2\u031b\u031c\7\13\2\2\u031c\u031e\5\26\f\2\u031d\u031b"+
		"\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u0322\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0331\7\n\2\2\u0323\u0324\7\13"+
		"\2\2\u0324\u0325\7\t\2\2\u0325\u032a\5\26\f\2\u0326\u0327\7\13\2\2\u0327"+
		"\u0329\5\26\f\2\u0328\u0326\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3"+
		"\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u032e\7\n\2\2\u032e\u0330\3\2\2\2\u032f\u0323\3\2\2\2\u0330\u0333\3\2"+
		"\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0335\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0334\u0310\3\2\2\2\u0334\u0318\3\2\2\2\u0335=\3\2\2\2"+
		"\u0336\u0337\7]\2\2\u0337\u0338\5\26\f\2\u0338?\3\2\2\2\u0339\u033a\7"+
		"[\2\2\u033a\u033b\7\65\2\2\u033b\u0340\5B\"\2\u033c\u033d\7\13\2\2\u033d"+
		"\u033f\5B\"\2\u033e\u033c\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0343"+
		"\u0345\5> \2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345A\3\2\2\2\u0346"+
		"\u0347\5\26\f\2\u0347C\3\2\2\2\u0348\u034a\7\u008e\2\2\u0349\u034b\t\3"+
		"\2\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u0351\5\62\32\2\u034d\u034e\7\13\2\2\u034e\u0350\5\62\32\2\u034f\u034d"+
		"\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"E\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u035e\7X\2\2\u0355\u035a\5\64\33\2"+
		"\u0356\u0357\7\13\2\2\u0357\u0359\5\64\33\2\u0358\u0356\3\2\2\2\u0359"+
		"\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035f\3\2"+
		"\2\2\u035c\u035a\3\2\2\2\u035d\u035f\5\66\34\2\u035e\u0355\3\2\2\2\u035e"+
		"\u035d\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u0354\3\2\2\2\u0360\u0361\3\2"+
		"\2\2\u0361G\3\2\2\2\u0362\u0363\7\u00a0\2\2\u0363\u0365\5\26\f\2\u0364"+
		"\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365I\3\2\2\2\u0366\u036c\7\u0097"+
		"\2\2\u0367\u0368\7\u0097\2\2\u0368\u036c\7*\2\2\u0369\u036c\7h\2\2\u036a"+
		"\u036c\7Q\2\2\u036b\u0366\3\2\2\2\u036b\u0367\3\2\2\2\u036b\u0369\3\2"+
		"\2\2\u036b\u036a\3\2\2\2\u036cK\3\2\2\2\u036d\u0379\5b\62\2\u036e\u036f"+
		"\7\t\2\2\u036f\u0374\5h\65\2\u0370\u0371\7\13\2\2\u0371\u0373\5h\65\2"+
		"\u0372\u0370\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\7\n\2\2\u0378"+
		"\u037a\3\2\2\2\u0379\u036e\3\2\2\2\u0379\u037a\3\2\2\2\u037aM\3\2\2\2"+
		"\u037b\u037d\t\b\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037e\u037f\7\u00a5\2\2\u037fO\3\2\2\2\u0380\u0381\t\t\2\2\u0381"+
		"Q\3\2\2\2\u0382\u0383\t\n\2\2\u0383S\3\2\2\2\u0384\u0385\7\u00a8\2\2\u0385"+
		"U\3\2\2\2\u0386\u0387\5\26\f\2\u0387W\3\2\2\2\u0388\u0389\t\13\2\2\u0389"+
		"Y\3\2\2\2\u038a\u038b\t\f\2\2\u038b[\3\2\2\2\u038c\u038d\5~@\2\u038d]"+
		"\3\2\2\2\u038e\u038f\5~@\2\u038f_\3\2\2\2\u0390\u0391\5~@\2\u0391a\3\2"+
		"\2\2\u0392\u0393\5~@\2\u0393c\3\2\2\2\u0394\u0395\5~@\2\u0395e\3\2\2\2"+
		"\u0396\u0397\5~@\2\u0397g\3\2\2\2\u0398\u0399\5~@\2\u0399i\3\2\2\2\u039a"+
		"\u039b\5~@\2\u039bk\3\2\2\2\u039c\u039d\5~@\2\u039dm\3\2\2\2\u039e\u039f"+
		"\5~@\2\u039fo\3\2\2\2\u03a0\u03a1\5~@\2\u03a1q\3\2\2\2\u03a2\u03a3\5~"+
		"@\2\u03a3s\3\2\2\2\u03a4\u03a5\5~@\2\u03a5u\3\2\2\2\u03a6\u03a7\5~@\2"+
		"\u03a7w\3\2\2\2\u03a8\u03a9\5~@\2\u03a9y\3\2\2\2\u03aa\u03ab\5~@\2\u03ab"+
		"{\3\2\2\2\u03ac\u03ad\5~@\2\u03ad}\3\2\2\2\u03ae\u03b6\7\u00a4\2\2\u03af"+
		"\u03b6\5Z.\2\u03b0\u03b6\7\u00a8\2\2\u03b1\u03b2\7\t\2\2\u03b2\u03b3\5"+
		"~@\2\u03b3\u03b4\7\n\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03ae\3\2\2\2\u03b5"+
		"\u03af\3\2\2\2\u03b5\u03b0\3\2\2\2\u03b5\u03b1\3\2\2\2\u03b6\177\3\2\2"+
		"\2\u03b7\u03b8\5`\61\2\u03b8\u03b9\7\b\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b7"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\5b\62\2\u03bd"+
		"\u03be\7\b\2\2\u03be\u03c0\3\2\2\2\u03bf\u03ba\3\2\2\2\u03bf\u03c0\3\2"+
		"\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\5h\65\2\u03c2\u0081\3\2\2\2\u0082"+
		"\u0084\u0086\u0091\u0098\u009d\u00a3\u00a8\u00ac\u00b3\u00b6\u00bb\u00bf"+
		"\u00c4\u00cd\u00d0\u00d6\u00d8\u00dc\u00e3\u00e6\u00f0\u00f3\u00f9\u00fb"+
		"\u00ff\u0106\u0109\u0111\u011b\u011e\u0124\u0126\u0129\u012d\u0134\u013d"+
		"\u0141\u0143\u0147\u0150\u0155\u0157\u0160\u016b\u0172\u0175\u017a\u0186"+
		"\u018d\u0196\u019b\u01a5\u01ac\u01b0\u01c0\u01c3\u01cb\u01d4\u01d8\u01dc"+
		"\u01ee\u01f3\u01ff\u0205\u020c\u0210\u021a\u021d\u0223\u0226\u0228\u022a"+
		"\u022f\u023a\u0241\u0244\u0263\u0267\u0277\u027d\u0285\u028a\u028d\u0292"+
		"\u029b\u02a0\u02ae\u02b1\u02b3\u02b8\u02bc\u02bf\u02c6\u02ce\u02d2\u02d6"+
		"\u02d9\u02df\u02e2\u02e4\u02ed\u02f2\u02f6\u02fa\u02fd\u0308\u030d\u0310"+
		"\u0316\u031f\u032a\u0331\u0334\u0340\u0344\u034a\u0351\u035a\u035e\u0360"+
		"\u0364\u036b\u0374\u0379\u037c\u03b5\u03ba\u03bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}