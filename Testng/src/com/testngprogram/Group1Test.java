package com.testngprogram;

import org.testng.annotations.Test;

public class Group1Test {
	@Test(groups="Smoke")
	public void Groupmethod1()
	{
		System.out.println("Group method1 in testNg1");
	}
	@Test(groups="Regression")
	public void Groupmethod2()
	{
		System.out.println("Group method2 in testNg1");
	}
	@Test(groups="Smoke")
	public void Groupmethod3()
	{
		System.out.println("Group method3 in testNg1");
	}

}
