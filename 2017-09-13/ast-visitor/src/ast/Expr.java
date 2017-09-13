package ast;

import visitor.IVisitor;
import visitor.IntVisitor;
import visitor.VoidVisitor;

public abstract class Expr {	

	//public abstract double eval();
	//public abstract String prettyPrint();
	//public abstract String posFixa();
	public abstract <T> T accept(IVisitor<T> v);
	//public abstract void accept(VoidVisitor v);
	//public abstract int accept(IntVisitor v);
}