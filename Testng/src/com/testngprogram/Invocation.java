package com.testngprogram;

import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount=10)
	public void testinvocationTest()
	{
		System.out.println("testmethod1");
	}

}
