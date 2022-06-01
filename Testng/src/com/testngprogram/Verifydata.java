package com.testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verifydata {
	@Test
	public void verifytext()
	{
		String Expectedtext="Facebook helps you connect and share with the people in your life";
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver f=new ChromeDriver();
		f.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		f.get("https://www.facebook.com/");
		String Actualtext=f.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
		//soft assert
				SoftAssert as=new SoftAssert();
				as.assertNotEquals(Actualtext,Expectedtext,"Result does not match");
				as.assertTrue(false);
				as.assertTrue(true);
				as.assertEquals(11, 15,"number does not match");
				as.assertAll();
		//hard assert
		Assert.assertEquals(Expectedtext,Actualtext);
		System.out.println("statement ends here");
		
		
		
		
	}

}
