package visitor;

import ast.DivExpr;
import ast.Expr;
import ast.MulExpr;
import ast.NumExpr;
import ast.ParExpr;
import ast.SubExpr;
import ast.SumExpr;

public interface VoidVisitor {
	void visit(Expr e);
	void visit(NumExpr e);
	void visit(SumExpr e);
	void visit(MulExpr e);
	void visit(SubExpr e);
	void visit(DivExpr e);
	void visit(ParExpr e);
}
