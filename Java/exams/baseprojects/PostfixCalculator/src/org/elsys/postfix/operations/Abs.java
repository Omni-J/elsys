package org.elsys.postfix.operations;

import org.elsys.postfix.Calculator;

public class Abs extends AbstractOperation implements Operation{

	public Abs(Calculator calculator, String token) {
		super(calculator, token);
		// TODO Auto-generated constructor stub

	}
	
	@Override
	public void calculate(){
		Double[] res = this.getVal(1);
		res[0] = Math.abs(res[0]);
		this.postRes(res[0]);
	}

}
