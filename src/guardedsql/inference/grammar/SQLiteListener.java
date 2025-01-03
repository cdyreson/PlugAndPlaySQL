// Generated from SQLite.g4 by ANTLR 4.7.1

    package guardedsql.inference.grammar;
    import guardedsql.database.DB;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLiteParser}.
 */
public interface SQLiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLiteParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLiteParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLiteParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLiteParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLiteParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLiteParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLiteParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLiteParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLiteParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLiteParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLiteParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#path_expr}.
	 * @param ctx the parse tree
	 */
	void enterPath_expr(SQLiteParser.Path_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#path_expr}.
	 * @param ctx the parse tree
	 */
	void exitPath_expr(SQLiteParser.Path_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLiteParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLiteParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(SQLiteParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(SQLiteParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(SQLiteParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(SQLiteParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLiteParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLiteParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SQLiteParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SQLiteParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLiteParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLiteParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLiteParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLiteParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLiteParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLiteParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLiteParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLiteParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLiteParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLiteParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(SQLiteParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(SQLiteParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(SQLiteParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(SQLiteParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#groupby_expr}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_expr(SQLiteParser.Groupby_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#groupby_expr}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_expr(SQLiteParser.Groupby_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(SQLiteParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(SQLiteParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(SQLiteParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(SQLiteParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SQLiteParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SQLiteParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(SQLiteParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(SQLiteParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLiteParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLiteParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLiteParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLiteParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLiteParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLiteParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLiteParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLiteParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLiteParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLiteParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SQLiteParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SQLiteParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLiteParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLiteParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLiteParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLiteParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLiteParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLiteParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLiteParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLiteParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLiteParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLiteParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLiteParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLiteParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLiteParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLiteParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLiteParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLiteParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLiteParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLiteParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLiteParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLiteParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLiteParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLiteParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SQLiteParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SQLiteParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SQLiteParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SQLiteParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SQLiteParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SQLiteParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SQLiteParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SQLiteParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SQLiteParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SQLiteParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLiteParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLiteParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_rename_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_rename_alias(SQLiteParser.Table_rename_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_rename_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_rename_alias(SQLiteParser.Table_rename_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SQLiteParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SQLiteParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLiteParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLiteParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#guard_key_name}.
	 * @param ctx the parse tree
	 */
	void enterGuard_key_name(SQLiteParser.Guard_key_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#guard_key_name}.
	 * @param ctx the parse tree
	 */
	void exitGuard_key_name(SQLiteParser.Guard_key_nameContext ctx);
}