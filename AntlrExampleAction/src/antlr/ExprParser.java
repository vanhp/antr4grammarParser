// Generated from Expr.g4 by ANTLR 4.8


	package antlr;
	import org.antlr.v4.runtime.*;
	import java.io.*;
	import java.util.*;
		
	//mode classes
	import expression.Expression;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import expression.Addition;
import expression.Expression;
import expression.Multiplication;
import expression.Program;
import expression.Variable;
import expression.VariableDeclaration;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, NUM=6, INT_TYPE=7, COMMENT=8, WS=9;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'*'", "'+'", null, null, "'INT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ID", "NUM", "INT_TYPE", "COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		//for error handling
		public List<String> vars = new ArrayList<>();
		public List<String> semanticErrors = new ArrayList<>();
		
		// root of AST (of type Expression)
		public Program program;

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Program p;
		public DeclContext x;
		public ExprContext y;
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		 // will be executed first before production take effect
			((ProgContext)_localctx).p =  new Program();
			program = _localctx.p;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(12);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(6);
					((ProgContext)_localctx).x = decl();

									_localctx.p.addExpression(((ProgContext)_localctx).x.d);
								
					}
					break;
				case 2:
					{
					setState(9);
					((ProgContext)_localctx).y = expr(0);

									_localctx.p.addExpression(((ProgContext)_localctx).y.e);
								
					}
					break;
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUM );
			setState(16);
			match(EOF);
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

	public static class DeclContext extends ParserRuleContext {
		public Expression d;
		public Token name;
		public Token type;
		public Token val;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode INT_TYPE() { return getToken(ExprParser.INT_TYPE, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((DeclContext)_localctx).name = match(ID);
			setState(19);
			match(T__0);
			setState(20);
			((DeclContext)_localctx).type = match(INT_TYPE);
			setState(21);
			match(T__1);
			setState(22);
			((DeclContext)_localctx).val = match(NUM);

					int line = ((DeclContext)_localctx).name.getLine();
					int column = ((DeclContext)_localctx).name.getCharPositionInLine() + 1;
					
					String id = (((DeclContext)_localctx).name!=null?((DeclContext)_localctx).name.getText():null);
					if(vars.contains(id)){
						semanticErrors.add("Error: variable " + id + " already declared (" + line + ", " + column + ")");
					}
					else {vars.add(id);}
					
					// handling type
					String type = ((DeclContext)_localctx).type.getText(); 
					
					// handling val
					int val = (((DeclContext)_localctx).val!=null?Integer.valueOf(((DeclContext)_localctx).val.getText()):0);
					
					// create declaration object
					((DeclContext)_localctx).d =  new VariableDeclaration(id,type,val);
				
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

	public static class ExprContext extends ParserRuleContext {
		public Expression e;
		public ExprContext left;
		public Token id;
		public Token n;
		public ExprContext right;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(26);
				((ExprContext)_localctx).id = match(ID);

						int line = ((ExprContext)_localctx).id.getLine();
						int column = ((ExprContext)_localctx).id.getCharPositionInLine() + 1;
						if(!vars.contains((((ExprContext)_localctx).id!=null?((ExprContext)_localctx).id.getText():null))){
							semanticErrors.add("Error: variable " + (((ExprContext)_localctx).id!=null?((ExprContext)_localctx).id.getText():null) + "not declared (" + line + ", " + column + ")");
						}
						((ExprContext)_localctx).e =  new Variable((((ExprContext)_localctx).id!=null?((ExprContext)_localctx).id.getText():null));
					
				}
				break;
			case NUM:
				{
				setState(28);
				((ExprContext)_localctx).n = match(NUM);
				// while building the subtree of an expr node that contains NUM as the first child,
						   // we also build Expression object.
							_localctx.e = new expression.Number((((ExprContext)_localctx).n!=null?Integer.valueOf(((ExprContext)_localctx).n.getText()):0));
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(32);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(33);
						match(T__2);
						setState(34);
						((ExprContext)_localctx).right = expr(5);

						          		((ExprContext)_localctx).e =  new Multiplication(((ExprContext)_localctx).left.e,((ExprContext)_localctx).right.e);
						          	
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(38);
						match(T__3);
						setState(39);
						((ExprContext)_localctx).right = expr(4);

						          		((ExprContext)_localctx).e =  new Addition(((ExprContext)_localctx).left.e,((ExprContext)_localctx).right.e);
						          	
						}
						break;
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\2\3\6\5\2\4\6"+
		"\2\2\2\63\2\16\3\2\2\2\4\24\3\2\2\2\6 \3\2\2\2\b\t\5\4\3\2\t\n\b\2\1\2"+
		"\n\17\3\2\2\2\13\f\5\6\4\2\f\r\b\2\1\2\r\17\3\2\2\2\16\b\3\2\2\2\16\13"+
		"\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22\23"+
		"\7\2\2\3\23\3\3\2\2\2\24\25\7\7\2\2\25\26\7\3\2\2\26\27\7\t\2\2\27\30"+
		"\7\4\2\2\30\31\7\b\2\2\31\32\b\3\1\2\32\5\3\2\2\2\33\34\b\4\1\2\34\35"+
		"\7\7\2\2\35!\b\4\1\2\36\37\7\b\2\2\37!\b\4\1\2 \33\3\2\2\2 \36\3\2\2\2"+
		"!.\3\2\2\2\"#\f\6\2\2#$\7\5\2\2$%\5\6\4\7%&\b\4\1\2&-\3\2\2\2\'(\f\5\2"+
		"\2()\7\6\2\2)*\5\6\4\6*+\b\4\1\2+-\3\2\2\2,\"\3\2\2\2,\'\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60.\3\2\2\2\7\16\20 ,.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}