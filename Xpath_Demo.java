package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		
		create.click();
	
	Thread.sleep(2000);
	
	WebElement firstname = driver.findElement(By.name("firstname"));
	
	firstname.sendKeys("dinesh");
	
	WebElement lastname = driver.findElement(By.name("lastname"));
	
	lastname.sendKeys("m");
	
	Thread.sleep(2000);
	
	WebElement day = driver.findElement(By.id("day"));
	day.sendKeys("20");
	
	WebElement password = driver.findElement(By.id("password_step_input"));
	password.sendKeys("rockz");
	
	WebElement month = driver.findElement(By.name("birthday_month"));
	month.sendKeys("july");
	
	WebElement year = driver.findElement(By.name("birthday_year"));
	year.sendKeys("2000");
	}

}
