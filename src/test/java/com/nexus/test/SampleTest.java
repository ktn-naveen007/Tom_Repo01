package com.nexus.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(BlockJUnit4ClassRunner.class)
public class SampleTest {
	
	@Test
	public void m1(){
		System.out.println("unit test case");
		Assert.assertEquals(10, 10);
	}

}
