package com.oct;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.codec.http.multipart.FileUpload;

public class Wait_Demo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dineshm");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		Thread.sleep(3000);
		
		//explicit wait
	//	WebDriverWait ob = new WebDriverWait(driver,30);
	//	wait.until(ExpectedConditions.invisibilityOf(ob));
		
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		
		
		
		//Screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\facebook.png");
		
		FileHandler.copy(Source, dest);

	}

}
