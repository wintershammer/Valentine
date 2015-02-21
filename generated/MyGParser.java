// Generated from MyG.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, ID=13, INT=14, WS=15, NEWLINE=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'def'", "'print'", "'end'", "'('", "')'", "'*'", 
		"':'", "'+'", "','", "'='", "'-'", "ID", "INT", "WS", "NEWLINE"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_funCallInt = 2, RULE_funCall = 3, 
		RULE_funCallFC = 4;
	public static final String[] ruleNames = {
		"program", "expression", "funCallInt", "funCall", "funCallFC"
	};

	@Override
	public String getGrammarFileName() { return "MyG.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); expression(0);
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__9) | (1L << T__7) | (1L << ID) | (1L << INT))) != 0) );
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
	public static class ReferenceContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public ReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public PrintStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitPrintStatement(this);
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
	public static class MulDivContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitAddSub(this);
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
	public static class FunCreationContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(MyGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunCreationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitFunCreation(this);
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
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(16); match(ID);
				setState(17); match(T__1);
				setState(18); expression(1);
				}
				break;
			case 2:
				{
				_localctx = new FunCreationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19); match(T__10);
				setState(20); match(ID);
				setState(21); match(T__7);
				setState(22); match(ID);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(23); match(T__2);
					setState(24); match(ID);
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(30); match(T__6);
				setState(31); match(T__4);
				setState(32); expression(0);
				setState(33); match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new PrintStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35); match(T__9);
				setState(36); match(T__7);
				setState(37); match(ID);
				setState(38); match(T__6);
				}
				break;
			case 4:
				{
				_localctx = new FunCallFC1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39); funCallFC();
				}
				break;
			case 5:
				{
				_localctx = new ReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40); match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41); match(INT);
				}
				break;
			case 7:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42); match(T__7);
				setState(43); expression(0);
				setState(44); match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(54);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__5) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(50); expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(52);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__0) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(53); expression(3);
						}
						break;
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FunCallIntContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(MyGParser.INT, i);
		}
		public TerminalNode ID() { return getToken(MyGParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(MyGParser.INT); }
		public FunCallIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCallInt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitFunCallInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallIntContext funCallInt() throws RecognitionException {
		FunCallIntContext _localctx = new FunCallIntContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funCallInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(ID);
			setState(60); match(T__7);
			setState(61); match(INT);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(62); match(T__2);
				setState(63); match(INT);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69); match(T__6);
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

	public static class FunCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGParser.ID, i);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGVisitor ) return ((MyGVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(ID);
			setState(72); match(T__7);
			setState(73); match(ID);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(74); match(T__2);
				setState(75); match(ID);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); match(T__6);
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
		public TerminalNode INT(int i) {
			return getToken(MyGParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(MyGParser.ID); }
		public List<FunCallIntContext> funCallInt() {
			return getRuleContexts(FunCallIntContext.class);
		}
		public List<FunCallContext> funCall() {
			return getRuleContexts(FunCallContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(MyGParser.ID, i);
		}
		public FunCallIntContext funCallInt(int i) {
			return getRuleContext(FunCallIntContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(MyGParser.INT); }
		public FunCallContext funCall(int i) {
			return getRuleContext(FunCallContext.class,i);
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
		enterRule(_localctx, 8, RULE_funCallFC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(ID);
			setState(84); match(T__7);
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(85); funCall();
				}
				break;
			case 2:
				{
				setState(86); funCallInt();
				}
				break;
			case 3:
				{
				setState(87); match(ID);
				}
				break;
			case 4:
				{
				setState(88); match(INT);
				}
				break;
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				setState(99);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(91); match(T__2);
					setState(92); funCall();
					}
					break;
				case 2:
					{
					setState(93); match(T__2);
					setState(94); funCallInt();
					}
					break;
				case 3:
					{
					setState(95); match(T__2);
					setState(96); match(INT);
					}
					break;
				case 4:
					{
					setState(97); match(T__2);
					setState(98); match(ID);
					}
					break;
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); match(T__6);
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
		case 1: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4"+
		"\16\4F\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\6\2\3\4\7\2\4\6\b\n\2\4\4\2\3\3\t\t\4"+
		"\2\13\13\16\16z\2\r\3\2\2\2\4\60\3\2\2\2\6=\3\2\2\2\bI\3\2\2\2\nU\3\2"+
		"\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2"+
		"\20\3\3\2\2\2\21\22\b\3\1\2\22\23\7\17\2\2\23\24\7\r\2\2\24\61\5\4\3\3"+
		"\25\26\7\4\2\2\26\27\7\17\2\2\27\30\7\7\2\2\30\35\7\17\2\2\31\32\7\f\2"+
		"\2\32\34\7\17\2\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\b\2\2!\"\7\n\2\2\"#\5\4\3\2#$\7\6\2"+
		"\2$\61\3\2\2\2%&\7\5\2\2&\'\7\7\2\2\'(\7\17\2\2(\61\7\b\2\2)\61\5\n\6"+
		"\2*\61\7\17\2\2+\61\7\20\2\2,-\7\7\2\2-.\5\4\3\2./\7\b\2\2/\61\3\2\2\2"+
		"\60\21\3\2\2\2\60\25\3\2\2\2\60%\3\2\2\2\60)\3\2\2\2\60*\3\2\2\2\60+\3"+
		"\2\2\2\60,\3\2\2\2\61:\3\2\2\2\62\63\f\5\2\2\63\64\t\2\2\2\649\5\4\3\6"+
		"\65\66\f\4\2\2\66\67\t\3\2\2\679\5\4\3\58\62\3\2\2\28\65\3\2\2\29<\3\2"+
		"\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<:\3\2\2\2=>\7\17\2\2>?\7\7\2\2?D\7"+
		"\20\2\2@A\7\f\2\2AC\7\20\2\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E"+
		"G\3\2\2\2FD\3\2\2\2GH\7\b\2\2H\7\3\2\2\2IJ\7\17\2\2JK\7\7\2\2KP\7\17\2"+
		"\2LM\7\f\2\2MO\7\17\2\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2"+
		"\2\2RP\3\2\2\2ST\7\b\2\2T\t\3\2\2\2UV\7\17\2\2V[\7\7\2\2W\\\5\b\5\2X\\"+
		"\5\6\4\2Y\\\7\17\2\2Z\\\7\20\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2"+
		"\2\\g\3\2\2\2]^\7\f\2\2^f\5\b\5\2_`\7\f\2\2`f\5\6\4\2ab\7\f\2\2bf\7\20"+
		"\2\2cd\7\f\2\2df\7\17\2\2e]\3\2\2\2e_\3\2\2\2ea\3\2\2\2ec\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\b\2\2k\13\3\2\2\2\f"+
		"\17\35\608:DP[eg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}