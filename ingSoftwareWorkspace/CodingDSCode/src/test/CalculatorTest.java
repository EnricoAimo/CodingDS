package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import classi.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		
	    Calculator calculator = new Calculator();
	    int result = calculator.add(2, 3);
	    assertEquals(5, result);
	}

	@Test
	public void testSubtract() {
	    Calculator calculator = new Calculator();
	    int result = calculator.subtract(5, 3);
	    assertEquals(2, result);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
	    Calculator calculator = new Calculator();
	    int result = calculator.divide(5, 0);
	}
	
	@Test
	public void testCalculatorInstance() {
	    Calculator calculator = new Calculator();
	    assertNotNull(calculator);
	}

	@Test
	public void testMultilply() {
	    Calculator calculator = new Calculator();
	    int result = calculator.multiply(5, 3);
	    assertEquals(15, result);
	}
	
	
	@Test
	public void testRadice() {
	    Calculator calculator = new Calculator();
	    double result = calculator.radice(9);
	    assertEquals(3 ,result, 0.001);
	}
	

}
