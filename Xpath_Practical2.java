package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practical2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//xpath with text
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		WebElement score = driver.findElement(By.xpath("//a[text()='Live Scores']"));
		score.click();
		Thread.sleep(2000);
		
		WebElement austeam = driver.findElement(By.xpath("//div[text()='AUS']"));
		austeam.click();
		
		//xpath with contains
		WebElement scorecard = driver.findElement(By.xpath("(//a[contains(@class,'cb-nav')])[5]"));
		scorecard.click();
		
	}

}
