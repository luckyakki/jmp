package com.luckymart.jmp;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestActor {
	
	@Test
	public void testAct(){
		Actor actorObject = new Actor();
		Assert.assertEquals("Chiranjeevi is acting...", actorObject.act("Chiranjeevi"));
		Assert.assertEquals("Nagarjuna is acting...", actorObject.act("Nagarjuna"));
	}

}
