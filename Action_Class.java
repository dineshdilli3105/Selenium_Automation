package com.oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		//click using mouse
		
		WebElement single = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions act = new Actions(driver);
		act.click(single).build().perform();
		//right click (contextClick) using mouse
		
		WebElement rightcl = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		act.contextClick(rightcl).perform();
		
		//double click
		WebElement doublecl = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		act.doubleClick(doublecl).perform();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.amazon.in/");
		
		//move to element 
		WebElement move = driver.findElement(By.xpath("(//span[contains(text(),'Up to 60% off')])[1]"));
		act.moveToElement(move).perform();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);//frame by index
		//drag and drop
		
		WebElement src = driver.findElement(By.id("draggable"));//source
		WebElement target = driver.findElement(By.id("droppable"));//dest
		
		act.dragAndDrop(src, target).perform();
		
		
	}

}
