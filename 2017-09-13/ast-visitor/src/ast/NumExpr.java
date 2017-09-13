package ast;

import visitor.IVisitor;
import visitor.IntVisitor;
import visitor.VoidVisitor;

public class NumExpr extends Expr {
	//volte para private, isso nao eh legal...
	public int num;

	public int getNum() {
		return num;
	}
	
	public NumExpr(int n) {
		this.num = n;
	}

	@Override
	public String toString() {
		return " " + num + " ";
	}
	/*
	@Override
	public double eval() {
		return num;
	}

	@Override
	public String prettyPrint() {
		return this.toString();
	}

	@Override
	public String posFixa() {
		return this.toString();
	}
/**/
	@Override
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}
	/*
	@Override
	public int accept(IntVisitor v) {
		return v.visit(this);
	}

	@Override
	public void accept(VoidVisitor v) {
		v.visit(this);
	}
	/**/

}
