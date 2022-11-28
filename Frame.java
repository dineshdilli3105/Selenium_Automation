package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//frame syntax use findelemets
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		//single frame
		
		//WebElement single = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		//single.click();
		driver.switchTo().frame(0);  //frame by index
		WebElement s1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));//doubt
		s1.sendKeys("success");
		Thread.sleep(2000);
		
		
		driver.switchTo().defaultContent(); // used to go back to main page
		
		//multiple frame
		WebElement s2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		s2.click();
		Thread.sleep(1000);
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));//frame ny webelement
		outer.click();
		Thread.sleep(1000);
		
		driver.switchTo().frame(outer);
		driver.switchTo().frame(0);
		WebElement send = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		send.sendKeys("1234");
		
	}

}
