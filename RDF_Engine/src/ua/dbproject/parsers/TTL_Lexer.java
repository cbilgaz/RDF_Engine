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
		LT=1, GT=2, DOT=3, REF=4, SIGN=5, SEMI=6, COLON=7, COMMA=8, QUESTION=9, 
		LPAREN=10, RPAREN=11, LCBRACKET=12, RCBRACKET=13, AND=14, OR=15, ASTERISK=16, 
		DOLAR=17, SELECT=18, WHERE=19, DISTINCT=20, PREFIX=21, HTML_STRING=22, 
		MARK_STRING=23, NEWLINE=24, LITERAL_INT=25, LITERAL_STRING=26, WS=27, 
		COMMENT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<'", "'>'", "'.'", "'&'", "'#'", "';'", "':'", "','", "'?'", "'('", 
		"')'", "'{'", "'}'", "'&&'", "'||'", "'*'", "'$'", "SELECT", "WHERE", 
		"DISTINCT", "PREFIX", "HTML_STRING", "MARK_STRING", "NEWLINE", "LITERAL_INT", 
		"LITERAL_STRING", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"LT", "GT", "DOT", "REF", "SIGN", "SEMI", "COLON", "COMMA", "QUESTION", 
		"LPAREN", "RPAREN", "LCBRACKET", "RCBRACKET", "AND", "OR", "ASTERISK", 
		"DOLAR", "SELECT", "WHERE", "DISTINCT", "PREFIX", "DIGITS", "LOWERLETTER", 
		"UPPERLETTER", "LETTER", "MARKS", "TAG", "HTML_STRING", "MARK_STRING", 
		"NEWLINE", "LITERAL_INT", "LITERAL_STRING", "WS", "COMMENT"
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
		case 32: WS_action((RuleContext)_localctx, actionIndex); break;

		case 33: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\36\u00d6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\5\32\u0091\n\32\3\33\3\33\3\33\3\33\5\33\u0097\n\33\3"+
		"\34\3\34\7\34\u009b\n\34\f\34\16\34\u009e\13\34\3\34\3\34\3\35\3\35\3"+
		"\35\7\35\u00a5\n\35\f\35\16\35\u00a8\13\35\3\35\3\35\3\36\6\36\u00ad\n"+
		"\36\r\36\16\36\u00ae\3\37\5\37\u00b2\n\37\3\37\3\37\3 \6 \u00b7\n \r "+
		"\16 \u00b8\3!\3!\7!\u00bd\n!\f!\16!\u00c0\13!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\5#\u00cb\n#\3#\7#\u00ce\n#\f#\16#\u00d1\13#\3#\3#\3#\3#\4\u009c"+
		"\u00cf$\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\2\1/\2\1\61\2\1\63\2\1\65\2\1\67\2\19\30\1;\31\1=\32\1?\33"+
		"\1A\34\1C\35\2E\36\3\3\2\24\4\2UUuu\4\2GGgg\4\2NNnn\4\2EEee\4\2VVvv\4"+
		"\2YYyy\4\2JJjj\4\2TTtt\4\2FFff\4\2KKkk\4\2PPpp\4\2RRrr\4\2HHhh\4\2ZZz"+
		"z\4\2//aa\4\2>>@@\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\u00dc\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7"+
		"K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23"+
		"W\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2"+
		"\37d\3\2\2\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'r\3\2\2\2)x\3\2\2\2+\u0081"+
		"\3\2\2\2-\u0088\3\2\2\2/\u008a\3\2\2\2\61\u008c\3\2\2\2\63\u0090\3\2\2"+
		"\2\65\u0096\3\2\2\2\67\u0098\3\2\2\29\u00a1\3\2\2\2;\u00ac\3\2\2\2=\u00b1"+
		"\3\2\2\2?\u00b6\3\2\2\2A\u00ba\3\2\2\2C\u00c3\3\2\2\2E\u00ca\3\2\2\2G"+
		"H\7>\2\2H\4\3\2\2\2IJ\7@\2\2J\6\3\2\2\2KL\7\60\2\2L\b\3\2\2\2MN\7(\2\2"+
		"N\n\3\2\2\2OP\7%\2\2P\f\3\2\2\2QR\7=\2\2R\16\3\2\2\2ST\7<\2\2T\20\3\2"+
		"\2\2UV\7.\2\2V\22\3\2\2\2WX\7A\2\2X\24\3\2\2\2YZ\7*\2\2Z\26\3\2\2\2[\\"+
		"\7+\2\2\\\30\3\2\2\2]^\7}\2\2^\32\3\2\2\2_`\7\177\2\2`\34\3\2\2\2ab\7"+
		"(\2\2bc\7(\2\2c\36\3\2\2\2de\7~\2\2ef\7~\2\2f \3\2\2\2gh\7,\2\2h\"\3\2"+
		"\2\2ij\7&\2\2j$\3\2\2\2kl\t\2\2\2lm\t\3\2\2mn\t\4\2\2no\t\3\2\2op\t\5"+
		"\2\2pq\t\6\2\2q&\3\2\2\2rs\t\7\2\2st\t\b\2\2tu\t\3\2\2uv\t\t\2\2vw\t\3"+
		"\2\2w(\3\2\2\2xy\t\n\2\2yz\t\13\2\2z{\t\2\2\2{|\t\6\2\2|}\t\13\2\2}~\t"+
		"\f\2\2~\177\t\5\2\2\177\u0080\t\6\2\2\u0080*\3\2\2\2\u0081\u0082\t\r\2"+
		"\2\u0082\u0083\t\t\2\2\u0083\u0084\t\3\2\2\u0084\u0085\t\16\2\2\u0085"+
		"\u0086\t\13\2\2\u0086\u0087\t\17\2\2\u0087,\3\2\2\2\u0088\u0089\4\62;"+
		"\2\u0089.\3\2\2\2\u008a\u008b\4c|\2\u008b\60\3\2\2\2\u008c\u008d\4C\\"+
		"\2\u008d\62\3\2\2\2\u008e\u0091\5\61\31\2\u008f\u0091\5/\30\2\u0090\u008e"+
		"\3\2\2\2\u0090\u008f\3\2\2\2\u0091\64\3\2\2\2\u0092\u0097\t\20\2\2\u0093"+
		"\u0097\5\61\31\2\u0094\u0097\5/\30\2\u0095\u0097\7<\2\2\u0096\u0092\3"+
		"\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\66\3\2\2\2\u0098\u009c\7>\2\2\u0099\u009b\13\2\2\2\u009a\u0099\3\2\2"+
		"\2\u009b\u009e\3\2\2\2\u009c\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7@\2\2\u00a08\3\2\2\2\u00a1\u00a6"+
		"\7>\2\2\u00a2\u00a5\5\67\34\2\u00a3\u00a5\n\21\2\2\u00a4\u00a2\3\2\2\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa"+
		":\3\2\2\2\u00ab\u00ad\5\65\33\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af<\3\2\2\2\u00b0\u00b2"+
		"\7\17\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2"+
		"\u00b3\u00b4\7\f\2\2\u00b4>\3\2\2\2\u00b5\u00b7\5-\27\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"@\3\2\2\2\u00ba\u00be\7$\2\2\u00bb\u00bd\n\22\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2B\3\2\2\2\u00c3\u00c4"+
		"\t\23\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\"\2\2\u00c6D\3\2\2\2\u00c7"+
		"\u00c8\7\61\2\2\u00c8\u00cb\7\61\2\2\u00c9\u00cb\5\13\6\2\u00ca\u00c7"+
		"\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\13\2\2\2"+
		"\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\f\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\b#\3\2\u00d5F\3\2\2\2\16\2\u0090\u0096\u009c"+
		"\u00a4\u00a6\u00ae\u00b1\u00b8\u00be\u00ca\u00cf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}