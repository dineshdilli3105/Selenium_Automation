package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practical {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// basic xpath
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		
		username.sendKeys("dinesh");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("1234");
		
	
		
	}

}
