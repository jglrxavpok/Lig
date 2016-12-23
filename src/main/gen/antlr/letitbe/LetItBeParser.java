// Generated from F:/Programming/Java/Languages/Lig/src/main/java/antlr/letitbe\LetItBe.g4 by ANTLR 4.5.3
package antlr.letitbe;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LetItBeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AS=7, SET_TO=8, EQUAL_TO=9, 
		BE=10, FLOAT_TERMINATOR=11, DOUBLE_COLON=12, DIGIT=13, PERIOD=14, PLUS=15, 
		MINUS=16, MULTIPLY=17, DIVISION=18, COLON=19, LEFT_PAREN=20, RIGHT_PAREN=21, 
		SMALL_ARROW=22, EQUAL_SIGN=23, IDENTIFIER=24, LOWERCASE_LETTER=25, UPPERCASE_LETTER=26, 
		WHITESPACE=27;
	public static final int
		RULE_codeblock = 0, RULE_instruction = 1, RULE_variableDeclaration = 2, 
		RULE_value = 3, RULE_tuple = 4, RULE_article = 5, RULE_letter = 6, RULE_integer = 7, 
		RULE_linkToValue = 8, RULE_let = 9;
	public static final String[] ruleNames = {
		"codeblock", "instruction", "variableDeclaration", "value", "tuple", "article", 
		"letter", "integer", "linkToValue", "let"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'a'", "'an'", "'the'", "'Let'", "'let'", "'as'", "'set to'", 
		"'equal to'", "'be'", "'f'", "'::'", null, "'.'", "'+'", "'-'", "'*'", 
		"'/'", "':'", "'('", "')'", "'->'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "AS", "SET_TO", "EQUAL_TO", 
		"BE", "FLOAT_TERMINATOR", "DOUBLE_COLON", "DIGIT", "PERIOD", "PLUS", "MINUS", 
		"MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", "RIGHT_PAREN", "SMALL_ARROW", 
		"EQUAL_SIGN", "IDENTIFIER", "LOWERCASE_LETTER", "UPPERCASE_LETTER", "WHITESPACE"
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
	public String getGrammarFileName() { return "LetItBe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LetItBeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeblockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(20);
				instruction();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InstructionContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			variableDeclaration();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(LetItBeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LetItBeParser.IDENTIFIER, i);
		}
		public TerminalNode BE() { return getToken(LetItBeParser.BE, 0); }
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public LinkToValueContext linkToValue() {
			return getRuleContext(LinkToValueContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(LetItBeParser.PERIOD, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			let();
			setState(29);
			match(IDENTIFIER);
			setState(30);
			match(BE);
			setState(32);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				setState(31);
				article();
				}
			}

			setState(34);
			match(IDENTIFIER);
			setState(38);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << SET_TO) | (1L << EQUAL_TO))) != 0)) {
				{
				setState(35);
				linkToValue();
				setState(36);
				value();
				}
			}

			setState(41);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(40);
				match(PERIOD);
				}
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LetItBeParser.IDENTIFIER, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(IDENTIFIER);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				tuple();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TupleContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(LetItBeParser.LEFT_PAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(LetItBeParser.RIGHT_PAREN, 0); }
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(LEFT_PAREN);
			setState(49);
			value();
			setState(50);
			match(T__0);
			setState(51);
			value();
			setState(52);
			match(RIGHT_PAREN);
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

	public static class ArticleContext extends ParserRuleContext {
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitArticle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitArticle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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

	public static class LetterContext extends ParserRuleContext {
		public TerminalNode LOWERCASE_LETTER() { return getToken(LetItBeParser.LOWERCASE_LETTER, 0); }
		public TerminalNode UPPERCASE_LETTER() { return getToken(LetItBeParser.UPPERCASE_LETTER, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==LOWERCASE_LETTER || _la==UPPERCASE_LETTER) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(LetItBeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(LetItBeParser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(DIGIT);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(59);
				match(DIGIT);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LinkToValueContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(LetItBeParser.AS, 0); }
		public TerminalNode SET_TO() { return getToken(LetItBeParser.SET_TO, 0); }
		public TerminalNode EQUAL_TO() { return getToken(LetItBeParser.EQUAL_TO, 0); }
		public LinkToValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkToValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterLinkToValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitLinkToValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitLinkToValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkToValueContext linkToValue() throws RecognitionException {
		LinkToValueContext _localctx = new LinkToValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_linkToValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << SET_TO) | (1L << EQUAL_TO))) != 0)) ) {
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

	public static class LetContext extends ParserRuleContext {
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LetItBeListener ) ((LetItBeListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LetItBeVisitor ) return ((LetItBeVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4#\n\4\3\4\3"+
		"\4\3\4\3\4\5\4)\n\4\3\4\5\4,\n\4\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t?\n\t\f\t\16\tB\13\t\3\n\3\n\3\13"+
		"\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\4\6\3\2\33\34\3\2\t\13"+
		"\3\2\7\bD\2\31\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b\60\3\2\2\2\n\62\3\2"+
		"\2\2\f8\3\2\2\2\16:\3\2\2\2\20<\3\2\2\2\22C\3\2\2\2\24E\3\2\2\2\26\30"+
		"\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3"+
		"\3\2\2\2\33\31\3\2\2\2\34\35\5\6\4\2\35\5\3\2\2\2\36\37\5\24\13\2\37 "+
		"\7\32\2\2 \"\7\f\2\2!#\5\f\7\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$(\7\32"+
		"\2\2%&\5\22\n\2&\'\5\b\5\2\')\3\2\2\2(%\3\2\2\2()\3\2\2\2)+\3\2\2\2*,"+
		"\7\20\2\2+*\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-\61\7\32\2\2.\61\5\n\6\2/\61"+
		"\5\20\t\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\t\3\2\2\2\62\63\7\26"+
		"\2\2\63\64\5\b\5\2\64\65\7\3\2\2\65\66\5\b\5\2\66\67\7\27\2\2\67\13\3"+
		"\2\2\289\t\2\2\29\r\3\2\2\2:;\t\3\2\2;\17\3\2\2\2<@\7\17\2\2=?\7\17\2"+
		"\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\21\3\2\2\2B@\3\2\2\2CD\t\4"+
		"\2\2D\23\3\2\2\2EF\t\5\2\2F\25\3\2\2\2\b\31\"(+\60@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}