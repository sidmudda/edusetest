package com.edu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
  public void verifyabout() {
	  
	    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	    ChromeDriver driver = new ChromeDriver();
            driver.get("http://35.190.172.87:8081/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("About Us")).click();
	    String toBeVerified = "This is about page";
	    String actual = driver.findElement(By.cssSelector("p")).getText();	
            Assert.assertEquals(actual, toBeVerified);
	    driver.close();	    
  }
}
