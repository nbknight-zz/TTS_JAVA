package practice;

import org.junit.Before;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator calc;
	
	@Before
	public void setup() {
		calc = new Calculator();
	}

	@Test
	public void testAdd() {
//		Calculator calc = new Calculator();
		int num1 = 5;
		int num2 = 10;
		assertEquals(calc.add(num1, num2),15,0);
	}

	@Test
	public void testSubtract() {
//		Calculator calc = new Calculator();
		int num1 = 10;
		int num2 = 5;
		assertEquals(calc.subtract(num1, num2),5,0);
	}

	@Test
	public void testDivide() {
//		Calculator calc = new Calculator();
		int num1 = 10;
		int num2 = 2;
		assertEquals(calc.divide(num1, num2),5,0);
	}

	@Test
	public void testMultiply() {
//		Calculator calc = new Calculator();
		int num1 = 5;
		int num2 = 10;
		assertEquals(calc.multiply(num1, num2), 50, 0);
	}

}
