// Generated from MyG.g4 by ANTLR 4.4
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
	 * Visit a parse tree produced by the {@code funCallFC1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallFC1(@NotNull MyGParser.FunCallFC1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull MyGParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#funCallFC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallFC(@NotNull MyGParser.FunCallFCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull MyGParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull MyGParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#funCallInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallInt(@NotNull MyGParser.FunCallIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull MyGParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listCreation}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCreation(@NotNull MyGParser.ListCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCreation1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCreation1(@NotNull MyGParser.FunCreation1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#funCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCreation(@NotNull MyGParser.FunCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code head}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(@NotNull MyGParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reference}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(@NotNull MyGParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#boolOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOper(@NotNull MyGParser.BoolOperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(@NotNull MyGParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plain}
	 * labeled alternative in {@link MyGParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlain(@NotNull MyGParser.PlainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonCreation1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCreation1(@NotNull MyGParser.AnonCreation1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#anonCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCall(@NotNull MyGParser.AnonCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullCheck}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullCheck(@NotNull MyGParser.NullCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delayStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayStatement(@NotNull MyGParser.DelayStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpress}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpress(@NotNull MyGParser.BoolExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull MyGParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull MyGParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tail}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(@NotNull MyGParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStatement(@NotNull MyGParser.LoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(@NotNull MyGParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolCheck}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCheck(@NotNull MyGParser.BoolCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull MyGParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(@NotNull MyGParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull MyGParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#relOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOper(@NotNull MyGParser.RelOperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull MyGParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonCall1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCall1(@NotNull MyGParser.AnonCall1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#consequent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsequent(@NotNull MyGParser.ConsequentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#anonCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCreation(@NotNull MyGParser.AnonCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code append}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(@NotNull MyGParser.AppendContext ctx);
}