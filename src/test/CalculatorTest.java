package test;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator obj = new Calculator();
	
	@Test
	public void Test1() {
		int a = 10;
		int b = 20;
		
		int result = obj.add(a, b);
		Assert.assertEquals(30, result);
		
	}

	@Test
	public void Test2() {
		int a = 20;
		int b = 10;
		
		int result = obj.Subtract(a, b);
		Assert.assertEquals(10, result);
		
	}
}
