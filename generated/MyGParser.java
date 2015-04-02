// Generated from MyG.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, COMMENT=42, FILENAME=43, STRING=44, BOOLEAN=45, 
		ID=46, INT=47, WS=48, NEWLINE=49;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_consequent = 2, RULE_alternative = 3, 
		RULE_boolOper = 4, RULE_relOper = 5, RULE_anonCall = 6, RULE_headSt = 7, 
		RULE_tailSt = 8, RULE_anonCreation = 9, RULE_funCallFC = 10, RULE_funCreation = 11, 
		RULE_variadicID = 12;
	public static final String[] ruleNames = {
		"program", "expression", "consequent", "alternative", "boolOper", "relOper", 
		"anonCall", "headSt", "tailSt", "anonCreation", "funCallFC", "funCreation", 
		"variadicID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'if'", "'{'", "'}'", "'else'", "'read'", "'delay'", 
		"'list'", "','", "'dict'", "'apply'", "'.'", "'add'", "'remove'", "'get'", 
		"'append'", "'prepend'", "'print'", "'null?'", "'list?'", "'load'", "'not'", 
		"'*'", "'/'", "'+'", "'-'", "'='", "'and'", "'or'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'first'", "'rest'", "'lambda'", "'def'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMMENT", "FILENAME", "STRING", "BOOLEAN", 
		"ID", "INT", "WS", "NEWLINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlainContext extends ProgramContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlainContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitPlain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new PlainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				expression(0);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0) );
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApplyContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitApply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunCreation1Context extends ExpressionContext {
		public FunCreationContext funCreation() {
			return getRuleContext(FunCreationContext.class,0);
		}
		public FunCreation1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitFunCreation1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DelayStatementContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DelayStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitDelayStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapGetContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public List<TerminalNode> STRING() { return getTokens(MyGParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyGParser.STRING, i);
		}
		public MapGetContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitMapGet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HeadContext extends ExpressionContext {
		public HeadStContext headSt() {
			return getRuleContext(HeadStContext.class,0);
		}
		public HeadContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelOperContext relOper() {
			return getRuleContext(RelOperContext.class,0);
		}
		public BoolExpressContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitBoolExpress(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonCall1Context extends ExpressionContext {
		public AnonCallContext anonCall() {
			return getRuleContext(AnonCallContext.class,0);
		}
		public AnonCall1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAnonCall1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapCreationContext extends ExpressionContext {
		public List<TerminalNode> STRING() { return getTokens(MyGParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyGParser.STRING, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MapCreationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitMapCreation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AppendContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AppendContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNegContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolNegContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitBoolNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputStatementContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public InputStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MyGParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrependContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrependContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitPrepend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapRemoveContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public List<TerminalNode> STRING() { return getTokens(MyGParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyGParser.STRING, i);
		}
		public MapRemoveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitMapRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListCheckContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListCheckContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitListCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunCallFC1Context extends ExpressionContext {
		public FunCallFCContext funCallFC() {
			return getRuleContext(FunCallFCContext.class,0);
		}
		public FunCallFC1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitFunCallFC1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadStatementContext extends ExpressionContext {
		public TerminalNode FILENAME() { return getToken(MyGParser.FILENAME, 0); }
		public List<TerminalNode> ID() { return getTokens(MyGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGParser.ID, i);
		}
		public LoadStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitLoadStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TailContext extends ExpressionContext {
		public TailStContext tailSt() {
			return getRuleContext(TailStContext.class,0);
		}
		public TailContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitTail(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenceContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public ReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListCreationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListCreationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitListCreation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConsequentContext consequent() {
			return getRuleContext(ConsequentContext.class,0);
		}
		public List<BoolOperContext> boolOper() {
			return getRuleContexts(BoolOperContext.class);
		}
		public BoolOperContext boolOper(int i) {
			return getRuleContext(BoolOperContext.class,i);
		}
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public IfStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonCreation1Context extends ExpressionContext {
		public AnonCreationContext anonCreation() {
			return getRuleContext(AnonCreationContext.class,0);
		}
		public AnonCreation1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAnonCreation1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MyGParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(MyGParser.BOOLEAN, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullCheckContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NullCheckContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitNullCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapAddContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public List<TerminalNode> STRING() { return getTokens(MyGParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyGParser.STRING, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MapAddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitMapAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCheckContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolOperContext boolOper() {
			return getRuleContext(BoolOperContext.class,0);
		}
		public BoolCheckContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitBoolCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new BoolNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(32);
				match(T__22);
				setState(33);
				expression(9);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(ID);
				setState(35);
				match(T__27);
				setState(36);
				expression(5);
				}
				break;
			case 3:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__0);
				setState(38);
				expression(0);
				setState(39);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new IfStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__2);
				setState(42);
				expression(0);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28 || _la==T__29) {
					{
					{
					setState(43);
					boolOper();
					setState(44);
					expression(0);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(T__3);
				setState(52);
				consequent();
				setState(53);
				match(T__4);
				setState(59);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(54);
					match(T__5);
					setState(55);
					match(T__3);
					setState(56);
					alternative();
					setState(57);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new InputStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__6);
				setState(62);
				match(T__0);
				setState(63);
				match(ID);
				setState(64);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new DelayStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__7);
				setState(66);
				match(T__0);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					expression(0);
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0) );
				setState(72);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new ListCreationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(T__8);
				setState(75);
				match(T__0);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0)) {
					{
					{
					setState(76);
					expression(0);
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(77);
						match(T__9);
						setState(78);
						expression(0);
						}
						}
						setState(83);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new MapCreationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(T__10);
				setState(91);
				match(T__0);
				setState(92);
				match(STRING);
				setState(93);
				match(T__9);
				setState(94);
				expression(0);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(95);
					match(T__9);
					setState(96);
					match(STRING);
					setState(97);
					match(T__9);
					setState(98);
					expression(0);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new ApplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__11);
				setState(107);
				match(T__0);
				setState(108);
				expression(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(109);
					match(T__9);
					setState(110);
					expression(0);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(T__1);
				}
				break;
			case 10:
				{
				_localctx = new MapAddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(ID);
				setState(119);
				match(T__12);
				setState(120);
				match(T__13);
				setState(121);
				match(T__0);
				setState(122);
				match(STRING);
				setState(123);
				match(T__9);
				setState(124);
				expression(0);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(125);
					match(T__9);
					setState(126);
					match(STRING);
					setState(127);
					match(T__9);
					setState(128);
					expression(0);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(T__1);
				}
				break;
			case 11:
				{
				_localctx = new MapRemoveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(ID);
				setState(137);
				match(T__12);
				setState(138);
				match(T__14);
				setState(139);
				match(T__0);
				setState(140);
				match(STRING);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(141);
					match(T__9);
					setState(142);
					match(STRING);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new MapGetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(ID);
				setState(150);
				match(T__12);
				setState(151);
				match(T__15);
				setState(152);
				match(T__0);
				setState(153);
				match(STRING);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(154);
					match(T__9);
					setState(155);
					match(STRING);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new HeadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				headSt();
				}
				break;
			case 14:
				{
				_localctx = new AppendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__16);
				setState(164);
				match(T__0);
				setState(165);
				expression(0);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(166);
					match(T__9);
					setState(167);
					expression(0);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__1);
				}
				break;
			case 15:
				{
				_localctx = new PrependContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(T__17);
				setState(176);
				match(T__0);
				setState(177);
				expression(0);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(178);
					match(T__9);
					setState(179);
					expression(0);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__1);
				}
				break;
			case 16:
				{
				_localctx = new TailContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				tailSt();
				}
				break;
			case 17:
				{
				_localctx = new PrintStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(T__18);
				setState(189);
				match(T__0);
				setState(190);
				expression(0);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(191);
					match(T__9);
					setState(192);
					expression(0);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(T__1);
				}
				break;
			case 18:
				{
				_localctx = new NullCheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(T__19);
				setState(201);
				match(T__0);
				setState(202);
				expression(0);
				setState(203);
				match(T__1);
				}
				break;
			case 19:
				{
				_localctx = new ListCheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(T__20);
				setState(206);
				match(T__0);
				setState(207);
				expression(0);
				setState(208);
				match(T__1);
				}
				break;
			case 20:
				{
				_localctx = new LoadStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__21);
				setState(211);
				match(FILENAME);
				{
				setState(212);
				match(ID);
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(213);
						match(T__9);
						setState(214);
						match(ID);
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				}
				break;
			case 21:
				{
				_localctx = new AnonCall1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				anonCall();
				}
				break;
			case 22:
				{
				_localctx = new FunCallFC1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				funCallFC();
				}
				break;
			case 23:
				{
				_localctx = new AnonCreation1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				anonCreation();
				}
				break;
			case 24:
				{
				_localctx = new FunCreation1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				funCreation();
				}
				break;
			case 25:
				{
				_localctx = new ReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(ID);
				}
				break;
			case 26:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(INT);
				}
				break;
			case 27:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(BOOLEAN);
				}
				break;
			case 28:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExpressContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(231);
						relOper();
						setState(232);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new BoolCheckContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(235);
						boolOper();
						setState(236);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(239);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(240);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(242);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(243);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConsequentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConsequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consequent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitConsequent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsequentContext consequent() throws RecognitionException {
		ConsequentContext _localctx = new ConsequentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_consequent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				expression(0);
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0) );
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

	public static class AlternativeContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				expression(0);
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0) );
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

	public static class BoolOperContext extends ParserRuleContext {
		public BoolOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitBoolOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOperContext boolOper() throws RecognitionException {
		BoolOperContext _localctx = new BoolOperContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolOper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class RelOperContext extends ParserRuleContext {
		public RelOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitRelOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperContext relOper() throws RecognitionException {
		RelOperContext _localctx = new RelOperContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relOper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class AnonCallContext extends ParserRuleContext {
		public AnonCreationContext anonCreation() {
			return getRuleContext(AnonCreationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AnonCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAnonCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonCallContext anonCall() throws RecognitionException {
		AnonCallContext _localctx = new AnonCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_anonCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			anonCreation();
			setState(264);
			match(T__0);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(265);
				expression(0);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(266);
					match(T__9);
					setState(267);
					expression(0);
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(T__1);
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

	public static class HeadStContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HeadStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headSt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitHeadSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadStContext headSt() throws RecognitionException {
		HeadStContext _localctx = new HeadStContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_headSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__36);
			setState(281);
			match(T__0);
			setState(282);
			expression(0);
			setState(283);
			match(T__1);
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

	public static class TailStContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TailStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tailSt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitTailSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TailStContext tailSt() throws RecognitionException {
		TailStContext _localctx = new TailStContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tailSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__37);
			setState(286);
			match(T__0);
			setState(287);
			expression(0);
			setState(288);
			match(T__1);
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

	public static class AnonCreationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AnonCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonCreation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAnonCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonCreationContext anonCreation() throws RecognitionException {
		AnonCreationContext _localctx = new AnonCreationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_anonCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__38);
			setState(291);
			match(T__0);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(292);
				match(ID);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(293);
					match(T__9);
					setState(294);
					match(ID);
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__1);
			setState(306);
			match(T__3);
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				expression(0);
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0) );
			setState(312);
			match(T__4);
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

	public static class FunCallFCContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunCallFCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCallFC; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitFunCallFC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallFCContext funCallFC() throws RecognitionException {
		FunCallFCContext _localctx = new FunCallFCContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funCallFC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ID);
			setState(315);
			match(T__0);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(316);
				expression(0);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(317);
					match(T__9);
					setState(318);
					expression(0);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(T__1);
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

	public static class FunCreationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGParser.ID, i);
		}
		public List<VariadicIDContext> variadicID() {
			return getRuleContexts(VariadicIDContext.class);
		}
		public VariadicIDContext variadicID(int i) {
			return getRuleContext(VariadicIDContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCreation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitFunCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCreationContext funCreation() throws RecognitionException {
		FunCreationContext _localctx = new FunCreationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funCreation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__39);
			setState(332);
			match(ID);
			setState(333);
			match(T__0);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40 || _la==ID) {
				{
				setState(347);
				switch (_input.LA(1)) {
				case T__40:
					{
					setState(334);
					variadicID();
					}
					break;
				case ID:
					{
					setState(335);
					match(ID);
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(336);
							match(T__9);
							setState(337);
							match(ID);
							}
							} 
						}
						setState(342);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					setState(345);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(343);
						match(T__9);
						setState(344);
						variadicID();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(T__1);
			setState(353);
			match(T__3);
			setState(355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(354);
				expression(0);
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0) );
			setState(359);
			match(T__4);
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

	public static class VariadicIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public VariadicIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variadicID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitVariadicID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariadicIDContext variadicID() throws RecognitionException {
		VariadicIDContext _localctx = new VariadicIDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variadicID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__40);
			setState(362);
			match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u016f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\6\3G\n\3\r\3\16\3H\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3R\n\3\f\3\16\3"+
		"U\13\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3f\n\3\f\3\16\3i\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3r\n\3\f\3\16\3"+
		"u\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0084\n"+
		"\3\f\3\16\3\u0087\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0092\n"+
		"\3\f\3\16\3\u0095\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u009f\n\3\f"+
		"\3\16\3\u00a2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ab\n\3\f\3\16\3"+
		"\u00ae\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00b7\n\3\f\3\16\3\u00ba\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00c4\n\3\f\3\16\3\u00c7\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\u00da\n\3\f\3\16\3\u00dd\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00e7"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00f7"+
		"\n\3\f\3\16\3\u00fa\13\3\3\4\6\4\u00fd\n\4\r\4\16\4\u00fe\3\5\6\5\u0102"+
		"\n\5\r\5\16\5\u0103\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u010f\n\b"+
		"\f\b\16\b\u0112\13\b\7\b\u0114\n\b\f\b\16\b\u0117\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u012a\n"+
		"\13\f\13\16\13\u012d\13\13\7\13\u012f\n\13\f\13\16\13\u0132\13\13\3\13"+
		"\3\13\3\13\6\13\u0137\n\13\r\13\16\13\u0138\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0142\n\f\f\f\16\f\u0145\13\f\7\f\u0147\n\f\f\f\16\f\u014a\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0155\n\r\f\r\16\r\u0158\13"+
		"\r\3\r\3\r\5\r\u015c\n\r\7\r\u015e\n\r\f\r\16\r\u0161\13\r\3\r\3\r\3\r"+
		"\6\r\u0166\n\r\r\r\16\r\u0167\3\r\3\r\3\16\3\16\3\16\3\16\2\3\4\17\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\2\6\3\2\32\33\3\2\34\35\3\2\37 \3\2!&\u019d"+
		"\2\35\3\2\2\2\4\u00e6\3\2\2\2\6\u00fc\3\2\2\2\b\u0101\3\2\2\2\n\u0105"+
		"\3\2\2\2\f\u0107\3\2\2\2\16\u0109\3\2\2\2\20\u011a\3\2\2\2\22\u011f\3"+
		"\2\2\2\24\u0124\3\2\2\2\26\u013c\3\2\2\2\30\u014d\3\2\2\2\32\u016b\3\2"+
		"\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2"+
		"\2 \3\3\2\2\2!\"\b\3\1\2\"#\7\31\2\2#\u00e7\5\4\3\13$%\7\60\2\2%&\7\36"+
		"\2\2&\u00e7\5\4\3\7\'(\7\3\2\2()\5\4\3\2)*\7\4\2\2*\u00e7\3\2\2\2+,\7"+
		"\5\2\2,\62\5\4\3\2-.\5\n\6\2./\5\4\3\2/\61\3\2\2\2\60-\3\2\2\2\61\64\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7"+
		"\6\2\2\66\67\5\6\4\2\67=\7\7\2\289\7\b\2\29:\7\6\2\2:;\5\b\5\2;<\7\7\2"+
		"\2<>\3\2\2\2=8\3\2\2\2=>\3\2\2\2>\u00e7\3\2\2\2?@\7\t\2\2@A\7\3\2\2AB"+
		"\7\60\2\2B\u00e7\7\4\2\2CD\7\n\2\2DF\7\3\2\2EG\5\4\3\2FE\3\2\2\2GH\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\4\2\2K\u00e7\3\2\2\2LM\7\13\2\2"+
		"MX\7\3\2\2NS\5\4\3\2OP\7\f\2\2PR\5\4\3\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VN\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZX\3\2\2\2[\u00e7\7\4\2\2\\]\7\r\2\2]^\7\3\2\2^_\7.\2\2_`\7"+
		"\f\2\2`g\5\4\3\2ab\7\f\2\2bc\7.\2\2cd\7\f\2\2df\5\4\3\2ea\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\4\2\2k\u00e7\3\2\2"+
		"\2lm\7\16\2\2mn\7\3\2\2ns\5\4\3\2op\7\f\2\2pr\5\4\3\2qo\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\4\2\2w\u00e7\3\2\2\2"+
		"xy\7\60\2\2yz\7\17\2\2z{\7\20\2\2{|\7\3\2\2|}\7.\2\2}~\7\f\2\2~\u0085"+
		"\5\4\3\2\177\u0080\7\f\2\2\u0080\u0081\7.\2\2\u0081\u0082\7\f\2\2\u0082"+
		"\u0084\5\4\3\2\u0083\177\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089"+
		"\7\4\2\2\u0089\u00e7\3\2\2\2\u008a\u008b\7\60\2\2\u008b\u008c\7\17\2\2"+
		"\u008c\u008d\7\21\2\2\u008d\u008e\7\3\2\2\u008e\u0093\7.\2\2\u008f\u0090"+
		"\7\f\2\2\u0090\u0092\7.\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u00e7\7\4\2\2\u0097\u0098\7\60\2\2\u0098\u0099\7\17\2\2\u0099"+
		"\u009a\7\22\2\2\u009a\u009b\7\3\2\2\u009b\u00a0\7.\2\2\u009c\u009d\7\f"+
		"\2\2\u009d\u009f\7.\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00e7\7\4\2\2\u00a4\u00e7\5\20\t\2\u00a5\u00a6\7\23\2\2\u00a6"+
		"\u00a7\7\3\2\2\u00a7\u00ac\5\4\3\2\u00a8\u00a9\7\f\2\2\u00a9\u00ab\5\4"+
		"\3\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\4"+
		"\2\2\u00b0\u00e7\3\2\2\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\7\3\2\2\u00b3"+
		"\u00b8\5\4\3\2\u00b4\u00b5\7\f\2\2\u00b5\u00b7\5\4\3\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\4\2\2\u00bc\u00e7\3\2"+
		"\2\2\u00bd\u00e7\5\22\n\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\7\3\2\2\u00c0"+
		"\u00c5\5\4\3\2\u00c1\u00c2\7\f\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00e7\3\2"+
		"\2\2\u00ca\u00cb\7\26\2\2\u00cb\u00cc\7\3\2\2\u00cc\u00cd\5\4\3\2\u00cd"+
		"\u00ce\7\4\2\2\u00ce\u00e7\3\2\2\2\u00cf\u00d0\7\27\2\2\u00d0\u00d1\7"+
		"\3\2\2\u00d1\u00d2\5\4\3\2\u00d2\u00d3\7\4\2\2\u00d3\u00e7\3\2\2\2\u00d4"+
		"\u00d5\7\30\2\2\u00d5\u00d6\7-\2\2\u00d6\u00db\7\60\2\2\u00d7\u00d8\7"+
		"\f\2\2\u00d8\u00da\7\60\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e7\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00e7\5\16\b\2\u00df\u00e7\5\26\f\2\u00e0\u00e7\5\24\13\2\u00e1"+
		"\u00e7\5\30\r\2\u00e2\u00e7\7\60\2\2\u00e3\u00e7\7\61\2\2\u00e4\u00e7"+
		"\7/\2\2\u00e5\u00e7\7.\2\2\u00e6!\3\2\2\2\u00e6$\3\2\2\2\u00e6\'\3\2\2"+
		"\2\u00e6+\3\2\2\2\u00e6?\3\2\2\2\u00e6C\3\2\2\2\u00e6L\3\2\2\2\u00e6\\"+
		"\3\2\2\2\u00e6l\3\2\2\2\u00e6x\3\2\2\2\u00e6\u008a\3\2\2\2\u00e6\u0097"+
		"\3\2\2\2\u00e6\u00a4\3\2\2\2\u00e6\u00a5\3\2\2\2\u00e6\u00b1\3\2\2\2\u00e6"+
		"\u00bd\3\2\2\2\u00e6\u00be\3\2\2\2\u00e6\u00ca\3\2\2\2\u00e6\u00cf\3\2"+
		"\2\2\u00e6\u00d4\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6"+
		"\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00f8\3\2\2\2\u00e8"+
		"\u00e9\f\f\2\2\u00e9\u00ea\5\f\7\2\u00ea\u00eb\5\4\3\r\u00eb\u00f7\3\2"+
		"\2\2\u00ec\u00ed\f\n\2\2\u00ed\u00ee\5\n\6\2\u00ee\u00ef\5\4\3\13\u00ef"+
		"\u00f7\3\2\2\2\u00f0\u00f1\f\t\2\2\u00f1\u00f2\t\2\2\2\u00f2\u00f7\5\4"+
		"\3\n\u00f3\u00f4\f\b\2\2\u00f4\u00f5\t\3\2\2\u00f5\u00f7\5\4\3\t\u00f6"+
		"\u00e8\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\5\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\5\4\3\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\7\3"+
		"\2\2\2\u0100\u0102\5\4\3\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\t\3\2\2\2\u0105\u0106\t\4\2\2"+
		"\u0106\13\3\2\2\2\u0107\u0108\t\5\2\2\u0108\r\3\2\2\2\u0109\u010a\5\24"+
		"\13\2\u010a\u0115\7\3\2\2\u010b\u0110\5\4\3\2\u010c\u010d\7\f\2\2\u010d"+
		"\u010f\5\4\3\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u010b\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\4\2\2\u0119"+
		"\17\3\2\2\2\u011a\u011b\7\'\2\2\u011b\u011c\7\3\2\2\u011c\u011d\5\4\3"+
		"\2\u011d\u011e\7\4\2\2\u011e\21\3\2\2\2\u011f\u0120\7(\2\2\u0120\u0121"+
		"\7\3\2\2\u0121\u0122\5\4\3\2\u0122\u0123\7\4\2\2\u0123\23\3\2\2\2\u0124"+
		"\u0125\7)\2\2\u0125\u0130\7\3\2\2\u0126\u012b\7\60\2\2\u0127\u0128\7\f"+
		"\2\2\u0128\u012a\7\60\2\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012e\u0126\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\4"+
		"\2\2\u0134\u0136\7\6\2\2\u0135\u0137\5\4\3\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\7\7\2\2\u013b\25\3\2\2\2\u013c\u013d\7\60\2\2\u013d\u0148"+
		"\7\3\2\2\u013e\u0143\5\4\3\2\u013f\u0140\7\f\2\2\u0140\u0142\5\4\3\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u013e\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\4\2\2\u014c\27\3\2\2\2\u014d\u014e"+
		"\7*\2\2\u014e\u014f\7\60\2\2\u014f\u015f\7\3\2\2\u0150\u015e\5\32\16\2"+
		"\u0151\u0156\7\60\2\2\u0152\u0153\7\f\2\2\u0153\u0155\7\60\2\2\u0154\u0152"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u015b\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\f\2\2\u015a\u015c\5\32"+
		"\16\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u0150\3\2\2\2\u015d\u0151\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\7\4\2\2\u0163\u0165\7\6\2\2\u0164\u0166\5\4\3\2\u0165\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\7\7\2\2\u016a\31\3\2\2\2\u016b\u016c\7+\2\2"+
		"\u016c\u016d\7\60\2\2\u016d\33\3\2\2\2\"\37\62=HSXgs\u0085\u0093\u00a0"+
		"\u00ac\u00b8\u00c5\u00db\u00e6\u00f6\u00f8\u00fe\u0103\u0110\u0115\u012b"+
		"\u0130\u0138\u0143\u0148\u0156\u015b\u015d\u015f\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}