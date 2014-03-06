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
		SIGN=5, PREFIX=21, WHERE=19, LT=1, LITERAL_INT=25, DOLAR=17, AND=14, SEMI=6, 
		LPAREN=10, ASTERISK=16, REF=4, LITERAL_STRING=26, COLON=7, RPAREN=11, 
		WS=27, QUESTION=9, HTML_STRING=22, MARK_STRING=23, NEWLINE=24, COMMA=8, 
		LCBRACKET=12, OR=15, GT=2, COMMENT=28, DOT=3, SELECT=18, DISTINCT=20, 
		RCBRACKET=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'<'", "'>'", "'.'", "'&'", "'#'", "';'", "':'", "','", "'?'", 
		"'('", "')'", "'{'", "'}'", "'&&'", "'||'", "'*'", "'$'", "SELECT", "WHERE", 
		"DISTINCT", "PREFIX", "HTML_STRING", "MARK_STRING", "NEWLINE", "LITERAL_INT", 
		"LITERAL_STRING", "WS", "COMMENT"
	};
	public static final int
		RULE_query = 0, RULE_defprefix = 1, RULE_prefixname = 2, RULE_selectQuery = 3, 
		RULE_variables = 4, RULE_variable = 5, RULE_questionvar = 6, RULE_dolarvar = 7, 
		RULE_whereClause = 8, RULE_groupGraphPattern = 9, RULE_groupGraphPatternSub = 10, 
		RULE_triplesBlock = 11, RULE_predicate = 12, RULE_subject = 13, RULE_object = 14;
	public static final String[] ruleNames = {
		"query", "defprefix", "prefixname", "selectQuery", "variables", "variable", 
		"questionvar", "dolarvar", "whereClause", "groupGraphPattern", "groupGraphPatternSub", 
		"triplesBlock", "predicate", "subject", "object"
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
		public TerminalNode NEWLINE() { return getToken(SPARQL_Parser.NEWLINE, 0); }
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREFIX) {
				{
				{
				setState(30); defprefix();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36); selectQuery();
			setState(38);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(37); match(NEWLINE);
				}
			}

			setState(40); match(EOF);
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
		public PrefixnameContext prefixname() {
			return getRuleContext(PrefixnameContext.class,0);
		}
		public TerminalNode PREFIX() { return getToken(SPARQL_Parser.PREFIX, 0); }
		public TerminalNode DOT() { return getToken(SPARQL_Parser.DOT, 0); }
		public TerminalNode HTML_STRING() { return getToken(SPARQL_Parser.HTML_STRING, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(PREFIX);
			setState(43); prefixname();
			setState(44); match(HTML_STRING);
			setState(46);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(45); match(DOT);
				}
			}

			setState(48); match(NEWLINE);
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
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
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
		enterRule(_localctx, 4, RULE_prefixname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(MARK_STRING);
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
		public TerminalNode NEWLINE() { return getToken(SPARQL_Parser.NEWLINE, 0); }
		public TerminalNode ASTERISK() { return getToken(SPARQL_Parser.ASTERISK, 0); }
		public TerminalNode DISTINCT() { return getToken(SPARQL_Parser.DISTINCT, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
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
		enterRule(_localctx, 6, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(SELECT);
			setState(54);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(53); match(DISTINCT);
				}
			}

			setState(58);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				{
				setState(56); variables();
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
			setState(61);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(60); match(NEWLINE);
				}
			}

			setState(63); whereClause();
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

	public static class VariablesContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SPARQL_Parser.COMMA); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SPARQL_Parser.COMMA, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); variable();
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(66); match(COMMA);
						}
					}

					setState(69); variable();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public QuestionvarContext questionvar() {
			return getRuleContext(QuestionvarContext.class,0);
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
			setState(77);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); questionvar();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); dolarvar();
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

	public static class QuestionvarContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(SPARQL_Parser.QUESTION, 0); }
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
		public QuestionvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterQuestionvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitQuestionvar(this);
		}
	}

	public final QuestionvarContext questionvar() throws RecognitionException {
		QuestionvarContext _localctx = new QuestionvarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_questionvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(QUESTION);
			setState(80); match(MARK_STRING);
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
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
		public TerminalNode DOLAR() { return getToken(SPARQL_Parser.DOLAR, 0); }
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
			setState(82); match(DOLAR);
			setState(83); match(MARK_STRING);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SPARQL_Parser.WHERE, 0); }
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(85); match(WHERE);
				}
			}

			setState(88); groupGraphPattern();
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

	public static class GroupGraphPatternContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SPARQL_Parser.NEWLINE, 0); }
		public TerminalNode LCBRACKET() { return getToken(SPARQL_Parser.LCBRACKET, 0); }
		public GroupGraphPatternSubContext groupGraphPatternSub() {
			return getRuleContext(GroupGraphPatternSubContext.class,0);
		}
		public TerminalNode RCBRACKET() { return getToken(SPARQL_Parser.RCBRACKET, 0); }
		public GroupGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterGroupGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitGroupGraphPattern(this);
		}
	}

	public final GroupGraphPatternContext groupGraphPattern() throws RecognitionException {
		GroupGraphPatternContext _localctx = new GroupGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_groupGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(LCBRACKET);
			setState(92);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(91); match(NEWLINE);
				}
			}

			{
			setState(94); groupGraphPatternSub();
			}
			setState(95); match(RCBRACKET);
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

	public static class GroupGraphPatternSubContext extends ParserRuleContext {
		public TriplesBlockContext triplesBlock(int i) {
			return getRuleContext(TriplesBlockContext.class,i);
		}
		public List<TriplesBlockContext> triplesBlock() {
			return getRuleContexts(TriplesBlockContext.class);
		}
		public GroupGraphPatternSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupGraphPatternSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterGroupGraphPatternSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitGroupGraphPatternSub(this);
		}
	}

	public final GroupGraphPatternSubContext groupGraphPatternSub() throws RecognitionException {
		GroupGraphPatternSubContext _localctx = new GroupGraphPatternSubContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_groupGraphPatternSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); triplesBlock();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << DOLAR) | (1L << HTML_STRING) | (1L << MARK_STRING) | (1L << LITERAL_STRING))) != 0)) {
				{
				{
				setState(98); triplesBlock();
				}
				}
				setState(103);
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

	public static class TriplesBlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SPARQL_Parser.NEWLINE, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SPARQL_Parser.DOT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public TriplesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterTriplesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitTriplesBlock(this);
		}
	}

	public final TriplesBlockContext triplesBlock() throws RecognitionException {
		TriplesBlockContext _localctx = new TriplesBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_triplesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); subject();
			setState(105); predicate();
			setState(106); object();
			setState(107); match(DOT);
			setState(109);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(108); match(NEWLINE);
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode LITERAL_STRING() { return getToken(SPARQL_Parser.LITERAL_STRING, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
		public TerminalNode HTML_STRING() { return getToken(SPARQL_Parser.HTML_STRING, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_predicate);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); variables();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(114); match(LITERAL_STRING);
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

	public static class SubjectContext extends ParserRuleContext {
		public TerminalNode LITERAL_STRING() { return getToken(SPARQL_Parser.LITERAL_STRING, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
		public TerminalNode HTML_STRING() { return getToken(SPARQL_Parser.HTML_STRING, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitSubject(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subject);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); variables();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); match(LITERAL_STRING);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LITERAL_STRING() { return getToken(SPARQL_Parser.LITERAL_STRING, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
		public TerminalNode HTML_STRING() { return getToken(SPARQL_Parser.HTML_STRING, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPARQL_Listener ) ((SPARQL_Listener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_object);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); variables();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); match(LITERAL_STRING);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\36\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\5\2)\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\5\59\n\5\3\5\3\5\5\5=\n\5\3\5\5\5@\n\5\3\5\3\5\3\6"+
		"\3\6\5\6F\n\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\3\7\5\7P\n\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\5\nY\n\n\3\n\3\n\3\13\3\13\5\13_\n\13\3\13\3\13\3\13"+
		"\3\f\3\f\7\ff\n\f\f\f\16\fi\13\f\3\r\3\r\3\r\3\r\3\r\5\rp\n\r\3\16\3\16"+
		"\3\16\3\16\5\16v\n\16\3\17\3\17\3\17\3\17\5\17|\n\17\3\20\3\20\3\20\3"+
		"\20\5\20\u0082\n\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2"+
		"\2\u008a\2#\3\2\2\2\4,\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\nC\3\2\2\2\f"+
		"O\3\2\2\2\16Q\3\2\2\2\20T\3\2\2\2\22X\3\2\2\2\24\\\3\2\2\2\26c\3\2\2\2"+
		"\30j\3\2\2\2\32u\3\2\2\2\34{\3\2\2\2\36\u0081\3\2\2\2 \"\5\4\3\2! \3\2"+
		"\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&(\5\b\5\2\')\7"+
		"\32\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,-\7\27\2\2"+
		"-.\5\6\4\2.\60\7\30\2\2/\61\7\5\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\7\32\2\2\63\5\3\2\2\2\64\65\7\31\2\2\65\7\3\2\2\2\668\7\24"+
		"\2\2\679\7\26\2\28\67\3\2\2\289\3\2\2\29<\3\2\2\2:=\5\n\6\2;=\7\22\2\2"+
		"<:\3\2\2\2<;\3\2\2\2=?\3\2\2\2>@\7\32\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2"+
		"\2AB\5\22\n\2B\t\3\2\2\2CJ\5\f\7\2DF\7\n\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2"+
		"\2\2GI\5\f\7\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LJ\3"+
		"\2\2\2MP\5\16\b\2NP\5\20\t\2OM\3\2\2\2ON\3\2\2\2P\r\3\2\2\2QR\7\13\2\2"+
		"RS\7\31\2\2S\17\3\2\2\2TU\7\23\2\2UV\7\31\2\2V\21\3\2\2\2WY\7\25\2\2X"+
		"W\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5\24\13\2[\23\3\2\2\2\\^\7\16\2\2]_\7"+
		"\32\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\5\26\f\2ab\7\17\2\2b\25\3\2\2"+
		"\2cg\5\30\r\2df\5\30\r\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\27\3"+
		"\2\2\2ig\3\2\2\2jk\5\34\17\2kl\5\32\16\2lm\5\36\20\2mo\7\5\2\2np\7\32"+
		"\2\2on\3\2\2\2op\3\2\2\2p\31\3\2\2\2qv\5\n\6\2rv\7\30\2\2sv\7\31\2\2t"+
		"v\7\34\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\33\3\2\2\2w|\5\n\6"+
		"\2x|\7\30\2\2y|\7\31\2\2z|\7\34\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3"+
		"\2\2\2|\35\3\2\2\2}\u0082\5\n\6\2~\u0082\7\30\2\2\177\u0082\7\31\2\2\u0080"+
		"\u0082\7\34\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\37\3\2\2\2\22#(\608<?EJOX^gou{\u0081";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}