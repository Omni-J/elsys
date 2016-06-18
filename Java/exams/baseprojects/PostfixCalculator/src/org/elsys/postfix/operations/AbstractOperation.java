package org.elsys.postfix.operations;

import org.elsys.postfix.Calculator;

public abstract class AbstractOperation implements Operation {

	private Calculator calculator;

	private String token;

	public AbstractOperation(Calculator calculator, String token) {
		this.calculator = calculator;
		this.token = token;
	}
	
	@Override
	public Calculator getCalculator() {
		return calculator;
	}

	@Override
	public String getToken() {
		return token;
	}

	public void postRes(double result){
		getCalculator().addValue(result);
		System.out.println(result);
	}
	
	public  Double[] getVal(int NumVal){
		Double[] val = new Double[NumVal];
		for (int i = 0; i < NumVal; i++){
			val[i] = getCalculator().popValue();
		}
		return val;
	}
}
