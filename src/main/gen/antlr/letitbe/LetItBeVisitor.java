// Generated from F:/Programming/Java/Languages/Lig/src/main/java/antlr/letitbe\LetItBe.g4 by ANTLR 4.5.3
package antlr.letitbe;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LetItBeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LetItBeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(LetItBeParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LetItBeParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(LetItBeParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LetItBeParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(LetItBeParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(LetItBeParser.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(LetItBeParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(LetItBeParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#linkToValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkToValue(LetItBeParser.LinkToValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LetItBeParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(LetItBeParser.LetContext ctx);
}