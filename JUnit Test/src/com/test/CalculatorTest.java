package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.model.Calculator;

public class CalculatorTest 
{
	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		int result = cal.sum(200, 300);

		assertEquals("Expected result is not match with original", 500, result);

	}
	
	@Ignore
	@Test
	public void testMultiply()
	{
		Calculator cal=new Calculator();
		int r=cal.multiply(2, 3);
		assertEquals("Expected result is not match with original", 6, r);
	}


}

