package com.edu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	
  WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  
	    System.setProperty("webdriver.chrome.driver", "/home/jslave/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://35.190.172.87:8081/");
  }
  
  @Test
  public void aboutus() {
	  
	 	
	  	driver.findElement(By.id("About Us")).click();
		
			
	}
  
  @Test
  public void verifytext() {
	  
        String toBeVerified = "This is about page";
	String actual = driver.findElement(By.cssSelector("p")).getText();	
        Assert.assertEquals(actual, toBeVerified);
	    System.out.println("Test Successful."); 
  }
  
  @AfterMethod
  public void afterMethod() {  
	  driver.close();
  }

}
