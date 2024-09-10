// Generated from br\dc\compiladores\t1_compiladores\t1_compiladores.g4 by ANTLR 4.12.0
package br.dc.compiladores.t1_compiladores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class t1_compiladores extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, OP_BOOLEANO=4, IDENT=5, CADEIA=6, 
		CADEIA_ABERTA=7, OP_REL=8, OP_ARIT=9, SIMBOLOS=10, COMENTARIO=11, COMENTARIO_ABERTO=12, 
		WS=13, ERRO=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "OP_BOOLEANO", "IDENT", "CADEIA", 
			"CADEIA_ABERTA", "OP_REL", "OP_ARIT", "SIMBOLOS", "COMENTARIO", "COMENTARIO_ABERTO", 
			"WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "OP_BOOLEANO", "IDENT", 
			"CADEIA", "CADEIA_ABERTA", "OP_REL", "OP_ARIT", "SIMBOLOS", "COMENTARIO", 
			"COMENTARIO_ABERTO", "WS", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public t1_compiladores(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "t1_compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000e\u018d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0125\b\u0000\u0001\u0001"+
		"\u0004\u0001\u0128\b\u0001\u000b\u0001\f\u0001\u0129\u0001\u0002\u0004"+
		"\u0002\u012d\b\u0002\u000b\u0002\f\u0002\u012e\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u0133\b\u0002\u000b\u0002\f\u0002\u0134\u0003\u0002\u0137"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0140\b\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0144\b\u0004\n\u0004\f\u0004\u0147\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u014d\b\u0005\n\u0005\f\u0005\u0150"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0158\b\u0006\n\u0006\f\u0006\u015b\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0168\b\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0172\b\t\u0001\n\u0001\n\u0005\n\u0176\b\n\n\n\f\n\u0179\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0181\b"+
		"\u000b\n\u000b\f\u000b\u0184\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\b\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\n\n\"\"\\\\\u0004\u0000%%*"+
		"+--//\u0006\u0000&&(),-::[[]^\u0003\u0000\n\n\r\r}}\u0001\u0000}}\u0003"+
		"\u0000\t\n\r\r  \u01c7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0001\u0124\u0001\u0000\u0000\u0000\u0003\u0127\u0001\u0000"+
		"\u0000\u0000\u0005\u012c\u0001\u0000\u0000\u0000\u0007\u013f\u0001\u0000"+
		"\u0000\u0000\t\u0141\u0001\u0000\u0000\u0000\u000b\u0148\u0001\u0000\u0000"+
		"\u0000\r\u0153\u0001\u0000\u0000\u0000\u000f\u0167\u0001\u0000\u0000\u0000"+
		"\u0011\u0169\u0001\u0000\u0000\u0000\u0013\u0171\u0001\u0000\u0000\u0000"+
		"\u0015\u0173\u0001\u0000\u0000\u0000\u0017\u017e\u0001\u0000\u0000\u0000"+
		"\u0019\u0187\u0001\u0000\u0000\u0000\u001b\u018b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005a\u0000\u0000\u001e\u001f\u0005l\u0000\u0000\u001f "+
		"\u0005g\u0000\u0000 !\u0005o\u0000\u0000!\"\u0005r\u0000\u0000\"#\u0005"+
		"i\u0000\u0000#$\u0005t\u0000\u0000$%\u0005m\u0000\u0000%\u0125\u0005o"+
		"\u0000\u0000&\'\u0005f\u0000\u0000\'(\u0005i\u0000\u0000()\u0005m\u0000"+
		"\u0000)*\u0005_\u0000\u0000*+\u0005a\u0000\u0000+,\u0005l\u0000\u0000"+
		",-\u0005g\u0000\u0000-.\u0005o\u0000\u0000./\u0005r\u0000\u0000/0\u0005"+
		"i\u0000\u000001\u0005t\u0000\u000012\u0005m\u0000\u00002\u0125\u0005o"+
		"\u0000\u000034\u0005d\u0000\u000045\u0005e\u0000\u000056\u0005c\u0000"+
		"\u000067\u0005l\u0000\u000078\u0005a\u0000\u000089\u0005r\u0000\u0000"+
		"9\u0125\u0005e\u0000\u0000:;\u0005l\u0000\u0000;<\u0005i\u0000\u0000<"+
		"=\u0005t\u0000\u0000=>\u0005e\u0000\u0000>?\u0005r\u0000\u0000?@\u0005"+
		"a\u0000\u0000@\u0125\u0005l\u0000\u0000AB\u0005i\u0000\u0000BC\u0005n"+
		"\u0000\u0000CD\u0005t\u0000\u0000DE\u0005e\u0000\u0000EF\u0005i\u0000"+
		"\u0000FG\u0005r\u0000\u0000G\u0125\u0005o\u0000\u0000HI\u0005r\u0000\u0000"+
		"IJ\u0005e\u0000\u0000JK\u0005a\u0000\u0000K\u0125\u0005l\u0000\u0000L"+
		"M\u0005l\u0000\u0000MN\u0005e\u0000\u0000NO\u0005i\u0000\u0000O\u0125"+
		"\u0005a\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005s\u0000\u0000RS\u0005"+
		"c\u0000\u0000ST\u0005r\u0000\u0000TU\u0005e\u0000\u0000UV\u0005v\u0000"+
		"\u0000V\u0125\u0005a\u0000\u0000WX\u0005s\u0000\u0000X\u0125\u0005e\u0000"+
		"\u0000YZ\u0005e\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005t\u0000\u0000"+
		"\\]\u0005a\u0000\u0000]\u0125\u0005o\u0000\u0000^_\u0005f\u0000\u0000"+
		"_`\u0005i\u0000\u0000`a\u0005m\u0000\u0000ab\u0005_\u0000\u0000bc\u0005"+
		"s\u0000\u0000c\u0125\u0005e\u0000\u0000de\u0005s\u0000\u0000ef\u0005e"+
		"\u0000\u0000fg\u0005n\u0000\u0000gh\u0005a\u0000\u0000h\u0125\u0005o\u0000"+
		"\u0000ij\u0005r\u0000\u0000jk\u0005e\u0000\u0000kl\u0005g\u0000\u0000"+
		"lm\u0005i\u0000\u0000mn\u0005s\u0000\u0000no\u0005t\u0000\u0000op\u0005"+
		"r\u0000\u0000p\u0125\u0005o\u0000\u0000qr\u0005f\u0000\u0000rs\u0005i"+
		"\u0000\u0000st\u0005m\u0000\u0000tu\u0005_\u0000\u0000uv\u0005r\u0000"+
		"\u0000vw\u0005e\u0000\u0000wx\u0005g\u0000\u0000xy\u0005i\u0000\u0000"+
		"yz\u0005s\u0000\u0000z{\u0005t\u0000\u0000{|\u0005r\u0000\u0000|\u0125"+
		"\u0005o\u0000\u0000}~\u0005f\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f"+
		"\u0080\u0005l\u0000\u0000\u0080\u0081\u0005s\u0000\u0000\u0081\u0125\u0005"+
		"o\u0000\u0000\u0082\u0083\u0005l\u0000\u0000\u0083\u0084\u0005o\u0000"+
		"\u0000\u0084\u0085\u0005g\u0000\u0000\u0085\u0086\u0005i\u0000\u0000\u0086"+
		"\u0087\u0005c\u0000\u0000\u0087\u0125\u0005o\u0000\u0000\u0088\u0089\u0005"+
		"v\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005r\u0000"+
		"\u0000\u008b\u008c\u0005d\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d"+
		"\u008e\u0005d\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0090\u0005"+
		"i\u0000\u0000\u0090\u0091\u0005r\u0000\u0000\u0091\u0125\u0005o\u0000"+
		"\u0000\u0092\u0093\u0005n\u0000\u0000\u0093\u0094\u0005a\u0000\u0000\u0094"+
		"\u0125\u0005o\u0000\u0000\u0095\u0096\u0005e\u0000\u0000\u0096\u0097\u0005"+
		"n\u0000\u0000\u0097\u0098\u0005q\u0000\u0000\u0098\u0099\u0005u\u0000"+
		"\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u009b\u0005n\u0000\u0000\u009b"+
		"\u009c\u0005t\u0000\u0000\u009c\u0125\u0005o\u0000\u0000\u009d\u009e\u0005"+
		"f\u0000\u0000\u009e\u009f\u0005i\u0000\u0000\u009f\u00a0\u0005m\u0000"+
		"\u0000\u00a0\u00a1\u0005_\u0000\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2"+
		"\u00a3\u0005n\u0000\u0000\u00a3\u00a4\u0005q\u0000\u0000\u00a4\u00a5\u0005"+
		"u\u0000\u0000\u00a5\u00a6\u0005a\u0000\u0000\u00a6\u00a7\u0005n\u0000"+
		"\u0000\u00a7\u00a8\u0005t\u0000\u0000\u00a8\u0125\u0005o\u0000\u0000\u00a9"+
		"\u00aa\u0005r\u0000\u0000\u00aa\u00ab\u0005e\u0000\u0000\u00ab\u00ac\u0005"+
		"t\u0000\u0000\u00ac\u00ad\u0005o\u0000\u0000\u00ad\u00ae\u0005r\u0000"+
		"\u0000\u00ae\u00af\u0005n\u0000\u0000\u00af\u0125\u0005e\u0000\u0000\u00b0"+
		"\u00b1\u0005c\u0000\u0000\u00b1\u00b2\u0005a\u0000\u0000\u00b2\u00b3\u0005"+
		"s\u0000\u0000\u00b3\u0125\u0005o\u0000\u0000\u00b4\u00b5\u0005f\u0000"+
		"\u0000\u00b5\u00b6\u0005i\u0000\u0000\u00b6\u00b7\u0005m\u0000\u0000\u00b7"+
		"\u00b8\u0005_\u0000\u0000\u00b8\u00b9\u0005c\u0000\u0000\u00b9\u00ba\u0005"+
		"a\u0000\u0000\u00ba\u00bb\u0005s\u0000\u0000\u00bb\u0125\u0005o\u0000"+
		"\u0000\u00bc\u00bd\u0005s\u0000\u0000\u00bd\u00be\u0005e\u0000\u0000\u00be"+
		"\u00bf\u0005j\u0000\u0000\u00bf\u0125\u0005a\u0000\u0000\u00c0\u00c1\u0005"+
		"v\u0000\u0000\u00c1\u00c2\u0005a\u0000\u0000\u00c2\u0125\u0005r\u0000"+
		"\u0000\u00c3\u00c4\u0005p\u0000\u0000\u00c4\u00c5\u0005a\u0000\u0000\u00c5"+
		"\u00c6\u0005r\u0000\u0000\u00c6\u0125\u0005a\u0000\u0000\u00c7\u00c8\u0005"+
		"a\u0000\u0000\u00c8\u00c9\u0005t\u0000\u0000\u00c9\u0125\u0005e\u0000"+
		"\u0000\u00ca\u00cb\u0005f\u0000\u0000\u00cb\u00cc\u0005a\u0000\u0000\u00cc"+
		"\u00cd\u0005c\u0000\u0000\u00cd\u0125\u0005a\u0000\u0000\u00ce\u00cf\u0005"+
		"f\u0000\u0000\u00cf\u00d0\u0005i\u0000\u0000\u00d0\u00d1\u0005m\u0000"+
		"\u0000\u00d1\u00d2\u0005_\u0000\u0000\u00d2\u00d3\u0005p\u0000\u0000\u00d3"+
		"\u00d4\u0005a\u0000\u0000\u00d4\u00d5\u0005r\u0000\u0000\u00d5\u0125\u0005"+
		"a\u0000\u0000\u00d6\u00d7\u0005r\u0000\u0000\u00d7\u00d8\u0005e\u0000"+
		"\u0000\u00d8\u00d9\u0005g\u0000\u0000\u00d9\u00da\u0005i\u0000\u0000\u00da"+
		"\u00db\u0005s\u0000\u0000\u00db\u00dc\u0005t\u0000\u0000\u00dc\u00dd\u0005"+
		"r\u0000\u0000\u00dd\u0125\u0005o\u0000\u0000\u00de\u00df\u0005f\u0000"+
		"\u0000\u00df\u00e0\u0005i\u0000\u0000\u00e0\u00e1\u0005m\u0000\u0000\u00e1"+
		"\u00e2\u0005_\u0000\u0000\u00e2\u00e3\u0005r\u0000\u0000\u00e3\u00e4\u0005"+
		"e\u0000\u0000\u00e4\u00e5\u0005g\u0000\u0000\u00e5\u00e6\u0005i\u0000"+
		"\u0000\u00e6\u00e7\u0005s\u0000\u0000\u00e7\u00e8\u0005t\u0000\u0000\u00e8"+
		"\u00e9\u0005r\u0000\u0000\u00e9\u0125\u0005o\u0000\u0000\u00ea\u00eb\u0005"+
		"p\u0000\u0000\u00eb\u00ec\u0005r\u0000\u0000\u00ec\u00ed\u0005o\u0000"+
		"\u0000\u00ed\u00ee\u0005c\u0000\u0000\u00ee\u00ef\u0005e\u0000\u0000\u00ef"+
		"\u00f0\u0005d\u0000\u0000\u00f0\u00f1\u0005i\u0000\u0000\u00f1\u00f2\u0005"+
		"m\u0000\u0000\u00f2\u00f3\u0005e\u0000\u0000\u00f3\u00f4\u0005n\u0000"+
		"\u0000\u00f4\u00f5\u0005t\u0000\u0000\u00f5\u0125\u0005o\u0000\u0000\u00f6"+
		"\u00f7\u0005f\u0000\u0000\u00f7\u00f8\u0005i\u0000\u0000\u00f8\u00f9\u0005"+
		"m\u0000\u0000\u00f9\u00fa\u0005_\u0000\u0000\u00fa\u00fb\u0005p\u0000"+
		"\u0000\u00fb\u00fc\u0005r\u0000\u0000\u00fc\u00fd\u0005o\u0000\u0000\u00fd"+
		"\u00fe\u0005c\u0000\u0000\u00fe\u00ff\u0005e\u0000\u0000\u00ff\u0100\u0005"+
		"d\u0000\u0000\u0100\u0101\u0005i\u0000\u0000\u0101\u0102\u0005m\u0000"+
		"\u0000\u0102\u0103\u0005e\u0000\u0000\u0103\u0104\u0005n\u0000\u0000\u0104"+
		"\u0105\u0005t\u0000\u0000\u0105\u0125\u0005o\u0000\u0000\u0106\u0107\u0005"+
		"f\u0000\u0000\u0107\u0108\u0005u\u0000\u0000\u0108\u0109\u0005n\u0000"+
		"\u0000\u0109\u010a\u0005c\u0000\u0000\u010a\u010b\u0005a\u0000\u0000\u010b"+
		"\u0125\u0005o\u0000\u0000\u010c\u010d\u0005f\u0000\u0000\u010d\u010e\u0005"+
		"i\u0000\u0000\u010e\u010f\u0005m\u0000\u0000\u010f\u0110\u0005_\u0000"+
		"\u0000\u0110\u0111\u0005f\u0000\u0000\u0111\u0112\u0005u\u0000\u0000\u0112"+
		"\u0113\u0005n\u0000\u0000\u0113\u0114\u0005c\u0000\u0000\u0114\u0115\u0005"+
		"a\u0000\u0000\u0115\u0125\u0005o\u0000\u0000\u0116\u0117\u0005t\u0000"+
		"\u0000\u0117\u0118\u0005i\u0000\u0000\u0118\u0119\u0005p\u0000\u0000\u0119"+
		"\u0125\u0005o\u0000\u0000\u011a\u011b\u0005c\u0000\u0000\u011b\u011c\u0005"+
		"o\u0000\u0000\u011c\u011d\u0005n\u0000\u0000\u011d\u011e\u0005s\u0000"+
		"\u0000\u011e\u011f\u0005t\u0000\u0000\u011f\u0120\u0005a\u0000\u0000\u0120"+
		"\u0121\u0005n\u0000\u0000\u0121\u0122\u0005t\u0000\u0000\u0122\u0125\u0005"+
		"e\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u001d\u0001\u0000"+
		"\u0000\u0000\u0124&\u0001\u0000\u0000\u0000\u01243\u0001\u0000\u0000\u0000"+
		"\u0124:\u0001\u0000\u0000\u0000\u0124A\u0001\u0000\u0000\u0000\u0124H"+
		"\u0001\u0000\u0000\u0000\u0124L\u0001\u0000\u0000\u0000\u0124P\u0001\u0000"+
		"\u0000\u0000\u0124W\u0001\u0000\u0000\u0000\u0124Y\u0001\u0000\u0000\u0000"+
		"\u0124^\u0001\u0000\u0000\u0000\u0124d\u0001\u0000\u0000\u0000\u0124i"+
		"\u0001\u0000\u0000\u0000\u0124q\u0001\u0000\u0000\u0000\u0124}\u0001\u0000"+
		"\u0000\u0000\u0124\u0082\u0001\u0000\u0000\u0000\u0124\u0088\u0001\u0000"+
		"\u0000\u0000\u0124\u0092\u0001\u0000\u0000\u0000\u0124\u0095\u0001\u0000"+
		"\u0000\u0000\u0124\u009d\u0001\u0000\u0000\u0000\u0124\u00a9\u0001\u0000"+
		"\u0000\u0000\u0124\u00b0\u0001\u0000\u0000\u0000\u0124\u00b4\u0001\u0000"+
		"\u0000\u0000\u0124\u00bc\u0001\u0000\u0000\u0000\u0124\u00c0\u0001\u0000"+
		"\u0000\u0000\u0124\u00c3\u0001\u0000\u0000\u0000\u0124\u00c7\u0001\u0000"+
		"\u0000\u0000\u0124\u00ca\u0001\u0000\u0000\u0000\u0124\u00ce\u0001\u0000"+
		"\u0000\u0000\u0124\u00d6\u0001\u0000\u0000\u0000\u0124\u00de\u0001\u0000"+
		"\u0000\u0000\u0124\u00ea\u0001\u0000\u0000\u0000\u0124\u00f6\u0001\u0000"+
		"\u0000\u0000\u0124\u0106\u0001\u0000\u0000\u0000\u0124\u010c\u0001\u0000"+
		"\u0000\u0000\u0124\u0116\u0001\u0000\u0000\u0000\u0124\u011a\u0001\u0000"+
		"\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0002\u0001\u0000"+
		"\u0000\u0000\u0126\u0128\u000209\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u0004\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0003\u0003\u0001\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0136\u0001\u0000\u0000\u0000"+
		"\u0130\u0132\u0005.\u0000\u0000\u0131\u0133\u0003\u0003\u0001\u0000\u0132"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0137\u0001\u0000\u0000\u0000\u0136\u0130\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0006\u0001\u0000\u0000\u0000\u0138"+
		"\u0140\u0005e\u0000\u0000\u0139\u013a\u0005o\u0000\u0000\u013a\u0140\u0005"+
		"u\u0000\u0000\u013b\u013c\u0005n\u0000\u0000\u013c\u013d\u0005a\u0000"+
		"\u0000\u013d\u0140\u0005o\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000"+
		"\u013f\u0138\u0001\u0000\u0000\u0000\u013f\u0139\u0001\u0000\u0000\u0000"+
		"\u013f\u013b\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\b\u0001\u0000\u0000\u0000\u0141\u0145\u0007\u0000\u0000\u0000\u0142"+
		"\u0144\u0007\u0001\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144"+
		"\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\n\u0001\u0000\u0000\u0000\u0147\u0145"+
		"\u0001\u0000\u0000\u0000\u0148\u014e\u0005\"\u0000\u0000\u0149\u014a\u0005"+
		"\\\u0000\u0000\u014a\u014d\u0005\"\u0000\u0000\u014b\u014d\b\u0002\u0000"+
		"\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0152\u0005\"\u0000\u0000"+
		"\u0152\f\u0001\u0000\u0000\u0000\u0153\u0159\u0005\"\u0000\u0000\u0154"+
		"\u0155\u0005\\\u0000\u0000\u0155\u0158\u0005\"\u0000\u0000\u0156\u0158"+
		"\b\u0002\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157\u0156\u0001"+
		"\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005"+
		"\n\u0000\u0000\u015d\u000e\u0001\u0000\u0000\u0000\u015e\u0168\u0005>"+
		"\u0000\u0000\u015f\u0160\u0005>\u0000\u0000\u0160\u0168\u0005=\u0000\u0000"+
		"\u0161\u0168\u0005<\u0000\u0000\u0162\u0163\u0005<\u0000\u0000\u0163\u0168"+
		"\u0005=\u0000\u0000\u0164\u0165\u0005<\u0000\u0000\u0165\u0168\u0005>"+
		"\u0000\u0000\u0166\u0168\u0005=\u0000\u0000\u0167\u015e\u0001\u0000\u0000"+
		"\u0000\u0167\u015f\u0001\u0000\u0000\u0000\u0167\u0161\u0001\u0000\u0000"+
		"\u0000\u0167\u0162\u0001\u0000\u0000\u0000\u0167\u0164\u0001\u0000\u0000"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u0010\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0007\u0003\u0000\u0000\u016a\u0012\u0001\u0000\u0000"+
		"\u0000\u016b\u0172\u0007\u0004\u0000\u0000\u016c\u016d\u0005.\u0000\u0000"+
		"\u016d\u0172\u0005.\u0000\u0000\u016e\u0172\u0005.\u0000\u0000\u016f\u0170"+
		"\u0005<\u0000\u0000\u0170\u0172\u0005-\u0000\u0000\u0171\u016b\u0001\u0000"+
		"\u0000\u0000\u0171\u016c\u0001\u0000\u0000\u0000\u0171\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0014\u0001\u0000"+
		"\u0000\u0000\u0173\u0177\u0005{\u0000\u0000\u0174\u0176\b\u0005\u0000"+
		"\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000"+
		"\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0005}\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0006\n\u0000\u0000\u017d\u0016\u0001\u0000\u0000\u0000\u017e"+
		"\u0182\u0005{\u0000\u0000\u017f\u0181\b\u0006\u0000\u0000\u0180\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0185"+
		"\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0005\n\u0000\u0000\u0186\u0018\u0001\u0000\u0000\u0000\u0187\u0188\u0007"+
		"\u0007\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0006"+
		"\f\u0000\u0000\u018a\u001a\u0001\u0000\u0000\u0000\u018b\u018c\t\u0000"+
		"\u0000\u0000\u018c\u001c\u0001\u0000\u0000\u0000\u0010\u0000\u0124\u0129"+
		"\u012e\u0134\u0136\u013f\u0145\u014c\u014e\u0157\u0159\u0167\u0171\u0177"+
		"\u0182\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}