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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, ID=13, INT=14, WS=15, NEWLINE=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "ID", "INT", "WS", "NEWLINE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16E\n\16\r\16"+
		"\16\16F\3\17\6\17J\n\17\r\17\16\17K\3\20\6\20O\n\20\r\20\16\20P\3\20\3"+
		"\20\3\21\5\21V\n\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\5\3\2c|\3\2\62;\5\2"+
		"\13\f\17\17\"\"\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7)\3\2\2\2\t/\3\2\2\2\13\63\3\2\2\2\r"+
		"\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2"+
		"\2\2\31A\3\2\2\2\33D\3\2\2\2\35I\3\2\2\2\37N\3\2\2\2!U\3\2\2\2#$\7\61"+
		"\2\2$\4\3\2\2\2%&\7f\2\2&\'\7g\2\2\'(\7h\2\2(\6\3\2\2\2)*\7r\2\2*+\7t"+
		"\2\2+,\7k\2\2,-\7p\2\2-.\7v\2\2.\b\3\2\2\2/\60\7g\2\2\60\61\7p\2\2\61"+
		"\62\7f\2\2\62\n\3\2\2\2\63\64\7*\2\2\64\f\3\2\2\2\65\66\7+\2\2\66\16\3"+
		"\2\2\2\678\7,\2\28\20\3\2\2\29:\7<\2\2:\22\3\2\2\2;<\7-\2\2<\24\3\2\2"+
		"\2=>\7.\2\2>\26\3\2\2\2?@\7?\2\2@\30\3\2\2\2AB\7/\2\2B\32\3\2\2\2CE\t"+
		"\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\34\3\2\2\2HJ\t\3\2\2I"+
		"H\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\36\3\2\2\2MO\t\4\2\2NM\3\2\2"+
		"\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\20\2\2S \3\2\2\2TV\7\17"+
		"\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\f\2\2X\"\3\2\2\2\7\2FKPU\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}