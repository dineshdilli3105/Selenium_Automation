package com.oct;

import java.io.File;
//import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("dineshdilli");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Vitality@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s1 = new Select(location);
	    s1.selectByValue("Melbourne");
	    Thread.sleep(1000);
	    
	    WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
	    Select s2 = new Select(hotels);
	    s2.selectByIndex(2);
	    Thread.sleep(1000);
	    
	    WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
	    Select s3 = new Select(room);
	    s3.selectByVisibleText("Standard");
	    Thread.sleep(1000);
	    
	    WebElement numberofrooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
	    Select s4 = new Select(numberofrooms);
	    s4.selectByValue("3");
	    Thread.sleep(1000);
	    
	    WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	    checkin.sendKeys("1122022");
	    Thread.sleep(1000);
	    
	    WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	    checkout.sendKeys("3122022");
	    Thread.sleep(2000);
	    
	    WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
	    Select s5 = new Select(adults);
	    s5.selectByValue("2");
	    Thread.sleep(2000);
	    
	    WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
	    Select s6 = new Select(child);
	    s6.selectByVisibleText("0 - None");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='Submit']")).click();
	    Thread.sleep(1000);
	    
	   driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	   Thread.sleep(1000);
	    
	   driver.findElement(By.xpath("//input[@name='continue']")).click();
	   Thread.sleep(1000);
	   
	   WebElement firstname = driver.findElement(By.id("first_name"));
	   firstname.sendKeys("Dilliganesh");
	   Thread.sleep(1000);
	   
	   WebElement lastname = driver.findElement(By.id("last_name"));
	   lastname.sendKeys("Mani");
	   Thread.sleep(1000);
	   
	   WebElement address = driver.findElement(By.id("address"));
	   address.sendKeys("no:32 muniappan street, perambur, ch-11");
	   Thread.sleep(1000);
	   
	   WebElement cardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
	   cardno.sendKeys("8790648826784569");
	   Thread.sleep(1000);
	   
	   WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
	   Select s7 = new Select(cardtype);
	   s7.selectByVisibleText("VISA");
	   Thread.sleep(1000);
	   
	   WebElement selmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	   Select s8 = new Select(selmonth);
	   s8.selectByValue("11");
	   Thread.sleep(1000);
	   
	   WebElement selyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	   Select s9 = new Select(selyear);
	   s9.selectByVisibleText("2022");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("1234");
	   Thread.sleep(2000);
	   
	   WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
	   booknow.click();
	   Thread.sleep(20000);
	   
	   JavascriptExecutor ob = (JavascriptExecutor) driver;
	   ob.executeScript("window.scrollBy(0,600);");
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   File dest = new File("C:\\Users\\Dinesh\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\miniproject.png");
	   org.openqa.selenium.io.FileHandler.copy(source, dest);	 
	    		
	}

}
