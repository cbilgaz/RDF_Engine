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
		LT=1, GT=2, DOT=3, REF=4, SIGN=5, SEMI=6, COLON=7, COMMA=8, QUESTION=9, 
		LPAREN=10, RPAREN=11, LCBRACKET=12, RCBRACKET=13, AND=14, OR=15, ASTERISK=16, 
		SELECT=17, WHERE=18, BASE=19, DISTINCT=20, FROM=21, PREFIX=22, ORDER=23, 
		ASC=24, DESC=25, LIMIT=26, UNION=27, COUNT=28, SUM=29, MIN=30, MAX=31, 
		AVG=32, TRUE=33, FALSE=34, HTML_STRING=35, RESERVED=36, MARK=37, NEWLINE=38, 
		IDENT=39, LITERAL_INT=40, LITERAL_STRING=41, WS=42, COMMENT=43;
	public static final String[] tokenNames = {
		"<INVALID>", "'<'", "'>'", "'.'", "'&'", "'#'", "';'", "':'", "','", "'?'", 
		"'('", "')'", "'{'", "'}'", "'&&'", "'||'", "'*'", "SELECT", "WHERE", 
		"BASE", "DISTINCT", "FROM", "PREFIX", "ORDER", "ASC", "DESC", "LIMIT", 
		"UNION", "COUNT", "SUM", "MIN", "MAX", "AVG", "TRUE", "FALSE", "HTML_STRING", 
		"RESERVED", "MARK", "NEWLINE", "IDENT", "LITERAL_INT", "LITERAL_STRING", 
		"WS", "COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"prog", "expr"
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
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(TTL_Parser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(TTL_Parser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); expr();
			setState(5); match(NEWLINE);
			setState(6); match(EOF);
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
		public TerminalNode LITERAL_INT() { return getToken(TTL_Parser.LITERAL_INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTL_Listener ) ((TTL_Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); match(LITERAL_INT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3-\r\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\3\3\3\3\3\2\4\2\4\2\2\n\2\6\3\2\2\2\4\n\3\2\2\2\6"+
		"\7\5\4\3\2\7\b\7(\2\2\b\t\7\2\2\3\t\3\3\2\2\2\n\13\7*\2\2\13\5\3\2\2\2"+
		"\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}