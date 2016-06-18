package org.elsys.postfix.operations.test;

import static org.junit.Assert.assertEquals;

import org.elsys.postfix.Calculator;
import org.elsys.postfix.operations.Abs;
import org.elsys.postfix.operations.Multi3;
import org.junit.Test;

public class Multi3Test {
	
	@Test
	public void test() {
		Calculator calculator = new Calculator();
		Multi3 tm = new Multi3(calculator, "*-*");
		calculator.addValue(-5);
		calculator.addValue(-5);
		calculator.addValue(-5);
		tm.calculate();
		assertEquals(125, calculator.popValue(), 0.00001);
	}

}
