package org.elsys.postfix.operations.test;

import static org.junit.Assert.assertEquals;

import org.elsys.postfix.Calculator;
import org.elsys.postfix.operations.Abs;
import org.junit.Test;

public class AbsTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
		Abs tm = new Abs(calculator, "abs");
		calculator.addValue(-5);
		tm.calculate();
		assertEquals(5, calculator.popValue(), 0.00001);
	}
	
}
