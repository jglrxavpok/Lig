// Generated from F:/Programming/Java/Languages/Lig/src/main/java/antlr/letitbe\LetItBe.g4 by ANTLR 4.5.3
package antlr.letitbe;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LetItBeParser}.
 */
public interface LetItBeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(LetItBeParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(LetItBeParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(LetItBeParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(LetItBeParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(LetItBeParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(LetItBeParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LetItBeParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LetItBeParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(LetItBeParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(LetItBeParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(LetItBeParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(LetItBeParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(LetItBeParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(LetItBeParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(LetItBeParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(LetItBeParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#linkToValue}.
	 * @param ctx the parse tree
	 */
	void enterLinkToValue(LetItBeParser.LinkToValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#linkToValue}.
	 * @param ctx the parse tree
	 */
	void exitLinkToValue(LetItBeParser.LinkToValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LetItBeParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(LetItBeParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LetItBeParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(LetItBeParser.LetContext ctx);
}