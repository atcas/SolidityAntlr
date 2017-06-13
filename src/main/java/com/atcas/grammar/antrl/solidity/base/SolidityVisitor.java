// Generated from Solidity.g4 by ANTLR 4.5
package com.atcas.grammar.antrl.solidity.base;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SolidityParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SolidityVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SolidityParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SolidityParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(SolidityParser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(SolidityParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#varGlobalSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarGlobalSolidity(SolidityParser.VarGlobalSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#mappingGlobalSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingGlobalSolidity(SolidityParser.MappingGlobalSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#structGlobalSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructGlobalSolidity(SolidityParser.StructGlobalSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#enumGlobalSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumGlobalSolidity(SolidityParser.EnumGlobalSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valuesenumGlobalSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesenumGlobalSolidity(SolidityParser.ValuesenumGlobalSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#sourceElementsFunctionSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElementsFunctionSolidity(SolidityParser.SourceElementsFunctionSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#sourceElementFunctionSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElementFunctionSolidity(SolidityParser.SourceElementFunctionSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#contractElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractElements(SolidityParser.ContractElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#contractElementGenerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractElementGenerico(SolidityParser.ContractElementGenericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#importElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportElement(SolidityParser.ImportElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#libraryElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryElement(SolidityParser.LibraryElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#contractElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractElement(SolidityParser.ContractElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#contractExtendElementConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractExtendElementConstructor(SolidityParser.ContractExtendElementConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#contractExtendElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractExtendElement(SolidityParser.ContractExtendElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#modifierExtendFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierExtendFunction(SolidityParser.ModifierExtendFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#modifierExtendFunctionConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierExtendFunctionConstructor(SolidityParser.ModifierExtendFunctionConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SolidityParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SolidityParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(SolidityParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclarationListFunctionSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationListFunctionSolidity(SolidityParser.VariableDeclarationListFunctionSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclarationNameEventSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationNameEventSolidity(SolidityParser.VariableDeclarationNameEventSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclarationNameFunctionSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationNameFunctionSolidity(SolidityParser.VariableDeclarationNameFunctionSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclarationNameSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationNameSolidity(SolidityParser.VariableDeclarationNameSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclarationSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationSolidity(SolidityParser.VariableDeclarationSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(SolidityParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SolidityParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#initialiser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialiser(SolidityParser.InitialiserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(SolidityParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(SolidityParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarStatement(SolidityParser.ForVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(SolidityParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarInStatement(SolidityParser.ForVarInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(SolidityParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(SolidityParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(SolidityParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(SolidityParser.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(SolidityParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(SolidityParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#labelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelledStatement(SolidityParser.LabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(SolidityParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(SolidityParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#catchProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchProduction(SolidityParser.CatchProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#finallyProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyProduction(SolidityParser.FinallyProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#debuggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebuggerStatement(SolidityParser.DebuggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#typeSolidityDataReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSolidityDataReturn(SolidityParser.TypeSolidityDataReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#formalParameterListGenericSolidityReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterListGenericSolidityReturn(SolidityParser.FormalParameterListGenericSolidityReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#returnfunctionSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnfunctionSolidity(SolidityParser.ReturnfunctionSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#mappingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingStatement(SolidityParser.MappingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#typeSolidityEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSolidityEvent(SolidityParser.TypeSolidityEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#singletypeSolidityEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingletypeSolidityEvent(SolidityParser.SingletypeSolidityEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#typeSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSolidity(SolidityParser.TypeSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#singletypeSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingletypeSolidity(SolidityParser.SingletypeSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#typeSolidityData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSolidityData(SolidityParser.TypeSolidityDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#keyWordSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyWordSolidity(SolidityParser.KeyWordSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#timeUnitsSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeUnitsSolidity(SolidityParser.TimeUnitsSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#etherUnitsSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtherUnitsSolidity(SolidityParser.EtherUnitsSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#visibilityTypeSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityTypeSolidity(SolidityParser.VisibilityTypeSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(SolidityParser.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#modifierDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierDeclaration(SolidityParser.ModifierDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#usingType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingType(SolidityParser.UsingTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(SolidityParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionDeclarationInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationInterface(SolidityParser.FunctionDeclarationInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#propertiesExtendFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesExtendFunctions(SolidityParser.PropertiesExtendFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#propertiesExtendFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesExtendFunction(SolidityParser.PropertiesExtendFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionDeclarationFallBack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationFallBack(SolidityParser.FunctionDeclarationFallBackContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionDeclarationAnonymous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationAnonymous(SolidityParser.FunctionDeclarationAnonymousContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#eventDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDeclaration(SolidityParser.EventDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(SolidityParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#formalParameterListGenericSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterListGenericSolidity(SolidityParser.FormalParameterListGenericSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#formalParameterListSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterListSolidity(SolidityParser.FormalParameterListSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#formalParameterListSolidityEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterListSolidityEvent(SolidityParser.FormalParameterListSolidityEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(SolidityParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(SolidityParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(SolidityParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#elision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElision(SolidityParser.ElisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(SolidityParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyNameAndValueList(SolidityParser.PropertyNameAndValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpressionAssignment(SolidityParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyGetter(SolidityParser.PropertyGetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySetter(SolidityParser.PropertySetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(SolidityParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySetParameterList(SolidityParser.PropertySetParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SolidityParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(SolidityParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#varSolidityDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSolidityDeclaration(SolidityParser.VarSolidityDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(SolidityParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(SolidityParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(SolidityParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EtherUnitsSolidityExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtherUnitsSolidityExpression(SolidityParser.EtherUnitsSolidityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(SolidityParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(SolidityParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(SolidityParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(SolidityParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimeUnitsSolidityExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeUnitsSolidityExpression(SolidityParser.TimeUnitsSolidityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SolidityParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecreaseExpression(SolidityParser.PreDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsExpression(SolidityParser.ArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(SolidityParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(SolidityParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecreaseExpression(SolidityParser.PostDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(SolidityParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(SolidityParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofExpression(SolidityParser.InstanceofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpression(SolidityParser.UnaryPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(SolidityParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(SolidityParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXOrExpression(SolidityParser.BitXOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SolidityParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitShiftExpression(SolidityParser.BitShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SolidityParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SolidityParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(SolidityParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(SolidityParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNotExpression(SolidityParser.BitNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(SolidityParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(SolidityParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(SolidityParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(SolidityParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(SolidityParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(SolidityParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModifierSolidityExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierSolidityExpression(SolidityParser.ModifierSolidityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentTypesIndexArrayExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentTypesIndexArrayExpression(SolidityParser.ArgumentTypesIndexArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpression(SolidityParser.BitAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpression(SolidityParser.BitOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperatorExpression(SolidityParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidExpression(SolidityParser.VoidExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expressionSequenceParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequenceParam(SolidityParser.ExpressionSequenceParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#singleExpressionParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpressionParam(SolidityParser.SingleExpressionParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(SolidityParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SolidityParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SolidityParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(SolidityParser.IdentifierNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(SolidityParser.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SolidityParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(SolidityParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(SolidityParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(SolidityParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(SolidityParser.EofContext ctx);
}