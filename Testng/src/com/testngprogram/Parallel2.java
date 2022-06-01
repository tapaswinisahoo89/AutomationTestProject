package com.testngprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void parallelTest2()
	{
		int no_of_links=319;
		System.setProperty("webdriver.gecko.driver", "./Driver1/geckodriver.exe");
		WebDriver f=new FirefoxDriver();
		f.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		f.get("https://www.bbc.com/");
		f.manage().window().maximize();
		List<WebElement> lst=f.findElements(By.xpath("//a"));
		int linkcount=lst.size();
	}

}
