// Generated from TTL_.g4 by ANTLR 4.1
package ua.dbproject.parsers;

/** The TTL_Parser takes care of parsing TTL files that hold the RDF input data. */

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TTL_Parser extends Parser {
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
		RULE_ntriplesDoc = 0, RULE_triple = 1, RULE_predicate = 2, RULE_subject = 3, 
		RULE_object = 4, RULE_variable = 5, RULE_questionvar = 6, RULE_dolarvar = 7;
	public static final String[] ruleNames = {
		"ntriplesDoc", "triple", "predicate", "subject", "object", "variable", 
		"questionvar", "dolarvar"
	};

	@Override
	public String getGrammarFileName() { return "TTL_.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TTL_Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NtriplesDocContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(TTL_Parser.NEWLINE); }
		public TerminalNode EOF() { return getToken(TTL_Parser.EOF, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TTL_Parser.NEWLINE, i);
		}
		public List<TripleContext> triple() {
			return getRuleContexts(TripleContext.class);
		}
		public TripleContext triple(int i) {
			return getRuleContext(TripleContext.class,i);
		}
		public NtriplesDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntriplesDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterNtriplesDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitNtriplesDoc(this);
		}
	}

	public final NtriplesDocContext ntriplesDoc() throws RecognitionException {
		NtriplesDocContext _localctx = new NtriplesDocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ntriplesDoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); triple();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(17); match(NEWLINE);
				setState(18); triple();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24); match(EOF);
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

	public static class TripleContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TTL_Parser.DOT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public TripleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterTriple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitTriple(this);
		}
	}

	public final TripleContext triple() throws RecognitionException {
		TripleContext _localctx = new TripleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_triple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); subject();
			setState(27); predicate();
			setState(28); object();
			setState(29); match(DOT);
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
		public TerminalNode LITERAL_STRING() { return getToken(TTL_Parser.LITERAL_STRING, 0); }
		public TerminalNode MARK_STRING() { return getToken(TTL_Parser.MARK_STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode HTML_STRING() { return getToken(TTL_Parser.HTML_STRING, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_predicate);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); variable();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(33); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(34); match(LITERAL_STRING);
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
		public TerminalNode LITERAL_STRING() { return getToken(TTL_Parser.LITERAL_STRING, 0); }
		public TerminalNode MARK_STRING() { return getToken(TTL_Parser.MARK_STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode HTML_STRING() { return getToken(TTL_Parser.HTML_STRING, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitSubject(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subject);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); variable();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(40); match(LITERAL_STRING);
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
		public TerminalNode LITERAL_STRING() { return getToken(TTL_Parser.LITERAL_STRING, 0); }
		public TerminalNode MARK_STRING() { return getToken(TTL_Parser.MARK_STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode HTML_STRING() { return getToken(TTL_Parser.HTML_STRING, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); variable();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); match(LITERAL_STRING);
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
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); questionvar();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); dolarvar();
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
		public TerminalNode QUESTION() { return getToken(TTL_Parser.QUESTION, 0); }
		public TerminalNode MARK_STRING() { return getToken(TTL_Parser.MARK_STRING, 0); }
		public QuestionvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterQuestionvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitQuestionvar(this);
		}
	}

	public final QuestionvarContext questionvar() throws RecognitionException {
		QuestionvarContext _localctx = new QuestionvarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_questionvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(QUESTION);
			setState(54); match(MARK_STRING);
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
		public TerminalNode MARK_STRING() { return getToken(TTL_Parser.MARK_STRING, 0); }
		public TerminalNode DOLAR() { return getToken(TTL_Parser.DOLAR, 0); }
		public DolarvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dolarvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterDolarvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitDolarvar(this);
		}
	}

	public final DolarvarContext dolarvar() throws RecognitionException {
		DolarvarContext _localctx = new DolarvarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dolarvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(DOLAR);
			setState(57); match(MARK_STRING);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\30>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"&\n\4\3\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\5\6\62\n\6\3\7\3\7\5\7"+
		"\66\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\2@\2\22\3"+
		"\2\2\2\4\34\3\2\2\2\6%\3\2\2\2\b+\3\2\2\2\n\61\3\2\2\2\f\65\3\2\2\2\16"+
		"\67\3\2\2\2\20:\3\2\2\2\22\27\5\4\3\2\23\24\7\24\2\2\24\26\5\4\3\2\25"+
		"\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31"+
		"\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\5\b\5\2\35\36\5\6\4\2\36"+
		"\37\5\n\6\2\37 \7\5\2\2 \5\3\2\2\2!&\5\f\7\2\"&\7\22\2\2#&\7\23\2\2$&"+
		"\7\26\2\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\7\3\2\2\2\',\5\f\7"+
		"\2(,\7\22\2\2),\7\23\2\2*,\7\26\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3"+
		"\2\2\2,\t\3\2\2\2-\62\5\f\7\2.\62\7\22\2\2/\62\7\23\2\2\60\62\7\26\2\2"+
		"\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\13\3\2\2\2\63\66"+
		"\5\16\b\2\64\66\5\20\t\2\65\63\3\2\2\2\65\64\3\2\2\2\66\r\3\2\2\2\678"+
		"\7\t\2\289\7\23\2\29\17\3\2\2\2:;\7\r\2\2;<\7\23\2\2<\21\3\2\2\2\7\27"+
		"%+\61\65";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}