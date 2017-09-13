package visitor;

import ast.DivExpr;
import ast.Expr;
import ast.MulExpr;
import ast.NumExpr;
import ast.ParExpr;
import ast.SubExpr;
import ast.SumExpr;

public class PrettyPrintVisitor implements IVisitor<Void> {
	public StringBuilder exp;
	
	//pode passar algum argumento, como uma Symbol Table
	public PrettyPrintVisitor() {
		exp = new StringBuilder();
	}
	
	@Override
	public Void visit(Expr e) {
		e.accept(this);
		return null;
	}

	@Override
	public Void visit(NumExpr e) {
		exp.append(e.num);
		return null;
	}

	@Override
	public Void visit(SumExpr e) {
		//SumExpr e = new SumExpr(NumExpr(25),NumExpr(3));
		exp.append("( ");
		e.e1.accept(this);//exp.append(NumExpr(25))
		exp.append(" + ");
		e.e2.accept(this);//exp.append(NumExpr(3))
		exp.append(" )");
		return null;
	}

	@Override
	public Void visit(MulExpr e) {
		exp.append("( ");
		e.e1.accept(this);
		exp.append(" * ");
		e.e2.accept(this);
		exp.append(" )");
		return null;
	}

	@Override
	public Void visit(SubExpr e) {
		exp.append("( ");
		e.e1.accept(this);
		exp.append(" - ");
		e.e2.accept(this);
		exp.append(" )");
		return null;
	}

	@Override
	public Void visit(DivExpr e) {
		exp.append("( ");
		e.e1.accept(this);
		exp.append(" / ");
		e.e2.accept(this);
		exp.append(" )");
		return null;
	}

	@Override
	public Void visit(ParExpr e) {
		exp.append("( ");
		e.e.accept(this);
		exp.append(" )");
		return null;
	}
}