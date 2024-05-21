// Generated from Y:/Universita/Linguagg/BrainFuck/src/Brainfuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BrainfuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MIN=1, MAG=2, PLUS=3, SUB=4, VIR=5, PUNT=6, LBRAK=7, RBRAK=8, WS=9;
	public static final int
		RULE_main = 0, RULE_init = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "init"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'+'", "'-'", "','", "'.'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MIN", "MAG", "PLUS", "SUB", "VIR", "PUNT", "LBRAK", "RBRAK", "WS"
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
	public String getGrammarFileName() { return "Brainfuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrainfuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BrainfuckParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			init();
			setState(5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	 
		public InitContext() { }
		public void copyFrom(InitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilContext extends InitContext {
		public NilContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends InitContext {
		public TerminalNode SUB() { return getToken(BrainfuckParser.SUB, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public SubContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MagContext extends InitContext {
		public TerminalNode MAG() { return getToken(BrainfuckParser.MAG, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public MagContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitMag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinContext extends InitContext {
		public TerminalNode MIN() { return getToken(BrainfuckParser.MIN, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public MinContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends InitContext {
		public TerminalNode LBRAK() { return getToken(BrainfuckParser.LBRAK, 0); }
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public TerminalNode RBRAK() { return getToken(BrainfuckParser.RBRAK, 0); }
		public LoopContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends InitContext {
		public TerminalNode PLUS() { return getToken(BrainfuckParser.PLUS, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public PlusContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VirContext extends InitContext {
		public TerminalNode VIR() { return getToken(BrainfuckParser.VIR, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public VirContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitVir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PuntContext extends InitContext {
		public TerminalNode PUNT() { return getToken(BrainfuckParser.PUNT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public PuntContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitPunt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_init);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(MIN);
				setState(8);
				init();
				}
				break;
			case MAG:
				_localctx = new MagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(MAG);
				setState(10);
				init();
				}
				break;
			case PLUS:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(11);
				match(PLUS);
				setState(12);
				init();
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				match(SUB);
				setState(14);
				init();
				}
				break;
			case VIR:
				_localctx = new VirContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
				match(VIR);
				setState(16);
				init();
				}
				break;
			case PUNT:
				_localctx = new PuntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				match(PUNT);
				setState(18);
				init();
				}
				break;
			case LBRAK:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(19);
				match(LBRAK);
				setState(20);
				init();
				setState(21);
				match(RBRAK);
				setState(22);
				init();
				}
				break;
			case EOF:
			case RBRAK:
				_localctx = new NilContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
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

	public static final String _serializedATN =
		"\u0004\u0001\t\u001c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000 \u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000"+
		"\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000"+
		"\u0007\b\u0005\u0001\u0000\u0000\b\u001a\u0003\u0002\u0001\u0000\t\n\u0005"+
		"\u0002\u0000\u0000\n\u001a\u0003\u0002\u0001\u0000\u000b\f\u0005\u0003"+
		"\u0000\u0000\f\u001a\u0003\u0002\u0001\u0000\r\u000e\u0005\u0004\u0000"+
		"\u0000\u000e\u001a\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0005\u0000"+
		"\u0000\u0010\u001a\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0006\u0000"+
		"\u0000\u0012\u001a\u0003\u0002\u0001\u0000\u0013\u0014\u0005\u0007\u0000"+
		"\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0005\b\u0000\u0000"+
		"\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u001a\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0007\u0001\u0000\u0000\u0000"+
		"\u0019\t\u0001\u0000\u0000\u0000\u0019\u000b\u0001\u0000\u0000\u0000\u0019"+
		"\r\u0001\u0000\u0000\u0000\u0019\u000f\u0001\u0000\u0000\u0000\u0019\u0011"+
		"\u0001\u0000\u0000\u0000\u0019\u0013\u0001\u0000\u0000\u0000\u0019\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u0001\u0019";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}