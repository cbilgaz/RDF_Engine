// Generated from TTL_.g4 by ANTLR 4.1
package ua.dbproject.parsers;

/** The TTL_Parser takes care of parsing TTL files that hold the RDF input data. */

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TTL_Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LT=1, GT=2, DOT=3, SIGN=4, COLON=5, COMMA=6, QUESTION=7, LPAREN=8, RPAREN=9, 
		LCBRACKET=10, RCBRACKET=11, ASTERISK=12, DOLAR=13, SELECT=14, WHERE=15, 
		DISTINCT=16, PREFIX=17, HTML_STRING=18, MARK_STRING=19, NEWLINE=20, LITERAL_INT=21, 
		LITERAL_STRING=22, WS=23, COMMENT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<'", "'>'", "'.'", "'#'", "':'", "','", "'?'", "'('", "')'", "'{'", 
		"'}'", "'*'", "'$'", "SELECT", "WHERE", "DISTINCT", "PREFIX", "HTML_STRING", 
		"MARK_STRING", "NEWLINE", "LITERAL_INT", "LITERAL_STRING", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"LT", "GT", "DOT", "SIGN", "COLON", "COMMA", "QUESTION", "LPAREN", "RPAREN", 
		"LCBRACKET", "RCBRACKET", "ASTERISK", "DOLAR", "SELECT", "WHERE", "DISTINCT", 
		"PREFIX", "DIGITS", "LOWERLETTER", "UPPERLETTER", "LETTER", "MARKS", "TAG", 
		"HTML_STRING", "MARK_STRING", "NEWLINE", "LITERAL_INT", "LITERAL_STRING", 
		"WS", "COMMENT"
	};


	public TTL_Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TTL_.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28: WS_action((RuleContext)_localctx, actionIndex); break;

		case 29: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\5\26\177\n\26\3\27\3\27\3\27\3\27\5\27\u0085\n\27\3\30\3\30"+
		"\7\30\u0089\n\30\f\30\16\30\u008c\13\30\3\30\3\30\3\31\3\31\3\31\7\31"+
		"\u0093\n\31\f\31\16\31\u0096\13\31\3\31\3\31\3\32\6\32\u009b\n\32\r\32"+
		"\16\32\u009c\3\33\5\33\u00a0\n\33\3\33\3\33\3\34\6\34\u00a5\n\34\r\34"+
		"\16\34\u00a6\3\35\3\35\7\35\u00ab\n\35\f\35\16\35\u00ae\13\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u00b9\n\37\3\37\7\37\u00bc\n"+
		"\37\f\37\16\37\u00bf\13\37\3\37\3\37\3\37\3\37\4\u008a\u00bd \3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1"+
		"\61\24\1\63\25\1\65\26\1\67\27\19\30\1;\31\2=\32\3\3\2\24\4\2UUuu\4\2"+
		"GGgg\4\2NNnn\4\2EEee\4\2VVvv\4\2YYyy\4\2JJjj\4\2TTtt\4\2FFff\4\2KKkk\4"+
		"\2PPpp\4\2RRrr\4\2HHhh\4\2ZZzz\4\2//aa\4\2>>@@\6\2\f\f\17\17$$^^\5\2\13"+
		"\f\16\17\"\"\u00ca\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\t"+
		"E\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25"+
		"Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37`\3\2\2\2"+
		"!f\3\2\2\2#o\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+~\3\2\2\2-\u0084\3"+
		"\2\2\2/\u0086\3\2\2\2\61\u008f\3\2\2\2\63\u009a\3\2\2\2\65\u009f\3\2\2"+
		"\2\67\u00a4\3\2\2\29\u00a8\3\2\2\2;\u00b1\3\2\2\2=\u00b8\3\2\2\2?@\7>"+
		"\2\2@\4\3\2\2\2AB\7@\2\2B\6\3\2\2\2CD\7\60\2\2D\b\3\2\2\2EF\7%\2\2F\n"+
		"\3\2\2\2GH\7<\2\2H\f\3\2\2\2IJ\7.\2\2J\16\3\2\2\2KL\7A\2\2L\20\3\2\2\2"+
		"MN\7*\2\2N\22\3\2\2\2OP\7+\2\2P\24\3\2\2\2QR\7}\2\2R\26\3\2\2\2ST\7\177"+
		"\2\2T\30\3\2\2\2UV\7,\2\2V\32\3\2\2\2WX\7&\2\2X\34\3\2\2\2YZ\t\2\2\2Z"+
		"[\t\3\2\2[\\\t\4\2\2\\]\t\3\2\2]^\t\5\2\2^_\t\6\2\2_\36\3\2\2\2`a\t\7"+
		"\2\2ab\t\b\2\2bc\t\3\2\2cd\t\t\2\2de\t\3\2\2e \3\2\2\2fg\t\n\2\2gh\t\13"+
		"\2\2hi\t\2\2\2ij\t\6\2\2jk\t\13\2\2kl\t\f\2\2lm\t\5\2\2mn\t\6\2\2n\"\3"+
		"\2\2\2op\t\r\2\2pq\t\t\2\2qr\t\3\2\2rs\t\16\2\2st\t\13\2\2tu\t\17\2\2"+
		"u$\3\2\2\2vw\4\62;\2w&\3\2\2\2xy\4c|\2y(\3\2\2\2z{\4C\\\2{*\3\2\2\2|\177"+
		"\5)\25\2}\177\5\'\24\2~|\3\2\2\2~}\3\2\2\2\177,\3\2\2\2\u0080\u0085\t"+
		"\20\2\2\u0081\u0085\5)\25\2\u0082\u0085\5\'\24\2\u0083\u0085\7<\2\2\u0084"+
		"\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2"+
		"\2\2\u0085.\3\2\2\2\u0086\u008a\7>\2\2\u0087\u0089\13\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7@\2\2\u008e\60\3\2\2\2"+
		"\u008f\u0094\7>\2\2\u0090\u0093\5/\30\2\u0091\u0093\n\21\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7@"+
		"\2\2\u0098\62\3\2\2\2\u0099\u009b\5-\27\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\64\3\2\2\2\u009e"+
		"\u00a0\7\17\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\7\f\2\2\u00a2\66\3\2\2\2\u00a3\u00a5\5%\23\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a78\3\2\2\2\u00a8\u00ac\7$\2\2\u00a9\u00ab\n\22\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7$\2\2\u00b0:\3\2\2\2\u00b1"+
		"\u00b2\t\23\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\36\2\2\u00b4<\3\2\2"+
		"\2\u00b5\u00b6\7\61\2\2\u00b6\u00b9\7\61\2\2\u00b7\u00b9\5\t\5\2\u00b8"+
		"\u00b5\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\13"+
		"\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\f"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\37\3\2\u00c3>\3\2\2\2\16\2~\u0084"+
		"\u008a\u0092\u0094\u009c\u009f\u00a6\u00ac\u00b8\u00bd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}