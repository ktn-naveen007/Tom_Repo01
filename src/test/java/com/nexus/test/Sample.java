package com.nexus.test;

import org.junit.Test;

import junit.framework.Assert;

public class Sample {
	
	@Test
	public void m1(){
		System.out.println("unit test case");
		Assert.assertEquals(10, 10);
	}

}
