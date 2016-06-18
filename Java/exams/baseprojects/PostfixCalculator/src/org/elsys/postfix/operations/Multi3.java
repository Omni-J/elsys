package org.elsys.postfix.operations;

import org.elsys.postfix.Calculator;

public class Multi3 extends AbstractOperation implements Operation{

	public Multi3(Calculator calculator, String token) {
		super(calculator, token);
	}

	@Override
	public void calculate() {
		Double[] values = this.getVal(3); // how many we need
		double result = -(values[0] * values[1] * values[2]);
		this.postRes(result);
	}
	
}
