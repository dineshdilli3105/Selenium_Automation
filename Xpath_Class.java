package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//basic xpath with index
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("dinesh");
		Thread.sleep(1000);
		//xpath with contains
		WebElement surname = driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
		surname.sendKeys("kumar");
		Thread.sleep(1000);
		
		WebElement mobileno = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobileno.sendKeys("1234@gmail");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-type,'pass')]"));
		password.sendKeys("777");
		//xpath with text
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
	
		
		
		
	}

}
