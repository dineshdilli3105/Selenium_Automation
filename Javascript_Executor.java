package com.oct;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Javascript_Executor {

	public static void main(String[] args) throws InterruptedException, Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		JavascriptExecutor ob = (JavascriptExecutor) driver; //addcast 
		//click
		
		ob.executeScript("arguments[0].click();", mob);
		Thread.sleep(2000);
		
		//scrolldown
		ob.executeScript("window.scrollBy(0,6000);");
		Thread.sleep(1000);
		
		//scrollup 
		ob.executeScript("window.scrollBy(0,-6000);");
		Thread.sleep(1000);
		
		//toget the mid of the page using javaexecutor
		WebElement top = driver.findElement(By.xpath("//span[text()='Top deals on mobile accessories']"));
		ob.executeScript("arguments[0].scrollIntoView();",top);
		Thread.sleep(2000);
		
		//screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\amazon.png");
		FileHandler.copy(Source, dest);
		
	}

}
