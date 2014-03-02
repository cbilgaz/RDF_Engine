// Generated from SPARQLexer.g4 by ANTLR 4.1
package ua.dbproject.parsers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPARQLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<'", "'>'", "'.'", "'&'", "'#'", "';'", "':'", "','", "'?'", "'('", 
		"')'", "'{'", "'}'", "'&&'", "'||'", "'*'", "SELECT", "WHERE", "BASE", 
		"DISTINCT", "FROM", "PREFIX", "ORDER", "ASC", "DESC", "LIMIT", "UNION", 
		"COUNT", "SUM", "MIN", "MAX", "AVG", "TRUE", "FALSE", "HTML_STRING", "RESERVED", 
		"MARK", "NEWLINE", "IDENT", "LITERAL_INT", "LITERAL_STRING", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"LT", "GT", "DOT", "REF", "SIGN", "SEMI", "COLON", "COMMA", "QUESTION", 
		"LPAREN", "RPAREN", "LCBRACKET", "RCBRACKET", "AND", "OR", "ASTERISK", 
		"SELECT", "WHERE", "BASE", "DISTINCT", "FROM", "PREFIX", "ORDER", "ASC", 
		"DESC", "LIMIT", "UNION", "COUNT", "SUM", "MIN", "MAX", "AVG", "TRUE", 
		"FALSE", "DIGITS", "LOWERLETTER", "UPPERLETTER", "LETTER", "MARKS", "Q_RESERVED", 
		"TAG", "HTML_STRING", "RESERVED", "MARK", "NEWLINE", "IDENT", "LITERAL_INT", 
		"LITERAL_STRING", "WS", "COMMENT"
	};


	public SPARQLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SPARQLexer.g4"; }

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
		case 48: WS_action((RuleContext)_localctx, actionIndex); break;

		case 49: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2-\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\5"+
		"\'\u00f5\n\'\3(\3(\3)\3)\3*\3*\7*\u00fd\n*\f*\16*\u0100\13*\3*\3*\3+\3"+
		"+\3+\7+\u0107\n+\f+\16+\u010a\13+\3+\3+\3,\6,\u010f\n,\r,\16,\u0110\3"+
		"-\6-\u0114\n-\r-\16-\u0115\3.\5.\u0119\n.\3.\3.\3/\6/\u011e\n/\r/\16/"+
		"\u011f\3\60\6\60\u0123\n\60\r\60\16\60\u0124\3\61\3\61\7\61\u0129\n\61"+
		"\f\61\16\61\u012c\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5"+
		"\63\u0137\n\63\3\63\7\63\u013a\n\63\f\63\16\63\u013d\13\63\3\63\3\63\3"+
		"\63\3\63\4\u00fe\u013b\64\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G\2\1I\2\1K\2\1M\2\1O\2\1Q\2\1S\2\1"+
		"U%\1W&\1Y\'\1[(\1])\1_*\1a+\1c,\2e-\3\3\2\35\4\2UUuu\4\2GGgg\4\2NNnn\4"+
		"\2EEee\4\2VVvv\4\2YYyy\4\2JJjj\4\2TTtt\4\2DDdd\4\2CCcc\4\2FFff\4\2KKk"+
		"k\4\2PPpp\4\2HHtt\4\2QQqq\4\2OOoo\4\2RRrr\4\2HHhh\4\2ZZzz\4\2WWww\4\2"+
		"XXxx\4\2IIii\7\2##),/\60aa\u0080\u0080\7\2&&-.\61\61<=AB\4\2>>@@\6\2\f"+
		"\f\17\17$$^^\5\2\13\f\16\17\"\"\u0146\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5"+
		"i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21"+
		"u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2\31}\3\2\2\2\33\177\3\2\2"+
		"\2\35\u0081\3\2\2\2\37\u0084\3\2\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u0090"+
		"\3\2\2\2\'\u0096\3\2\2\2)\u009b\3\2\2\2+\u00a4\3\2\2\2-\u00a9\3\2\2\2"+
		"/\u00b0\3\2\2\2\61\u00b6\3\2\2\2\63\u00ba\3\2\2\2\65\u00bf\3\2\2\2\67"+
		"\u00c5\3\2\2\29\u00cb\3\2\2\2;\u00d1\3\2\2\2=\u00d5\3\2\2\2?\u00d9\3\2"+
		"\2\2A\u00dd\3\2\2\2C\u00e1\3\2\2\2E\u00e6\3\2\2\2G\u00ec\3\2\2\2I\u00ee"+
		"\3\2\2\2K\u00f0\3\2\2\2M\u00f4\3\2\2\2O\u00f6\3\2\2\2Q\u00f8\3\2\2\2S"+
		"\u00fa\3\2\2\2U\u0103\3\2\2\2W\u010e\3\2\2\2Y\u0113\3\2\2\2[\u0118\3\2"+
		"\2\2]\u011d\3\2\2\2_\u0122\3\2\2\2a\u0126\3\2\2\2c\u012f\3\2\2\2e\u0136"+
		"\3\2\2\2gh\7>\2\2h\4\3\2\2\2ij\7@\2\2j\6\3\2\2\2kl\7\60\2\2l\b\3\2\2\2"+
		"mn\7(\2\2n\n\3\2\2\2op\7%\2\2p\f\3\2\2\2qr\7=\2\2r\16\3\2\2\2st\7<\2\2"+
		"t\20\3\2\2\2uv\7.\2\2v\22\3\2\2\2wx\7A\2\2x\24\3\2\2\2yz\7*\2\2z\26\3"+
		"\2\2\2{|\7+\2\2|\30\3\2\2\2}~\7}\2\2~\32\3\2\2\2\177\u0080\7\177\2\2\u0080"+
		"\34\3\2\2\2\u0081\u0082\7(\2\2\u0082\u0083\7(\2\2\u0083\36\3\2\2\2\u0084"+
		"\u0085\7~\2\2\u0085\u0086\7~\2\2\u0086 \3\2\2\2\u0087\u0088\7,\2\2\u0088"+
		"\"\3\2\2\2\u0089\u008a\t\2\2\2\u008a\u008b\t\3\2\2\u008b\u008c\t\4\2\2"+
		"\u008c\u008d\t\3\2\2\u008d\u008e\t\5\2\2\u008e\u008f\t\6\2\2\u008f$\3"+
		"\2\2\2\u0090\u0091\t\7\2\2\u0091\u0092\t\b\2\2\u0092\u0093\t\3\2\2\u0093"+
		"\u0094\t\t\2\2\u0094\u0095\t\3\2\2\u0095&\3\2\2\2\u0096\u0097\t\n\2\2"+
		"\u0097\u0098\t\13\2\2\u0098\u0099\t\2\2\2\u0099\u009a\t\3\2\2\u009a(\3"+
		"\2\2\2\u009b\u009c\t\f\2\2\u009c\u009d\t\r\2\2\u009d\u009e\t\2\2\2\u009e"+
		"\u009f\t\6\2\2\u009f\u00a0\t\r\2\2\u00a0\u00a1\t\16\2\2\u00a1\u00a2\t"+
		"\5\2\2\u00a2\u00a3\t\6\2\2\u00a3*\3\2\2\2\u00a4\u00a5\t\17\2\2\u00a5\u00a6"+
		"\t\t\2\2\u00a6\u00a7\t\20\2\2\u00a7\u00a8\t\21\2\2\u00a8,\3\2\2\2\u00a9"+
		"\u00aa\t\22\2\2\u00aa\u00ab\t\t\2\2\u00ab\u00ac\t\3\2\2\u00ac\u00ad\t"+
		"\23\2\2\u00ad\u00ae\t\r\2\2\u00ae\u00af\t\24\2\2\u00af.\3\2\2\2\u00b0"+
		"\u00b1\t\20\2\2\u00b1\u00b2\t\t\2\2\u00b2\u00b3\t\f\2\2\u00b3\u00b4\t"+
		"\3\2\2\u00b4\u00b5\t\t\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\t\13\2\2\u00b7"+
		"\u00b8\t\2\2\2\u00b8\u00b9\t\5\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\t\f\2"+
		"\2\u00bb\u00bc\t\3\2\2\u00bc\u00bd\t\2\2\2\u00bd\u00be\t\5\2\2\u00be\64"+
		"\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0\u00c1\t\r\2\2\u00c1\u00c2\t\21\2\2"+
		"\u00c2\u00c3\t\r\2\2\u00c3\u00c4\t\6\2\2\u00c4\66\3\2\2\2\u00c5\u00c6"+
		"\t\25\2\2\u00c6\u00c7\t\16\2\2\u00c7\u00c8\t\r\2\2\u00c8\u00c9\t\20\2"+
		"\2\u00c9\u00ca\t\16\2\2\u00ca8\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc\u00cd"+
		"\t\20\2\2\u00cd\u00ce\t\25\2\2\u00ce\u00cf\t\16\2\2\u00cf\u00d0\t\6\2"+
		"\2\u00d0:\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2\u00d3\t\25\2\2\u00d3\u00d4"+
		"\t\21\2\2\u00d4<\3\2\2\2\u00d5\u00d6\t\21\2\2\u00d6\u00d7\t\r\2\2\u00d7"+
		"\u00d8\t\16\2\2\u00d8>\3\2\2\2\u00d9\u00da\t\21\2\2\u00da\u00db\t\13\2"+
		"\2\u00db\u00dc\t\24\2\2\u00dc@\3\2\2\2\u00dd\u00de\t\13\2\2\u00de\u00df"+
		"\t\26\2\2\u00df\u00e0\t\27\2\2\u00e0B\3\2\2\2\u00e1\u00e2\t\6\2\2\u00e2"+
		"\u00e3\t\t\2\2\u00e3\u00e4\t\25\2\2\u00e4\u00e5\t\3\2\2\u00e5D\3\2\2\2"+
		"\u00e6\u00e7\t\23\2\2\u00e7\u00e8\t\13\2\2\u00e8\u00e9\t\4\2\2\u00e9\u00ea"+
		"\t\2\2\2\u00ea\u00eb\t\3\2\2\u00ebF\3\2\2\2\u00ec\u00ed\4\62;\2\u00ed"+
		"H\3\2\2\2\u00ee\u00ef\4c|\2\u00efJ\3\2\2\2\u00f0\u00f1\4C\\\2\u00f1L\3"+
		"\2\2\2\u00f2\u00f5\5K&\2\u00f3\u00f5\5I%\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5N\3\2\2\2\u00f6\u00f7\t\30\2\2\u00f7P\3\2\2\2\u00f8\u00f9"+
		"\t\31\2\2\u00f9R\3\2\2\2\u00fa\u00fe\7>\2\2\u00fb\u00fd\13\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00ff\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7@\2\2\u0102"+
		"T\3\2\2\2\u0103\u0108\7>\2\2\u0104\u0107\5S*\2\u0105\u0107\n\32\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\7@\2\2\u010cV\3\2\2\2\u010d\u010f\5Q)\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111X\3\2\2\2"+
		"\u0112\u0114\5O(\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116Z\3\2\2\2\u0117\u0119\7\17\2\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\f"+
		"\2\2\u011b\\\3\2\2\2\u011c\u011e\5M\'\2\u011d\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120^\3\2\2\2\u0121"+
		"\u0123\5G$\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2"+
		"\2\u0124\u0125\3\2\2\2\u0125`\3\2\2\2\u0126\u012a\7$\2\2\u0127\u0129\n"+
		"\33\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7$"+
		"\2\2\u012eb\3\2\2\2\u012f\u0130\t\34\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\b\62\2\2\u0132d\3\2\2\2\u0133\u0134\7\61\2\2\u0134\u0137\7\61\2\2\u0135"+
		"\u0137\5\13\6\2\u0136\u0133\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013b\3"+
		"\2\2\2\u0138\u013a\13\2\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u013f\7\f\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\63\3\2\u0141"+
		"f\3\2\2\2\17\2\u00f4\u00fe\u0106\u0108\u0110\u0115\u0118\u011f\u0124\u012a"+
		"\u0136\u013b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}