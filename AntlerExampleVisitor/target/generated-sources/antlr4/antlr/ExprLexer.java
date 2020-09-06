// Generated from Expr.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, ID=5, NUM=6, INT_TYPE=7, COMMENT=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "ID", "NUM", "INT_TYPE", "COMMENT", "WS"
	};


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13G\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6 \n\6\f\6\16\6#\13\6\3\7\3\7\5\7\'"+
		"\n\7\3\7\3\7\7\7+\n\7\f\7\16\7.\13\7\5\7\60\n\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\7\t:\n\t\f\t\16\t=\13\t\3\t\3\t\3\n\6\nB\n\n\r\n\16\nC\3\n"+
		"\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\b\3\2c|\6\2\62"+
		";C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\4\2\13\f\"\"L\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\31\3\2\2\2\t\33\3"+
		"\2\2\2\13\35\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\65\3\2\2\2\23A\3\2\2"+
		"\2\25\26\7,\2\2\26\4\3\2\2\2\27\30\7<\2\2\30\6\3\2\2\2\31\32\7-\2\2\32"+
		"\b\3\2\2\2\33\34\7?\2\2\34\n\3\2\2\2\35!\t\2\2\2\36 \t\3\2\2\37\36\3\2"+
		"\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\f\3\2\2\2#!\3\2\2\2$\60\7\62\2"+
		"\2%\'\7/\2\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2(,\t\4\2\2)+\t\5\2\2*)\3\2"+
		"\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.,\3\2\2\2/$\3\2\2\2/&\3"+
		"\2\2\2\60\16\3\2\2\2\61\62\7K\2\2\62\63\7P\2\2\63\64\7V\2\2\64\20\3\2"+
		"\2\2\65\66\7/\2\2\66\67\7/\2\2\67;\3\2\2\28:\n\6\2\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\b\t\2\2?\22\3\2\2\2@B\t\7"+
		"\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\n\2\2F\24\3"+
		"\2\2\2\t\2!&,/;C\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}