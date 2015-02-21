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
	 * Visit a parse tree produced by {@link MyGParser#funCallFC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallFC(@NotNull MyGParser.FunCallFCContext ctx);
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
	 * Visit a parse tree produced by {@link MyGParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull MyGParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCreation}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCreation(@NotNull MyGParser.FunCreationContext ctx);
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
	 * Visit a parse tree produced by the {@code reference}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(@NotNull MyGParser.ReferenceContext ctx);
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
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(@NotNull MyGParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonCreation1}
	 * labeled alternative in {@link MyGParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCreation1(@NotNull MyGParser.AnonCreation1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#anonCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCreation(@NotNull MyGParser.AnonCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGParser#anonCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonCall(@NotNull MyGParser.AnonCallContext ctx);
}