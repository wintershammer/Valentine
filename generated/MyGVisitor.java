// Generated from MyG.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code plain}
	 * labeled alternative in {@link MyGParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlain(MyGParser.PlainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apply}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApply(MyGParser.ApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCreation1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCreation1(MyGParser.FunCreation1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code delayStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayStatement(MyGParser.DelayStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(MyGParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapGet}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapGet(MyGParser.MapGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(MyGParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code head}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(MyGParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpress}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpress(MyGParser.BoolExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapCreation}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapCreation(MyGParser.MapCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonCall1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCall1(MyGParser.AnonCall1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNeg}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNeg(MyGParser.BoolNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code append}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(MyGParser.AppendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(MyGParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(MyGParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prepend}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepend(MyGParser.PrependContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(MyGParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapRemove}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapRemove(MyGParser.MapRemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listCheck}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCheck(MyGParser.ListCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCallFC1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallFC1(MyGParser.FunCallFC1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code loadStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStatement(MyGParser.LoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tail}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(MyGParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MyGParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reference}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(MyGParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listCreation}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCreation(MyGParser.ListCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MyGParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MyGParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MyGParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonCreation1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCreation1(MyGParser.AnonCreation1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MyGParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullCheck}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullCheck(MyGParser.NullCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolCheck}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCheck(MyGParser.BoolCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapAdd}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapAdd(MyGParser.MapAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#consequent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsequent(MyGParser.ConsequentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(MyGParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#boolOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOper(MyGParser.BoolOperContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#relOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOper(MyGParser.RelOperContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#anonCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCall(MyGParser.AnonCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#headSt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadSt(MyGParser.HeadStContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#tailSt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTailSt(MyGParser.TailStContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#anonCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCreation(MyGParser.AnonCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#funCallFC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallFC(MyGParser.FunCallFCContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#funCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCreation(MyGParser.FunCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#variadicID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariadicID(MyGParser.VariadicIDContext ctx);
}