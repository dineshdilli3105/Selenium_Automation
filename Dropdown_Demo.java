package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Demo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("dinesh");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("1234567");
		
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement dob = driver.findElement(By.xpath("//select[@title='Day']"));
		
		Select ab = new Select(dob);
		ab.selectByVisibleText("10");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select cd = new Select(month);
		cd.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select ef = new Select(year);
		ef.selectByValue("2019");
	}

}
