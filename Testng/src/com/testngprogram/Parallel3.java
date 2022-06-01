package com.testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	public void parallelTest3()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver f=new ChromeDriver();
		f.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		f.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement wb=f.findElement(By.cssSelector(".context-menu-one"));
		
        Actions act=new Actions(f);
        act.contextClick(wb).build().perform();
        String copy=f.findElement(By.cssSelector(".context-menu-one")).getText();
        System.out.println(copy);
	}

}
