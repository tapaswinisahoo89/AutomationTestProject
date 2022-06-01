package com.testngprogram;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test(enabled=false)
	public void testmethodTest()
	{
		System.out.println("testmethod1");
	}
	
	@Test
	public void testmethod1Test()
	{
		System.out.println("testmethod1");
	}
	
	@Test
	public void testmethod2Test()
	{
		System.out.println("testmethod1");
	}

	@Test
	public void testmethod3Test()
	{
		System.out.println("testmethod1");
	}
	@Test(enabled=false)
	public void testmethod4Test()
	{
		System.out.println("testmethod1");
	}




}
