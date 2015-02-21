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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, COMMENT=14, ID=15, INT=16, WS=17, 
		NEWLINE=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "COMMENT", "ID", "INT", "WS", "NEWLINE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17Q\n\17\f\17\16\17T\13\17"+
		"\3\17\3\17\3\20\6\20Y\n\20\r\20\16\20Z\3\21\6\21^\n\21\r\21\16\21_\3\22"+
		"\6\22c\n\22\r\22\16\22d\3\22\3\22\3\23\5\23j\n\23\3\23\3\23\2\2\24\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\3\2\6\4\2\f\f\17\17\3\2c|\3\2\62;\5\2\13\f\17\17\"\"q\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7-\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2"+
		"\2\r8\3\2\2\2\17>\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2"+
		"\2\2\31J\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37X\3\2\2\2!]\3\2\2\2#b\3\2\2"+
		"\2%i\3\2\2\2\'(\7\61\2\2(\4\3\2\2\2)*\7f\2\2*+\7g\2\2+,\7h\2\2,\6\3\2"+
		"\2\2-.\7n\2\2./\7c\2\2/\60\7o\2\2\60\61\7d\2\2\61\62\7f\2\2\62\63\7c\2"+
		"\2\63\b\3\2\2\2\64\65\7<\2\2\65\n\3\2\2\2\66\67\7?\2\2\67\f\3\2\2\289"+
		"\7r\2\29:\7t\2\2:;\7k\2\2;<\7p\2\2<=\7v\2\2=\16\3\2\2\2>?\7g\2\2?@\7p"+
		"\2\2@A\7f\2\2A\20\3\2\2\2BC\7*\2\2C\22\3\2\2\2DE\7+\2\2E\24\3\2\2\2FG"+
		"\7,\2\2G\26\3\2\2\2HI\7-\2\2I\30\3\2\2\2JK\7.\2\2K\32\3\2\2\2LM\7/\2\2"+
		"M\34\3\2\2\2NR\7%\2\2OQ\n\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2SU\3\2\2\2TR\3\2\2\2UV\b\17\2\2V\36\3\2\2\2WY\t\3\2\2XW\3\2\2\2YZ\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[ \3\2\2\2\\^\t\4\2\2]\\\3\2\2\2^_\3\2\2\2_"+
		"]\3\2\2\2_`\3\2\2\2`\"\3\2\2\2ac\t\5\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2ef\3\2\2\2fg\b\22\2\2g$\3\2\2\2hj\7\17\2\2ih\3\2\2\2ij\3\2\2"+
		"\2jk\3\2\2\2kl\7\f\2\2l&\3\2\2\2\b\2RZ_di\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}