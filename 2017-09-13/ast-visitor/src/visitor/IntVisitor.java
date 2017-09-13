package visitor;

import ast.DivExpr;
import ast.Expr;
import ast.MulExpr;
import ast.NumExpr;
import ast.ParExpr;
import ast.SubExpr;
import ast.SumExpr;

public interface IntVisitor {
	int visit(Expr e);
	int visit(NumExpr e);
	int visit(SumExpr e);
	int visit(MulExpr e);
	int visit(SubExpr e);
	int visit(DivExpr e);
	int visit(ParExpr e);
}
