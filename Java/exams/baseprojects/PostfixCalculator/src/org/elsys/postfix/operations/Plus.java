package org.elsys.postfix.operations;

import org.elsys.postfix.Calculator;

public class Plus extends AbstractOperation implements Operation {

	public Plus(Calculator calculator, String token) {
		super(calculator, token);
	}

	@Override
	public void calculate() {
		Double[] res = this.getVal(2);
		double result = res[0] + res[1];
		this.postRes(result);
	}

}
