package com.luckymart.jmp.testmath;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luckymart.jmp.math.Subtract;

public class TestSubtract {
	public Subtract subtractObj;
	
	@Test
	public void testSubtract(){
		subtractObj = new Subtract();
		Assert.assertEquals(5,subtractObj.subtractNumbers(10, 5));
	}

}
