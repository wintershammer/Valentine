// Generated from MyG.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		COMMENT=25, BOOLEAN=26, ID=27, INT=28, WS=29, NEWLINE=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "COMMENT", 
		"BOOLEAN", "ID", "INT", "WS", "NEWLINE"
	};


	public MyGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyG.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00b4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u008d"+
		"\n\32\f\32\16\32\u0090\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u009d\n\33\3\34\6\34\u00a0\n\34\r\34\16\34\u00a1\3"+
		"\35\6\35\u00a5\n\35\r\35\16\35\u00a6\3\36\6\36\u00aa\n\36\r\36\16\36\u00ab"+
		"\3\36\3\36\3\37\5\37\u00b1\n\37\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\6\4\2\f\f\17\17"+
		"\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\u00b9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5"+
		"A\3\2\2\2\7E\3\2\2\2\tL\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17T\3\2\2\2\21"+
		"W\3\2\2\2\23Y\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33e\3\2\2\2"+
		"\35h\3\2\2\2\37k\3\2\2\2!q\3\2\2\2#v\3\2\2\2%z\3\2\2\2\'|\3\2\2\2)~\3"+
		"\2\2\2+\u0082\3\2\2\2-\u0084\3\2\2\2/\u0086\3\2\2\2\61\u0088\3\2\2\2\63"+
		"\u008a\3\2\2\2\65\u009c\3\2\2\2\67\u009f\3\2\2\29\u00a4\3\2\2\2;\u00a9"+
		"\3\2\2\2=\u00b0\3\2\2\2?@\7\61\2\2@\4\3\2\2\2AB\7f\2\2BC\7g\2\2CD\7h\2"+
		"\2D\6\3\2\2\2EF\7n\2\2FG\7c\2\2GH\7o\2\2HI\7d\2\2IJ\7f\2\2JK\7c\2\2K\b"+
		"\3\2\2\2LM\7#\2\2MN\7?\2\2N\n\3\2\2\2OP\7<\2\2P\f\3\2\2\2QR\7@\2\2RS\7"+
		"?\2\2S\16\3\2\2\2TU\7?\2\2UV\7?\2\2V\20\3\2\2\2WX\7>\2\2X\22\3\2\2\2Y"+
		"Z\7n\2\2Z[\7k\2\2[\\\7u\2\2\\]\7v\2\2]\24\3\2\2\2^_\7?\2\2_\26\3\2\2\2"+
		"`a\7@\2\2a\30\3\2\2\2bc\7k\2\2cd\7h\2\2d\32\3\2\2\2ef\7q\2\2fg\7t\2\2"+
		"g\34\3\2\2\2hi\7>\2\2ij\7?\2\2j\36\3\2\2\2kl\7r\2\2lm\7t\2\2mn\7k\2\2"+
		"no\7p\2\2op\7v\2\2p \3\2\2\2qr\7g\2\2rs\7n\2\2st\7u\2\2tu\7g\2\2u\"\3"+
		"\2\2\2vw\7g\2\2wx\7p\2\2xy\7f\2\2y$\3\2\2\2z{\7*\2\2{&\3\2\2\2|}\7+\2"+
		"\2}(\3\2\2\2~\177\7c\2\2\177\u0080\7p\2\2\u0080\u0081\7f\2\2\u0081*\3"+
		"\2\2\2\u0082\u0083\7,\2\2\u0083,\3\2\2\2\u0084\u0085\7-\2\2\u0085.\3\2"+
		"\2\2\u0086\u0087\7.\2\2\u0087\60\3\2\2\2\u0088\u0089\7/\2\2\u0089\62\3"+
		"\2\2\2\u008a\u008e\7%\2\2\u008b\u008d\n\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0092\b\32\2\2\u0092\64\3\2\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7w\2\2\u0096\u009d\7g\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2"+
		"\u009b\u009d\7g\2\2\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009d\66\3"+
		"\2\2\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a28\3\2\2\2\u00a3\u00a5\t\4\2\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7:\3\2\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\b\36\2\2\u00ae<\3\2\2\2\u00af\u00b1\7\17\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\f\2\2\u00b3"+
		">\3\2\2\2\t\2\u008e\u009c\u00a1\u00a6\u00ab\u00b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}