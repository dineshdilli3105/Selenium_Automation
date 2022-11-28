package com.oct;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
	    driver.manage().window().maximize();
	    
	    WebElement aa = driver.findElement(By.xpath("(//div[@class='header-text'])[3]"));
	    aa.click();
	    Thread.sleep(2000);
	    WebElement aaa = driver.findElement(By.xpath("//span[text()='Alerts']"));
	    aaa.click();
	    // Simple alert - It will show only accept button, we need to use accept 
	  //  WebElement ab = driver.findElement(By.xpath("//button[@id='alertButton']"));
	  //  ab.click();
	   // Thread.sleep(4000);
	  //  Alert alert = driver.switchTo().alert();
	 //   alert.accept();
	    
	    //confirm alert - It will show both accept button and cancel button
	  //  WebElement cd = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	   // cd.click();
	   // Thread.sleep(2000);
	   // Alert alert1= driver.switchTo().alert();
	  //  alert1.dismiss();
	    
	    //prompt alert - For this we need to send keys
	    
	       WebElement ef = driver.findElement(By.xpath("//button[@id='promtButton']"));
		   ef.click();
		   Thread.sleep(2000);
		   Alert alert2 = driver.switchTo().alert();
		   alert2.sendKeys("success");
		   alert2.accept();
		    
	  
	}

}
