package com.luckymart.jmp;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestActor {
	
	@Test
	public void testAct(){
		Actor actorObject = new Actor();
		Assert.assertEquals(actorObject.act("Chiranjeevi"), "Chiranjeevi is acting...");
		Assert.assertEquals(actorObject.act("Nagarjuna"),"Nagarjuna is acting...");
	}

}
