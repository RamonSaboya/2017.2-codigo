package visitor;

import ast.DivExpr;
import ast.Expr;
import ast.MulExpr;
import ast.NumExpr;
import ast.ParExpr;
import ast.SubExpr;
import ast.SumExpr;

public interface IVisitor<T> {
	T visit(Expr e);
	T visit(NumExpr e);
	T visit(SumExpr e);
	T visit(MulExpr e);
	T visit(SubExpr e);
	T visit(DivExpr e);
	T visit(ParExpr e);
}
