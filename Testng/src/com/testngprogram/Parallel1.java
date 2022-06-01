package com.testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void parallelTest1()
	{
		String Expectedtext="Facebook helps you connect and share with the people in your life";
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver f=new ChromeDriver();
		f.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		f.get("https://www.facebook.com/");
		String Actualtext=f.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
	}
	  

}
