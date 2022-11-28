package com.oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Con {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();

		// table - use foreach loop to get all data, to get all data we need to use
		// findelements
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : alldata) {

			System.out.println(all.getText());

			// row data

			System.out.println("****Row value***");

			List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
			for (WebElement row : rowdata) {

				String row_Values = row.getText();
				System.out.println(row_Values);
				
				//column data
				System.out.println("****Column value***");
				List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
				for (WebElement column : columndata) {
					String columnvalues = column.getText();
					System.out.println(columnvalues);
					
					
					//particular element
					
					WebElement particularelement = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
					System.out.println(particularelement.getText()); 
					
				 List<WebElement> headerdata = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
				 for (WebElement head : headerdata) {
					String headervalue = head.getText();
					System.out.println(headervalue);
					 
				}
					
					}
				

			}

		}

	}

}
