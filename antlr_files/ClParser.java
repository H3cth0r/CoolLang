// Generated from ClParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ClParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MAIN=2, IF=3, ELIF=4, ELSE=5, WHILE=6, FOR=7, CLASS=8, STRUCT=9, 
		SELF=10, RETURN=11, PLUS=12, MINUS=13, BY=14, DIV=15, MOD=16, EQUAL=17, 
		COLON=18, SEMI=19, COMMA=20, LBRACE=21, RBRACE=22, LPAR=23, RPAR=24, POINT=25, 
		INT=26, FLOAT=27, STRING=28, BOOL=29, TRUE=30, FALSE=31, EQEQUAL=32, NOTEQUAL=33, 
		MUTABLE=34, INMUTABLE=35, NONDIGIT=36, DIGIT=37, HEX_DIGIT=38, STRINGLITERAL=39, 
		USTRINGLITERAL=40, EXPONENT=41;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_fieldDeclaration = 2, 
		RULE_methodDeclaration = 3, RULE_argumentList = 4, RULE_argument = 5, 
		RULE_structDeclaration = 6, RULE_main = 7, RULE_statement = 8, RULE_assignment = 9, 
		RULE_ifStatement = 10, RULE_whileStatement = 11, RULE_forStatement = 12, 
		RULE_classInstantiation = 13, RULE_methodCall = 14, RULE_returnStatement = 15, 
		RULE_expression = 16, RULE_integer_expr = 17, RULE_floating_expr = 18, 
		RULE_string_expr = 19, RULE_type = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "fieldDeclaration", "methodDeclaration", 
			"argumentList", "argument", "structDeclaration", "main", "statement", 
			"assignment", "ifStatement", "whileStatement", "forStatement", "classInstantiation", 
			"methodCall", "returnStatement", "expression", "integer_expr", "floating_expr", 
			"string_expr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'main'", "'if'", "'elif'", "'else'", "'while'", "'for'", 
			"'class'", "'struct'", "'->'", "'<-'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "':'", "';'", "','", "'{'", "'}'", "'('", "')'", "'.'", "'int'", 
			"'float'", "'str'", "'bool'", "'true'", "'false'", "'=='", "'!='", "'mutable'", 
			"'inmutable'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "MAIN", "IF", "ELIF", "ELSE", "WHILE", "FOR", "CLASS", "STRUCT", 
			"SELF", "RETURN", "PLUS", "MINUS", "BY", "DIV", "MOD", "EQUAL", "COLON", 
			"SEMI", "COMMA", "LBRACE", "RBRACE", "LPAR", "RPAR", "POINT", "INT", 
			"FLOAT", "STRING", "BOOL", "TRUE", "FALSE", "EQEQUAL", "NOTEQUAL", "MUTABLE", 
			"INMUTABLE", "NONDIGIT", "DIGIT", "HEX_DIGIT", "STRINGLITERAL", "USTRINGLITERAL", 
			"EXPONENT"
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
	public String getGrammarFileName() { return "ClParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==STRUCT) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(42);
					classDeclaration();
					}
					break;
				case STRUCT:
					{
					setState(43);
					structDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			main();
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ClParser.CLASS, 0); }
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public TerminalNode LBRACE() { return getToken(ClParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ClParser.RBRACE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CLASS);
			setState(52);
			match(NONDIGIT);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(53);
				match(NONDIGIT);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(LBRACE);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006645248L) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
					{
					setState(60);
					fieldDeclaration();
					}
					break;
				case INT:
				case FLOAT:
				case STRING:
				case BOOL:
					{
					setState(61);
					methodDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(RBRACE);
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public TerminalNode SEMI() { return getToken(ClParser.SEMI, 0); }
		public TerminalNode PLUS() { return getToken(ClParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ClParser.MINUS, 0); }
		public TerminalNode EQUAL() { return getToken(ClParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(ClParser.MUTABLE, 0); }
		public TerminalNode INMUTABLE() { return getToken(ClParser.INMUTABLE, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE || _la==INMUTABLE) {
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==MUTABLE || _la==INMUTABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(73);
			type();
			setState(74);
			match(NONDIGIT);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(75);
				match(NONDIGIT);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(81);
				match(EQUAL);
				setState(82);
				expression(0);
				}
			}

			setState(85);
			match(SEMI);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public TerminalNode LPAR() { return getToken(ClParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ClParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ClParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ClParser.RBRACE, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			type();
			setState(88);
			match(NONDIGIT);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(89);
				match(NONDIGIT);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(LPAR);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) {
				{
				setState(96);
				argumentList();
				}
			}

			setState(99);
			match(RPAR);
			setState(100);
			match(LBRACE);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478984L) != 0)) {
				{
				{
				setState(101);
				statement();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(RBRACE);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			argument();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				argument();
				}
				}
				setState(116);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			type();
			setState(118);
			match(NONDIGIT);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(119);
				match(NONDIGIT);
				}
				}
				setState(124);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(ClParser.STRUCT, 0); }
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public TerminalNode LBRACE() { return getToken(ClParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ClParser.RBRACE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(STRUCT);
			setState(126);
			match(NONDIGIT);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(127);
				match(NONDIGIT);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(LBRACE);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(134);
				fieldDeclaration();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(RBRACE);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(ClParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(ClParser.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ClParser.RBRACE, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(MAIN);
			setState(143);
			match(LBRACE);
			setState(144);
			statement();
			setState(145);
			match(RBRACE);
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ClParser.SEMI, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ClassInstantiationContext classInstantiation() {
			return getRuleContext(ClassInstantiationContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				assignment();
				setState(148);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				classInstantiation();
				setState(154);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				methodCall();
				setState(157);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				returnStatement();
				setState(160);
				match(SEMI);
				}
				break;
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
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public TerminalNode EQUAL() { return getToken(ClParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(NONDIGIT);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(165);
				match(NONDIGIT);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(EQUAL);
			setState(172);
			expression(0);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ClParser.IF, 0); }
		public List<TerminalNode> LPAR() { return getTokens(ClParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(ClParser.LPAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(ClParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(ClParser.RPAR, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(ClParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ClParser.LBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ClParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ClParser.RBRACE, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(ClParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(ClParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(ClParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IF);
			setState(175);
			match(LPAR);
			setState(176);
			expression(0);
			setState(177);
			match(RPAR);
			setState(178);
			match(LBRACE);
			setState(179);
			statement();
			setState(180);
			match(RBRACE);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(181);
				match(ELIF);
				setState(182);
				match(LPAR);
				setState(183);
				expression(0);
				setState(184);
				match(RPAR);
				setState(185);
				match(LBRACE);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478984L) != 0)) {
					{
					{
					setState(186);
					statement();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(RBRACE);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(199);
				match(ELSE);
				setState(200);
				match(LBRACE);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478984L) != 0)) {
					{
					{
					setState(201);
					statement();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ClParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ClParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ClParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ClParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ClParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(WHILE);
			setState(211);
			match(LPAR);
			setState(212);
			expression(0);
			setState(213);
			match(RPAR);
			setState(214);
			match(LBRACE);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478984L) != 0)) {
				{
				{
				setState(215);
				statement();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(RBRACE);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ClParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(ClParser.LPAR, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ClParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ClParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ClParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ClParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ClParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(FOR);
			setState(224);
			match(LPAR);
			setState(225);
			assignment();
			setState(226);
			match(SEMI);
			setState(227);
			expression(0);
			setState(228);
			match(SEMI);
			setState(229);
			assignment();
			setState(230);
			match(RPAR);
			setState(231);
			match(LBRACE);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478984L) != 0)) {
				{
				{
				setState(232);
				statement();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(RBRACE);
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
	public static class ClassInstantiationContext extends ParserRuleContext {
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public TerminalNode EQUAL() { return getToken(ClParser.EQUAL, 0); }
		public TerminalNode LPAR() { return getToken(ClParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ClParser.RPAR, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterClassInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitClassInstantiation(this);
		}
	}

	public final ClassInstantiationContext classInstantiation() throws RecognitionException {
		ClassInstantiationContext _localctx = new ClassInstantiationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(NONDIGIT);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(241);
				match(NONDIGIT);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(EQUAL);
			setState(248);
			match(NONDIGIT);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(249);
				match(NONDIGIT);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(LPAR);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) {
				{
				setState(256);
				argumentList();
				}
			}

			setState(259);
			match(RPAR);
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
	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public TerminalNode LPAR() { return getToken(ClParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ClParser.RPAR, 0); }
		public TerminalNode POINT() { return getToken(ClParser.POINT, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(261);
				match(NONDIGIT);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NONDIGIT) {
					{
					{
					setState(262);
					match(NONDIGIT);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				match(POINT);
				}
				break;
			}
			setState(271);
			match(NONDIGIT);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDIGIT) {
				{
				{
				setState(272);
				match(NONDIGIT);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(LPAR);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) {
				{
				setState(279);
				argumentList();
				}
			}

			setState(282);
			match(RPAR);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ClParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(RETURN);
			setState(285);
			expression(0);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> NONDIGIT() { return getTokens(ClParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(ClParser.NONDIGIT, i);
		}
		public Integer_exprContext integer_expr() {
			return getRuleContext(Integer_exprContext.class,0);
		}
		public Floating_exprContext floating_expr() {
			return getRuleContext(Floating_exprContext.class,0);
		}
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(ClParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ClParser.FALSE, 0); }
		public TerminalNode LPAR() { return getToken(ClParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ClParser.RPAR, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ClParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ClParser.MINUS, 0); }
		public TerminalNode BY() { return getToken(ClParser.BY, 0); }
		public TerminalNode DIV() { return getToken(ClParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ClParser.MOD, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(288);
				match(NONDIGIT);
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						match(NONDIGIT);
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(295);
				integer_expr();
				}
				break;
			case 3:
				{
				setState(296);
				floating_expr();
				}
				break;
			case 4:
				{
				setState(297);
				string_expr();
				}
				break;
			case 5:
				{
				setState(298);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(299);
				match(FALSE);
				}
				break;
			case 7:
				{
				setState(300);
				match(LPAR);
				setState(301);
				expression(0);
				setState(302);
				match(RPAR);
				}
				break;
			case 8:
				{
				setState(304);
				methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(308);
						match(PLUS);
						setState(309);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(311);
						match(MINUS);
						setState(312);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(314);
						match(BY);
						setState(315);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(317);
						match(DIV);
						setState(318);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(320);
						match(MOD);
						setState(321);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Integer_exprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ClParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ClParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ClParser.DIGIT, i);
		}
		public Integer_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterInteger_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitInteger_expr(this);
		}
	}

	public final Integer_exprContext integer_expr() throws RecognitionException {
		Integer_exprContext _localctx = new Integer_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_integer_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(328); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(327);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(330); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case MINUS:
				{
				setState(332);
				match(MINUS);
				setState(334); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(333);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(336); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Floating_exprContext extends ParserRuleContext {
		public TerminalNode POINT() { return getToken(ClParser.POINT, 0); }
		public TerminalNode EXPONENT() { return getToken(ClParser.EXPONENT, 0); }
		public TerminalNode PLUS() { return getToken(ClParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ClParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ClParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ClParser.DIGIT, i);
		}
		public Floating_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterFloating_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitFloating_expr(this);
		}
	}

	public final Floating_exprContext floating_expr() throws RecognitionException {
		Floating_exprContext _localctx = new Floating_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_floating_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(340);
					match(DIGIT);
					}
					}
					setState(343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(345);
				match(POINT);
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						match(DIGIT);
						}
						} 
					}
					setState(351);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(352);
					match(DIGIT);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				match(POINT);
				setState(360); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(359);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(362); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				{
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(364);
					match(DIGIT);
					}
					}
					setState(367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(369);
				match(EXPONENT);
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(372); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(371);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(374); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_exprContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(ClParser.STRINGLITERAL, 0); }
		public String_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterString_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitString_expr(this);
		}
	}

	public final String_exprContext string_expr() throws RecognitionException {
		String_exprContext _localctx = new String_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(STRINGLITERAL);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ClParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ClParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(ClParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(ClParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClParserListener ) ((ClParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u017f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001\f\u0001"+
		":\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001?\b\u0001\n\u0001"+
		"\f\u0001B\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002H\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002M\b\u0002"+
		"\n\u0002\f\u0002P\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002T\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"[\b\u0003\n\u0003\f\u0003^\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"b\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003g\b\u0003\n\u0003"+
		"\f\u0003j\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004q\b\u0004\n\u0004\f\u0004t\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005y\b\u0005\n\u0005\f\u0005|\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0081\b\u0006\n\u0006\f\u0006"+
		"\u0084\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0088\b\u0006\n\u0006"+
		"\f\u0006\u008b\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00a3\b\b\u0001\t\u0001\t\u0005\t\u00a7\b\t\n\t\f\t"+
		"\u00aa\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00bc\b\n\n\n\f\n\u00bf\t\n\u0001\n\u0001\n\u0005\n\u00c3\b\n\n\n\f"+
		"\n\u00c6\t\n\u0001\n\u0001\n\u0001\n\u0005\n\u00cb\b\n\n\n\f\n\u00ce\t"+
		"\n\u0001\n\u0003\n\u00d1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d9\b\u000b\n\u000b\f\u000b"+
		"\u00dc\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ea\b\f\n\f"+
		"\f\f\u00ed\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u00f3\b\r\n\r\f"+
		"\r\u00f6\t\r\u0001\r\u0001\r\u0001\r\u0005\r\u00fb\b\r\n\r\f\r\u00fe\t"+
		"\r\u0001\r\u0001\r\u0003\r\u0102\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0108\b\u000e\n\u000e\f\u000e\u010b\t\u000e\u0001\u000e"+
		"\u0003\u000e\u010e\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0112\b"+
		"\u000e\n\u000e\f\u000e\u0115\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0119\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0123\b\u0010\n\u0010"+
		"\f\u0010\u0126\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0132\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0143\b\u0010\n\u0010\f\u0010\u0146\t\u0010\u0001\u0011\u0004\u0011\u0149"+
		"\b\u0011\u000b\u0011\f\u0011\u014a\u0001\u0011\u0001\u0011\u0004\u0011"+
		"\u014f\b\u0011\u000b\u0011\f\u0011\u0150\u0003\u0011\u0153\b\u0011\u0001"+
		"\u0012\u0004\u0012\u0156\b\u0012\u000b\u0012\f\u0012\u0157\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u015c\b\u0012\n\u0012\f\u0012\u015f\t\u0012\u0001"+
		"\u0012\u0005\u0012\u0162\b\u0012\n\u0012\f\u0012\u0165\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u0169\b\u0012\u000b\u0012\f\u0012\u016a\u0001"+
		"\u0012\u0004\u0012\u016e\b\u0012\u000b\u0012\f\u0012\u016f\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u0175\b\u0012\u000b\u0012\f\u0012"+
		"\u0176\u0003\u0012\u0179\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0000\u0001 \u0015\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0003\u0001"+
		"\u0000\f\r\u0001\u0000\"#\u0001\u0000\u001a\u001d\u01a4\u0000.\u0001\u0000"+
		"\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000"+
		"\u0006W\u0001\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\nu\u0001\u0000"+
		"\u0000\u0000\f}\u0001\u0000\u0000\u0000\u000e\u008e\u0001\u0000\u0000"+
		"\u0000\u0010\u00a2\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000\u0000"+
		"\u0000\u0014\u00ae\u0001\u0000\u0000\u0000\u0016\u00d2\u0001\u0000\u0000"+
		"\u0000\u0018\u00df\u0001\u0000\u0000\u0000\u001a\u00f0\u0001\u0000\u0000"+
		"\u0000\u001c\u010d\u0001\u0000\u0000\u0000\u001e\u011c\u0001\u0000\u0000"+
		"\u0000 \u0131\u0001\u0000\u0000\u0000\"\u0152\u0001\u0000\u0000\u0000"+
		"$\u0178\u0001\u0000\u0000\u0000&\u017a\u0001\u0000\u0000\u0000(\u017c"+
		"\u0001\u0000\u0000\u0000*-\u0003\u0002\u0001\u0000+-\u0003\f\u0006\u0000"+
		",*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000012\u0003\u000e\u0007\u00002\u0001"+
		"\u0001\u0000\u0000\u000034\u0005\b\u0000\u000048\u0005$\u0000\u000057"+
		"\u0005$\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;@\u0005\u0015\u0000\u0000<?\u0003\u0004"+
		"\u0002\u0000=?\u0003\u0006\u0003\u0000><\u0001\u0000\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0016\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EG\u0007"+
		"\u0000\u0000\u0000FH\u0007\u0001\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0003(\u0014\u0000"+
		"JN\u0005$\u0000\u0000KM\u0005$\u0000\u0000LK\u0001\u0000\u0000\u0000M"+
		"P\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OS\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0011"+
		"\u0000\u0000RT\u0003 \u0010\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u0013\u0000\u0000V\u0005"+
		"\u0001\u0000\u0000\u0000WX\u0003(\u0014\u0000X\\\u0005$\u0000\u0000Y["+
		"\u0005$\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_a\u0005\u0017\u0000\u0000`b\u0003\b"+
		"\u0004\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cd\u0005\u0018\u0000\u0000dh\u0005\u0015\u0000\u0000"+
		"eg\u0003\u0010\b\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0005\u0016\u0000\u0000l\u0007\u0001"+
		"\u0000\u0000\u0000mr\u0003\n\u0005\u0000no\u0005\u0014\u0000\u0000oq\u0003"+
		"\n\u0005\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\t\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uv\u0003(\u0014\u0000vz\u0005$\u0000\u0000w"+
		"y\u0005$\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u000b\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\t\u0000\u0000~\u0082\u0005"+
		"$\u0000\u0000\u007f\u0081\u0005$\u0000\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0089\u0005\u0015\u0000"+
		"\u0000\u0086\u0088\u0003\u0004\u0002\u0000\u0087\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0016\u0000"+
		"\u0000\u008d\r\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0002\u0000\u0000"+
		"\u008f\u0090\u0005\u0015\u0000\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091"+
		"\u0092\u0005\u0016\u0000\u0000\u0092\u000f\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0003\u0012\t\u0000\u0094\u0095\u0005\u0013\u0000\u0000\u0095\u00a3"+
		"\u0001\u0000\u0000\u0000\u0096\u00a3\u0003\u0014\n\u0000\u0097\u00a3\u0003"+
		"\u0016\u000b\u0000\u0098\u00a3\u0003\u0018\f\u0000\u0099\u009a\u0003\u001a"+
		"\r\u0000\u009a\u009b\u0005\u0013\u0000\u0000\u009b\u00a3\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0003\u001c\u000e\u0000\u009d\u009e\u0005\u0013\u0000"+
		"\u0000\u009e\u00a3\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u001e\u000f"+
		"\u0000\u00a0\u00a1\u0005\u0013\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a2\u0093\u0001\u0000\u0000\u0000\u00a2\u0096\u0001\u0000\u0000"+
		"\u0000\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u0098\u0001\u0000\u0000"+
		"\u0000\u00a2\u0099\u0001\u0000\u0000\u0000\u00a2\u009c\u0001\u0000\u0000"+
		"\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3\u0011\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a8\u0005$\u0000\u0000\u00a5\u00a7\u0005$\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0011\u0000\u0000\u00ac\u00ad\u0003 \u0010\u0000\u00ad\u0013"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af\u00b0"+
		"\u0005\u0017\u0000\u0000\u00b0\u00b1\u0003 \u0010\u0000\u00b1\u00b2\u0005"+
		"\u0018\u0000\u0000\u00b2\u00b3\u0005\u0015\u0000\u0000\u00b3\u00b4\u0003"+
		"\u0010\b\u0000\u00b4\u00c4\u0005\u0016\u0000\u0000\u00b5\u00b6\u0005\u0004"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0017\u0000\u0000\u00b7\u00b8\u0003 \u0010"+
		"\u0000\u00b8\u00b9\u0005\u0018\u0000\u0000\u00b9\u00bd\u0005\u0015\u0000"+
		"\u0000\u00ba\u00bc\u0003\u0010\b\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0016\u0000\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b5\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00d0\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0005\u0000\u0000"+
		"\u00c8\u00cc\u0005\u0015\u0000\u0000\u00c9\u00cb\u0003\u0010\b\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d1\u0005\u0016\u0000\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u0015\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0006\u0000\u0000\u00d3\u00d4\u0005\u0017\u0000\u0000\u00d4"+
		"\u00d5\u0003 \u0010\u0000\u00d5\u00d6\u0005\u0018\u0000\u0000\u00d6\u00da"+
		"\u0005\u0015\u0000\u0000\u00d7\u00d9\u0003\u0010\b\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u0016\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u0007\u0000\u0000\u00e0\u00e1\u0005\u0017\u0000\u0000\u00e1\u00e2\u0003"+
		"\u0012\t\u0000\u00e2\u00e3\u0005\u0013\u0000\u0000\u00e3\u00e4\u0003 "+
		"\u0010\u0000\u00e4\u00e5\u0005\u0013\u0000\u0000\u00e5\u00e6\u0003\u0012"+
		"\t\u0000\u00e6\u00e7\u0005\u0018\u0000\u0000\u00e7\u00eb\u0005\u0015\u0000"+
		"\u0000\u00e8\u00ea\u0003\u0010\b\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0016\u0000\u0000"+
		"\u00ef\u0019\u0001\u0000\u0000\u0000\u00f0\u00f4\u0005$\u0000\u0000\u00f1"+
		"\u00f3\u0005$\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0011\u0000\u0000\u00f8\u00fc"+
		"\u0005$\u0000\u0000\u00f9\u00fb\u0005$\u0000\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0101\u0005\u0017"+
		"\u0000\u0000\u0100\u0102\u0003\b\u0004\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005\u0018\u0000\u0000\u0104\u001b\u0001\u0000\u0000"+
		"\u0000\u0105\u0109\u0005$\u0000\u0000\u0106\u0108\u0005$\u0000\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c"+
		"\u010e\u0005\u0019\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0113\u0005$\u0000\u0000\u0110\u0112\u0005$\u0000\u0000\u0111\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0118\u0005"+
		"\u0017\u0000\u0000\u0117\u0119\u0003\b\u0004\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0005\u0018\u0000\u0000\u011b\u001d\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005\u000b\u0000\u0000\u011d\u011e\u0003 \u0010"+
		"\u0000\u011e\u001f\u0001\u0000\u0000\u0000\u011f\u0120\u0006\u0010\uffff"+
		"\uffff\u0000\u0120\u0124\u0005$\u0000\u0000\u0121\u0123\u0005$\u0000\u0000"+
		"\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0132\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000"+
		"\u0127\u0132\u0003\"\u0011\u0000\u0128\u0132\u0003$\u0012\u0000\u0129"+
		"\u0132\u0003&\u0013\u0000\u012a\u0132\u0005\u001e\u0000\u0000\u012b\u0132"+
		"\u0005\u001f\u0000\u0000\u012c\u012d\u0005\u0017\u0000\u0000\u012d\u012e"+
		"\u0003 \u0010\u0000\u012e\u012f\u0005\u0018\u0000\u0000\u012f\u0132\u0001"+
		"\u0000\u0000\u0000\u0130\u0132\u0003\u001c\u000e\u0000\u0131\u011f\u0001"+
		"\u0000\u0000\u0000\u0131\u0127\u0001\u0000\u0000\u0000\u0131\u0128\u0001"+
		"\u0000\u0000\u0000\u0131\u0129\u0001\u0000\u0000\u0000\u0131\u012a\u0001"+
		"\u0000\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131\u012c\u0001"+
		"\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0144\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\n\u0007\u0000\u0000\u0134\u0135\u0005\f"+
		"\u0000\u0000\u0135\u0143\u0003 \u0010\b\u0136\u0137\n\u0006\u0000\u0000"+
		"\u0137\u0138\u0005\r\u0000\u0000\u0138\u0143\u0003 \u0010\u0007\u0139"+
		"\u013a\n\u0005\u0000\u0000\u013a\u013b\u0005\u000e\u0000\u0000\u013b\u0143"+
		"\u0003 \u0010\u0006\u013c\u013d\n\u0004\u0000\u0000\u013d\u013e\u0005"+
		"\u000f\u0000\u0000\u013e\u0143\u0003 \u0010\u0005\u013f\u0140\n\u0003"+
		"\u0000\u0000\u0140\u0141\u0005\u0010\u0000\u0000\u0141\u0143\u0003 \u0010"+
		"\u0004\u0142\u0133\u0001\u0000\u0000\u0000\u0142\u0136\u0001\u0000\u0000"+
		"\u0000\u0142\u0139\u0001\u0000\u0000\u0000\u0142\u013c\u0001\u0000\u0000"+
		"\u0000\u0142\u013f\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145!\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0005%\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u0153\u0001\u0000\u0000\u0000\u014c"+
		"\u014e\u0005\r\u0000\u0000\u014d\u014f\u0005%\u0000\u0000\u014e\u014d"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153"+
		"\u0001\u0000\u0000\u0000\u0152\u0148\u0001\u0000\u0000\u0000\u0152\u014c"+
		"\u0001\u0000\u0000\u0000\u0153#\u0001\u0000\u0000\u0000\u0154\u0156\u0005"+
		"%\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015d\u0005\u0019"+
		"\u0000\u0000\u015a\u015c\u0005%\u0000\u0000\u015b\u015a\u0001\u0000\u0000"+
		"\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0179\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0162\u0005%\u0000\u0000"+
		"\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000"+
		"\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000"+
		"\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0166\u0168\u0005\u0019\u0000\u0000\u0167\u0169\u0005%\u0000\u0000\u0168"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u0179\u0001\u0000\u0000\u0000\u016c\u016e\u0005%\u0000\u0000\u016d\u016c"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u016d"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0005)\u0000\u0000\u0172\u0174\u0007"+
		"\u0000\u0000\u0000\u0173\u0175\u0005%\u0000\u0000\u0174\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000"+
		"\u0000\u0000\u0178\u0155\u0001\u0000\u0000\u0000\u0178\u0163\u0001\u0000"+
		"\u0000\u0000\u0178\u016d\u0001\u0000\u0000\u0000\u0179%\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0005\'\u0000\u0000\u017b\'\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0007\u0002\u0000\u0000\u017d)\u0001\u0000\u0000\u0000,,"+
		".8>@GNS\\ahrz\u0082\u0089\u00a2\u00a8\u00bd\u00c4\u00cc\u00d0\u00da\u00eb"+
		"\u00f4\u00fc\u0101\u0109\u010d\u0113\u0118\u0124\u0131\u0142\u0144\u014a"+
		"\u0150\u0152\u0157\u015d\u0163\u016a\u016f\u0176\u0178";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}