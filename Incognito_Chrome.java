package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_Chrome {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		ChromeOptions ob = new ChromeOptions();
		ob.addArguments("incognito");
		
		Thread.sleep(1000);
		WebDriver driver = new ChromeDriver(ob);
		driver.get("https://www.facebook.com/");
		// css locator using id and name
		
		WebElement username = driver.findElement(By.cssSelector("input#email"));
		username.sendKeys("dinny");
		//css locator using attribute name and value
		
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234");
		
		//css locator using attribute name and value with prefix and suffix
		
		WebElement password = driver.findElement(By.cssSelector("[type$='word']"));
		password.sendKeys("ganesh@123");
		
		
		
	}

}
