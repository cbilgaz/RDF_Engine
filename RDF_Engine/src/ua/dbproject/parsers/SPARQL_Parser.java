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
		SIGN=4, COLON=5, PREFIX=15, WHERE=13, LT=1, WS=21, NEWLINE=18, MARK_STRING=17, 
		HTML_STRING=16, QUESTION=7, COMMA=6, LITERAL_INT=19, LCBRACKET=8, DOLAR=11, 
		GT=2, COMMENT=22, DOT=3, DISTINCT=14, SELECT=12, RCBRACKET=9, ASTERISK=10, 
		LITERAL_STRING=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'<'", "'>'", "'.'", "'#'", "':'", "','", "'?'", "'{'", "'}'", 
		"'*'", "'$'", "SELECT", "WHERE", "DISTINCT", "PREFIX", "HTML_STRING", 
		"MARK_STRING", "NEWLINE", "LITERAL_INT", "LITERAL_STRING", "WS", "COMMENT"
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
		public TerminalNode EOF() { return getToken(SPARQL_Parser.EOF, 0); }
		public DefprefixContext defprefix() {
			return getRuleContext(DefprefixContext.class,0);
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
			setState(31);
			_la = _input.LA(1);
			if (_la==PREFIX) {
				{
				setState(30); defprefix();
				}
			}

			setState(33); selectQuery();
			setState(34); match(EOF);
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
		public DefprefixContext defprefix(int i) {
			return getRuleContext(DefprefixContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SPARQL_Parser.DOT, 0); }
		public List<DefprefixContext> defprefix() {
			return getRuleContexts(DefprefixContext.class);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(PREFIX);
			setState(37); prefixname();
			setState(38); match(HTML_STRING);
			setState(40);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(39); match(DOT);
				}
			}

			setState(42); match(NEWLINE);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(43); defprefix();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(49); match(MARK_STRING);
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
			setState(51); match(SELECT);
			setState(53);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(52); match(DISTINCT);
				}
			}

			setState(57);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				{
				setState(55); variables();
				}
				break;
			case ASTERISK:
				{
				setState(56); match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(60);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(59); match(NEWLINE);
				}
			}

			setState(62); whereClause();
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
			enterOuterAlt(_localctx, 1);
			{
			setState(64); variable();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << QUESTION) | (1L << DOLAR))) != 0)) {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(65); match(COMMA);
					}
				}

				setState(68); variable();
				}
				}
				setState(73);
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
			setState(76);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); questionvar();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); dolarvar();
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
			setState(78); match(QUESTION);
			setState(79); match(MARK_STRING);
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
			setState(81); match(DOLAR);
			setState(82); match(MARK_STRING);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(WHERE);
			setState(85); groupGraphPattern();
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
		public List<TerminalNode> NEWLINE() { return getTokens(SPARQL_Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SPARQL_Parser.NEWLINE, i);
		}
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
			setState(87); match(LCBRACKET);
			setState(89);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(88); match(NEWLINE);
				}
			}

			setState(91); groupGraphPatternSub();
			setState(93);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(92); match(NEWLINE);
				}
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
		public List<TerminalNode> NEWLINE() { return getTokens(SPARQL_Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SPARQL_Parser.NEWLINE, i);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97); triplesBlock();
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(98); match(NEWLINE);
					setState(99); triplesBlock();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); subject();
			setState(106); predicate();
			setState(107); object();
			setState(108); match(DOT);
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
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
			setState(114);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); variable();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(113); match(LITERAL_STRING);
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
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
			setState(120);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); variable();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); match(LITERAL_STRING);
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
		public TerminalNode MARK_STRING() { return getToken(SPARQL_Parser.MARK_STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
			setState(126);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); variable();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(125); match(LITERAL_STRING);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\30\u0083\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2\"\n\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\4\3\4\3\5\3\5\5\58\n\5\3\5\3\5\5\5<\n\5\3\5\5\5?\n\5\3\5\3\5\3\6\3\6"+
		"\5\6E\n\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13\\\n\13\3\13\3\13\5\13`\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\7\fg\n\f\f\f\16\fj\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16u\n\16\3\17\3\17\3\17\3\17\5\17{\n\17\3\20\3\20\3\20\3"+
		"\20\5\20\u0081\n\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2"+
		"\2\u0088\2!\3\2\2\2\4&\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\nB\3\2\2\2\f"+
		"N\3\2\2\2\16P\3\2\2\2\20S\3\2\2\2\22V\3\2\2\2\24Y\3\2\2\2\26c\3\2\2\2"+
		"\30k\3\2\2\2\32t\3\2\2\2\34z\3\2\2\2\36\u0080\3\2\2\2 \"\5\4\3\2! \3\2"+
		"\2\2!\"\3\2\2\2\"#\3\2\2\2#$\5\b\5\2$%\7\2\2\3%\3\3\2\2\2&\'\7\21\2\2"+
		"\'(\5\6\4\2(*\7\22\2\2)+\7\5\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,\60\7\24"+
		"\2\2-/\5\4\3\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3"+
		"\2\2\2\62\60\3\2\2\2\63\64\7\23\2\2\64\7\3\2\2\2\65\67\7\16\2\2\668\7"+
		"\20\2\2\67\66\3\2\2\2\678\3\2\2\28;\3\2\2\29<\5\n\6\2:<\7\f\2\2;9\3\2"+
		"\2\2;:\3\2\2\2<>\3\2\2\2=?\7\24\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\5"+
		"\22\n\2A\t\3\2\2\2BI\5\f\7\2CE\7\b\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2F"+
		"H\5\f\7\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2"+
		"\2LO\5\16\b\2MO\5\20\t\2NL\3\2\2\2NM\3\2\2\2O\r\3\2\2\2PQ\7\t\2\2QR\7"+
		"\23\2\2R\17\3\2\2\2ST\7\r\2\2TU\7\23\2\2U\21\3\2\2\2VW\7\17\2\2WX\5\24"+
		"\13\2X\23\3\2\2\2Y[\7\n\2\2Z\\\7\24\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2"+
		"\2]_\5\26\f\2^`\7\24\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\13\2\2b\25"+
		"\3\2\2\2ch\5\30\r\2de\7\24\2\2eg\5\30\r\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2i\27\3\2\2\2jh\3\2\2\2kl\5\34\17\2lm\5\32\16\2mn\5\36\20\2"+
		"no\7\5\2\2o\31\3\2\2\2pu\5\f\7\2qu\7\22\2\2ru\7\23\2\2su\7\26\2\2tp\3"+
		"\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\33\3\2\2\2v{\5\f\7\2w{\7\22\2\2"+
		"x{\7\23\2\2y{\7\26\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\35\3\2"+
		"\2\2|\u0081\5\f\7\2}\u0081\7\22\2\2~\u0081\7\23\2\2\177\u0081\7\26\2\2"+
		"\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081"+
		"\37\3\2\2\2\21!*\60\67;>DIN[_htz\u0080";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}