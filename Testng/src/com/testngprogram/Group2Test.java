package com.testngprogram;

import org.testng.annotations.Test;

public class Group2Test {
	@Test(groups="Regression")
	public void Group2method1()
	{
		System.out.println("Group method1 in testNg2");
	}
	@Test(groups="Smoke")
	public void Group2method2()
	{
		System.out.println("Group method2 in testNg2");
	}
	@Test(groups="Regression")
	public void Group2method3()
	{
		System.out.println("Group method3 in testNg2");
	}


}
