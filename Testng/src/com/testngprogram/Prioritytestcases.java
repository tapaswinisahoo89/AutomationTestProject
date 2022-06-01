package com.testngprogram;

import org.testng.annotations.Test;

public class Prioritytestcases {
	@Test(priority=3)
	public void Groupmethod1()
	{
		System.out.println("Group method1 in testNg1");
	}
	@Test(priority=1)
	public void Groupmethod2()
	{
		System.out.println("Group method2 in testNg1");
	}
	@Test(priority=2)
	public void Groupmethod3()
	{
		System.out.println("Group method3 in testNg1");
	}


}
