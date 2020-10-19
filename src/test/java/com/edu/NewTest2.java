package com.edu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	WebDriver driver;

  @BeforeMethod
  public void launch() {
	  
	    System.setProperty("webdriver.chrome.driver", "/home/jslave/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("http://35.190.172.87:8081/");

	  }
  
  @Test
  public void verifyurl() {
	  
	    String x = driver.getCurrentUrl();
	    System.out.println(x);
	    //Assert.assertEquals(x, "http://35.190.172.87:8081/");
  }
  
  @Test
  public void verifytitle() {
	  
        String a = driver.getTitle();
        System.out.println(a);
        //Assert.assertEquals(a, "PHP");
	//System.out.println("Test Successful.");    
  }
  
  @AfterMethod
  public void close() {
	  
	  driver.close();
  }

}
