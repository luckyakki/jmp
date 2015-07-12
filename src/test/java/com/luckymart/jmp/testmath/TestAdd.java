package com.luckymart.jmp.testmath;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luckymart.jmp.math.Add;


public class TestAdd {
	
	private Add addObj ;
	
	@Test(groups="positive", priority=1)
	public void testAdd(){
		addObj = new Add();
		Assert.assertEquals(15, addObj.addNumbers(10, 5));
	}
	
	@Test(groups="negative", priority=1)
	public void testAddWithAnIntAndCharacter(){
		addObj = new Add();
		Assert.assertNotEquals(15, addObj.addNumbers(10, 'c'));
	}
	
	@Test(groups="positive", priority=1)
	public void testAddWithTwoCharacters(){
		addObj = new Add();
		Assert.assertNotEquals(15, addObj.addNumbers('c', 'c'));
	}
	
	@Test(groups="negative", priority=1)
	public void testAddWithLong(){
		addObj = new Add();
		Assert.assertNotEquals(15, addObj.addNumbers(345678, 345678));
	}

}
