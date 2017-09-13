package ast;

import visitor.IVisitor;
import visitor.IntVisitor;
import visitor.VoidVisitor;

public class MulExpr extends Expr {

	// private...
	public Expr e1, e2;

	public MulExpr(Expr e1, Expr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public String toString() {
		return e1.toString() + " * " + e2.toString();
	}

	/*
	 * @Override public double eval() { return e1.eval() * e2.eval(); }
	 * 
	 * @Override public String prettyPrint() { return this.toString(); }
	 * 
	 * @Override public String posFixa() { return e1.posFixa() + " " +
	 * e2.posFixa() + " * "; } /*
	 */
	@Override
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}
	/*
	 * @Override public int accept(IntVisitor v) { return v.visit(this); }
	 * 
	 * @Override public void accept(VoidVisitor v) { v.visit(this); } /*
	 */
}
