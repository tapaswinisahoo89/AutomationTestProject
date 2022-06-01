package com.testngprogram;

import org.testng.annotations.Test;

public class Createemployee {
	@Test
	public void vCreateemployeedata()
	{
		System.out.println("Enter employee data");
	}
	@Test(dependsOnMethods="vCreateemployeedata")
	public void Updateemployeedata()
	{
		System.out.println("update employee data");
	}

}
