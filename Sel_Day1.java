package com.oct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Day1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
    Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	// to get the current title of page
	String title = driver.getTitle();
	System.out.println(title);
	
	//to get the current url 
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.cricbuzz.com/");
	
	Thread.sleep(1000);
	
	driver.navigate().back();
	
	Thread.sleep(1000);
	driver.navigate().forward();
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	driver.close();
}
}
