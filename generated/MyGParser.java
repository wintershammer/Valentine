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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, ID=14, INT=15, WS=16, NEWLINE=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'def'", "'lambda'", "':'", "'='", "'print'", "'end'", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "ID", "INT", "WS", "NEWLINE"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_anonCall = 2, RULE_anonCreation = 3, 
		RULE_funCallInt = 4, RULE_funCall = 5, RULE_funCallFC = 6;
	public static final String[] ruleNames = {
		"program", "expression", "anonCall", "anonCreation", "funCallInt", "funCall", 
		"funCallFC"
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); expression(0);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__10) | (1L << T__7) | (1L << T__5) | (1L << ID) | (1L << INT))) != 0) );
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
	public static class FunCreationContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(MyGParser.ID); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(MyGParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(20); match(ID);
				setState(21); match(T__8);
				setState(22); expression(1);
				}
				break;
			case 2:
				{
				_localctx = new FunCreationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23); match(T__11);
				setState(24); match(ID);
				setState(25); match(T__5);
				setState(26); match(ID);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(27); match(T__1);
					setState(28); match(ID);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34); match(T__4);
				setState(35); match(T__9);
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36); expression(0);
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__10) | (1L << T__7) | (1L << T__5) | (1L << ID) | (1L << INT))) != 0) );
				setState(41); match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new AnonCall1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43); anonCall();
				}
				break;
			case 4:
				{
				_localctx = new AnonCreation1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44); anonCreation();
				}
				break;
			case 5:
				{
				_localctx = new PrintStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45); match(T__7);
				setState(46); match(T__5);
				setState(47); match(ID);
				setState(48); match(T__4);
				}
				break;
			case 6:
				{
				_localctx = new FunCallFC1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49); funCallFC();
				}
				break;
			case 7:
				{
				_localctx = new ReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50); match(ID);
				}
				break;
			case 8:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51); match(INT);
				}
				break;
			case 9:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52); match(T__5);
				setState(53); expression(0);
				setState(54); match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__3) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(60); expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__0) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(63); expression(3);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class AnonCallContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(MyGParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(MyGParser.ID); }
		public List<FunCallIntContext> funCallInt() {
			return getRuleContexts(FunCallIntContext.class);
		}
		public AnonCreationContext anonCreation() {
			return getRuleContext(AnonCreationContext.class,0);
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
		enterRule(_localctx, 4, RULE_anonCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); anonCreation();
			setState(70); match(T__5);
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(71); funCall();
				}
				break;
			case 2:
				{
				setState(72); funCallInt();
				}
				break;
			case 3:
				{
				setState(73); match(ID);
				}
				break;
			case 4:
				{
				setState(74); match(INT);
				}
				break;
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				setState(85);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(77); match(T__1);
					setState(78); funCall();
					}
					break;
				case 2:
					{
					setState(79); match(T__1);
					setState(80); funCallInt();
					}
					break;
				case 3:
					{
					setState(81); match(T__1);
					setState(82); match(INT);
					}
					break;
				case 4:
					{
					setState(83); match(T__1);
					setState(84); match(ID);
					}
					break;
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); match(T__4);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(MyGParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		enterRule(_localctx, 6, RULE_anonCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(T__10);
			setState(93); match(T__5);
			setState(94); match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(95); match(T__1);
				setState(96); match(ID);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(T__4);
			setState(103); match(T__9);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104); expression(0);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__10) | (1L << T__7) | (1L << T__5) | (1L << ID) | (1L << INT))) != 0) );
			setState(109); match(T__6);
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
		enterRule(_localctx, 8, RULE_funCallInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(ID);
			setState(112); match(T__5);
			setState(113); match(INT);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(114); match(T__1);
				setState(115); match(INT);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(T__4);
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
		enterRule(_localctx, 10, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(ID);
			setState(124); match(T__5);
			setState(125); match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(126); match(T__1);
				setState(127); match(ID);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133); match(T__4);
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
		enterRule(_localctx, 12, RULE_funCallFC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(ID);
			setState(136); match(T__5);
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(137); funCall();
				}
				break;
			case 2:
				{
				setState(138); funCallInt();
				}
				break;
			case 3:
				{
				setState(139); match(ID);
				}
				break;
			case 4:
				{
				setState(140); match(INT);
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				setState(151);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(143); match(T__1);
					setState(144); funCall();
					}
					break;
				case 2:
					{
					setState(145); match(T__1);
					setState(146); funCallInt();
					}
					break;
				case 3:
					{
					setState(147); match(T__1);
					setState(148); match(INT);
					}
					break;
				case 4:
					{
					setState(149); match(T__1);
					setState(150); match(ID);
					}
					break;
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156); match(T__4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16"+
		"\2\23\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3"+
		"\3\3\3\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3C\n\3\f\3\16"+
		"\3F\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5d\n\5\f\5"+
		"\16\5g\13\5\3\5\3\5\3\5\6\5l\n\5\r\5\16\5m\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f\7"+
		"\16\7\u0086\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b\3\b\3\b"+
		"\2\3\4\t\2\4\6\b\n\f\16\2\4\4\2\3\3\f\f\4\2\r\r\17\17\u00b8\2\21\3\2\2"+
		"\2\4:\3\2\2\2\6G\3\2\2\2\b^\3\2\2\2\nq\3\2\2\2\f}\3\2\2\2\16\u0089\3\2"+
		"\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2"+
		"\2\2\24\3\3\2\2\2\25\26\b\3\1\2\26\27\7\20\2\2\27\30\7\7\2\2\30;\5\4\3"+
		"\3\31\32\7\4\2\2\32\33\7\20\2\2\33\34\7\n\2\2\34!\7\20\2\2\35\36\7\16"+
		"\2\2\36 \7\20\2\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3"+
		"\2\2\2#!\3\2\2\2$%\7\13\2\2%\'\7\6\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\t\2\2,;\3\2\2\2-;\5\6\4\2.;\5\b\5"+
		"\2/\60\7\b\2\2\60\61\7\n\2\2\61\62\7\20\2\2\62;\7\13\2\2\63;\5\16\b\2"+
		"\64;\7\20\2\2\65;\7\21\2\2\66\67\7\n\2\2\678\5\4\3\289\7\13\2\29;\3\2"+
		"\2\2:\25\3\2\2\2:\31\3\2\2\2:-\3\2\2\2:.\3\2\2\2:/\3\2\2\2:\63\3\2\2\2"+
		":\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2;D\3\2\2\2<=\f\5\2\2=>\t\2\2\2>C\5"+
		"\4\3\6?@\f\4\2\2@A\t\3\2\2AC\5\4\3\5B<\3\2\2\2B?\3\2\2\2CF\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2E\5\3\2\2\2FD\3\2\2\2GH\5\b\5\2HM\7\n\2\2IN\5\f\7\2JN"+
		"\5\n\6\2KN\7\20\2\2LN\7\21\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2"+
		"NY\3\2\2\2OP\7\16\2\2PX\5\f\7\2QR\7\16\2\2RX\5\n\6\2ST\7\16\2\2TX\7\21"+
		"\2\2UV\7\16\2\2VX\7\20\2\2WO\3\2\2\2WQ\3\2\2\2WS\3\2\2\2WU\3\2\2\2X[\3"+
		"\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\13\2\2]\7\3\2\2\2"+
		"^_\7\5\2\2_`\7\n\2\2`e\7\20\2\2ab\7\16\2\2bd\7\20\2\2ca\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\13\2\2ik\7\6\2\2jl\5"+
		"\4\3\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\t\2\2p\t"+
		"\3\2\2\2qr\7\20\2\2rs\7\n\2\2sx\7\21\2\2tu\7\16\2\2uw\7\21\2\2vt\3\2\2"+
		"\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\13\2\2|\13\3"+
		"\2\2\2}~\7\20\2\2~\177\7\n\2\2\177\u0084\7\20\2\2\u0080\u0081\7\16\2\2"+
		"\u0081\u0083\7\20\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\7\13\2\2\u0088\r\3\2\2\2\u0089\u008a\7\20\2\2\u008a\u008f\7\n\2"+
		"\2\u008b\u0090\5\f\7\2\u008c\u0090\5\n\6\2\u008d\u0090\7\20\2\2\u008e"+
		"\u0090\7\21\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\u009b\3\2\2\2\u0091\u0092\7\16\2\2\u0092"+
		"\u009a\5\f\7\2\u0093\u0094\7\16\2\2\u0094\u009a\5\n\6\2\u0095\u0096\7"+
		"\16\2\2\u0096\u009a\7\21\2\2\u0097\u0098\7\16\2\2\u0098\u009a\7\20\2\2"+
		"\u0099\u0091\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\13\2\2\u009f\17\3\2\2"+
		"\2\22\23!):BDMWYemx\u0084\u008f\u0099\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}