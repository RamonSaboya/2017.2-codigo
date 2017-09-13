package ast;

import visitor.IVisitor;
import visitor.IntVisitor;
import visitor.VoidVisitor;

public class ParExpr extends Expr {

	// private...
	public Expr e;

	public ParExpr(Expr e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return " ( " + e.toString() + " ) ";
	}

	/*
	 * @Override public double eval() { return e.eval(); }
	 * 
	 * @Override public String prettyPrint() { return this.toString(); }
	 * 
	 * @Override public String posFixa() { return e.posFixa(); } /*
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
