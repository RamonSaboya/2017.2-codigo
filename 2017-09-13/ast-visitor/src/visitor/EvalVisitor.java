package visitor;

import ast.DivExpr;
import ast.Expr;
import ast.MulExpr;
import ast.NumExpr;
import ast.ParExpr;
import ast.SubExpr;
import ast.SumExpr;

public class EvalVisitor implements IVisitor<Integer> {
	
	@Override
	public Integer visit(Expr e) {
		//System.out.println("visit(Expr e)");
		return e.accept(this);
	}

	@Override
	public Integer visit(NumExpr e) {
		return e.num;
	}

	@Override
	public Integer visit(SumExpr e) {
		return e.e1.accept(this) + e.e2.accept(this);
	}

	@Override
	public Integer visit(MulExpr e) {
		return e.e1.accept(this) * e.e2.accept(this);
	}

	@Override
	public Integer visit(SubExpr e) {
		return e.e1.accept(this) - e.e2.accept(this);
	}

	@Override
	public Integer visit(DivExpr e) {
		//evitar divisao por zero
		return e.e1.accept(this) / e.e2.accept(this);
	}

	@Override
	public Integer visit(ParExpr e) {
		return e.e.accept(this);
	}

}
