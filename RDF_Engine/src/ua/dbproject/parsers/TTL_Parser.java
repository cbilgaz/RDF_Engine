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
		SIGN=4, COLON=5, PREFIX=17, WHERE=15, RPAREN=9, LT=1, WS=23, NEWLINE=20, 
		MARK_STRING=19, HTML_STRING=18, QUESTION=7, COMMA=6, LITERAL_INT=21, LCBRACKET=10, 
		DOLAR=13, GT=2, COMMENT=24, DOT=3, DISTINCT=16, SELECT=14, RCBRACKET=11, 
		LPAREN=8, ASTERISK=12, LITERAL_STRING=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'<'", "'>'", "'.'", "'#'", "':'", "','", "'?'", "'('", "')'", 
		"'{'", "'}'", "'*'", "'$'", "SELECT", "WHERE", "DISTINCT", "PREFIX", "HTML_STRING", 
		"MARK_STRING", "NEWLINE", "LITERAL_INT", "LITERAL_STRING", "WS", "COMMENT"
	};
	public static final int
		RULE_ntriplesDoc = 0, RULE_triple = 1, RULE_predicate = 2, RULE_subject = 3, 
		RULE_object = 4, RULE_variables = 5, RULE_variable = 6, RULE_questionvar = 7, 
		RULE_dolarvar = 8;
	public static final String[] ruleNames = {
		"ntriplesDoc", "triple", "predicate", "subject", "object", "variables", 
		"variable", "questionvar", "dolarvar"
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
			setState(18); triple();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(19); match(NEWLINE);
				setState(20); triple();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); match(EOF);
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
		public TerminalNode NEWLINE() { return getToken(TTL_Parser.NEWLINE, 0); }
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
			setState(28); subject();
			setState(29); predicate();
			setState(30); object();
			setState(31); match(DOT);
			setState(33);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(32); match(NEWLINE);
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode LITERAL_STRING() { return getToken(TTL_Parser.LITERAL_STRING, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode MARK_STRING() { return getToken(TTL_Parser.MARK_STRING, 0); }
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
			setState(39);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); variables();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(37); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(38); match(LITERAL_STRING);
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
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode MARK_STRING() { return getToken(TTL_Parser.MARK_STRING, 0); }
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
			setState(45);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); variables();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(44); match(LITERAL_STRING);
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
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode MARK_STRING() { return getToken(TTL_Parser.MARK_STRING, 0); }
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
			setState(51);
			switch (_input.LA(1)) {
			case QUESTION:
			case DOLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); variables();
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); match(HTML_STRING);
				}
				break;
			case MARK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(49); match(MARK_STRING);
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(50); match(LITERAL_STRING);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); variable();
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
		enterRule(_localctx, 12, RULE_variable);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); questionvar();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); dolarvar();
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
		enterRule(_localctx, 14, RULE_questionvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(QUESTION);
			setState(60); match(MARK_STRING);
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
		enterRule(_localctx, 16, RULE_dolarvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(DOLAR);
			setState(63); match(MARK_STRING);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\32D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4"+
		"\3\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\5\5\60\n\5\3\6\3\6\3\6\3\6\5\6\66"+
		"\n\6\3\7\3\7\3\b\3\b\5\b<\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\2\13\2\4\6\b"+
		"\n\f\16\20\22\2\2F\2\24\3\2\2\2\4\36\3\2\2\2\6)\3\2\2\2\b/\3\2\2\2\n\65"+
		"\3\2\2\2\f\67\3\2\2\2\16;\3\2\2\2\20=\3\2\2\2\22@\3\2\2\2\24\31\5\4\3"+
		"\2\25\26\7\26\2\2\26\30\5\4\3\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3\3\2"+
		"\2\2\36\37\5\b\5\2\37 \5\6\4\2 !\5\n\6\2!#\7\5\2\2\"$\7\26\2\2#\"\3\2"+
		"\2\2#$\3\2\2\2$\5\3\2\2\2%*\5\f\7\2&*\7\24\2\2\'*\7\25\2\2(*\7\30\2\2"+
		")%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\7\3\2\2\2+\60\5\f\7\2,\60\7"+
		"\24\2\2-\60\7\25\2\2.\60\7\30\2\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2"+
		"\2\2\60\t\3\2\2\2\61\66\5\f\7\2\62\66\7\24\2\2\63\66\7\25\2\2\64\66\7"+
		"\30\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\13"+
		"\3\2\2\2\678\5\16\b\28\r\3\2\2\29<\5\20\t\2:<\5\22\n\2;9\3\2\2\2;:\3\2"+
		"\2\2<\17\3\2\2\2=>\7\t\2\2>?\7\25\2\2?\21\3\2\2\2@A\7\17\2\2AB\7\25\2"+
		"\2B\23\3\2\2\2\b\31#)/\65;";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}