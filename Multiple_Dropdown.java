package com.oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		//select by value
		WebElement old = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s = new Select(old);
		s.selectByValue("2");
		Thread.sleep(2000);
		
		//ismultiple tpo check true or false 
		
		WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s1 = new Select(cars);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		
		//togetoption- it will show all option in drop down list
		
		List<WebElement> options = s1.getOptions();
		System.out.println(cars.getText());
		
		List<WebElement> options2 = s.getOptions();
		System.out.println(old.getText());
	}

}
