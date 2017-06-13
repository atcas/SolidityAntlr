// Generated from Solidity.g4 by ANTLR 4.5
package com.atcas.grammar.antrl.solidity.base;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Contract=3, Import=4, Library=5, ModifierSoliditySymbol=6, 
		ReturnsSolidity=7, VarSolidity=8, BoolSolidity=9, BytesSolidity=10, IntSolidity=11, 
		UIntSolidity=12, FixedSolidity=13, UfixedSolidity=14, AddressSolidity=15, 
		HashSolidity=16, StringSolidity=17, StructSolidity=18, MappingSolidity=19, 
		EnumSolidity=20, ModifierSolidity=21, ConstantSolidity=22, Indexed=23, 
		Seconds=24, Minutes=25, Hours=26, Days=27, Weeks=28, Years=29, Now=30, 
		Wei=31, Finney=32, Szabo=33, Ether=34, Using=35, Event=36, RegularExpressionLiteral=37, 
		LineTerminator=38, OpenBracket=39, CloseBracket=40, OpenParen=41, CloseParen=42, 
		OpenBrace=43, CloseBrace=44, SemiColon=45, Comma=46, Assign=47, QuestionMark=48, 
		Colon=49, Dot=50, PlusPlus=51, MinusMinus=52, Plus=53, Minus=54, BitNot=55, 
		Not=56, Multiply=57, Divide=58, Modulus=59, RightShiftArithmetic=60, LeftShiftArithmetic=61, 
		RightShiftLogical=62, LessThan=63, MoreThan=64, LessThanEquals=65, GreaterThanEquals=66, 
		Equals=67, NotEquals=68, IdentityEquals=69, IdentityNotEquals=70, BitAnd=71, 
		BitXOr=72, BitOr=73, And=74, Or=75, MultiplyAssign=76, DivideAssign=77, 
		ModulusAssign=78, PlusAssign=79, MinusAssign=80, LeftShiftArithmeticAssign=81, 
		RightShiftArithmeticAssign=82, RightShiftLogicalAssign=83, BitAndAssign=84, 
		BitXorAssign=85, BitOrAssign=86, NullLiteral=87, BooleanLiteral=88, DecimalLiteral=89, 
		HexIntegerLiteral=90, OctalIntegerLiteral=91, Break=92, Do=93, Instanceof=94, 
		Typeof=95, Case=96, Else=97, New=98, Catch=99, Finally=100, Return=101, 
		Void=102, Continue=103, For=104, Switch=105, While=106, Debugger=107, 
		Function=108, This=109, With=110, Default=111, If=112, Throw=113, Delete=114, 
		In=115, Try=116, Implements=117, Let=118, Private=119, Public=120, Interface=121, 
		Package=122, Protected=123, Inheritable=124, External=125, Static=126, 
		Yield=127, Identifier=128, StringLiteral=129, WhiteSpaces=130, MultiLineComment=131, 
		SingleLineComment=132, NEWLINE=133, WS=134, UnexpectedCharacter=135;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_sourceElement = 2, RULE_varGlobalSolidity = 3, 
		RULE_mappingGlobalSolidity = 4, RULE_structGlobalSolidity = 5, RULE_enumGlobalSolidity = 6, 
		RULE_valuesenumGlobalSolidity = 7, RULE_sourceElementsFunctionSolidity = 8, 
		RULE_sourceElementFunctionSolidity = 9, RULE_contractElements = 10, RULE_contractElementGenerico = 11, 
		RULE_importElement = 12, RULE_libraryElement = 13, RULE_contractElement = 14, 
		RULE_contractExtendElementConstructor = 15, RULE_contractExtendElement = 16, 
		RULE_modifierExtendFunction = 17, RULE_modifierExtendFunctionConstructor = 18, 
		RULE_statement = 19, RULE_block = 20, RULE_statementList = 21, RULE_variableDeclarationListFunctionSolidity = 22, 
		RULE_variableDeclarationNameEventSolidity = 23, RULE_variableDeclarationNameFunctionSolidity = 24, 
		RULE_variableDeclarationNameSolidity = 25, RULE_variableDeclarationSolidity = 26, 
		RULE_variableDeclarationList = 27, RULE_variableDeclaration = 28, RULE_initialiser = 29, 
		RULE_emptyStatement = 30, RULE_expressionStatement = 31, RULE_ifStatement = 32, 
		RULE_iterationStatement = 33, RULE_continueStatement = 34, RULE_breakStatement = 35, 
		RULE_returnStatement = 36, RULE_withStatement = 37, RULE_switchStatement = 38, 
		RULE_caseBlock = 39, RULE_caseClauses = 40, RULE_caseClause = 41, RULE_defaultClause = 42, 
		RULE_labelledStatement = 43, RULE_throwStatement = 44, RULE_tryStatement = 45, 
		RULE_catchProduction = 46, RULE_finallyProduction = 47, RULE_debuggerStatement = 48, 
		RULE_typeSolidityDataReturn = 49, RULE_formalParameterListGenericSolidityReturn = 50, 
		RULE_returnfunctionSolidity = 51, RULE_mappingStatement = 52, RULE_typeSolidityEvent = 53, 
		RULE_singletypeSolidityEvent = 54, RULE_typeSolidity = 55, RULE_singletypeSolidity = 56, 
		RULE_typeSolidityData = 57, RULE_keyWordSolidity = 58, RULE_timeUnitsSolidity = 59, 
		RULE_etherUnitsSolidity = 60, RULE_visibilityTypeSolidity = 61, RULE_usingDeclaration = 62, 
		RULE_modifierDeclaration = 63, RULE_usingType = 64, RULE_functionDeclaration = 65, 
		RULE_functionDeclarationInterface = 66, RULE_propertiesExtendFunctions = 67, 
		RULE_propertiesExtendFunction = 68, RULE_functionDeclarationFallBack = 69, 
		RULE_functionDeclarationAnonymous = 70, RULE_eventDeclaration = 71, RULE_formalParameterList = 72, 
		RULE_formalParameterListGenericSolidity = 73, RULE_formalParameterListSolidity = 74, 
		RULE_formalParameterListSolidityEvent = 75, RULE_functionBody = 76, RULE_arrayLiteral = 77, 
		RULE_elementList = 78, RULE_elision = 79, RULE_objectLiteral = 80, RULE_propertyNameAndValueList = 81, 
		RULE_propertyAssignment = 82, RULE_propertyName = 83, RULE_propertySetParameterList = 84, 
		RULE_arguments = 85, RULE_argumentList = 86, RULE_varSolidityDeclaration = 87, 
		RULE_expressionSequence = 88, RULE_singleExpression = 89, RULE_expressionSequenceParam = 90, 
		RULE_singleExpressionParam = 91, RULE_assignmentOperator = 92, RULE_literal = 93, 
		RULE_numericLiteral = 94, RULE_identifierName = 95, RULE_reservedWord = 96, 
		RULE_keyword = 97, RULE_getter = 98, RULE_setter = 99, RULE_eos = 100, 
		RULE_eof = 101;
	public static final String[] ruleNames = {
		"program", "sourceElements", "sourceElement", "varGlobalSolidity", "mappingGlobalSolidity", 
		"structGlobalSolidity", "enumGlobalSolidity", "valuesenumGlobalSolidity", 
		"sourceElementsFunctionSolidity", "sourceElementFunctionSolidity", "contractElements", 
		"contractElementGenerico", "importElement", "libraryElement", "contractElement", 
		"contractExtendElementConstructor", "contractExtendElement", "modifierExtendFunction", 
		"modifierExtendFunctionConstructor", "statement", "block", "statementList", 
		"variableDeclarationListFunctionSolidity", "variableDeclarationNameEventSolidity", 
		"variableDeclarationNameFunctionSolidity", "variableDeclarationNameSolidity", 
		"variableDeclarationSolidity", "variableDeclarationList", "variableDeclaration", 
		"initialiser", "emptyStatement", "expressionStatement", "ifStatement", 
		"iterationStatement", "continueStatement", "breakStatement", "returnStatement", 
		"withStatement", "switchStatement", "caseBlock", "caseClauses", "caseClause", 
		"defaultClause", "labelledStatement", "throwStatement", "tryStatement", 
		"catchProduction", "finallyProduction", "debuggerStatement", "typeSolidityDataReturn", 
		"formalParameterListGenericSolidityReturn", "returnfunctionSolidity", 
		"mappingStatement", "typeSolidityEvent", "singletypeSolidityEvent", "typeSolidity", 
		"singletypeSolidity", "typeSolidityData", "keyWordSolidity", "timeUnitsSolidity", 
		"etherUnitsSolidity", "visibilityTypeSolidity", "usingDeclaration", "modifierDeclaration", 
		"usingType", "functionDeclaration", "functionDeclarationInterface", "propertiesExtendFunctions", 
		"propertiesExtendFunction", "functionDeclarationFallBack", "functionDeclarationAnonymous", 
		"eventDeclaration", "formalParameterList", "formalParameterListGenericSolidity", 
		"formalParameterListSolidity", "formalParameterListSolidityEvent", "functionBody", 
		"arrayLiteral", "elementList", "elision", "objectLiteral", "propertyNameAndValueList", 
		"propertyAssignment", "propertyName", "propertySetParameterList", "arguments", 
		"argumentList", "varSolidityDeclaration", "expressionSequence", "singleExpression", 
		"expressionSequenceParam", "singleExpressionParam", "assignmentOperator", 
		"literal", "numericLiteral", "identifierName", "reservedWord", "keyword", 
		"getter", "setter", "eos", "eof"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'is'", "'=>'", "'contract'", "'import'", "'library'", "'_'", "'returns'", 
		"'var'", "'bool'", null, null, null, null, null, "'address'", null, null, 
		"'struct'", "'mapping'", "'enum'", "'modifier'", "'constant'", "'indexed'", 
		"'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'years'", "'now'", 
		"'wei'", "'finney'", "'szabo'", "'ether'", "'using'", "'event'", null, 
		null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'?'", 
		"':'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", 
		"'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", 
		"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", 
		"'|='", "'null'", null, null, null, null, "'break'", "'do'", "'instanceof'", 
		"'typeof'", "'case'", "'else'", "'new'", "'catch'", "'finally'", "'return'", 
		"'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
		"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
		"'in'", "'try'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Contract", "Import", "Library", "ModifierSoliditySymbol", 
		"ReturnsSolidity", "VarSolidity", "BoolSolidity", "BytesSolidity", "IntSolidity", 
		"UIntSolidity", "FixedSolidity", "UfixedSolidity", "AddressSolidity", 
		"HashSolidity", "StringSolidity", "StructSolidity", "MappingSolidity", 
		"EnumSolidity", "ModifierSolidity", "ConstantSolidity", "Indexed", "Seconds", 
		"Minutes", "Hours", "Days", "Weeks", "Years", "Now", "Wei", "Finney", 
		"Szabo", "Ether", "Using", "Event", "RegularExpressionLiteral", "LineTerminator", 
		"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
		"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
		"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
		"Divide", "Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", 
		"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
		"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
		"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case", 
		"Else", "New", "Catch", "Finally", "Return", "Void", "Continue", "For", 
		"Switch", "While", "Debugger", "Function", "This", "With", "Default", 
		"If", "Throw", "Delete", "In", "Try", "Implements", "Let", "Private", 
		"Public", "Interface", "Package", "Protected", "Inheritable", "External", 
		"Static", "Yield", "Identifier", "StringLiteral", "WhiteSpaces", "MultiLineComment", 
		"SingleLineComment", "NEWLINE", "WS", "UnexpectedCharacter"
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
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




		//protected void elVarGlobalSolidity() { } // blank implementations
		protected void elStructGlobalSolidity(Token identifier) { }
		protected void elEnumGlobalSolidity(Token identifier) { }
		protected void elUsingDeclaration(Token identifier) { }
		protected void elModifierDeclaration(Token identifier) { }
		protected void elEventDeclaration(Token identifier) { }
		protected void elFunctionDeclaration(Token identifier) { }
		protected void elFunctionDeclarationFallBack() { }
		protected void elFunctionDeclarationInterface(Token identifier) { }
		protected void elFunctionDeclarationAnonymous() { }
		protected void elSingleExpressionIdentifier(Token identifier) { }


		/**
		 * Returns {@code true} iff on the current index of the parser's
		 * token stream a token of the given {@code type} exists on the
		 * {@code HIDDEN} channel.
		 *
		 * @param type
		 *         the type of the token on the {@code HIDDEN} channel
		 *         to check.
		 *
		 * ...
		 */
		private boolean here(final int type) {

		      int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
		        Token ahead = _input.get(possibleIndexEosToken);
		        // Check if the token resides on the Hidden channel and if it's of the
		        // provided type.
		        return (ahead.getChannel() == Lexer.HIDDEN) && (ahead.getType() == type);


		}

		/**
		 * Returns {@code true} iff on the current index of the parser's
		 * token stream a token exists on the {@code HIDDEN} channel which
		 * either is a line terminator, or is a multi line comment that
		 * contains a line terminator.
		 *
		 * ...
		 */
		private boolean lineTerminatorAhead() {

			  // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);
	        if (ahead.getChannel() != Lexer.HIDDEN) {
	            // We're only interested in tokens on the Hidden channel.
	            return false;
	        }

	        if (ahead.getType() == LineTerminator) {
	            // There is definitely a line terminator ahead.
	            return true;
	        }

	        if (ahead.getType() == WhiteSpaces) {
	            // Get the token ahead of the current whitespaces.
	            possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
	            ahead = _input.get(possibleIndexEosToken);
	        }

	        // Get the token's text and type.
	        String text = ahead.getText();
	        int type = ahead.getType();

	        // Check if the token is, or contains a line terminator.
	        return (type == MultiLineComment && (text.contains("\r") || text.contains("\n"))) ||
	                (type == LineTerminator);

		}



	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public ContractElementsContext contractElements() {
			return getRuleContext(ContractElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Contract) | (1L << Import) | (1L << Library))) != 0)) {
				{
				setState(204);
				contractElements();
				}
			}

			setState(207);
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

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				sourceElement();
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << StructSolidity) | (1L << MappingSolidity) | (1L << EnumSolidity) | (1L << ModifierSolidity) | (1L << Using) | (1L << Event))) != 0) || _la==Function || _la==Identifier );
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

	public static class SourceElementContext extends ParserRuleContext {
		public VarGlobalSolidityContext varGlobalSolidity() {
			return getRuleContext(VarGlobalSolidityContext.class,0);
		}
		public MappingGlobalSolidityContext mappingGlobalSolidity() {
			return getRuleContext(MappingGlobalSolidityContext.class,0);
		}
		public StructGlobalSolidityContext structGlobalSolidity() {
			return getRuleContext(StructGlobalSolidityContext.class,0);
		}
		public EnumGlobalSolidityContext enumGlobalSolidity() {
			return getRuleContext(EnumGlobalSolidityContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public ModifierDeclarationContext modifierDeclaration() {
			return getRuleContext(ModifierDeclarationContext.class,0);
		}
		public EventDeclarationContext eventDeclaration() {
			return getRuleContext(EventDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclarationFallBackContext functionDeclarationFallBack() {
			return getRuleContext(FunctionDeclarationFallBackContext.class,0);
		}
		public FunctionDeclarationInterfaceContext functionDeclarationInterface() {
			return getRuleContext(FunctionDeclarationInterfaceContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public FunctionDeclarationAnonymousContext functionDeclarationAnonymous() {
			return getRuleContext(FunctionDeclarationAnonymousContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceElement);
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				varGlobalSolidity();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				mappingGlobalSolidity();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				structGlobalSolidity();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				enumGlobalSolidity();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				usingDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				modifierDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				eventDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				functionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				functionDeclarationFallBack();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(223);
				functionDeclarationInterface();
				setState(224);
				emptyStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				functionDeclarationAnonymous();
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

	public static class VarGlobalSolidityContext extends ParserRuleContext {
		public VarSolidityDeclarationContext varSolidityDeclaration() {
			return getRuleContext(VarSolidityDeclarationContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public VarGlobalSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varGlobalSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVarGlobalSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVarGlobalSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVarGlobalSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarGlobalSolidityContext varGlobalSolidity() throws RecognitionException {
		VarGlobalSolidityContext _localctx = new VarGlobalSolidityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varGlobalSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			varSolidityDeclaration();
			setState(232);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(230);
				match(Assign);
				setState(231);
				expressionStatement();
				}
			}

			setState(234);
			emptyStatement();
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

	public static class MappingGlobalSolidityContext extends ParserRuleContext {
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public VisibilityTypeSolidityContext visibilityTypeSolidity() {
			return getRuleContext(VisibilityTypeSolidityContext.class,0);
		}
		public MappingGlobalSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingGlobalSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMappingGlobalSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMappingGlobalSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMappingGlobalSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingGlobalSolidityContext mappingGlobalSolidity() throws RecognitionException {
		MappingGlobalSolidityContext _localctx = new MappingGlobalSolidityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mappingGlobalSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			mappingStatement();
			setState(238);
			_la = _input.LA(1);
			if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)))) != 0)) {
				{
				setState(237);
				visibilityTypeSolidity();
				}
			}

			setState(240);
			match(Identifier);
			setState(241);
			emptyStatement();
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

	public static class StructGlobalSolidityContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode StructSolidity() { return getToken(SolidityParser.StructSolidity, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public List<VariableDeclarationNameSolidityContext> variableDeclarationNameSolidity() {
			return getRuleContexts(VariableDeclarationNameSolidityContext.class);
		}
		public VariableDeclarationNameSolidityContext variableDeclarationNameSolidity(int i) {
			return getRuleContext(VariableDeclarationNameSolidityContext.class,i);
		}
		public StructGlobalSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structGlobalSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructGlobalSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructGlobalSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStructGlobalSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructGlobalSolidityContext structGlobalSolidity() throws RecognitionException {
		StructGlobalSolidityContext _localctx = new StructGlobalSolidityContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structGlobalSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(StructSolidity);
			setState(244);
			((StructGlobalSolidityContext)_localctx).Identifier = match(Identifier);
			setState(245);
			match(OpenBrace);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << StructSolidity) | (1L << MappingSolidity))) != 0) || _la==Identifier) {
				{
				{
				setState(246);
				variableDeclarationNameSolidity();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(CloseBrace);
			elStructGlobalSolidity(((StructGlobalSolidityContext)_localctx).Identifier);
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

	public static class EnumGlobalSolidityContext extends ParserRuleContext {
		public TerminalNode EnumSolidity() { return getToken(SolidityParser.EnumSolidity, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public ValuesenumGlobalSolidityContext valuesenumGlobalSolidity() {
			return getRuleContext(ValuesenumGlobalSolidityContext.class,0);
		}
		public EnumGlobalSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumGlobalSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumGlobalSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumGlobalSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumGlobalSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumGlobalSolidityContext enumGlobalSolidity() throws RecognitionException {
		EnumGlobalSolidityContext _localctx = new EnumGlobalSolidityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumGlobalSolidity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(EnumSolidity);
			setState(256);
			match(Identifier);
			setState(257);
			match(OpenBrace);
			setState(258);
			valuesenumGlobalSolidity();
			setState(259);
			match(CloseBrace);
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

	public static class ValuesenumGlobalSolidityContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public ValuesenumGlobalSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesenumGlobalSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValuesenumGlobalSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValuesenumGlobalSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitValuesenumGlobalSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesenumGlobalSolidityContext valuesenumGlobalSolidity() throws RecognitionException {
		ValuesenumGlobalSolidityContext _localctx = new ValuesenumGlobalSolidityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valuesenumGlobalSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(Identifier);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(262);
				match(Comma);
				setState(263);
				match(Identifier);
				}
				}
				setState(268);
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

	public static class SourceElementsFunctionSolidityContext extends ParserRuleContext {
		public List<SourceElementFunctionSolidityContext> sourceElementFunctionSolidity() {
			return getRuleContexts(SourceElementFunctionSolidityContext.class);
		}
		public SourceElementFunctionSolidityContext sourceElementFunctionSolidity(int i) {
			return getRuleContext(SourceElementFunctionSolidityContext.class,i);
		}
		public SourceElementsFunctionSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElementsFunctionSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceElementsFunctionSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceElementsFunctionSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceElementsFunctionSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsFunctionSolidityContext sourceElementsFunctionSolidity() throws RecognitionException {
		SourceElementsFunctionSolidityContext _localctx = new SourceElementsFunctionSolidityContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sourceElementsFunctionSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				sourceElementFunctionSolidity();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Break - 87)) | (1L << (Do - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Return - 87)) | (1L << (Void - 87)) | (1L << (Continue - 87)) | (1L << (For - 87)) | (1L << (Switch - 87)) | (1L << (While - 87)) | (1L << (Debugger - 87)) | (1L << (This - 87)) | (1L << (With - 87)) | (1L << (If - 87)) | (1L << (Throw - 87)) | (1L << (Delete - 87)) | (1L << (Try - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0) );
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

	public static class SourceElementFunctionSolidityContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceElementFunctionSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElementFunctionSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceElementFunctionSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceElementFunctionSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceElementFunctionSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementFunctionSolidityContext sourceElementFunctionSolidity() throws RecognitionException {
		SourceElementFunctionSolidityContext _localctx = new SourceElementFunctionSolidityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sourceElementFunctionSolidity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			statement();
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

	public static class ContractElementsContext extends ParserRuleContext {
		public List<ContractElementGenericoContext> contractElementGenerico() {
			return getRuleContexts(ContractElementGenericoContext.class);
		}
		public ContractElementGenericoContext contractElementGenerico(int i) {
			return getRuleContext(ContractElementGenericoContext.class,i);
		}
		public ContractElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractElementsContext contractElements() throws RecognitionException {
		ContractElementsContext _localctx = new ContractElementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contractElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				contractElementGenerico();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Contract) | (1L << Import) | (1L << Library))) != 0) );
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

	public static class ContractElementGenericoContext extends ParserRuleContext {
		public ImportElementContext importElement() {
			return getRuleContext(ImportElementContext.class,0);
		}
		public LibraryElementContext libraryElement() {
			return getRuleContext(LibraryElementContext.class,0);
		}
		public ContractElementContext contractElement() {
			return getRuleContext(ContractElementContext.class,0);
		}
		public ContractElementGenericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractElementGenerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractElementGenerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractElementGenerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractElementGenerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractElementGenericoContext contractElementGenerico() throws RecognitionException {
		ContractElementGenericoContext _localctx = new ContractElementGenericoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractElementGenerico);
		try {
			setState(284);
			switch (_input.LA(1)) {
			case Import:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				importElement();
				}
				break;
			case Library:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				libraryElement();
				}
				break;
			case Contract:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				contractElement();
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

	public static class ImportElementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(SolidityParser.Import, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportElementContext importElement() throws RecognitionException {
		ImportElementContext _localctx = new ImportElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(Import);
			setState(287);
			match(StringLiteral);
			setState(288);
			eos();
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

	public static class LibraryElementContext extends ParserRuleContext {
		public TerminalNode Library() { return getToken(SolidityParser.Library, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public LibraryElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLibraryElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLibraryElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLibraryElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryElementContext libraryElement() throws RecognitionException {
		LibraryElementContext _localctx = new LibraryElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_libraryElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(Library);
			setState(291);
			match(Identifier);
			setState(292);
			match(OpenBrace);
			setState(294);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << StructSolidity) | (1L << MappingSolidity) | (1L << EnumSolidity) | (1L << ModifierSolidity) | (1L << Using) | (1L << Event))) != 0) || _la==Function || _la==Identifier) {
				{
				setState(293);
				sourceElements();
				}
			}

			setState(296);
			match(CloseBrace);
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

	public static class ContractElementContext extends ParserRuleContext {
		public TerminalNode Contract() { return getToken(SolidityParser.Contract, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public ContractExtendElementContext contractExtendElement() {
			return getRuleContext(ContractExtendElementContext.class,0);
		}
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ContractElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractElementContext contractElement() throws RecognitionException {
		ContractElementContext _localctx = new ContractElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_contractElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(Contract);
			setState(299);
			match(Identifier);
			setState(301);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(300);
				contractExtendElement();
				}
			}

			setState(303);
			match(OpenBrace);
			setState(305);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << StructSolidity) | (1L << MappingSolidity) | (1L << EnumSolidity) | (1L << ModifierSolidity) | (1L << Using) | (1L << Event))) != 0) || _la==Function || _la==Identifier) {
				{
				setState(304);
				sourceElements();
				}
			}

			setState(307);
			match(CloseBrace);
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

	public static class ContractExtendElementConstructorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ContractExtendElementConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractExtendElementConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractExtendElementConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractExtendElementConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractExtendElementConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractExtendElementConstructorContext contractExtendElementConstructor() throws RecognitionException {
		ContractExtendElementConstructorContext _localctx = new ContractExtendElementConstructorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_contractExtendElementConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(Identifier);
			setState(311);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(310);
				arguments();
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

	public static class ContractExtendElementContext extends ParserRuleContext {
		public List<ContractExtendElementConstructorContext> contractExtendElementConstructor() {
			return getRuleContexts(ContractExtendElementConstructorContext.class);
		}
		public ContractExtendElementConstructorContext contractExtendElementConstructor(int i) {
			return getRuleContext(ContractExtendElementConstructorContext.class,i);
		}
		public ContractExtendElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractExtendElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractExtendElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractExtendElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractExtendElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractExtendElementContext contractExtendElement() throws RecognitionException {
		ContractExtendElementContext _localctx = new ContractExtendElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_contractExtendElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__0);
			setState(314);
			contractExtendElementConstructor();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(315);
				match(Comma);
				setState(316);
				contractExtendElementConstructor();
				}
				}
				setState(321);
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

	public static class ModifierExtendFunctionContext extends ParserRuleContext {
		public List<ModifierExtendFunctionConstructorContext> modifierExtendFunctionConstructor() {
			return getRuleContexts(ModifierExtendFunctionConstructorContext.class);
		}
		public ModifierExtendFunctionConstructorContext modifierExtendFunctionConstructor(int i) {
			return getRuleContext(ModifierExtendFunctionConstructorContext.class,i);
		}
		public ModifierExtendFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierExtendFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierExtendFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierExtendFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierExtendFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierExtendFunctionContext modifierExtendFunction() throws RecognitionException {
		ModifierExtendFunctionContext _localctx = new ModifierExtendFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifierExtendFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(322);
					modifierExtendFunctionConstructor();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(325); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ModifierExtendFunctionConstructorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ModifierExtendFunctionConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierExtendFunctionConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierExtendFunctionConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierExtendFunctionConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierExtendFunctionConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierExtendFunctionConstructorContext modifierExtendFunctionConstructor() throws RecognitionException {
		ModifierExtendFunctionConstructorContext _localctx = new ModifierExtendFunctionConstructorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modifierExtendFunctionConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(Identifier);
			setState(329);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(328);
				arguments();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				iterationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				continueStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				breakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(337);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(338);
				withStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(339);
				labelledStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(340);
				switchStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(341);
				throwStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(342);
				tryStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(343);
				debuggerStatement();
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

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(OpenBrace);
			setState(348);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Break - 87)) | (1L << (Do - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Return - 87)) | (1L << (Void - 87)) | (1L << (Continue - 87)) | (1L << (For - 87)) | (1L << (Switch - 87)) | (1L << (While - 87)) | (1L << (Debugger - 87)) | (1L << (This - 87)) | (1L << (With - 87)) | (1L << (If - 87)) | (1L << (Throw - 87)) | (1L << (Delete - 87)) | (1L << (Try - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(347);
				statementList();
				}
			}

			setState(350);
			match(CloseBrace);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(352);
				statement();
				}
				}
				setState(355); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Break - 87)) | (1L << (Do - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Return - 87)) | (1L << (Void - 87)) | (1L << (Continue - 87)) | (1L << (For - 87)) | (1L << (Switch - 87)) | (1L << (While - 87)) | (1L << (Debugger - 87)) | (1L << (This - 87)) | (1L << (With - 87)) | (1L << (If - 87)) | (1L << (Throw - 87)) | (1L << (Delete - 87)) | (1L << (Try - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0) );
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

	public static class VariableDeclarationListFunctionSolidityContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public VariableDeclarationListFunctionSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationListFunctionSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationListFunctionSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationListFunctionSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationListFunctionSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListFunctionSolidityContext variableDeclarationListFunctionSolidity() throws RecognitionException {
		VariableDeclarationListFunctionSolidityContext _localctx = new VariableDeclarationListFunctionSolidityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableDeclarationListFunctionSolidity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			expressionSequence();
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

	public static class VariableDeclarationNameEventSolidityContext extends ParserRuleContext {
		public TypeSolidityEventContext typeSolidityEvent() {
			return getRuleContext(TypeSolidityEventContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public VariableDeclarationNameEventSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationNameEventSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationNameEventSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationNameEventSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationNameEventSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationNameEventSolidityContext variableDeclarationNameEventSolidity() throws RecognitionException {
		VariableDeclarationNameEventSolidityContext _localctx = new VariableDeclarationNameEventSolidityContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarationNameEventSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			typeSolidityEvent();
			setState(361);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(360);
				match(Identifier);
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

	public static class VariableDeclarationNameFunctionSolidityContext extends ParserRuleContext {
		public TypeSolidityContext typeSolidity() {
			return getRuleContext(TypeSolidityContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public TerminalNode StructSolidity() { return getToken(SolidityParser.StructSolidity, 0); }
		public VariableDeclarationNameFunctionSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationNameFunctionSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationNameFunctionSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationNameFunctionSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationNameFunctionSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationNameFunctionSolidityContext variableDeclarationNameFunctionSolidity() throws RecognitionException {
		VariableDeclarationNameFunctionSolidityContext _localctx = new VariableDeclarationNameFunctionSolidityContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDeclarationNameFunctionSolidity);
		try {
			setState(371);
			switch (_input.LA(1)) {
			case VarSolidity:
			case BoolSolidity:
			case BytesSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
			case HashSolidity:
			case StringSolidity:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				typeSolidity();
				setState(364);
				match(Identifier);
				}
				break;
			case MappingSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				mappingStatement();
				setState(367);
				match(Identifier);
				}
				break;
			case StructSolidity:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(StructSolidity);
				setState(370);
				match(Identifier);
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

	public static class VariableDeclarationNameSolidityContext extends ParserRuleContext {
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public TerminalNode StructSolidity() { return getToken(SolidityParser.StructSolidity, 0); }
		public SingletypeSolidityContext singletypeSolidity() {
			return getRuleContext(SingletypeSolidityContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public VariableDeclarationNameSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationNameSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationNameSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationNameSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationNameSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationNameSolidityContext variableDeclarationNameSolidity() throws RecognitionException {
		VariableDeclarationNameSolidityContext _localctx = new VariableDeclarationNameSolidityContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableDeclarationNameSolidity);
		int _la;
		try {
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				mappingStatement();
				setState(374);
				match(Identifier);
				setState(375);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(StructSolidity);
				setState(378);
				match(Identifier);
				setState(379);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(Identifier);
				setState(381);
				match(Identifier);
				setState(382);
				match(SemiColon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				singletypeSolidity();
				setState(384);
				match(Identifier);
				setState(385);
				match(SemiColon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				singletypeSolidity();
				setState(388);
				match(OpenBracket);
				setState(390);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(389);
					expressionSequence();
					}
				}

				setState(392);
				match(CloseBracket);
				setState(393);
				match(Identifier);
				setState(394);
				match(SemiColon);
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

	public static class VariableDeclarationSolidityContext extends ParserRuleContext {
		public TypeSolidityContext typeSolidity() {
			return getRuleContext(TypeSolidityContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public TerminalNode StructSolidity() { return getToken(SolidityParser.StructSolidity, 0); }
		public VariableDeclarationSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationSolidityContext variableDeclarationSolidity() throws RecognitionException {
		VariableDeclarationSolidityContext _localctx = new VariableDeclarationSolidityContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableDeclarationSolidity);
		int _la;
		try {
			setState(410);
			switch (_input.LA(1)) {
			case VarSolidity:
			case BoolSolidity:
			case BytesSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
			case HashSolidity:
			case StringSolidity:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				typeSolidity();
				setState(400);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(399);
					match(Identifier);
					}
				}

				}
				break;
			case MappingSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				mappingStatement();
				setState(404);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(403);
					match(Identifier);
					}
				}

				}
				break;
			case StructSolidity:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(StructSolidity);
				setState(408);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(407);
					match(Identifier);
					}
				}

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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			variableDeclaration();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(413);
				match(Comma);
				setState(414);
				variableDeclaration();
				}
				}
				setState(419);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(Identifier);
			setState(422);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(421);
				initialiser();
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

	public static class InitialiserContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInitialiser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInitialiser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInitialiser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(Assign);
			setState(425);
			singleExpression(0);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(SolidityParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(SemiColon);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			expressionSequence();
			setState(431);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(430);
				emptyStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SolidityParser.If, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SolidityParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(If);
			setState(434);
			match(OpenParen);
			setState(435);
			expressionSequence();
			setState(436);
			match(CloseParen);
			setState(437);
			statement();
			setState(440);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(438);
				match(Else);
				setState(439);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(SolidityParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public SingletypeSolidityContext singletypeSolidity() {
			return getRuleContext(SingletypeSolidityContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public SingletypeSolidityContext singletypeSolidity() {
			return getRuleContext(SingletypeSolidityContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(SolidityParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForVarInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForVarInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForVarInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode In() { return getToken(SolidityParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_iterationStatement);
		int _la;
		try {
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(Do);
				setState(443);
				statement();
				setState(444);
				match(While);
				setState(445);
				match(OpenParen);
				setState(446);
				expressionSequence();
				setState(447);
				match(CloseParen);
				setState(448);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(While);
				setState(451);
				match(OpenParen);
				setState(452);
				expressionSequence();
				setState(453);
				match(CloseParen);
				setState(454);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(For);
				setState(457);
				match(OpenParen);
				setState(459);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(458);
					expressionSequence();
					}
				}

				setState(461);
				match(SemiColon);
				setState(463);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(462);
					expressionSequence();
					}
				}

				setState(465);
				match(SemiColon);
				setState(467);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(466);
					expressionSequence();
					}
				}

				setState(469);
				match(CloseParen);
				setState(470);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(For);
				setState(472);
				match(OpenParen);
				setState(473);
				singletypeSolidity();
				setState(474);
				variableDeclarationList();
				setState(475);
				match(SemiColon);
				setState(477);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(476);
					expressionSequence();
					}
				}

				setState(479);
				match(SemiColon);
				setState(481);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(480);
					expressionSequence();
					}
				}

				setState(483);
				match(CloseParen);
				setState(484);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				match(For);
				setState(487);
				match(OpenParen);
				setState(488);
				singleExpression(0);
				setState(489);
				match(In);
				setState(490);
				expressionSequence();
				setState(491);
				match(CloseParen);
				setState(492);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(494);
				match(For);
				setState(495);
				match(OpenParen);
				setState(496);
				singletypeSolidity();
				setState(497);
				variableDeclaration();
				setState(498);
				match(In);
				setState(499);
				expressionSequence();
				setState(500);
				match(CloseParen);
				setState(501);
				statement();
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(SolidityParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(Continue);
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(506);
				match(Identifier);
				}
				break;
			}
			setState(509);
			eos();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SolidityParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(Break);
			setState(513);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(512);
				match(Identifier);
				}
				break;
			}
			setState(515);
			eos();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SolidityParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(Return);
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(518);
				expressionSequence();
				}
				break;
			}
			setState(521);
			eos();
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

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(SolidityParser.With, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(With);
			setState(524);
			match(OpenParen);
			setState(525);
			expressionSequence();
			setState(526);
			match(CloseParen);
			setState(527);
			statement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(SolidityParser.Switch, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(Switch);
			setState(530);
			match(OpenParen);
			setState(531);
			expressionSequence();
			setState(532);
			match(CloseParen);
			setState(533);
			caseBlock();
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

	public static class CaseBlockContext extends ParserRuleContext {
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(OpenBrace);
			setState(537);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(536);
				caseClauses();
				}
			}

			setState(543);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(539);
				defaultClause();
				setState(541);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(540);
					caseClauses();
					}
				}

				}
			}

			setState(545);
			match(CloseBrace);
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

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(547);
				caseClause();
				}
				}
				setState(550); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
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

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(SolidityParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(Case);
			setState(553);
			expressionSequence();
			setState(554);
			match(Colon);
			setState(556);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Break - 87)) | (1L << (Do - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Return - 87)) | (1L << (Void - 87)) | (1L << (Continue - 87)) | (1L << (For - 87)) | (1L << (Switch - 87)) | (1L << (While - 87)) | (1L << (Debugger - 87)) | (1L << (This - 87)) | (1L << (With - 87)) | (1L << (If - 87)) | (1L << (Throw - 87)) | (1L << (Delete - 87)) | (1L << (Try - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(555);
				statementList();
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

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(SolidityParser.Default, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(Default);
			setState(559);
			match(Colon);
			setState(561);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Break - 87)) | (1L << (Do - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Return - 87)) | (1L << (Void - 87)) | (1L << (Continue - 87)) | (1L << (For - 87)) | (1L << (Switch - 87)) | (1L << (While - 87)) | (1L << (Debugger - 87)) | (1L << (This - 87)) | (1L << (With - 87)) | (1L << (If - 87)) | (1L << (Throw - 87)) | (1L << (Delete - 87)) | (1L << (Try - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(560);
				statementList();
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

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(Identifier);
			setState(564);
			match(Colon);
			setState(565);
			statement();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(SolidityParser.Throw, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(Throw);
			setState(568);
			eos();
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

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(SolidityParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tryStatement);
		try {
			setState(583);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(Try);
				setState(571);
				block();
				setState(572);
				catchProduction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(Try);
				setState(575);
				block();
				setState(576);
				finallyProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(Try);
				setState(579);
				block();
				setState(580);
				catchProduction();
				setState(581);
				finallyProduction();
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

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(SolidityParser.Catch, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCatchProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCatchProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_catchProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(Catch);
			setState(586);
			match(OpenParen);
			setState(587);
			match(Identifier);
			setState(588);
			match(CloseParen);
			setState(589);
			block();
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

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(SolidityParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFinallyProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFinallyProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(Finally);
			setState(592);
			block();
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

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(SolidityParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDebuggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDebuggerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDebuggerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(Debugger);
			setState(595);
			eos();
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

	public static class TypeSolidityDataReturnContext extends ParserRuleContext {
		public List<TypeSolidityDataContext> typeSolidityData() {
			return getRuleContexts(TypeSolidityDataContext.class);
		}
		public TypeSolidityDataContext typeSolidityData(int i) {
			return getRuleContext(TypeSolidityDataContext.class,i);
		}
		public TypeSolidityDataReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSolidityDataReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeSolidityDataReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeSolidityDataReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeSolidityDataReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSolidityDataReturnContext typeSolidityDataReturn() throws RecognitionException {
		TypeSolidityDataReturnContext _localctx = new TypeSolidityDataReturnContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeSolidityDataReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			typeSolidityData();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(598);
				match(Comma);
				setState(599);
				typeSolidityData();
				}
				}
				setState(604);
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

	public static class FormalParameterListGenericSolidityReturnContext extends ParserRuleContext {
		public FormalParameterListGenericSolidityContext formalParameterListGenericSolidity() {
			return getRuleContext(FormalParameterListGenericSolidityContext.class,0);
		}
		public TypeSolidityDataReturnContext typeSolidityDataReturn() {
			return getRuleContext(TypeSolidityDataReturnContext.class,0);
		}
		public FormalParameterListGenericSolidityReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterListGenericSolidityReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFormalParameterListGenericSolidityReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFormalParameterListGenericSolidityReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFormalParameterListGenericSolidityReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListGenericSolidityReturnContext formalParameterListGenericSolidityReturn() throws RecognitionException {
		FormalParameterListGenericSolidityReturnContext _localctx = new FormalParameterListGenericSolidityReturnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameterListGenericSolidityReturn);
		int _la;
		try {
			setState(611);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << RegularExpressionLiteral) | (1L << OpenBracket))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(605);
					formalParameterListGenericSolidity();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity))) != 0)) {
					{
					setState(608);
					typeSolidityDataReturn();
					}
				}

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

	public static class ReturnfunctionSolidityContext extends ParserRuleContext {
		public TerminalNode ReturnsSolidity() { return getToken(SolidityParser.ReturnsSolidity, 0); }
		public FormalParameterListGenericSolidityReturnContext formalParameterListGenericSolidityReturn() {
			return getRuleContext(FormalParameterListGenericSolidityReturnContext.class,0);
		}
		public ReturnfunctionSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnfunctionSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnfunctionSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnfunctionSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnfunctionSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnfunctionSolidityContext returnfunctionSolidity() throws RecognitionException {
		ReturnfunctionSolidityContext _localctx = new ReturnfunctionSolidityContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_returnfunctionSolidity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(ReturnsSolidity);
			setState(614);
			match(OpenParen);
			setState(615);
			formalParameterListGenericSolidityReturn();
			setState(616);
			match(CloseParen);
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

	public static class MappingStatementContext extends ParserRuleContext {
		public TerminalNode MappingSolidity() { return getToken(SolidityParser.MappingSolidity, 0); }
		public List<TypeSolidityContext> typeSolidity() {
			return getRuleContexts(TypeSolidityContext.class);
		}
		public TypeSolidityContext typeSolidity(int i) {
			return getRuleContext(TypeSolidityContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public MappingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMappingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMappingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMappingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingStatementContext mappingStatement() throws RecognitionException {
		MappingStatementContext _localctx = new MappingStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_mappingStatement);
		try {
			setState(639);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(MappingSolidity);
				setState(619);
				match(OpenParen);
				setState(620);
				typeSolidity();
				setState(621);
				match(T__1);
				setState(622);
				typeSolidity();
				setState(623);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(MappingSolidity);
				setState(626);
				match(OpenParen);
				setState(627);
				typeSolidity();
				setState(628);
				match(T__1);
				setState(629);
				match(Identifier);
				setState(630);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(MappingSolidity);
				setState(633);
				match(OpenParen);
				setState(634);
				typeSolidity();
				setState(635);
				match(T__1);
				setState(636);
				mappingStatement();
				setState(637);
				match(CloseParen);
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

	public static class TypeSolidityEventContext extends ParserRuleContext {
		public SingletypeSolidityEventContext singletypeSolidityEvent() {
			return getRuleContext(SingletypeSolidityEventContext.class,0);
		}
		public TypeSolidityEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSolidityEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeSolidityEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeSolidityEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeSolidityEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSolidityEventContext typeSolidityEvent() throws RecognitionException {
		TypeSolidityEventContext _localctx = new TypeSolidityEventContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeSolidityEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			singletypeSolidityEvent();
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

	public static class SingletypeSolidityEventContext extends ParserRuleContext {
		public TerminalNode BoolSolidity() { return getToken(SolidityParser.BoolSolidity, 0); }
		public TerminalNode Indexed() { return getToken(SolidityParser.Indexed, 0); }
		public TerminalNode IntSolidity() { return getToken(SolidityParser.IntSolidity, 0); }
		public TerminalNode UIntSolidity() { return getToken(SolidityParser.UIntSolidity, 0); }
		public TerminalNode FixedSolidity() { return getToken(SolidityParser.FixedSolidity, 0); }
		public TerminalNode UfixedSolidity() { return getToken(SolidityParser.UfixedSolidity, 0); }
		public TerminalNode VarSolidity() { return getToken(SolidityParser.VarSolidity, 0); }
		public TerminalNode StringSolidity() { return getToken(SolidityParser.StringSolidity, 0); }
		public TerminalNode AddressSolidity() { return getToken(SolidityParser.AddressSolidity, 0); }
		public SingletypeSolidityEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singletypeSolidityEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSingletypeSolidityEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSingletypeSolidityEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSingletypeSolidityEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingletypeSolidityEventContext singletypeSolidityEvent() throws RecognitionException {
		SingletypeSolidityEventContext _localctx = new SingletypeSolidityEventContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_singletypeSolidityEvent);
		int _la;
		try {
			setState(675);
			switch (_input.LA(1)) {
			case BoolSolidity:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(BoolSolidity);
				setState(645);
				_la = _input.LA(1);
				if (_la==Indexed) {
					{
					setState(644);
					match(Indexed);
					}
				}

				}
				break;
			case IntSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(IntSolidity);
				setState(649);
				_la = _input.LA(1);
				if (_la==Indexed) {
					{
					setState(648);
					match(Indexed);
					}
				}

				}
				break;
			case UIntSolidity:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				match(UIntSolidity);
				setState(653);
				_la = _input.LA(1);
				if (_la==Indexed) {
					{
					setState(652);
					match(Indexed);
					}
				}

				}
				break;
			case FixedSolidity:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				match(FixedSolidity);
				setState(657);
				_la = _input.LA(1);
				if (_la==Indexed) {
					{
					setState(656);
					match(Indexed);
					}
				}

				}
				break;
			case UfixedSolidity:
				enterOuterAlt(_localctx, 5);
				{
				setState(659);
				match(UfixedSolidity);
				setState(661);
				_la = _input.LA(1);
				if (_la==Indexed) {
					{
					setState(660);
					match(Indexed);
					}
				}

				}
				break;
			case VarSolidity:
				enterOuterAlt(_localctx, 6);
				{
				setState(663);
				match(VarSolidity);
				setState(665);
				_la = _input.LA(1);
				if (_la==Indexed) {
					{
					setState(664);
					match(Indexed);
					}
				}

				}
				break;
			case StringSolidity:
				enterOuterAlt(_localctx, 7);
				{
				setState(667);
				match(StringSolidity);
				setState(669);
				_la = _input.LA(1);
				if (_la==Indexed) {
					{
					setState(668);
					match(Indexed);
					}
				}

				}
				break;
			case AddressSolidity:
				enterOuterAlt(_localctx, 8);
				{
				setState(671);
				match(AddressSolidity);
				setState(673);
				_la = _input.LA(1);
				if (_la==Indexed) {
					{
					setState(672);
					match(Indexed);
					}
				}

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

	public static class TypeSolidityContext extends ParserRuleContext {
		public SingletypeSolidityContext singletypeSolidity() {
			return getRuleContext(SingletypeSolidityContext.class,0);
		}
		public TypeSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSolidityContext typeSolidity() throws RecognitionException {
		TypeSolidityContext _localctx = new TypeSolidityContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeSolidity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			singletypeSolidity();
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

	public static class SingletypeSolidityContext extends ParserRuleContext {
		public TypeSolidityDataContext typeSolidityData() {
			return getRuleContext(TypeSolidityDataContext.class,0);
		}
		public VisibilityTypeSolidityContext visibilityTypeSolidity() {
			return getRuleContext(VisibilityTypeSolidityContext.class,0);
		}
		public SingletypeSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singletypeSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSingletypeSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSingletypeSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSingletypeSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingletypeSolidityContext singletypeSolidity() throws RecognitionException {
		SingletypeSolidityContext _localctx = new SingletypeSolidityContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_singletypeSolidity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			typeSolidityData();
			setState(681);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(680);
				visibilityTypeSolidity();
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

	public static class TypeSolidityDataContext extends ParserRuleContext {
		public TerminalNode BoolSolidity() { return getToken(SolidityParser.BoolSolidity, 0); }
		public TerminalNode BytesSolidity() { return getToken(SolidityParser.BytesSolidity, 0); }
		public TerminalNode IntSolidity() { return getToken(SolidityParser.IntSolidity, 0); }
		public TerminalNode UIntSolidity() { return getToken(SolidityParser.UIntSolidity, 0); }
		public TerminalNode FixedSolidity() { return getToken(SolidityParser.FixedSolidity, 0); }
		public TerminalNode UfixedSolidity() { return getToken(SolidityParser.UfixedSolidity, 0); }
		public TerminalNode VarSolidity() { return getToken(SolidityParser.VarSolidity, 0); }
		public TerminalNode StringSolidity() { return getToken(SolidityParser.StringSolidity, 0); }
		public TerminalNode AddressSolidity() { return getToken(SolidityParser.AddressSolidity, 0); }
		public TerminalNode HashSolidity() { return getToken(SolidityParser.HashSolidity, 0); }
		public TypeSolidityDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSolidityData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeSolidityData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeSolidityData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeSolidityData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSolidityDataContext typeSolidityData() throws RecognitionException {
		TypeSolidityDataContext _localctx = new TypeSolidityDataContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeSolidityData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity))) != 0)) ) {
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

	public static class KeyWordSolidityContext extends ParserRuleContext {
		public VisibilityTypeSolidityContext visibilityTypeSolidity() {
			return getRuleContext(VisibilityTypeSolidityContext.class,0);
		}
		public TypeSolidityDataContext typeSolidityData() {
			return getRuleContext(TypeSolidityDataContext.class,0);
		}
		public TerminalNode EnumSolidity() { return getToken(SolidityParser.EnumSolidity, 0); }
		public TerminalNode ModifierSoliditySymbol() { return getToken(SolidityParser.ModifierSoliditySymbol, 0); }
		public TerminalNode Indexed() { return getToken(SolidityParser.Indexed, 0); }
		public TimeUnitsSolidityContext timeUnitsSolidity() {
			return getRuleContext(TimeUnitsSolidityContext.class,0);
		}
		public EtherUnitsSolidityContext etherUnitsSolidity() {
			return getRuleContext(EtherUnitsSolidityContext.class,0);
		}
		public KeyWordSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyWordSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterKeyWordSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitKeyWordSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitKeyWordSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyWordSolidityContext keyWordSolidity() throws RecognitionException {
		KeyWordSolidityContext _localctx = new KeyWordSolidityContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_keyWordSolidity);
		try {
			setState(692);
			switch (_input.LA(1)) {
			case Private:
			case Public:
			case Protected:
			case Inheritable:
			case External:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				visibilityTypeSolidity();
				}
				break;
			case VarSolidity:
			case BoolSolidity:
			case BytesSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
			case HashSolidity:
			case StringSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				typeSolidityData();
				}
				break;
			case EnumSolidity:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				match(EnumSolidity);
				}
				break;
			case ModifierSoliditySymbol:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				match(ModifierSoliditySymbol);
				}
				break;
			case Indexed:
				enterOuterAlt(_localctx, 5);
				{
				setState(689);
				match(Indexed);
				}
				break;
			case Seconds:
			case Minutes:
			case Hours:
			case Days:
			case Weeks:
			case Years:
			case Now:
				enterOuterAlt(_localctx, 6);
				{
				setState(690);
				timeUnitsSolidity();
				}
				break;
			case Wei:
			case Finney:
			case Szabo:
			case Ether:
				enterOuterAlt(_localctx, 7);
				{
				setState(691);
				etherUnitsSolidity();
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

	public static class TimeUnitsSolidityContext extends ParserRuleContext {
		public TerminalNode Seconds() { return getToken(SolidityParser.Seconds, 0); }
		public TerminalNode Minutes() { return getToken(SolidityParser.Minutes, 0); }
		public TerminalNode Hours() { return getToken(SolidityParser.Hours, 0); }
		public TerminalNode Days() { return getToken(SolidityParser.Days, 0); }
		public TerminalNode Weeks() { return getToken(SolidityParser.Weeks, 0); }
		public TerminalNode Years() { return getToken(SolidityParser.Years, 0); }
		public TerminalNode Now() { return getToken(SolidityParser.Now, 0); }
		public TimeUnitsSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeUnitsSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTimeUnitsSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTimeUnitsSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTimeUnitsSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeUnitsSolidityContext timeUnitsSolidity() throws RecognitionException {
		TimeUnitsSolidityContext _localctx = new TimeUnitsSolidityContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_timeUnitsSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now))) != 0)) ) {
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

	public static class EtherUnitsSolidityContext extends ParserRuleContext {
		public TerminalNode Wei() { return getToken(SolidityParser.Wei, 0); }
		public TerminalNode Finney() { return getToken(SolidityParser.Finney, 0); }
		public TerminalNode Szabo() { return getToken(SolidityParser.Szabo, 0); }
		public TerminalNode Ether() { return getToken(SolidityParser.Ether, 0); }
		public EtherUnitsSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etherUnitsSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEtherUnitsSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEtherUnitsSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEtherUnitsSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtherUnitsSolidityContext etherUnitsSolidity() throws RecognitionException {
		EtherUnitsSolidityContext _localctx = new EtherUnitsSolidityContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_etherUnitsSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether))) != 0)) ) {
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

	public static class VisibilityTypeSolidityContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(SolidityParser.Private, 0); }
		public TerminalNode Public() { return getToken(SolidityParser.Public, 0); }
		public TerminalNode Protected() { return getToken(SolidityParser.Protected, 0); }
		public TerminalNode Inheritable() { return getToken(SolidityParser.Inheritable, 0); }
		public TerminalNode External() { return getToken(SolidityParser.External, 0); }
		public VisibilityTypeSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityTypeSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVisibilityTypeSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVisibilityTypeSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVisibilityTypeSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityTypeSolidityContext visibilityTypeSolidity() throws RecognitionException {
		VisibilityTypeSolidityContext _localctx = new VisibilityTypeSolidityContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_visibilityTypeSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)))) != 0)) ) {
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

	public static class UsingDeclarationContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode Using() { return getToken(SolidityParser.Using, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public UsingTypeContext usingType() {
			return getRuleContext(UsingTypeContext.class,0);
		}
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_usingDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(Using);
			setState(701);
			((UsingDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(702);
			match(For);
			setState(703);
			usingType();
			setState(704);
			match(SemiColon);
			elUsingDeclaration(((UsingDeclarationContext)_localctx).Identifier);
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

	public static class ModifierDeclarationContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode ModifierSolidity() { return getToken(SolidityParser.ModifierSolidity, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListSolidityContext formalParameterListSolidity() {
			return getRuleContext(FormalParameterListSolidityContext.class,0);
		}
		public ModifierDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierDeclarationContext modifierDeclaration() throws RecognitionException {
		ModifierDeclarationContext _localctx = new ModifierDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_modifierDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(ModifierSolidity);
			setState(708);
			((ModifierDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(714);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(709);
				match(OpenParen);
				setState(711);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << StructSolidity) | (1L << MappingSolidity))) != 0)) {
					{
					setState(710);
					formalParameterListSolidity();
					}
				}

				setState(713);
				match(CloseParen);
				}
			}

			setState(716);
			match(OpenBrace);
			setState(717);
			functionBody();
			setState(718);
			match(CloseBrace);
			elModifierDeclaration(((ModifierDeclarationContext)_localctx).Identifier);
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

	public static class UsingTypeContext extends ParserRuleContext {
		public SingletypeSolidityContext singletypeSolidity() {
			return getRuleContext(SingletypeSolidityContext.class,0);
		}
		public UsingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingTypeContext usingType() throws RecognitionException {
		UsingTypeContext _localctx = new UsingTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_usingType);
		int _la;
		try {
			setState(730);
			switch (_input.LA(1)) {
			case Multiply:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(Multiply);
				}
				break;
			case VarSolidity:
			case BoolSolidity:
			case BytesSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
			case HashSolidity:
			case StringSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				singletypeSolidity();
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket) {
					{
					{
					setState(723);
					match(OpenBracket);
					setState(724);
					match(CloseBracket);
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListGenericSolidityContext formalParameterListGenericSolidity() {
			return getRuleContext(FormalParameterListGenericSolidityContext.class,0);
		}
		public PropertiesExtendFunctionsContext propertiesExtendFunctions() {
			return getRuleContext(PropertiesExtendFunctionsContext.class,0);
		}
		public ReturnfunctionSolidityContext returnfunctionSolidity() {
			return getRuleContext(ReturnfunctionSolidityContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(Function);
			setState(733);
			((FunctionDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(734);
			match(OpenParen);
			setState(736);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << RegularExpressionLiteral) | (1L << OpenBracket))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(735);
				formalParameterListGenericSolidity();
				}
			}

			setState(738);
			match(CloseParen);
			setState(740);
			_la = _input.LA(1);
			if (_la==ConstantSolidity || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)) | (1L << (Identifier - 119)))) != 0)) {
				{
				setState(739);
				propertiesExtendFunctions();
				}
			}

			setState(743);
			_la = _input.LA(1);
			if (_la==ReturnsSolidity) {
				{
				setState(742);
				returnfunctionSolidity();
				}
			}

			setState(745);
			match(OpenBrace);
			setState(746);
			functionBody();
			setState(747);
			match(CloseBrace);
			elFunctionDeclaration(((FunctionDeclarationContext)_localctx).Identifier);
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

	public static class FunctionDeclarationInterfaceContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public FormalParameterListGenericSolidityContext formalParameterListGenericSolidity() {
			return getRuleContext(FormalParameterListGenericSolidityContext.class,0);
		}
		public PropertiesExtendFunctionsContext propertiesExtendFunctions() {
			return getRuleContext(PropertiesExtendFunctionsContext.class,0);
		}
		public ReturnfunctionSolidityContext returnfunctionSolidity() {
			return getRuleContext(ReturnfunctionSolidityContext.class,0);
		}
		public FunctionDeclarationInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDeclarationInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDeclarationInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDeclarationInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationInterfaceContext functionDeclarationInterface() throws RecognitionException {
		FunctionDeclarationInterfaceContext _localctx = new FunctionDeclarationInterfaceContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionDeclarationInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(Function);
			setState(751);
			((FunctionDeclarationInterfaceContext)_localctx).Identifier = match(Identifier);
			setState(752);
			match(OpenParen);
			setState(754);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << RegularExpressionLiteral) | (1L << OpenBracket))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(753);
				formalParameterListGenericSolidity();
				}
			}

			setState(756);
			match(CloseParen);
			setState(758);
			_la = _input.LA(1);
			if (_la==ConstantSolidity || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)) | (1L << (Identifier - 119)))) != 0)) {
				{
				setState(757);
				propertiesExtendFunctions();
				}
			}

			setState(761);
			_la = _input.LA(1);
			if (_la==ReturnsSolidity) {
				{
				setState(760);
				returnfunctionSolidity();
				}
			}

			elFunctionDeclarationInterface(((FunctionDeclarationInterfaceContext)_localctx).Identifier);
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

	public static class PropertiesExtendFunctionsContext extends ParserRuleContext {
		public List<PropertiesExtendFunctionContext> propertiesExtendFunction() {
			return getRuleContexts(PropertiesExtendFunctionContext.class);
		}
		public PropertiesExtendFunctionContext propertiesExtendFunction(int i) {
			return getRuleContext(PropertiesExtendFunctionContext.class,i);
		}
		public PropertiesExtendFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesExtendFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertiesExtendFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertiesExtendFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPropertiesExtendFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesExtendFunctionsContext propertiesExtendFunctions() throws RecognitionException {
		PropertiesExtendFunctionsContext _localctx = new PropertiesExtendFunctionsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_propertiesExtendFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(765);
				propertiesExtendFunction();
				}
				}
				setState(768); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ConstantSolidity || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)) | (1L << (Identifier - 119)))) != 0) );
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

	public static class PropertiesExtendFunctionContext extends ParserRuleContext {
		public VisibilityTypeSolidityContext visibilityTypeSolidity() {
			return getRuleContext(VisibilityTypeSolidityContext.class,0);
		}
		public TerminalNode ConstantSolidity() { return getToken(SolidityParser.ConstantSolidity, 0); }
		public ModifierExtendFunctionContext modifierExtendFunction() {
			return getRuleContext(ModifierExtendFunctionContext.class,0);
		}
		public PropertiesExtendFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesExtendFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertiesExtendFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertiesExtendFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPropertiesExtendFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesExtendFunctionContext propertiesExtendFunction() throws RecognitionException {
		PropertiesExtendFunctionContext _localctx = new PropertiesExtendFunctionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_propertiesExtendFunction);
		try {
			setState(773);
			switch (_input.LA(1)) {
			case Private:
			case Public:
			case Protected:
			case Inheritable:
			case External:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				visibilityTypeSolidity();
				}
				break;
			case ConstantSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(ConstantSolidity);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				modifierExtendFunction();
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

	public static class FunctionDeclarationFallBackContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationFallBackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationFallBack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDeclarationFallBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDeclarationFallBack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDeclarationFallBack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationFallBackContext functionDeclarationFallBack() throws RecognitionException {
		FunctionDeclarationFallBackContext _localctx = new FunctionDeclarationFallBackContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionDeclarationFallBack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(Function);
			setState(776);
			match(OpenParen);
			setState(777);
			match(CloseParen);
			setState(778);
			match(OpenBrace);
			setState(779);
			functionBody();
			setState(780);
			match(CloseBrace);
			elFunctionDeclarationFallBack();
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

	public static class FunctionDeclarationAnonymousContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListGenericSolidityContext formalParameterListGenericSolidity() {
			return getRuleContext(FormalParameterListGenericSolidityContext.class,0);
		}
		public PropertiesExtendFunctionsContext propertiesExtendFunctions() {
			return getRuleContext(PropertiesExtendFunctionsContext.class,0);
		}
		public ReturnfunctionSolidityContext returnfunctionSolidity() {
			return getRuleContext(ReturnfunctionSolidityContext.class,0);
		}
		public FunctionDeclarationAnonymousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationAnonymous; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDeclarationAnonymous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDeclarationAnonymous(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDeclarationAnonymous(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationAnonymousContext functionDeclarationAnonymous() throws RecognitionException {
		FunctionDeclarationAnonymousContext _localctx = new FunctionDeclarationAnonymousContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionDeclarationAnonymous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(Function);
			setState(784);
			match(OpenParen);
			setState(786);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << RegularExpressionLiteral) | (1L << OpenBracket))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(785);
				formalParameterListGenericSolidity();
				}
			}

			setState(788);
			match(CloseParen);
			setState(790);
			_la = _input.LA(1);
			if (_la==ConstantSolidity || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)) | (1L << (Identifier - 119)))) != 0)) {
				{
				setState(789);
				propertiesExtendFunctions();
				}
			}

			setState(793);
			_la = _input.LA(1);
			if (_la==ReturnsSolidity) {
				{
				setState(792);
				returnfunctionSolidity();
				}
			}

			setState(795);
			match(OpenBrace);
			setState(796);
			functionBody();
			setState(797);
			match(CloseBrace);
			elFunctionDeclarationAnonymous();
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

	public static class EventDeclarationContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode Event() { return getToken(SolidityParser.Event, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public FormalParameterListSolidityEventContext formalParameterListSolidityEvent() {
			return getRuleContext(FormalParameterListSolidityEventContext.class,0);
		}
		public EventDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDeclarationContext eventDeclaration() throws RecognitionException {
		EventDeclarationContext _localctx = new EventDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_eventDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(Event);
			setState(801);
			((EventDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(802);
			match(OpenParen);
			setState(804);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarSolidity) | (1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StringSolidity))) != 0)) {
				{
				setState(803);
				formalParameterListSolidityEvent();
				}
			}

			setState(806);
			match(CloseParen);
			setState(807);
			eos();
			elEventDeclaration(((EventDeclarationContext)_localctx).Identifier);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(Identifier);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(811);
				match(Comma);
				setState(812);
				match(Identifier);
				}
				}
				setState(817);
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

	public static class FormalParameterListGenericSolidityContext extends ParserRuleContext {
		public List<ExpressionSequenceParamContext> expressionSequenceParam() {
			return getRuleContexts(ExpressionSequenceParamContext.class);
		}
		public ExpressionSequenceParamContext expressionSequenceParam(int i) {
			return getRuleContext(ExpressionSequenceParamContext.class,i);
		}
		public FormalParameterListGenericSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterListGenericSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFormalParameterListGenericSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFormalParameterListGenericSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFormalParameterListGenericSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListGenericSolidityContext formalParameterListGenericSolidity() throws RecognitionException {
		FormalParameterListGenericSolidityContext _localctx = new FormalParameterListGenericSolidityContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_formalParameterListGenericSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			expressionSequenceParam();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(819);
				match(Comma);
				setState(820);
				expressionSequenceParam();
				}
				}
				setState(825);
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

	public static class FormalParameterListSolidityContext extends ParserRuleContext {
		public List<VariableDeclarationNameFunctionSolidityContext> variableDeclarationNameFunctionSolidity() {
			return getRuleContexts(VariableDeclarationNameFunctionSolidityContext.class);
		}
		public VariableDeclarationNameFunctionSolidityContext variableDeclarationNameFunctionSolidity(int i) {
			return getRuleContext(VariableDeclarationNameFunctionSolidityContext.class,i);
		}
		public FormalParameterListSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterListSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFormalParameterListSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFormalParameterListSolidity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFormalParameterListSolidity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListSolidityContext formalParameterListSolidity() throws RecognitionException {
		FormalParameterListSolidityContext _localctx = new FormalParameterListSolidityContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_formalParameterListSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			variableDeclarationNameFunctionSolidity();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(827);
				match(Comma);
				setState(828);
				variableDeclarationNameFunctionSolidity();
				}
				}
				setState(833);
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

	public static class FormalParameterListSolidityEventContext extends ParserRuleContext {
		public List<VariableDeclarationNameEventSolidityContext> variableDeclarationNameEventSolidity() {
			return getRuleContexts(VariableDeclarationNameEventSolidityContext.class);
		}
		public VariableDeclarationNameEventSolidityContext variableDeclarationNameEventSolidity(int i) {
			return getRuleContext(VariableDeclarationNameEventSolidityContext.class,i);
		}
		public FormalParameterListSolidityEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterListSolidityEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFormalParameterListSolidityEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFormalParameterListSolidityEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFormalParameterListSolidityEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListSolidityEventContext formalParameterListSolidityEvent() throws RecognitionException {
		FormalParameterListSolidityEventContext _localctx = new FormalParameterListSolidityEventContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterListSolidityEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			variableDeclarationNameEventSolidity();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(835);
				match(Comma);
				setState(836);
				variableDeclarationNameEventSolidity();
				}
				}
				setState(841);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsFunctionSolidityContext sourceElementsFunctionSolidity() {
			return getRuleContext(SourceElementsFunctionSolidityContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Break - 87)) | (1L << (Do - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Return - 87)) | (1L << (Void - 87)) | (1L << (Continue - 87)) | (1L << (For - 87)) | (1L << (Switch - 87)) | (1L << (While - 87)) | (1L << (Debugger - 87)) | (1L << (This - 87)) | (1L << (With - 87)) | (1L << (If - 87)) | (1L << (Throw - 87)) | (1L << (Delete - 87)) | (1L << (Try - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(842);
				sourceElementsFunctionSolidity();
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(OpenBracket);
			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(846);
				elementList();
				}
				break;
			}
			setState(850);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(849);
				match(Comma);
				}
				break;
			}
			setState(853);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(852);
				elision();
				}
			}

			setState(855);
			match(CloseBracket);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<ElisionContext> elision() {
			return getRuleContexts(ElisionContext.class);
		}
		public ElisionContext elision(int i) {
			return getRuleContext(ElisionContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(857);
				elision();
				}
			}

			setState(860);
			singleExpression(0);
			setState(868);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(861);
					match(Comma);
					setState(863);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(862);
						elision();
						}
					}

					setState(865);
					singleExpression(0);
					}
					} 
				}
				setState(870);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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

	public static class ElisionContext extends ParserRuleContext {
		public ElisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitElision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElisionContext elision() throws RecognitionException {
		ElisionContext _localctx = new ElisionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_elision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(871);
				match(Comma);
				}
				}
				setState(874); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public PropertyNameAndValueListContext propertyNameAndValueList() {
			return getRuleContext(PropertyNameAndValueListContext.class,0);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(OpenBrace);
			setState(878);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(877);
				propertyNameAndValueList();
				}
				break;
			}
			setState(881);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(880);
				match(Comma);
				}
			}

			setState(883);
			match(CloseBrace);
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

	public static class PropertyNameAndValueListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public PropertyNameAndValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNameAndValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertyNameAndValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertyNameAndValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPropertyNameAndValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameAndValueListContext propertyNameAndValueList() throws RecognitionException {
		PropertyNameAndValueListContext _localctx = new PropertyNameAndValueListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_propertyNameAndValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			propertyAssignment();
			setState(890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(886);
					match(Comma);
					setState(887);
					propertyAssignment();
					}
					} 
				}
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public PropertySetParameterListContext propertySetParameterList() {
			return getRuleContext(PropertySetParameterListContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertySetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertySetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPropertySetter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertyGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertyGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPropertyGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_propertyAssignment);
		try {
			setState(912);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				propertyName();
				setState(894);
				match(Colon);
				setState(895);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				getter();
				setState(898);
				match(OpenParen);
				setState(899);
				match(CloseParen);
				setState(900);
				match(OpenBrace);
				setState(901);
				functionBody();
				setState(902);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				setter();
				setState(905);
				match(OpenParen);
				setState(906);
				propertySetParameterList();
				setState(907);
				match(CloseParen);
				setState(908);
				match(OpenBrace);
				setState(909);
				functionBody();
				setState(910);
				match(CloseBrace);
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

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_propertyName);
		try {
			setState(917);
			switch (_input.LA(1)) {
			case ModifierSoliditySymbol:
			case VarSolidity:
			case BoolSolidity:
			case BytesSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
			case HashSolidity:
			case StringSolidity:
			case EnumSolidity:
			case Indexed:
			case Seconds:
			case Minutes:
			case Hours:
			case Days:
			case Weeks:
			case Years:
			case Now:
			case Wei:
			case Finney:
			case Szabo:
			case Ether:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Private:
			case Public:
			case Protected:
			case Inheritable:
			case External:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				numericLiteral();
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

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertySetParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertySetParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPropertySetParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(Identifier);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(OpenParen);
			setState(923);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(922);
				argumentList();
				}
			}

			setState(925);
			match(CloseParen);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			singleExpression(0);
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(928);
				match(Comma);
				setState(929);
				singleExpression(0);
				}
				}
				setState(934);
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

	public static class VarSolidityDeclarationContext extends ParserRuleContext {
		public SingletypeSolidityContext singletypeSolidity() {
			return getRuleContext(SingletypeSolidityContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public VisibilityTypeSolidityContext visibilityTypeSolidity() {
			return getRuleContext(VisibilityTypeSolidityContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public VarSolidityDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSolidityDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVarSolidityDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVarSolidityDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVarSolidityDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSolidityDeclarationContext varSolidityDeclaration() throws RecognitionException {
		VarSolidityDeclarationContext _localctx = new VarSolidityDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_varSolidityDeclaration);
		int _la;
		try {
			setState(986);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				singletypeSolidity();
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket) {
					{
					{
					setState(936);
					match(OpenBracket);
					setState(938);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
						{
						setState(937);
						expressionSequence();
						}
					}

					setState(940);
					match(CloseBracket);
					}
					}
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(947);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)))) != 0)) {
					{
					setState(946);
					visibilityTypeSolidity();
					}
				}

				setState(949);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(Identifier);
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket) {
					{
					{
					setState(952);
					match(OpenBracket);
					setState(954);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
						{
						setState(953);
						expressionSequence();
						}
					}

					setState(956);
					match(CloseBracket);
					}
					}
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(963);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)))) != 0)) {
					{
					setState(962);
					visibilityTypeSolidity();
					}
				}

				setState(965);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(Identifier);
				setState(967);
				match(Dot);
				setState(968);
				match(Identifier);
				setState(970);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(969);
					arguments();
					}
				}

				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(972);
					match(Dot);
					setState(973);
					match(Identifier);
					setState(975);
					_la = _input.LA(1);
					if (_la==OpenParen) {
						{
						setState(974);
						arguments();
						}
					}

					}
					}
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(983);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)))) != 0)) {
					{
					setState(982);
					visibilityTypeSolidity();
					}
				}

				setState(985);
				match(Identifier);
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

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			singleExpression(0);
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(989);
					match(Comma);
					setState(990);
					singleExpression(0);
					}
					} 
				}
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EtherUnitsSolidityExpressionContext extends SingleExpressionContext {
		public EtherUnitsSolidityContext etherUnitsSolidity() {
			return getRuleContext(EtherUnitsSolidityContext.class,0);
		}
		public TerminalNode DecimalLiteral() { return getToken(SolidityParser.DecimalLiteral, 0); }
		public EtherUnitsSolidityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEtherUnitsSolidityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEtherUnitsSolidityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEtherUnitsSolidityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(SolidityParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeUnitsSolidityExpressionContext extends SingleExpressionContext {
		public TimeUnitsSolidityContext timeUnitsSolidity() {
			return getRuleContext(TimeUnitsSolidityContext.class,0);
		}
		public TerminalNode DecimalLiteral() { return getToken(SolidityParser.DecimalLiteral, 0); }
		public TimeUnitsSolidityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTimeUnitsSolidityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTimeUnitsSolidityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTimeUnitsSolidityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPreDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPreDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArgumentsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitArgumentsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(SolidityParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPostDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPostDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(SolidityParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(SolidityParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInstanceofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInstanceofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInstanceofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUnaryPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUnaryPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(SolidityParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitXOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBitXOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(SolidityParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMemberDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMemberDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMemberIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMemberIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifierSolidityExpressionContext extends SingleExpressionContext {
		public TerminalNode ModifierSoliditySymbol() { return getToken(SolidityParser.ModifierSoliditySymbol, 0); }
		public ModifierSolidityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierSolidityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierSolidityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierSolidityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentTypesIndexArrayExpressionContext extends SingleExpressionContext {
		public SingletypeSolidityContext singletypeSolidity() {
			return getRuleContext(SingletypeSolidityContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public VisibilityTypeSolidityContext visibilityTypeSolidity() {
			return getRuleContext(VisibilityTypeSolidityContext.class,0);
		}
		public ArgumentTypesIndexArrayExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArgumentTypesIndexArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArgumentTypesIndexArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitArgumentTypesIndexArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssignmentOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssignmentOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(SolidityParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVoidExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVoidExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVoidExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(997);
				match(Delete);
				setState(998);
				singleExpression(33);
				}
				break;
			case 2:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(999);
				match(Void);
				setState(1000);
				singleExpression(32);
				}
				break;
			case 3:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1001);
				match(Typeof);
				setState(1002);
				singleExpression(31);
				}
				break;
			case 4:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1003);
				match(PlusPlus);
				setState(1004);
				singleExpression(30);
				}
				break;
			case 5:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1005);
				match(MinusMinus);
				setState(1006);
				singleExpression(29);
				}
				break;
			case 6:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1007);
				match(Plus);
				setState(1008);
				singleExpression(28);
				}
				break;
			case 7:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1009);
				match(Minus);
				setState(1010);
				singleExpression(27);
				}
				break;
			case 8:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1011);
				match(BitNot);
				setState(1012);
				singleExpression(26);
				}
				break;
			case 9:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1013);
				match(Not);
				setState(1014);
				singleExpression(25);
				}
				break;
			case 10:
				{
				_localctx = new ArgumentTypesIndexArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1015);
				singletypeSolidity();
				setState(1023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1016);
						match(OpenBracket);
						setState(1018);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ModifierSoliditySymbol) | (1L << VarSolidity) | (1L << BoolSolidity) | (1L << BytesSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << HashSolidity) | (1L << StringSolidity) | (1L << Seconds) | (1L << Minutes) | (1L << Hours) | (1L << Days) | (1L << Weeks) | (1L << Years) | (1L << Now) | (1L << Wei) | (1L << Finney) | (1L << Szabo) | (1L << Ether) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalLiteral - 87)) | (1L << (HexIntegerLiteral - 87)) | (1L << (OctalIntegerLiteral - 87)) | (1L << (Typeof - 87)) | (1L << (New - 87)) | (1L << (Void - 87)) | (1L << (This - 87)) | (1L << (Delete - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
							{
							setState(1017);
							expressionSequence();
							}
						}

						setState(1020);
						match(CloseBracket);
						}
						} 
					}
					setState(1025);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(1027);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (Private - 119)) | (1L << (Public - 119)) | (1L << (Protected - 119)) | (1L << (Inheritable - 119)) | (1L << (External - 119)))) != 0)) {
					{
					setState(1026);
					visibilityTypeSolidity();
					}
				}

				setState(1029);
				expressionSequence();
				}
				break;
			case 11:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1031);
				match(New);
				setState(1032);
				singleExpression(0);
				setState(1034);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1033);
					arguments();
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new TimeUnitsSolidityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1037);
				_la = _input.LA(1);
				if (_la==DecimalLiteral) {
					{
					setState(1036);
					match(DecimalLiteral);
					}
				}

				setState(1039);
				timeUnitsSolidity();
				}
				break;
			case 13:
				{
				_localctx = new EtherUnitsSolidityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1041);
				_la = _input.LA(1);
				if (_la==DecimalLiteral) {
					{
					setState(1040);
					match(DecimalLiteral);
					}
				}

				setState(1043);
				etherUnitsSolidity();
				}
				break;
			case 14:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1044);
				match(This);
				}
				break;
			case 15:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1045);
				match(Identifier);
				}
				break;
			case 16:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1046);
				literal();
				}
				break;
			case 17:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1047);
				arrayLiteral();
				}
				break;
			case 18:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1048);
				objectLiteral();
				}
				break;
			case 19:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1049);
				match(OpenParen);
				setState(1050);
				expressionSequence();
				setState(1051);
				match(CloseParen);
				}
				break;
			case 20:
				{
				_localctx = new ModifierSolidityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1053);
				match(ModifierSoliditySymbol);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1131);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1056);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1057);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1058);
						singleExpression(25);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1059);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1060);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1061);
						singleExpression(24);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1062);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1063);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1064);
						singleExpression(23);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1065);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1066);
						_la = _input.LA(1);
						if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LessThan - 63)) | (1L << (MoreThan - 63)) | (1L << (LessThanEquals - 63)) | (1L << (GreaterThanEquals - 63)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1067);
						singleExpression(22);
						}
						break;
					case 5:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1068);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1069);
						match(Instanceof);
						setState(1070);
						singleExpression(21);
						}
						break;
					case 6:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1071);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1072);
						match(In);
						setState(1073);
						singleExpression(20);
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1074);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1075);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Equals - 67)) | (1L << (NotEquals - 67)) | (1L << (IdentityEquals - 67)) | (1L << (IdentityNotEquals - 67)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1076);
						singleExpression(19);
						}
						break;
					case 8:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1077);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1078);
						match(BitAnd);
						setState(1079);
						singleExpression(18);
						}
						break;
					case 9:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1080);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1081);
						match(BitXOr);
						setState(1082);
						singleExpression(17);
						}
						break;
					case 10:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1083);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1084);
						match(BitOr);
						setState(1085);
						singleExpression(16);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1086);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1087);
						match(And);
						setState(1088);
						singleExpression(15);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1089);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1090);
						match(Or);
						setState(1091);
						singleExpression(14);
						}
						break;
					case 13:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1092);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1093);
						match(QuestionMark);
						setState(1094);
						singleExpression(0);
						setState(1095);
						match(Colon);
						setState(1096);
						singleExpression(13);
						}
						break;
					case 14:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1098);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1099);
						match(OpenBracket);
						setState(1100);
						expressionSequence();
						setState(1101);
						match(CloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1103);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1104);
						match(Dot);
						setState(1105);
						match(Identifier);
						setState(1113);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1106);
								match(Dot);
								setState(1107);
								match(Identifier);
								setState(1109);
								switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
								case 1:
									{
									setState(1108);
									arguments();
									}
									break;
								}
								}
								} 
							}
							setState(1115);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
						}
						}
						break;
					case 16:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1116);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1117);
						arguments();
						}
						break;
					case 17:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1118);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1119);
						if (!(!this.here(LineTerminator))) throw new FailedPredicateException(this, "!this.here(LineTerminator)");
						setState(1120);
						match(PlusPlus);
						}
						break;
					case 18:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1121);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1122);
						if (!(!this.here(LineTerminator))) throw new FailedPredicateException(this, "!this.here(LineTerminator)");
						setState(1123);
						match(MinusMinus);
						}
						break;
					case 19:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1124);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1125);
						match(Assign);
						setState(1126);
						expressionSequence();
						}
						break;
					case 20:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1127);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1128);
						assignmentOperator();
						setState(1129);
						expressionSequence();
						}
						break;
					}
					} 
				}
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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

	public static class ExpressionSequenceParamContext extends ParserRuleContext {
		public List<SingleExpressionParamContext> singleExpressionParam() {
			return getRuleContexts(SingleExpressionParamContext.class);
		}
		public SingleExpressionParamContext singleExpressionParam(int i) {
			return getRuleContext(SingleExpressionParamContext.class,i);
		}
		public ExpressionSequenceParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequenceParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionSequenceParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionSequenceParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionSequenceParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceParamContext expressionSequenceParam() throws RecognitionException {
		ExpressionSequenceParamContext _localctx = new ExpressionSequenceParamContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_expressionSequenceParam);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			singleExpressionParam();
			setState(1140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1137);
					singleExpressionParam();
					}
					} 
				}
				setState(1142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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

	public static class SingleExpressionParamContext extends ParserRuleContext {
		public SingletypeSolidityContext singletypeSolidity() {
			return getRuleContext(SingletypeSolidityContext.class,0);
		}
		public List<ExpressionSequenceParamContext> expressionSequenceParam() {
			return getRuleContexts(ExpressionSequenceParamContext.class);
		}
		public ExpressionSequenceParamContext expressionSequenceParam(int i) {
			return getRuleContext(ExpressionSequenceParamContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public SingleExpressionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpressionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSingleExpressionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSingleExpressionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSingleExpressionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionParamContext singleExpressionParam() throws RecognitionException {
		SingleExpressionParamContext _localctx = new SingleExpressionParamContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_singleExpressionParam);
		try {
			setState(1157);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				singletypeSolidity();
				setState(1145);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1144);
					expressionSequenceParam();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				singletypeSolidity();
				setState(1148);
				match(OpenBracket);
				setState(1149);
				expressionSequenceParam();
				setState(1150);
				match(CloseBracket);
				setState(1152);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1151);
					expressionSequenceParam();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1155);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1156);
				arrayLiteral();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (MultiplyAssign - 76)) | (1L << (DivideAssign - 76)) | (1L << (ModulusAssign - 76)) | (1L << (PlusAssign - 76)) | (1L << (MinusAssign - 76)) | (1L << (LeftShiftArithmeticAssign - 76)) | (1L << (RightShiftArithmeticAssign - 76)) | (1L << (RightShiftLogicalAssign - 76)) | (1L << (BitAndAssign - 76)) | (1L << (BitXorAssign - 76)) | (1L << (BitOrAssign - 76)))) != 0)) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(SolidityParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(SolidityParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_literal);
		int _la;
		try {
			setState(1163);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				_la = _input.LA(1);
				if ( !(_la==RegularExpressionLiteral || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NullLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (StringLiteral - 87)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				numericLiteral();
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(SolidityParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(SolidityParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(SolidityParser.OctalIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (DecimalLiteral - 89)) | (1L << (HexIntegerLiteral - 89)) | (1L << (OctalIntegerLiteral - 89)))) != 0)) ) {
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

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifierName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_identifierName);
		try {
			setState(1169);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				match(Identifier);
				}
				break;
			case ModifierSoliditySymbol:
			case VarSolidity:
			case BoolSolidity:
			case BytesSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
			case HashSolidity:
			case StringSolidity:
			case EnumSolidity:
			case Indexed:
			case Seconds:
			case Minutes:
			case Hours:
			case Days:
			case Weeks:
			case Years:
			case Now:
			case Wei:
			case Finney:
			case Szabo:
			case Ether:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Private:
			case Public:
			case Protected:
			case Inheritable:
			case External:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				reservedWord();
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

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(SolidityParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_reservedWord);
		int _la;
		try {
			setState(1173);
			switch (_input.LA(1)) {
			case ModifierSoliditySymbol:
			case VarSolidity:
			case BoolSolidity:
			case BytesSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
			case HashSolidity:
			case StringSolidity:
			case EnumSolidity:
			case Indexed:
			case Seconds:
			case Minutes:
			case Hours:
			case Days:
			case Weeks:
			case Years:
			case Now:
			case Wei:
			case Finney:
			case Szabo:
			case Ether:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Private:
			case Public:
			case Protected:
			case Inheritable:
			case External:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				keyword();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				_la = _input.LA(1);
				if ( !(_la==NullLiteral || _la==BooleanLiteral) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SolidityParser.Break, 0); }
		public TerminalNode Do() { return getToken(SolidityParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(SolidityParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(SolidityParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(SolidityParser.Case, 0); }
		public TerminalNode Else() { return getToken(SolidityParser.Else, 0); }
		public TerminalNode New() { return getToken(SolidityParser.New, 0); }
		public TerminalNode ModifierSoliditySymbol() { return getToken(SolidityParser.ModifierSoliditySymbol, 0); }
		public KeyWordSolidityContext keyWordSolidity() {
			return getRuleContext(KeyWordSolidityContext.class,0);
		}
		public TerminalNode Catch() { return getToken(SolidityParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(SolidityParser.Finally, 0); }
		public TerminalNode Return() { return getToken(SolidityParser.Return, 0); }
		public TerminalNode Void() { return getToken(SolidityParser.Void, 0); }
		public TerminalNode Continue() { return getToken(SolidityParser.Continue, 0); }
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode Switch() { return getToken(SolidityParser.Switch, 0); }
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode Debugger() { return getToken(SolidityParser.Debugger, 0); }
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public TerminalNode This() { return getToken(SolidityParser.This, 0); }
		public TerminalNode With() { return getToken(SolidityParser.With, 0); }
		public TerminalNode Default() { return getToken(SolidityParser.Default, 0); }
		public TerminalNode If() { return getToken(SolidityParser.If, 0); }
		public TerminalNode Throw() { return getToken(SolidityParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(SolidityParser.Delete, 0); }
		public TerminalNode In() { return getToken(SolidityParser.In, 0); }
		public TerminalNode Try() { return getToken(SolidityParser.Try, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_keyword);
		try {
			setState(1202);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				match(Break);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176);
				match(Do);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1177);
				match(Instanceof);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1178);
				match(Typeof);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1179);
				match(Case);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1180);
				match(Else);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1181);
				match(New);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1182);
				match(ModifierSoliditySymbol);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1183);
				keyWordSolidity();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1184);
				match(Catch);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1185);
				match(Finally);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1186);
				match(Return);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1187);
				match(Void);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1188);
				match(Continue);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1189);
				match(For);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1190);
				match(Switch);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1191);
				match(While);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1192);
				match(Debugger);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1193);
				match(Function);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1194);
				match(This);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1195);
				match(With);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1196);
				match(Default);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1197);
				match(If);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1198);
				match(Throw);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1199);
				match(Delete);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1200);
				match(In);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1201);
				match(Try);
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

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			if (!(this._input.LT(1).getText().startsWith("get"))) throw new FailedPredicateException(this, "this._input.LT(1).getText().startsWith(\"get\")");
			setState(1205);
			match(Identifier);
			setState(1206);
			propertyName();
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

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			if (!(this._input.LT(1).getText().startsWith("set"))) throw new FailedPredicateException(this, "this._input.LT(1).getText().startsWith(\"set\")");
			setState(1209);
			match(Identifier);
			setState(1210);
			propertyName();
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(SolidityParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_eos);
		try {
			setState(1216);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1213);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1214);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1215);
				if (!(this._input.LT(1).getType() == SolidityParser.CloseBrace)) throw new FailedPredicateException(this, "this._input.LT(1).getType() == SolidityParser.CloseBrace");
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 89:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 98:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 99:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 100:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 40);
		case 14:
			return precpred(_ctx, 39);
		case 15:
			return precpred(_ctx, 38);
		case 16:
			return precpred(_ctx, 35);
		case 17:
			return !this.here(LineTerminator);
		case 18:
			return precpred(_ctx, 34);
		case 19:
			return !this.here(LineTerminator);
		case 20:
			return precpred(_ctx, 11);
		case 21:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return this._input.LT(1).getText().startsWith("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return this._input.LT(1).getText().startsWith("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return this.lineTerminatorAhead();
		case 25:
			return this._input.LT(1).getType() == SolidityParser.CloseBrace;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0089\u04c7\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\5\2\u00d0\n\2\3\2\3"+
		"\2\3\3\6\3\u00d5\n\3\r\3\16\3\u00d6\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u00e6\n\4\3\5\3\5\3\5\5\5\u00eb\n\5\3\5\3\5\3\6"+
		"\3\6\5\6\u00f1\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00fa\n\7\f\7\16\7"+
		"\u00fd\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u010b"+
		"\n\t\f\t\16\t\u010e\13\t\3\n\6\n\u0111\n\n\r\n\16\n\u0112\3\13\3\13\3"+
		"\f\6\f\u0118\n\f\r\f\16\f\u0119\3\r\3\r\3\r\5\r\u011f\n\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\5\17\u0129\n\17\3\17\3\17\3\20\3\20\3\20"+
		"\5\20\u0130\n\20\3\20\3\20\5\20\u0134\n\20\3\20\3\20\3\21\3\21\5\21\u013a"+
		"\n\21\3\22\3\22\3\22\3\22\7\22\u0140\n\22\f\22\16\22\u0143\13\22\3\23"+
		"\6\23\u0146\n\23\r\23\16\23\u0147\3\24\3\24\5\24\u014c\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u015b\n\25"+
		"\3\26\3\26\5\26\u015f\n\26\3\26\3\26\3\27\6\27\u0164\n\27\r\27\16\27\u0165"+
		"\3\30\3\30\3\31\3\31\5\31\u016c\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0176\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0189\n\33\3\33\3\33\3\33\3\33"+
		"\5\33\u018f\n\33\3\34\3\34\5\34\u0193\n\34\3\34\3\34\5\34\u0197\n\34\3"+
		"\34\3\34\5\34\u019b\n\34\5\34\u019d\n\34\3\35\3\35\3\35\7\35\u01a2\n\35"+
		"\f\35\16\35\u01a5\13\35\3\36\3\36\5\36\u01a9\n\36\3\37\3\37\3\37\3 \3"+
		" \3!\3!\5!\u01b2\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01bb\n\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01ce\n#\3#\3#\5#\u01d2"+
		"\n#\3#\3#\5#\u01d6\n#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01e0\n#\3#\3#\5#\u01e4"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01fa"+
		"\n#\3$\3$\5$\u01fe\n$\3$\3$\3%\3%\5%\u0204\n%\3%\3%\3&\3&\5&\u020a\n&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\5)\u021c\n)\3)"+
		"\3)\5)\u0220\n)\5)\u0222\n)\3)\3)\3*\6*\u0227\n*\r*\16*\u0228\3+\3+\3"+
		"+\3+\5+\u022f\n+\3,\3,\3,\5,\u0234\n,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u024a\n/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u025b\n\63\f\63\16"+
		"\63\u025e\13\63\3\64\5\64\u0261\n\64\3\64\5\64\u0264\n\64\5\64\u0266\n"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0282"+
		"\n\66\3\67\3\67\38\38\58\u0288\n8\38\38\58\u028c\n8\38\38\58\u0290\n8"+
		"\38\38\58\u0294\n8\38\38\58\u0298\n8\38\38\58\u029c\n8\38\38\58\u02a0"+
		"\n8\38\38\58\u02a4\n8\58\u02a6\n8\39\39\3:\3:\5:\u02ac\n:\3;\3;\3<\3<"+
		"\3<\3<\3<\3<\3<\5<\u02b7\n<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A"+
		"\3A\3A\3A\5A\u02ca\nA\3A\5A\u02cd\nA\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u02d8"+
		"\nB\fB\16B\u02db\13B\5B\u02dd\nB\3C\3C\3C\3C\5C\u02e3\nC\3C\3C\5C\u02e7"+
		"\nC\3C\5C\u02ea\nC\3C\3C\3C\3C\3C\3D\3D\3D\3D\5D\u02f5\nD\3D\3D\5D\u02f9"+
		"\nD\3D\5D\u02fc\nD\3D\3D\3E\6E\u0301\nE\rE\16E\u0302\3F\3F\3F\5F\u0308"+
		"\nF\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\5H\u0315\nH\3H\3H\5H\u0319\nH\3H"+
		"\5H\u031c\nH\3H\3H\3H\3H\3H\3I\3I\3I\3I\5I\u0327\nI\3I\3I\3I\3I\3J\3J"+
		"\3J\7J\u0330\nJ\fJ\16J\u0333\13J\3K\3K\3K\7K\u0338\nK\fK\16K\u033b\13"+
		"K\3L\3L\3L\7L\u0340\nL\fL\16L\u0343\13L\3M\3M\3M\7M\u0348\nM\fM\16M\u034b"+
		"\13M\3N\5N\u034e\nN\3O\3O\5O\u0352\nO\3O\5O\u0355\nO\3O\5O\u0358\nO\3"+
		"O\3O\3P\5P\u035d\nP\3P\3P\3P\5P\u0362\nP\3P\7P\u0365\nP\fP\16P\u0368\13"+
		"P\3Q\6Q\u036b\nQ\rQ\16Q\u036c\3R\3R\5R\u0371\nR\3R\5R\u0374\nR\3R\3R\3"+
		"S\3S\3S\7S\u037b\nS\fS\16S\u037e\13S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0393\nT\3U\3U\3U\5U\u0398\nU\3V\3V\3W\3W"+
		"\5W\u039e\nW\3W\3W\3X\3X\3X\7X\u03a5\nX\fX\16X\u03a8\13X\3Y\3Y\3Y\5Y\u03ad"+
		"\nY\3Y\7Y\u03b0\nY\fY\16Y\u03b3\13Y\3Y\5Y\u03b6\nY\3Y\3Y\3Y\3Y\3Y\5Y\u03bd"+
		"\nY\3Y\7Y\u03c0\nY\fY\16Y\u03c3\13Y\3Y\5Y\u03c6\nY\3Y\3Y\3Y\3Y\3Y\5Y\u03cd"+
		"\nY\3Y\3Y\3Y\5Y\u03d2\nY\7Y\u03d4\nY\fY\16Y\u03d7\13Y\3Y\5Y\u03da\nY\3"+
		"Y\5Y\u03dd\nY\3Z\3Z\3Z\7Z\u03e2\nZ\fZ\16Z\u03e5\13Z\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u03fd\n[\3[\7[\u0400"+
		"\n[\f[\16[\u0403\13[\3[\5[\u0406\n[\3[\3[\3[\3[\3[\5[\u040d\n[\3[\5[\u0410"+
		"\n[\3[\3[\5[\u0414\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0421\n[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\5[\u0458\n[\7[\u045a\n[\f[\16[\u045d\13[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u046e\n[\f[\16[\u0471\13[\3\\\3"+
		"\\\7\\\u0475\n\\\f\\\16\\\u0478\13\\\3]\3]\5]\u047c\n]\3]\3]\3]\3]\3]"+
		"\5]\u0483\n]\3]\3]\3]\5]\u0488\n]\3^\3^\3_\3_\5_\u048e\n_\3`\3`\3a\3a"+
		"\5a\u0494\na\3b\3b\5b\u0498\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u04b5\nc\3d\3d\3d\3d\3e"+
		"\3e\3e\3e\3f\3f\3f\3f\5f\u04c3\nf\3g\3g\3g\2\3\u00b4h\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\2\17\3\2\n\23\3\2\32 \3\2!$\4\2yz}\177"+
		"\3\2;=\3\2\678\3\2>@\3\2AD\3\2EH\3\2NX\5\2\'\'YZ\u0083\u0083\3\2[]\3\2"+
		"YZ\u0554\2\u00cf\3\2\2\2\4\u00d4\3\2\2\2\6\u00e5\3\2\2\2\b\u00e7\3\2\2"+
		"\2\n\u00ee\3\2\2\2\f\u00f5\3\2\2\2\16\u0101\3\2\2\2\20\u0107\3\2\2\2\22"+
		"\u0110\3\2\2\2\24\u0114\3\2\2\2\26\u0117\3\2\2\2\30\u011e\3\2\2\2\32\u0120"+
		"\3\2\2\2\34\u0124\3\2\2\2\36\u012c\3\2\2\2 \u0137\3\2\2\2\"\u013b\3\2"+
		"\2\2$\u0145\3\2\2\2&\u0149\3\2\2\2(\u015a\3\2\2\2*\u015c\3\2\2\2,\u0163"+
		"\3\2\2\2.\u0167\3\2\2\2\60\u0169\3\2\2\2\62\u0175\3\2\2\2\64\u018e\3\2"+
		"\2\2\66\u019c\3\2\2\28\u019e\3\2\2\2:\u01a6\3\2\2\2<\u01aa\3\2\2\2>\u01ad"+
		"\3\2\2\2@\u01af\3\2\2\2B\u01b3\3\2\2\2D\u01f9\3\2\2\2F\u01fb\3\2\2\2H"+
		"\u0201\3\2\2\2J\u0207\3\2\2\2L\u020d\3\2\2\2N\u0213\3\2\2\2P\u0219\3\2"+
		"\2\2R\u0226\3\2\2\2T\u022a\3\2\2\2V\u0230\3\2\2\2X\u0235\3\2\2\2Z\u0239"+
		"\3\2\2\2\\\u0249\3\2\2\2^\u024b\3\2\2\2`\u0251\3\2\2\2b\u0254\3\2\2\2"+
		"d\u0257\3\2\2\2f\u0265\3\2\2\2h\u0267\3\2\2\2j\u0281\3\2\2\2l\u0283\3"+
		"\2\2\2n\u02a5\3\2\2\2p\u02a7\3\2\2\2r\u02a9\3\2\2\2t\u02ad\3\2\2\2v\u02b6"+
		"\3\2\2\2x\u02b8\3\2\2\2z\u02ba\3\2\2\2|\u02bc\3\2\2\2~\u02be\3\2\2\2\u0080"+
		"\u02c5\3\2\2\2\u0082\u02dc\3\2\2\2\u0084\u02de\3\2\2\2\u0086\u02f0\3\2"+
		"\2\2\u0088\u0300\3\2\2\2\u008a\u0307\3\2\2\2\u008c\u0309\3\2\2\2\u008e"+
		"\u0311\3\2\2\2\u0090\u0322\3\2\2\2\u0092\u032c\3\2\2\2\u0094\u0334\3\2"+
		"\2\2\u0096\u033c\3\2\2\2\u0098\u0344\3\2\2\2\u009a\u034d\3\2\2\2\u009c"+
		"\u034f\3\2\2\2\u009e\u035c\3\2\2\2\u00a0\u036a\3\2\2\2\u00a2\u036e\3\2"+
		"\2\2\u00a4\u0377\3\2\2\2\u00a6\u0392\3\2\2\2\u00a8\u0397\3\2\2\2\u00aa"+
		"\u0399\3\2\2\2\u00ac\u039b\3\2\2\2\u00ae\u03a1\3\2\2\2\u00b0\u03dc\3\2"+
		"\2\2\u00b2\u03de\3\2\2\2\u00b4\u0420\3\2\2\2\u00b6\u0472\3\2\2\2\u00b8"+
		"\u0487\3\2\2\2\u00ba\u0489\3\2\2\2\u00bc\u048d\3\2\2\2\u00be\u048f\3\2"+
		"\2\2\u00c0\u0493\3\2\2\2\u00c2\u0497\3\2\2\2\u00c4\u04b4\3\2\2\2\u00c6"+
		"\u04b6\3\2\2\2\u00c8\u04ba\3\2\2\2\u00ca\u04c2\3\2\2\2\u00cc\u04c4\3\2"+
		"\2\2\u00ce\u00d0\5\26\f\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\7\2\2\3\u00d2\3\3\2\2\2\u00d3\u00d5\5\6\4\2"+
		"\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\5\3\2\2\2\u00d8\u00e6\5\b\5\2\u00d9\u00e6\5\n\6\2\u00da"+
		"\u00e6\5\f\7\2\u00db\u00e6\5\16\b\2\u00dc\u00e6\5~@\2\u00dd\u00e6\5\u0080"+
		"A\2\u00de\u00e6\5\u0090I\2\u00df\u00e6\5\u0084C\2\u00e0\u00e6\5\u008c"+
		"G\2\u00e1\u00e2\5\u0086D\2\u00e2\u00e3\5> \2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e6\5\u008eH\2\u00e5\u00d8\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00da"+
		"\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5"+
		"\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\7\3\2\2\2\u00e7\u00ea\5\u00b0Y\2\u00e8"+
		"\u00e9\7\61\2\2\u00e9\u00eb\5@!\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5> \2\u00ed\t\3\2\2\2\u00ee\u00f0"+
		"\5j\66\2\u00ef\u00f1\5|?\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\7\u0082\2\2\u00f3\u00f4\5> \2\u00f4\13\3\2"+
		"\2\2\u00f5\u00f6\7\24\2\2\u00f6\u00f7\7\u0082\2\2\u00f7\u00fb\7-\2\2\u00f8"+
		"\u00fa\5\64\33\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00ff\7.\2\2\u00ff\u0100\b\7\1\2\u0100\r\3\2\2\2\u0101\u0102\7\26\2\2"+
		"\u0102\u0103\7\u0082\2\2\u0103\u0104\7-\2\2\u0104\u0105\5\20\t\2\u0105"+
		"\u0106\7.\2\2\u0106\17\3\2\2\2\u0107\u010c\7\u0082\2\2\u0108\u0109\7\60"+
		"\2\2\u0109\u010b\7\u0082\2\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\21\3\2\2\2\u010e\u010c\3\2\2"+
		"\2\u010f\u0111\5\24\13\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\23\3\2\2\2\u0114\u0115\5(\25"+
		"\2\u0115\25\3\2\2\2\u0116\u0118\5\30\r\2\u0117\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\27\3\2\2\2\u011b"+
		"\u011f\5\32\16\2\u011c\u011f\5\34\17\2\u011d\u011f\5\36\20\2\u011e\u011b"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\31\3\2\2\2\u0120"+
		"\u0121\7\6\2\2\u0121\u0122\7\u0083\2\2\u0122\u0123\5\u00caf\2\u0123\33"+
		"\3\2\2\2\u0124\u0125\7\7\2\2\u0125\u0126\7\u0082\2\2\u0126\u0128\7-\2"+
		"\2\u0127\u0129\5\4\3\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012b\7.\2\2\u012b\35\3\2\2\2\u012c\u012d\7\5\2\2\u012d"+
		"\u012f\7\u0082\2\2\u012e\u0130\5\"\22\2\u012f\u012e\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\7-\2\2\u0132\u0134\5\4\3\2\u0133"+
		"\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7."+
		"\2\2\u0136\37\3\2\2\2\u0137\u0139\7\u0082\2\2\u0138\u013a\5\u00acW\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a!\3\2\2\2\u013b\u013c\7\3\2\2"+
		"\u013c\u0141\5 \21\2\u013d\u013e\7\60\2\2\u013e\u0140\5 \21\2\u013f\u013d"+
		"\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"#\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\5&\24\2\u0145\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148%\3"+
		"\2\2\2\u0149\u014b\7\u0082\2\2\u014a\u014c\5\u00acW\2\u014b\u014a\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\'\3\2\2\2\u014d\u015b\5*\26\2\u014e\u015b"+
		"\5@!\2\u014f\u015b\5B\"\2\u0150\u015b\5D#\2\u0151\u015b\5F$\2\u0152\u015b"+
		"\5H%\2\u0153\u015b\5J&\2\u0154\u015b\5L\'\2\u0155\u015b\5X-\2\u0156\u015b"+
		"\5N(\2\u0157\u015b\5Z.\2\u0158\u015b\5\\/\2\u0159\u015b\5b\62\2\u015a"+
		"\u014d\3\2\2\2\u015a\u014e\3\2\2\2\u015a\u014f\3\2\2\2\u015a\u0150\3\2"+
		"\2\2\u015a\u0151\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u0153\3\2\2\2\u015a"+
		"\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b)\3\2\2\2\u015c\u015e"+
		"\7-\2\2\u015d\u015f\5,\27\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\7.\2\2\u0161+\3\2\2\2\u0162\u0164\5(\25\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166-\3\2\2\2\u0167\u0168\5\u00b2Z\2\u0168/\3\2\2\2\u0169\u016b"+
		"\5l\67\2\u016a\u016c\7\u0082\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2"+
		"\2\u016c\61\3\2\2\2\u016d\u016e\5p9\2\u016e\u016f\7\u0082\2\2\u016f\u0176"+
		"\3\2\2\2\u0170\u0171\5j\66\2\u0171\u0172\7\u0082\2\2\u0172\u0176\3\2\2"+
		"\2\u0173\u0174\7\24\2\2\u0174\u0176\7\u0082\2\2\u0175\u016d\3\2\2\2\u0175"+
		"\u0170\3\2\2\2\u0175\u0173\3\2\2\2\u0176\63\3\2\2\2\u0177\u0178\5j\66"+
		"\2\u0178\u0179\7\u0082\2\2\u0179\u017a\7/\2\2\u017a\u018f\3\2\2\2\u017b"+
		"\u017c\7\24\2\2\u017c\u017d\7\u0082\2\2\u017d\u018f\7/\2\2\u017e\u017f"+
		"\7\u0082\2\2\u017f\u0180\7\u0082\2\2\u0180\u018f\7/\2\2\u0181\u0182\5"+
		"r:\2\u0182\u0183\7\u0082\2\2\u0183\u0184\7/\2\2\u0184\u018f\3\2\2\2\u0185"+
		"\u0186\5r:\2\u0186\u0188\7)\2\2\u0187\u0189\5\u00b2Z\2\u0188\u0187\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\7*\2\2\u018b"+
		"\u018c\7\u0082\2\2\u018c\u018d\7/\2\2\u018d\u018f\3\2\2\2\u018e\u0177"+
		"\3\2\2\2\u018e\u017b\3\2\2\2\u018e\u017e\3\2\2\2\u018e\u0181\3\2\2\2\u018e"+
		"\u0185\3\2\2\2\u018f\65\3\2\2\2\u0190\u0192\5p9\2\u0191\u0193\7\u0082"+
		"\2\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u019d\3\2\2\2\u0194"+
		"\u0196\5j\66\2\u0195\u0197\7\u0082\2\2\u0196\u0195\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u019d\3\2\2\2\u0198\u019a\7\24\2\2\u0199\u019b\7\u0082"+
		"\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u0190\3\2\2\2\u019c\u0194\3\2\2\2\u019c\u0198\3\2\2\2\u019d\67\3\2\2"+
		"\2\u019e\u01a3\5:\36\2\u019f\u01a0\7\60\2\2\u01a0\u01a2\5:\36\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a49\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\7\u0082\2\2\u01a7"+
		"\u01a9\5<\37\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9;\3\2\2\2"+
		"\u01aa\u01ab\7\61\2\2\u01ab\u01ac\5\u00b4[\2\u01ac=\3\2\2\2\u01ad\u01ae"+
		"\7/\2\2\u01ae?\3\2\2\2\u01af\u01b1\5\u00b2Z\2\u01b0\u01b2\5> \2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2A\3\2\2\2\u01b3\u01b4\7r\2\2\u01b4"+
		"\u01b5\7+\2\2\u01b5\u01b6\5\u00b2Z\2\u01b6\u01b7\7,\2\2\u01b7\u01ba\5"+
		"(\25\2\u01b8\u01b9\7c\2\2\u01b9\u01bb\5(\25\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bbC\3\2\2\2\u01bc\u01bd\7_\2\2\u01bd\u01be\5(\25\2\u01be"+
		"\u01bf\7l\2\2\u01bf\u01c0\7+\2\2\u01c0\u01c1\5\u00b2Z\2\u01c1\u01c2\7"+
		",\2\2\u01c2\u01c3\5\u00caf\2\u01c3\u01fa\3\2\2\2\u01c4\u01c5\7l\2\2\u01c5"+
		"\u01c6\7+\2\2\u01c6\u01c7\5\u00b2Z\2\u01c7\u01c8\7,\2\2\u01c8\u01c9\5"+
		"(\25\2\u01c9\u01fa\3\2\2\2\u01ca\u01cb\7j\2\2\u01cb\u01cd\7+\2\2\u01cc"+
		"\u01ce\5\u00b2Z\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d1\7/\2\2\u01d0\u01d2\5\u00b2Z\2\u01d1\u01d0\3\2\2\2"+
		"\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\7/\2\2\u01d4\u01d6"+
		"\5\u00b2Z\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2"+
		"\2\u01d7\u01d8\7,\2\2\u01d8\u01fa\5(\25\2\u01d9\u01da\7j\2\2\u01da\u01db"+
		"\7+\2\2\u01db\u01dc\5r:\2\u01dc\u01dd\58\35\2\u01dd\u01df\7/\2\2\u01de"+
		"\u01e0\5\u00b2Z\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01e3\7/\2\2\u01e2\u01e4\5\u00b2Z\2\u01e3\u01e2\3\2\2\2"+
		"\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7,\2\2\u01e6\u01e7"+
		"\5(\25\2\u01e7\u01fa\3\2\2\2\u01e8\u01e9\7j\2\2\u01e9\u01ea\7+\2\2\u01ea"+
		"\u01eb\5\u00b4[\2\u01eb\u01ec\7u\2\2\u01ec\u01ed\5\u00b2Z\2\u01ed\u01ee"+
		"\7,\2\2\u01ee\u01ef\5(\25\2\u01ef\u01fa\3\2\2\2\u01f0\u01f1\7j\2\2\u01f1"+
		"\u01f2\7+\2\2\u01f2\u01f3\5r:\2\u01f3\u01f4\5:\36\2\u01f4\u01f5\7u\2\2"+
		"\u01f5\u01f6\5\u00b2Z\2\u01f6\u01f7\7,\2\2\u01f7\u01f8\5(\25\2\u01f8\u01fa"+
		"\3\2\2\2\u01f9\u01bc\3\2\2\2\u01f9\u01c4\3\2\2\2\u01f9\u01ca\3\2\2\2\u01f9"+
		"\u01d9\3\2\2\2\u01f9\u01e8\3\2\2\2\u01f9\u01f0\3\2\2\2\u01faE\3\2\2\2"+
		"\u01fb\u01fd\7i\2\2\u01fc\u01fe\7\u0082\2\2\u01fd\u01fc\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\5\u00caf\2\u0200G\3\2\2"+
		"\2\u0201\u0203\7^\2\2\u0202\u0204\7\u0082\2\2\u0203\u0202\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\5\u00caf\2\u0206I\3\2\2"+
		"\2\u0207\u0209\7g\2\2\u0208\u020a\5\u00b2Z\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\5\u00caf\2\u020cK\3\2\2"+
		"\2\u020d\u020e\7p\2\2\u020e\u020f\7+\2\2\u020f\u0210\5\u00b2Z\2\u0210"+
		"\u0211\7,\2\2\u0211\u0212\5(\25\2\u0212M\3\2\2\2\u0213\u0214\7k\2\2\u0214"+
		"\u0215\7+\2\2\u0215\u0216\5\u00b2Z\2\u0216\u0217\7,\2\2\u0217\u0218\5"+
		"P)\2\u0218O\3\2\2\2\u0219\u021b\7-\2\2\u021a\u021c\5R*\2\u021b\u021a\3"+
		"\2\2\2\u021b\u021c\3\2\2\2\u021c\u0221\3\2\2\2\u021d\u021f\5V,\2\u021e"+
		"\u0220\5R*\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2"+
		"\2\u0221\u021d\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224"+
		"\7.\2\2\u0224Q\3\2\2\2\u0225\u0227\5T+\2\u0226\u0225\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229S\3\2\2\2\u022a"+
		"\u022b\7b\2\2\u022b\u022c\5\u00b2Z\2\u022c\u022e\7\63\2\2\u022d\u022f"+
		"\5,\27\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022fU\3\2\2\2\u0230"+
		"\u0231\7q\2\2\u0231\u0233\7\63\2\2\u0232\u0234\5,\27\2\u0233\u0232\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234W\3\2\2\2\u0235\u0236\7\u0082\2\2\u0236"+
		"\u0237\7\63\2\2\u0237\u0238\5(\25\2\u0238Y\3\2\2\2\u0239\u023a\7s\2\2"+
		"\u023a\u023b\5\u00caf\2\u023b[\3\2\2\2\u023c\u023d\7v\2\2\u023d\u023e"+
		"\5*\26\2\u023e\u023f\5^\60\2\u023f\u024a\3\2\2\2\u0240\u0241\7v\2\2\u0241"+
		"\u0242\5*\26\2\u0242\u0243\5`\61\2\u0243\u024a\3\2\2\2\u0244\u0245\7v"+
		"\2\2\u0245\u0246\5*\26\2\u0246\u0247\5^\60\2\u0247\u0248\5`\61\2\u0248"+
		"\u024a\3\2\2\2\u0249\u023c\3\2\2\2\u0249\u0240\3\2\2\2\u0249\u0244\3\2"+
		"\2\2\u024a]\3\2\2\2\u024b\u024c\7e\2\2\u024c\u024d\7+\2\2\u024d\u024e"+
		"\7\u0082\2\2\u024e\u024f\7,\2\2\u024f\u0250\5*\26\2\u0250_\3\2\2\2\u0251"+
		"\u0252\7f\2\2\u0252\u0253\5*\26\2\u0253a\3\2\2\2\u0254\u0255\7m\2\2\u0255"+
		"\u0256\5\u00caf\2\u0256c\3\2\2\2\u0257\u025c\5t;\2\u0258\u0259\7\60\2"+
		"\2\u0259\u025b\5t;\2\u025a\u0258\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025de\3\2\2\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0261\5\u0094K\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0266"+
		"\3\2\2\2\u0262\u0264\5d\63\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0266\3\2\2\2\u0265\u0260\3\2\2\2\u0265\u0263\3\2\2\2\u0266g\3\2\2\2"+
		"\u0267\u0268\7\t\2\2\u0268\u0269\7+\2\2\u0269\u026a\5f\64\2\u026a\u026b"+
		"\7,\2\2\u026bi\3\2\2\2\u026c\u026d\7\25\2\2\u026d\u026e\7+\2\2\u026e\u026f"+
		"\5p9\2\u026f\u0270\7\4\2\2\u0270\u0271\5p9\2\u0271\u0272\7,\2\2\u0272"+
		"\u0282\3\2\2\2\u0273\u0274\7\25\2\2\u0274\u0275\7+\2\2\u0275\u0276\5p"+
		"9\2\u0276\u0277\7\4\2\2\u0277\u0278\7\u0082\2\2\u0278\u0279\7,\2\2\u0279"+
		"\u0282\3\2\2\2\u027a\u027b\7\25\2\2\u027b\u027c\7+\2\2\u027c\u027d\5p"+
		"9\2\u027d\u027e\7\4\2\2\u027e\u027f\5j\66\2\u027f\u0280\7,\2\2\u0280\u0282"+
		"\3\2\2\2\u0281\u026c\3\2\2\2\u0281\u0273\3\2\2\2\u0281\u027a\3\2\2\2\u0282"+
		"k\3\2\2\2\u0283\u0284\5n8\2\u0284m\3\2\2\2\u0285\u0287\7\13\2\2\u0286"+
		"\u0288\7\31\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u02a6\3"+
		"\2\2\2\u0289\u028b\7\r\2\2\u028a\u028c\7\31\2\2\u028b\u028a\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u02a6\3\2\2\2\u028d\u028f\7\16\2\2\u028e\u0290\7"+
		"\31\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u02a6\3\2\2\2\u0291"+
		"\u0293\7\17\2\2\u0292\u0294\7\31\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3"+
		"\2\2\2\u0294\u02a6\3\2\2\2\u0295\u0297\7\20\2\2\u0296\u0298\7\31\2\2\u0297"+
		"\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u02a6\3\2\2\2\u0299\u029b\7\n"+
		"\2\2\u029a\u029c\7\31\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u02a6\3\2\2\2\u029d\u029f\7\23\2\2\u029e\u02a0\7\31\2\2\u029f\u029e\3"+
		"\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a6\3\2\2\2\u02a1\u02a3\7\21\2\2\u02a2"+
		"\u02a4\7\31\2\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3"+
		"\2\2\2\u02a5\u0285\3\2\2\2\u02a5\u0289\3\2\2\2\u02a5\u028d\3\2\2\2\u02a5"+
		"\u0291\3\2\2\2\u02a5\u0295\3\2\2\2\u02a5\u0299\3\2\2\2\u02a5\u029d\3\2"+
		"\2\2\u02a5\u02a1\3\2\2\2\u02a6o\3\2\2\2\u02a7\u02a8\5r:\2\u02a8q\3\2\2"+
		"\2\u02a9\u02ab\5t;\2\u02aa\u02ac\5|?\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02acs\3\2\2\2\u02ad\u02ae\t\2\2\2\u02aeu\3\2\2\2\u02af\u02b7"+
		"\5|?\2\u02b0\u02b7\5t;\2\u02b1\u02b7\7\26\2\2\u02b2\u02b7\7\b\2\2\u02b3"+
		"\u02b7\7\31\2\2\u02b4\u02b7\5x=\2\u02b5\u02b7\5z>\2\u02b6\u02af\3\2\2"+
		"\2\u02b6\u02b0\3\2\2\2\u02b6\u02b1\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b6\u02b3"+
		"\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7w\3\2\2\2\u02b8"+
		"\u02b9\t\3\2\2\u02b9y\3\2\2\2\u02ba\u02bb\t\4\2\2\u02bb{\3\2\2\2\u02bc"+
		"\u02bd\t\5\2\2\u02bd}\3\2\2\2\u02be\u02bf\7%\2\2\u02bf\u02c0\7\u0082\2"+
		"\2\u02c0\u02c1\7j\2\2\u02c1\u02c2\5\u0082B\2\u02c2\u02c3\7/\2\2\u02c3"+
		"\u02c4\b@\1\2\u02c4\177\3\2\2\2\u02c5\u02c6\7\27\2\2\u02c6\u02cc\7\u0082"+
		"\2\2\u02c7\u02c9\7+\2\2\u02c8\u02ca\5\u0096L\2\u02c9\u02c8\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\7,\2\2\u02cc\u02c7\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\7-\2\2\u02cf"+
		"\u02d0\5\u009aN\2\u02d0\u02d1\7.\2\2\u02d1\u02d2\bA\1\2\u02d2\u0081\3"+
		"\2\2\2\u02d3\u02dd\7;\2\2\u02d4\u02d9\5r:\2\u02d5\u02d6\7)\2\2\u02d6\u02d8"+
		"\7*\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02d3\3\2"+
		"\2\2\u02dc\u02d4\3\2\2\2\u02dd\u0083\3\2\2\2\u02de\u02df\7n\2\2\u02df"+
		"\u02e0\7\u0082\2\2\u02e0\u02e2\7+\2\2\u02e1\u02e3\5\u0094K\2\u02e2\u02e1"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\7,\2\2\u02e5"+
		"\u02e7\5\u0088E\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9"+
		"\3\2\2\2\u02e8\u02ea\5h\65\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ec\7-\2\2\u02ec\u02ed\5\u009aN\2\u02ed\u02ee\7"+
		".\2\2\u02ee\u02ef\bC\1\2\u02ef\u0085\3\2\2\2\u02f0\u02f1\7n\2\2\u02f1"+
		"\u02f2\7\u0082\2\2\u02f2\u02f4\7+\2\2\u02f3\u02f5\5\u0094K\2\u02f4\u02f3"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\7,\2\2\u02f7"+
		"\u02f9\5\u0088E\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb"+
		"\3\2\2\2\u02fa\u02fc\5h\65\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u02fe\bD\1\2\u02fe\u0087\3\2\2\2\u02ff\u0301\5\u008a"+
		"F\2\u0300\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0089\3\2\2\2\u0304\u0308\5|?\2\u0305\u0308\7\30"+
		"\2\2\u0306\u0308\5$\23\2\u0307\u0304\3\2\2\2\u0307\u0305\3\2\2\2\u0307"+
		"\u0306\3\2\2\2\u0308\u008b\3\2\2\2\u0309\u030a\7n\2\2\u030a\u030b\7+\2"+
		"\2\u030b\u030c\7,\2\2\u030c\u030d\7-\2\2\u030d\u030e\5\u009aN\2\u030e"+
		"\u030f\7.\2\2\u030f\u0310\bG\1\2\u0310\u008d\3\2\2\2\u0311\u0312\7n\2"+
		"\2\u0312\u0314\7+\2\2\u0313\u0315\5\u0094K\2\u0314\u0313\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\7,\2\2\u0317\u0319\5\u0088"+
		"E\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a"+
		"\u031c\5h\65\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u031e\7-\2\2\u031e\u031f\5\u009aN\2\u031f\u0320\7.\2\2\u0320"+
		"\u0321\bH\1\2\u0321\u008f\3\2\2\2\u0322\u0323\7&\2\2\u0323\u0324\7\u0082"+
		"\2\2\u0324\u0326\7+\2\2\u0325\u0327\5\u0098M\2\u0326\u0325\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\7,\2\2\u0329\u032a\5\u00ca"+
		"f\2\u032a\u032b\bI\1\2\u032b\u0091\3\2\2\2\u032c\u0331\7\u0082\2\2\u032d"+
		"\u032e\7\60\2\2\u032e\u0330\7\u0082\2\2\u032f\u032d\3\2\2\2\u0330\u0333"+
		"\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0093\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0334\u0339\5\u00b6\\\2\u0335\u0336\7\60\2\2\u0336\u0338"+
		"\5\u00b6\\\2\u0337\u0335\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2"+
		"\2\u0339\u033a\3\2\2\2\u033a\u0095\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u0341"+
		"\5\62\32\2\u033d\u033e\7\60\2\2\u033e\u0340\5\62\32\2\u033f\u033d\3\2"+
		"\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0097\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0349\5\60\31\2\u0345\u0346\7"+
		"\60\2\2\u0346\u0348\5\60\31\2\u0347\u0345\3\2\2\2\u0348\u034b\3\2\2\2"+
		"\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u0099\3\2\2\2\u034b\u0349"+
		"\3\2\2\2\u034c\u034e\5\22\n\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2"+
		"\u034e\u009b\3\2\2\2\u034f\u0351\7)\2\2\u0350\u0352\5\u009eP\2\u0351\u0350"+
		"\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0355\7\60\2\2"+
		"\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u0358"+
		"\5\u00a0Q\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2"+
		"\2\u0359\u035a\7*\2\2\u035a\u009d\3\2\2\2\u035b\u035d\5\u00a0Q\2\u035c"+
		"\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0366\5\u00b4"+
		"[\2\u035f\u0361\7\60\2\2\u0360\u0362\5\u00a0Q\2\u0361\u0360\3\2\2\2\u0361"+
		"\u0362\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\5\u00b4[\2\u0364\u035f"+
		"\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u009f\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036b\7\60\2\2\u036a\u0369\3"+
		"\2\2\2\u036b\u036c\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u00a1\3\2\2\2\u036e\u0370\7-\2\2\u036f\u0371\5\u00a4S\2\u0370\u036f\3"+
		"\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0374\7\60\2\2\u0373"+
		"\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\7."+
		"\2\2\u0376\u00a3\3\2\2\2\u0377\u037c\5\u00a6T\2\u0378\u0379\7\60\2\2\u0379"+
		"\u037b\5\u00a6T\2\u037a\u0378\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u00a5\3\2\2\2\u037e\u037c\3\2\2\2\u037f"+
		"\u0380\5\u00a8U\2\u0380\u0381\7\63\2\2\u0381\u0382\5\u00b4[\2\u0382\u0393"+
		"\3\2\2\2\u0383\u0384\5\u00c6d\2\u0384\u0385\7+\2\2\u0385\u0386\7,\2\2"+
		"\u0386\u0387\7-\2\2\u0387\u0388\5\u009aN\2\u0388\u0389\7.\2\2\u0389\u0393"+
		"\3\2\2\2\u038a\u038b\5\u00c8e\2\u038b\u038c\7+\2\2\u038c\u038d\5\u00aa"+
		"V\2\u038d\u038e\7,\2\2\u038e\u038f\7-\2\2\u038f\u0390\5\u009aN\2\u0390"+
		"\u0391\7.\2\2\u0391\u0393\3\2\2\2\u0392\u037f\3\2\2\2\u0392\u0383\3\2"+
		"\2\2\u0392\u038a\3\2\2\2\u0393\u00a7\3\2\2\2\u0394\u0398\5\u00c0a\2\u0395"+
		"\u0398\7\u0083\2\2\u0396\u0398\5\u00be`\2\u0397\u0394\3\2\2\2\u0397\u0395"+
		"\3\2\2\2\u0397\u0396\3\2\2\2\u0398\u00a9\3\2\2\2\u0399\u039a\7\u0082\2"+
		"\2\u039a\u00ab\3\2\2\2\u039b\u039d\7+\2\2\u039c\u039e\5\u00aeX\2\u039d"+
		"\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\7,"+
		"\2\2\u03a0\u00ad\3\2\2\2\u03a1\u03a6\5\u00b4[\2\u03a2\u03a3\7\60\2\2\u03a3"+
		"\u03a5\5\u00b4[\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4"+
		"\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u00af\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9"+
		"\u03b1\5r:\2\u03aa\u03ac\7)\2\2\u03ab\u03ad\5\u00b2Z\2\u03ac\u03ab\3\2"+
		"\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\7*\2\2\u03af"+
		"\u03aa\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2"+
		"\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b6\5|?\2\u03b5\u03b4"+
		"\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7\u0082\2"+
		"\2\u03b8\u03dd\3\2\2\2\u03b9\u03c1\7\u0082\2\2\u03ba\u03bc\7)\2\2\u03bb"+
		"\u03bd\5\u00b2Z\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be"+
		"\3\2\2\2\u03be\u03c0\7*\2\2\u03bf\u03ba\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1"+
		"\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2"+
		"\2\2\u03c4\u03c6\5|?\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7"+
		"\3\2\2\2\u03c7\u03dd\7\u0082\2\2\u03c8\u03c9\7\u0082\2\2\u03c9\u03ca\7"+
		"\64\2\2\u03ca\u03cc\7\u0082\2\2\u03cb\u03cd\5\u00acW\2\u03cc\u03cb\3\2"+
		"\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03d5\3\2\2\2\u03ce\u03cf\7\64\2\2\u03cf"+
		"\u03d1\7\u0082\2\2\u03d0\u03d2\5\u00acW\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2"+
		"\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03ce\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5"+
		"\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d8\u03da\5|?\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db"+
		"\3\2\2\2\u03db\u03dd\7\u0082\2\2\u03dc\u03a9\3\2\2\2\u03dc\u03b9\3\2\2"+
		"\2\u03dc\u03c8\3\2\2\2\u03dd\u00b1\3\2\2\2\u03de\u03e3\5\u00b4[\2\u03df"+
		"\u03e0\7\60\2\2\u03e0\u03e2\5\u00b4[\2\u03e1\u03df\3\2\2\2\u03e2\u03e5"+
		"\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u00b3\3\2\2\2\u03e5"+
		"\u03e3\3\2\2\2\u03e6\u03e7\b[\1\2\u03e7\u03e8\7t\2\2\u03e8\u0421\5\u00b4"+
		"[#\u03e9\u03ea\7h\2\2\u03ea\u0421\5\u00b4[\"\u03eb\u03ec\7a\2\2\u03ec"+
		"\u0421\5\u00b4[!\u03ed\u03ee\7\65\2\2\u03ee\u0421\5\u00b4[ \u03ef\u03f0"+
		"\7\66\2\2\u03f0\u0421\5\u00b4[\37\u03f1\u03f2\7\67\2\2\u03f2\u0421\5\u00b4"+
		"[\36\u03f3\u03f4\78\2\2\u03f4\u0421\5\u00b4[\35\u03f5\u03f6\79\2\2\u03f6"+
		"\u0421\5\u00b4[\34\u03f7\u03f8\7:\2\2\u03f8\u0421\5\u00b4[\33\u03f9\u0401"+
		"\5r:\2\u03fa\u03fc\7)\2\2\u03fb\u03fd\5\u00b2Z\2\u03fc\u03fb\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\7*\2\2\u03ff\u03fa\3\2"+
		"\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0406\5|?\2\u0405\u0404\3\2\2"+
		"\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\5\u00b2Z\2\u0408"+
		"\u0421\3\2\2\2\u0409\u040a\7d\2\2\u040a\u040c\5\u00b4[\2\u040b\u040d\5"+
		"\u00acW\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u0421\3\2\2\2"+
		"\u040e\u0410\7[\2\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411"+
		"\3\2\2\2\u0411\u0421\5x=\2\u0412\u0414\7[\2\2\u0413\u0412\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0421\5z>\2\u0416\u0421\7o\2"+
		"\2\u0417\u0421\7\u0082\2\2\u0418\u0421\5\u00bc_\2\u0419\u0421\5\u009c"+
		"O\2\u041a\u0421\5\u00a2R\2\u041b\u041c\7+\2\2\u041c\u041d\5\u00b2Z\2\u041d"+
		"\u041e\7,\2\2\u041e\u0421\3\2\2\2\u041f\u0421\7\b\2\2\u0420\u03e6\3\2"+
		"\2\2\u0420\u03e9\3\2\2\2\u0420\u03eb\3\2\2\2\u0420\u03ed\3\2\2\2\u0420"+
		"\u03ef\3\2\2\2\u0420\u03f1\3\2\2\2\u0420\u03f3\3\2\2\2\u0420\u03f5\3\2"+
		"\2\2\u0420\u03f7\3\2\2\2\u0420\u03f9\3\2\2\2\u0420\u0409\3\2\2\2\u0420"+
		"\u040f\3\2\2\2\u0420\u0413\3\2\2\2\u0420\u0416\3\2\2\2\u0420\u0417\3\2"+
		"\2\2\u0420\u0418\3\2\2\2\u0420\u0419\3\2\2\2\u0420\u041a\3\2\2\2\u0420"+
		"\u041b\3\2\2\2\u0420\u041f\3\2\2\2\u0421\u046f\3\2\2\2\u0422\u0423\f\32"+
		"\2\2\u0423\u0424\t\6\2\2\u0424\u046e\5\u00b4[\33\u0425\u0426\f\31\2\2"+
		"\u0426\u0427\t\7\2\2\u0427\u046e\5\u00b4[\32\u0428\u0429\f\30\2\2\u0429"+
		"\u042a\t\b\2\2\u042a\u046e\5\u00b4[\31\u042b\u042c\f\27\2\2\u042c\u042d"+
		"\t\t\2\2\u042d\u046e\5\u00b4[\30\u042e\u042f\f\26\2\2\u042f\u0430\7`\2"+
		"\2\u0430\u046e\5\u00b4[\27\u0431\u0432\f\25\2\2\u0432\u0433\7u\2\2\u0433"+
		"\u046e\5\u00b4[\26\u0434\u0435\f\24\2\2\u0435\u0436\t\n\2\2\u0436\u046e"+
		"\5\u00b4[\25\u0437\u0438\f\23\2\2\u0438\u0439\7I\2\2\u0439\u046e\5\u00b4"+
		"[\24\u043a\u043b\f\22\2\2\u043b\u043c\7J\2\2\u043c\u046e\5\u00b4[\23\u043d"+
		"\u043e\f\21\2\2\u043e\u043f\7K\2\2\u043f\u046e\5\u00b4[\22\u0440\u0441"+
		"\f\20\2\2\u0441\u0442\7L\2\2\u0442\u046e\5\u00b4[\21\u0443\u0444\f\17"+
		"\2\2\u0444\u0445\7M\2\2\u0445\u046e\5\u00b4[\20\u0446\u0447\f\16\2\2\u0447"+
		"\u0448\7\62\2\2\u0448\u0449\5\u00b4[\2\u0449\u044a\7\63\2\2\u044a\u044b"+
		"\5\u00b4[\17\u044b\u046e\3\2\2\2\u044c\u044d\f*\2\2\u044d\u044e\7)\2\2"+
		"\u044e\u044f\5\u00b2Z\2\u044f\u0450\7*\2\2\u0450\u046e\3\2\2\2\u0451\u0452"+
		"\f)\2\2\u0452\u0453\7\64\2\2\u0453\u045b\7\u0082\2\2\u0454\u0455\7\64"+
		"\2\2\u0455\u0457\7\u0082\2\2\u0456\u0458\5\u00acW\2\u0457\u0456\3\2\2"+
		"\2\u0457\u0458\3\2\2\2\u0458\u045a\3\2\2\2\u0459\u0454\3\2\2\2\u045a\u045d"+
		"\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u046e\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045e\u045f\f(\2\2\u045f\u046e\5\u00acW\2\u0460\u0461\f"+
		"%\2\2\u0461\u0462\6[\23\2\u0462\u046e\7\65\2\2\u0463\u0464\f$\2\2\u0464"+
		"\u0465\6[\25\2\u0465\u046e\7\66\2\2\u0466\u0467\f\r\2\2\u0467\u0468\7"+
		"\61\2\2\u0468\u046e\5\u00b2Z\2\u0469\u046a\f\f\2\2\u046a\u046b\5\u00ba"+
		"^\2\u046b\u046c\5\u00b2Z\2\u046c\u046e\3\2\2\2\u046d\u0422\3\2\2\2\u046d"+
		"\u0425\3\2\2\2\u046d\u0428\3\2\2\2\u046d\u042b\3\2\2\2\u046d\u042e\3\2"+
		"\2\2\u046d\u0431\3\2\2\2\u046d\u0434\3\2\2\2\u046d\u0437\3\2\2\2\u046d"+
		"\u043a\3\2\2\2\u046d\u043d\3\2\2\2\u046d\u0440\3\2\2\2\u046d\u0443\3\2"+
		"\2\2\u046d\u0446\3\2\2\2\u046d\u044c\3\2\2\2\u046d\u0451\3\2\2\2\u046d"+
		"\u045e\3\2\2\2\u046d\u0460\3\2\2\2\u046d\u0463\3\2\2\2\u046d\u0466\3\2"+
		"\2\2\u046d\u0469\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f"+
		"\u0470\3\2\2\2\u0470\u00b5\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0476\5\u00b8"+
		"]\2\u0473\u0475\5\u00b8]\2\u0474\u0473\3\2\2\2\u0475\u0478\3\2\2\2\u0476"+
		"\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u00b7\3\2\2\2\u0478\u0476\3\2"+
		"\2\2\u0479\u047b\5r:\2\u047a\u047c\5\u00b6\\\2\u047b\u047a\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047c\u0488\3\2\2\2\u047d\u047e\5r:\2\u047e\u047f\7)\2"+
		"\2\u047f\u0480\5\u00b6\\\2\u0480\u0482\7*\2\2\u0481\u0483\5\u00b6\\\2"+
		"\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0488\3\2\2\2\u0484\u0488"+
		"\7\u0082\2\2\u0485\u0488\5\u00bc_\2\u0486\u0488\5\u009cO\2\u0487\u0479"+
		"\3\2\2\2\u0487\u047d\3\2\2\2\u0487\u0484\3\2\2\2\u0487\u0485\3\2\2\2\u0487"+
		"\u0486\3\2\2\2\u0488\u00b9\3\2\2\2\u0489\u048a\t\13\2\2\u048a\u00bb\3"+
		"\2\2\2\u048b\u048e\t\f\2\2\u048c\u048e\5\u00be`\2\u048d\u048b\3\2\2\2"+
		"\u048d\u048c\3\2\2\2\u048e\u00bd\3\2\2\2\u048f\u0490\t\r\2\2\u0490\u00bf"+
		"\3\2\2\2\u0491\u0494\7\u0082\2\2\u0492\u0494\5\u00c2b\2\u0493\u0491\3"+
		"\2\2\2\u0493\u0492\3\2\2\2\u0494\u00c1\3\2\2\2\u0495\u0498\5\u00c4c\2"+
		"\u0496\u0498\t\16\2\2\u0497\u0495\3\2\2\2\u0497\u0496\3\2\2\2\u0498\u00c3"+
		"\3\2\2\2\u0499\u04b5\7^\2\2\u049a\u04b5\7_\2\2\u049b\u04b5\7`\2\2\u049c"+
		"\u04b5\7a\2\2\u049d\u04b5\7b\2\2\u049e\u04b5\7c\2\2\u049f\u04b5\7d\2\2"+
		"\u04a0\u04b5\7\b\2\2\u04a1\u04b5\5v<\2\u04a2\u04b5\7e\2\2\u04a3\u04b5"+
		"\7f\2\2\u04a4\u04b5\7g\2\2\u04a5\u04b5\7h\2\2\u04a6\u04b5\7i\2\2\u04a7"+
		"\u04b5\7j\2\2\u04a8\u04b5\7k\2\2\u04a9\u04b5\7l\2\2\u04aa\u04b5\7m\2\2"+
		"\u04ab\u04b5\7n\2\2\u04ac\u04b5\7o\2\2\u04ad\u04b5\7p\2\2\u04ae\u04b5"+
		"\7q\2\2\u04af\u04b5\7r\2\2\u04b0\u04b5\7s\2\2\u04b1\u04b5\7t\2\2\u04b2"+
		"\u04b5\7u\2\2\u04b3\u04b5\7v\2\2\u04b4\u0499\3\2\2\2\u04b4\u049a\3\2\2"+
		"\2\u04b4\u049b\3\2\2\2\u04b4\u049c\3\2\2\2\u04b4\u049d\3\2\2\2\u04b4\u049e"+
		"\3\2\2\2\u04b4\u049f\3\2\2\2\u04b4\u04a0\3\2\2\2\u04b4\u04a1\3\2\2\2\u04b4"+
		"\u04a2\3\2\2\2\u04b4\u04a3\3\2\2\2\u04b4\u04a4\3\2\2\2\u04b4\u04a5\3\2"+
		"\2\2\u04b4\u04a6\3\2\2\2\u04b4\u04a7\3\2\2\2\u04b4\u04a8\3\2\2\2\u04b4"+
		"\u04a9\3\2\2\2\u04b4\u04aa\3\2\2\2\u04b4\u04ab\3\2\2\2\u04b4\u04ac\3\2"+
		"\2\2\u04b4\u04ad\3\2\2\2\u04b4\u04ae\3\2\2\2\u04b4\u04af\3\2\2\2\u04b4"+
		"\u04b0\3\2\2\2\u04b4\u04b1\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b3\3\2"+
		"\2\2\u04b5\u00c5\3\2\2\2\u04b6\u04b7\6d\30\2\u04b7\u04b8\7\u0082\2\2\u04b8"+
		"\u04b9\5\u00a8U\2\u04b9\u00c7\3\2\2\2\u04ba\u04bb\6e\31\2\u04bb\u04bc"+
		"\7\u0082\2\2\u04bc\u04bd\5\u00a8U\2\u04bd\u00c9\3\2\2\2\u04be\u04c3\7"+
		"/\2\2\u04bf\u04c3\7\2\2\3\u04c0\u04c3\6f\32\2\u04c1\u04c3\6f\33\2\u04c2"+
		"\u04be\3\2\2\2\u04c2\u04bf\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2"+
		"\2\2\u04c3\u00cb\3\2\2\2\u04c4\u04c5\7\2\2\3\u04c5\u00cd\3\2\2\2\u0085"+
		"\u00cf\u00d6\u00e5\u00ea\u00f0\u00fb\u010c\u0112\u0119\u011e\u0128\u012f"+
		"\u0133\u0139\u0141\u0147\u014b\u015a\u015e\u0165\u016b\u0175\u0188\u018e"+
		"\u0192\u0196\u019a\u019c\u01a3\u01a8\u01b1\u01ba\u01cd\u01d1\u01d5\u01df"+
		"\u01e3\u01f9\u01fd\u0203\u0209\u021b\u021f\u0221\u0228\u022e\u0233\u0249"+
		"\u025c\u0260\u0263\u0265\u0281\u0287\u028b\u028f\u0293\u0297\u029b\u029f"+
		"\u02a3\u02a5\u02ab\u02b6\u02c9\u02cc\u02d9\u02dc\u02e2\u02e6\u02e9\u02f4"+
		"\u02f8\u02fb\u0302\u0307\u0314\u0318\u031b\u0326\u0331\u0339\u0341\u0349"+
		"\u034d\u0351\u0354\u0357\u035c\u0361\u0366\u036c\u0370\u0373\u037c\u0392"+
		"\u0397\u039d\u03a6\u03ac\u03b1\u03b5\u03bc\u03c1\u03c5\u03cc\u03d1\u03d5"+
		"\u03d9\u03dc\u03e3\u03fc\u0401\u0405\u040c\u040f\u0413\u0420\u0457\u045b"+
		"\u046d\u046f\u0476\u047b\u0482\u0487\u048d\u0493\u0497\u04b4\u04c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}