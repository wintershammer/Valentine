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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, COMMENT=15, ID=16, INT=17, 
		WS=18, NEWLINE=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "COMMENT", "ID", "INT", "WS", 
		"NEWLINE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\7\20X\n\20\f\20\16\20[\13\20\3\20\3\20\3\21\6\21`\n\21\r\21\16\21"+
		"a\3\22\6\22e\n\22\r\22\16\22f\3\23\6\23j\n\23\r\23\16\23k\3\23\3\23\3"+
		"\24\5\24q\n\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\4\2\f\f\17"+
		"\17\3\2c|\3\2\62;\5\2\13\f\17\17\"\"x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3"+
		"\2\2\2\5+\3\2\2\2\7/\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r=\3\2\2\2\17?\3"+
		"\2\2\2\21E\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33"+
		"Q\3\2\2\2\35S\3\2\2\2\37U\3\2\2\2!_\3\2\2\2#d\3\2\2\2%i\3\2\2\2\'p\3\2"+
		"\2\2)*\7\61\2\2*\4\3\2\2\2+,\7f\2\2,-\7g\2\2-.\7h\2\2.\6\3\2\2\2/\60\7"+
		"n\2\2\60\61\7c\2\2\61\62\7o\2\2\62\63\7d\2\2\63\64\7f\2\2\64\65\7c\2\2"+
		"\65\b\3\2\2\2\66\67\7<\2\2\67\n\3\2\2\289\7n\2\29:\7k\2\2:;\7u\2\2;<\7"+
		"v\2\2<\f\3\2\2\2=>\7?\2\2>\16\3\2\2\2?@\7r\2\2@A\7t\2\2AB\7k\2\2BC\7p"+
		"\2\2CD\7v\2\2D\20\3\2\2\2EF\7g\2\2FG\7p\2\2GH\7f\2\2H\22\3\2\2\2IJ\7*"+
		"\2\2J\24\3\2\2\2KL\7+\2\2L\26\3\2\2\2MN\7,\2\2N\30\3\2\2\2OP\7-\2\2P\32"+
		"\3\2\2\2QR\7.\2\2R\34\3\2\2\2ST\7/\2\2T\36\3\2\2\2UY\7%\2\2VX\n\2\2\2"+
		"WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\b\20"+
		"\2\2] \3\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\"\3"+
		"\2\2\2ce\t\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g$\3\2\2\2hj\t"+
		"\5\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\23\2\2n&"+
		"\3\2\2\2oq\7\17\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2s(\3\2\2\2"+
		"\b\2Yafkp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}