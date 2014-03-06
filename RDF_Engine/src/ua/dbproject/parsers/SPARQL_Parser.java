// Generated from SPARQL_.g4 by ANTLR 4.1
package ua.dbproject.parsers;

  //** The SPARQL_Parser takes care of parsing SPARQL queries. */

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPARQL_Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, SIGN=5, PREFIX=22, WHERE=18, LT=1, MARK=37, ASC=24, ORDER=23, 
		LIMIT=26, LITERAL_INT=40, MAX=31, COUNT=28, MIN=30, SUM=29, AND=14, TRUE=33, 
		SEMI=6, UNION=27, LPAREN=10, ASTERISK=16, REF=4, LITERAL_STRING=41, COLON=7, 
		RPAREN=11, WS=42, NEWLINE=38, RESERVED=36, HTML_STRING=35, QUESTION=9, 
		COMMA=8, AVG=32, LCBRACKET=12, OR=15, IDENT=39, GT=2, BASE=19, DESC=25, 
		COMMENT=43, DOT=3, FROM=21, FALSE=34, SELECT=17, DISTINCT=20, RCBRACKET=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'<'", "'>'", "'.'", "'&'", "'#'", "';'", "':'", "','", "QUESTION", 
		"'('", "')'", "'{'", "'}'", "'&&'", "'||'", "'*'", "SELECT", "WHERE", 
		"BASE", "DISTINCT", "FROM", "PREFIX", "ORDER", "ASC", "DESC", "LIMIT", 
		"UNION", "COUNT", "SUM", "MIN", "MAX", "AVG", "TRUE", "FALSE", "HTML_STRING", 
		"RESERVED", "MARK", "NEWLINE", "IDENT", "LITERAL_INT", "LITERAL_STRING", 
		"WS", "COMMENT"
	};
	public static final int
		RULE_query = 0, RULE_defprefix = 1, RULE_prefixnames = 2, RULE_prefixname = 3, 
		RULE_selectQuery = 4, RULE_variable = 5, RULE_questinvar = 6, RULE_dolarvar = 7, 
		RULE_datasetClause = 8, RULE_defaultGraphClause = 9, RULE_sourceSelector = 10;
	public static final String[] ruleNames = {
		"query", "defprefix", "prefixnames", "prefixname", "selectQuery", "variable", 
		"questinvar", "dolarvar", "datasetClause", "defaultGraphClause", "sourceSelector"
	};

	@Override
	public String getGrammarFileName() { return "SPARQL_.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SPARQL_Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public DefprefixContext defprefix(int i) {
			return getRuleContext(DefprefixContext.class,i);
		}
		public TerminalNode EOF() { return getToken(SPARQL_Parser.EOF, 0); }
		public List<DefprefixContext> defprefix() {
			return getRuleContexts(DefprefixContext.class);
		}
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREFIX) {
				{
				{
				setState(22); defprefix();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28); selectQuery();
			setState(29); match(EOF);
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

	public static class DefprefixContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SPARQL_Parser.NEWLINE, 0); }
		public TerminalNode PREFIX() { return getToken(SPARQL_Parser.PREFIX, 0); }
		public PrefixnamesContext prefixnames() {
			return getRuleContext(PrefixnamesContext.class,0);
		}
		public TerminalNode HTML_STRING() { return getToken(SPARQL_Parser.HTML_STRING, 0); }
		public TerminalNode COLON() { return getToken(SPARQL_Parser.COLON, 0); }
		public DefprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterDefprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitDefprefix(this);
		}
	}

	public final DefprefixContext defprefix() throws RecognitionException {
		DefprefixContext _localctx = new DefprefixContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(PREFIX);
			setState(32); prefixnames();
			setState(33); match(COLON);
			setState(34); match(HTML_STRING);
			setState(35); match(NEWLINE);
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

	public static class PrefixnamesContext extends ParserRuleContext {
		public List<PrefixnameContext> prefixname() {
			return getRuleContexts(PrefixnameContext.class);
		}
		public PrefixnameContext prefixname(int i) {
			return getRuleContext(PrefixnameContext.class,i);
		}
		public PrefixnamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixnames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterPrefixnames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitPrefixnames(this);
		}
	}

	public final PrefixnamesContext prefixnames() throws RecognitionException {
		PrefixnamesContext _localctx = new PrefixnamesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prefixnames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MARK || _la==IDENT) {
				{
				{
				setState(37); prefixname();
				}
				}
				setState(42);
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

	public static class PrefixnameContext extends ParserRuleContext {
		public TerminalNode MARK() { return getToken(SPARQL_Parser.MARK, 0); }
		public TerminalNode IDENT() { return getToken(SPARQL_Parser.IDENT, 0); }
		public PrefixnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterPrefixname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitPrefixname(this);
		}
	}

	public final PrefixnameContext prefixname() throws RecognitionException {
		PrefixnameContext _localctx = new PrefixnameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefixname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !(_la==MARK || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SelectQueryContext extends ParserRuleContext {
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SPARQL_Parser.ASTERISK, 0); }
		public TerminalNode DISTINCT() { return getToken(SPARQL_Parser.DISTINCT, 0); }
		public TerminalNode COMMA() { return getToken(SPARQL_Parser.COMMA, 0); }
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(SPARQL_Parser.SELECT, 0); }
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterSelectQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitSelectQuery(this);
		}
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(SELECT);
			setState(47);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(46); match(DISTINCT);
				}
			}

			setState(58);
			switch (_input.LA(1)) {
			case 1:
			case 2:
				{
				setState(49); variable();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(50); match(COMMA);
					setState(51); variable();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK:
				{
				setState(57); match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(60); datasetClause();
				}
				}
				setState(65);
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

	public static class VariableContext extends ParserRuleContext {
		public DolarvarContext dolarvar() {
			return getRuleContext(DolarvarContext.class,0);
		}
		public QuestinvarContext questinvar() {
			return getRuleContext(QuestinvarContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); questinvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); dolarvar();
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

	public static class QuestinvarContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SPARQL_Parser.IDENT, 0); }
		public QuestinvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questinvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterQuestinvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitQuestinvar(this);
		}
	}

	public final QuestinvarContext questinvar() throws RecognitionException {
		QuestinvarContext _localctx = new QuestinvarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_questinvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(1);
			setState(71); match(IDENT);
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

	public static class DolarvarContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SPARQL_Parser.IDENT, 0); }
		public DolarvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dolarvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterDolarvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitDolarvar(this);
		}
	}

	public final DolarvarContext dolarvar() throws RecognitionException {
		DolarvarContext _localctx = new DolarvarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dolarvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(2);
			setState(74); match(IDENT);
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

	public static class DatasetClauseContext extends ParserRuleContext {
		public DefaultGraphClauseContext defaultGraphClause() {
			return getRuleContext(DefaultGraphClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SPARQL_Parser.FROM, 0); }
		public DatasetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterDatasetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitDatasetClause(this);
		}
	}

	public final DatasetClauseContext datasetClause() throws RecognitionException {
		DatasetClauseContext _localctx = new DatasetClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_datasetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(FROM);
			setState(77); defaultGraphClause();
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

	public static class DefaultGraphClauseContext extends ParserRuleContext {
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public DefaultGraphClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultGraphClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterDefaultGraphClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitDefaultGraphClause(this);
		}
	}

	public final DefaultGraphClauseContext defaultGraphClause() throws RecognitionException {
		DefaultGraphClauseContext _localctx = new DefaultGraphClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defaultGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); sourceSelector();
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

	public static class SourceSelectorContext extends ParserRuleContext {
		public SourceSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterSourceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitSourceSelector(this);
		}
	}

	public final SourceSelectorContext sourceSelector() throws RecognitionException {
		SourceSelectorContext _localctx = new SourceSelectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sourceSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3-V\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\7\4)\n\4\f\4\16\4,\13\4\3\5\3\5\3\6\3\6\5\6\62\n\6\3\6\3\6\3\6"+
		"\7\6\67\n\6\f\6\16\6:\13\6\3\6\5\6=\n\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3"+
		"\7\3\7\5\7G\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\'\'))Q\2\33\3\2\2\2\4!\3\2"+
		"\2\2\6*\3\2\2\2\b-\3\2\2\2\n/\3\2\2\2\fF\3\2\2\2\16H\3\2\2\2\20K\3\2\2"+
		"\2\22N\3\2\2\2\24Q\3\2\2\2\26S\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32"+
		"\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36"+
		"\37\5\n\6\2\37 \7\2\2\3 \3\3\2\2\2!\"\7\30\2\2\"#\5\6\4\2#$\7\t\2\2$%"+
		"\7%\2\2%&\7(\2\2&\5\3\2\2\2\')\5\b\5\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2"+
		"*+\3\2\2\2+\7\3\2\2\2,*\3\2\2\2-.\t\2\2\2.\t\3\2\2\2/\61\7\23\2\2\60\62"+
		"\7\26\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62<\3\2\2\2\638\5\f\7\2\64\65\7"+
		"\n\2\2\65\67\5\f\7\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29"+
		"=\3\2\2\2:8\3\2\2\2;=\7\22\2\2<\63\3\2\2\2<;\3\2\2\2=A\3\2\2\2>@\5\22"+
		"\n\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\13\3\2\2\2CA\3\2\2\2DG\5"+
		"\16\b\2EG\5\20\t\2FD\3\2\2\2FE\3\2\2\2G\r\3\2\2\2HI\7\3\2\2IJ\7)\2\2J"+
		"\17\3\2\2\2KL\7\4\2\2LM\7)\2\2M\21\3\2\2\2NO\7\27\2\2OP\5\24\13\2P\23"+
		"\3\2\2\2QR\5\26\f\2R\25\3\2\2\2ST\3\2\2\2T\27\3\2\2\2\t\33*\618<AF";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}