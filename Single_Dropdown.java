package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		//select by index
		WebElement dob = driver.findElement(By.xpath("//select[@id='day']"));
		Select ab = new Select(dob);
		ab.selectByIndex(10);
		
		//select by value
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select cd = new Select(month);
		cd.selectByValue("5");
		
		//select by text
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ef = new Select(year)	;
		ef.selectByVisibleText("2000");
				}

}
