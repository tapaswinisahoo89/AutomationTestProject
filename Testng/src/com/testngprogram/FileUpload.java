package com.testngprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
	@Test
	public void fileupload_documentTest() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver f=new ChromeDriver();
		f.manage().window().maximize();
		f.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		f.get("https://www.grammarly.com/plagiarism-checker");
		//to scroll down
		JavascriptExecutor js=(JavascriptExecutor)f;
		js.executeScript("window.scrollBy(0,200)","");
		f.findElement(By.xpath("//div[text()='Upload a file']")).click();
		Thread.sleep(2000);
		//create object of robot class
		Robot rw=new Robot();
		//copying the path of the file in to clipboard
		StringSelection str=new StringSelection("C:\\Users\\hruda\\OneDrive\\Desktop\\New Text Document.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		rw.keyPress(KeyEvent.VK_CONTROL);
		rw.keyPress(KeyEvent.VK_V);
		rw.keyRelease(KeyEvent.VK_CONTROL);
		rw.keyRelease(KeyEvent.VK_V);
		rw.keyPress(KeyEvent.VK_ENTER);
		rw.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	
}
