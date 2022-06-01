package com.testngprogram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2Test {
	@BeforeClass
	public void bfrcls()
	{
		System.out.println("open the browser");
	}
	@BeforeMethod
	public void bfrmthd()
	{
		
		System.out.println("Login to app");
	}
	@Test
	public void Testmethod1Test()
	{
		System.out.println("Testcase1");
	}
	@Test
	public void Testmethod2Test()
	{
		System.out.println("Testcase2");
	}
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("Logout");
		
	}
	@AfterClass
	public void aftercls()
	{
		System.out.println("Close the browser");	
	}

}
