// Generated from F:/Programming/Java/Languages/Lig/src/main/java/antlr/letitbe\LetItBe.g4 by ANTLR 4.5.3
package antlr.letitbe;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LetItBeLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "AS", "SET_TO", "EQUAL_TO", 
		"BE", "FLOAT_TERMINATOR", "DOUBLE_COLON", "DIGIT", "PERIOD", "PLUS", "MINUS", 
		"MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", "RIGHT_PAREN", "SMALL_ARROW", 
		"EQUAL_SIGN", "IDENTIFIER", "LOWERCASE_LETTER", "UPPERCASE_LETTER", "WHITESPACE"
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


	public LetItBeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LetItBe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\6\31"+
		"\u0080\n\31\r\31\16\31\u0081\3\32\3\32\3\33\3\33\3\34\6\34\u0089\n\34"+
		"\r\34\16\34\u008a\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\35\3\2\4\5\2C\\aac|\5\2\13\f\17\17\"\"\u008f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3"+
		"\2\2\2\7=\3\2\2\2\t@\3\2\2\2\13D\3\2\2\2\rH\3\2\2\2\17L\3\2\2\2\21O\3"+
		"\2\2\2\23V\3\2\2\2\25_\3\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33g\3\2\2\2\35"+
		"i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'s\3\2\2\2)u\3\2\2"+
		"\2+w\3\2\2\2-y\3\2\2\2/|\3\2\2\2\61\177\3\2\2\2\63\u0083\3\2\2\2\65\u0085"+
		"\3\2\2\2\67\u0088\3\2\2\29:\7.\2\2:\4\3\2\2\2;<\7c\2\2<\6\3\2\2\2=>\7"+
		"c\2\2>?\7p\2\2?\b\3\2\2\2@A\7v\2\2AB\7j\2\2BC\7g\2\2C\n\3\2\2\2DE\7N\2"+
		"\2EF\7g\2\2FG\7v\2\2G\f\3\2\2\2HI\7n\2\2IJ\7g\2\2JK\7v\2\2K\16\3\2\2\2"+
		"LM\7c\2\2MN\7u\2\2N\20\3\2\2\2OP\7u\2\2PQ\7g\2\2QR\7v\2\2RS\7\"\2\2ST"+
		"\7v\2\2TU\7q\2\2U\22\3\2\2\2VW\7g\2\2WX\7s\2\2XY\7w\2\2YZ\7c\2\2Z[\7n"+
		"\2\2[\\\7\"\2\2\\]\7v\2\2]^\7q\2\2^\24\3\2\2\2_`\7d\2\2`a\7g\2\2a\26\3"+
		"\2\2\2bc\7h\2\2c\30\3\2\2\2de\7<\2\2ef\7<\2\2f\32\3\2\2\2gh\4\62;\2h\34"+
		"\3\2\2\2ij\7\60\2\2j\36\3\2\2\2kl\7-\2\2l \3\2\2\2mn\7/\2\2n\"\3\2\2\2"+
		"op\7,\2\2p$\3\2\2\2qr\7\61\2\2r&\3\2\2\2st\7<\2\2t(\3\2\2\2uv\7*\2\2v"+
		"*\3\2\2\2wx\7+\2\2x,\3\2\2\2yz\7/\2\2z{\7@\2\2{.\3\2\2\2|}\7?\2\2}\60"+
		"\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\62\3\2\2\2\u0083\u0084\4c|\2\u0084\64\3"+
		"\2\2\2\u0085\u0086\4C\\\2\u0086\66\3\2\2\2\u0087\u0089\t\3\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\34\2\2\u008d8\3\2\2\2\5\2\u0081\u008a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}