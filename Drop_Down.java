package com.oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		//single dropdown
		
		WebElement oldcars = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s = new Select(oldcars);
		s.selectByIndex(0);  //selectByIndex
		Thread.sleep(2000);
		
		s.selectByValue("2"); //selectByValue
		Thread.sleep(2000);
		
		s.selectByVisibleText("Voilet");
		Thread.sleep(1000);
		
		List<WebElement> options = s.getOptions();
		System.out.println(oldcars.getText()); //to see in output
		Thread.sleep(1000);
		
		System.out.println();
		
		//Multiple dropdown
		//ismultiple to check true or false 
		
		WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s1 = new Select(cars);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);// to see multiple option in output
		
		System.out.println();
		
		s1.selectByValue("volvo"); //selectByValue
		Thread.sleep(1000);
		
		s1.selectByVisibleText("Audi"); //selectByVisibleText
		Thread.sleep(1000);
		List<WebElement> options2 = s1.getOptions();
		System.out.println(cars.getText()); 
		Thread.sleep(1000);
		
		//getfirstselected option
		
		System.out.println("getfirstselected option");
		
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		//getallselected option -- need to use for each loop to see in output
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		for (WebElement zz : allSelectedOptions) {
			System.out.println(zz.getText());
			
		}
		
	//	Diselect
		
		s1.deselectByValue("audi");
		Thread.sleep(1000);
		s1.deselectByIndex(0);
		Thread.sleep(1000);
		
		
		
	}
	}