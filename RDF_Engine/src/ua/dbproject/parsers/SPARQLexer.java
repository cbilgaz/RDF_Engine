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
		LT=1, GT=2, DOT=3, REF=4, SEMI=5, PLUS=6, COLON=7, COMMA=8, MINUS=9, LPAREN=10, 
		RPAREN=11, QUESTION=12, LCBRACKET=13, RCBRACKET=14, SELECT=15, WHERE=16, 
		NEWLINE=17, IDENT=18, LITERAL_LIBRARY=19, LITERAL_INT=20, LITERAL_FLOAT=21, 
		LITERAL_STRING=22, WS=23, LINECOMMENT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<'", "'>'", "'.'", "'&'", "';'", "'+'", "':'", "','", "'-'", "'('", 
		"')'", "'?'", "'{'", "'}'", "'select'", "'where'", "NEWLINE", "IDENT", 
		"LITERAL_LIBRARY", "LITERAL_INT", "LITERAL_FLOAT", "LITERAL_STRING", "WS", 
		"LINECOMMENT"
	};
	public static final String[] ruleNames = {
		"LT", "GT", "DOT", "REF", "SEMI", "PLUS", "COLON", "COMMA", "MINUS", "LPAREN", 
		"RPAREN", "QUESTION", "LCBRACKET", "RCBRACKET", "SELECT", "WHERE", "DIGITS", 
		"LOWERLETTER", "UPPERLETTER", "UNDER_SCORES", "LETTER", "NEWLINE", "IDENT", 
		"LITERAL_LIBRARY", "LITERAL_INT", "LITERAL_FLOAT", "LITERAL_STRING", "WS", 
		"LINECOMMENT"
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
		case 27: WS_action((RuleContext)_localctx, actionIndex); break;

		case 28: LINECOMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINECOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\5\26r\n\26\3\27\6\27u\n\27\r\27\16\27v\3\30\3\30\3\30"+
		"\7\30|\n\30\f\30\16\30\177\13\30\3\31\3\31\3\31\7\31\u0084\n\31\f\31\16"+
		"\31\u0087\13\31\3\32\6\32\u008a\n\32\r\32\16\32\u008b\3\33\6\33\u008f"+
		"\n\33\r\33\16\33\u0090\3\33\3\33\6\33\u0095\n\33\r\33\16\33\u0096\3\34"+
		"\3\34\7\34\u009b\n\34\f\34\16\34\u009e\13\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\7\36\u00aa\n\36\f\36\16\36\u00ad\13\36\3\36"+
		"\5\36\u00b0\n\36\3\36\3\36\3\36\3\36\2\37\3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\23\1/\24\1\61\25\1\63\26\1\65\27"+
		"\1\67\30\19\31\2;\32\3\3\2\5\4\2\f\f\17\17\6\2\f\f\17\17$$^^\5\2\13\f"+
		"\16\17\"\"\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\t"+
		"C\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25"+
		"O\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37Y\3\2\2\2"+
		"!`\3\2\2\2#f\3\2\2\2%h\3\2\2\2\'j\3\2\2\2)l\3\2\2\2+q\3\2\2\2-t\3\2\2"+
		"\2/x\3\2\2\2\61\u0080\3\2\2\2\63\u0089\3\2\2\2\65\u008e\3\2\2\2\67\u0098"+
		"\3\2\2\29\u00a1\3\2\2\2;\u00a5\3\2\2\2=>\7>\2\2>\4\3\2\2\2?@\7@\2\2@\6"+
		"\3\2\2\2AB\7\60\2\2B\b\3\2\2\2CD\7(\2\2D\n\3\2\2\2EF\7=\2\2F\f\3\2\2\2"+
		"GH\7-\2\2H\16\3\2\2\2IJ\7<\2\2J\20\3\2\2\2KL\7.\2\2L\22\3\2\2\2MN\7/\2"+
		"\2N\24\3\2\2\2OP\7*\2\2P\26\3\2\2\2QR\7+\2\2R\30\3\2\2\2ST\7A\2\2T\32"+
		"\3\2\2\2UV\7}\2\2V\34\3\2\2\2WX\7\177\2\2X\36\3\2\2\2YZ\7u\2\2Z[\7g\2"+
		"\2[\\\7n\2\2\\]\7g\2\2]^\7e\2\2^_\7v\2\2_ \3\2\2\2`a\7y\2\2ab\7j\2\2b"+
		"c\7g\2\2cd\7t\2\2de\7g\2\2e\"\3\2\2\2fg\4\62;\2g$\3\2\2\2hi\4c|\2i&\3"+
		"\2\2\2jk\4C\\\2k(\3\2\2\2lm\7a\2\2m*\3\2\2\2nr\5\'\24\2or\5%\23\2pr\5"+
		")\25\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r,\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3"+
		"\2\2\2vt\3\2\2\2vw\3\2\2\2w.\3\2\2\2x}\5+\26\2y|\5+\26\2z|\5#\22\2{y\3"+
		"\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\60\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0085\5+\26\2\u0081\u0084\5+\26\2\u0082\u0084\5\7\4\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\62\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a"+
		"\5#\22\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\64\3\2\2\2\u008d\u008f\5#\22\2\u008e\u008d\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0094\7\60\2\2\u0093\u0095\5#\22\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\66"+
		"\3\2\2\2\u0098\u009c\7$\2\2\u0099\u009b\n\3\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7$\2\2\u00a08\3\2\2\2\u00a1\u00a2"+
		"\t\4\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\35\2\2\u00a4:\3\2\2\2\u00a5"+
		"\u00a6\7\61\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\n"+
		"\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\17"+
		"\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\7\f\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\36\3\2\u00b4<\3\2\2\2"+
		"\17\2qv{}\u0083\u0085\u008b\u0090\u0096\u009c\u00ab\u00af";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}