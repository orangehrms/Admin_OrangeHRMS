package com.orange_hrms;

import org.testng.annotations.Test;

//import com.orange_hrms.utils.MultiBrowser;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Welcome {
	
	WebDriver driver = null;
	//static String Firefox=null;
	
  @Test
  public void googlehome() {
	  
	  driver.get("http:\\www.google.com");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  
	//  MultiBrowser.Browser(Firefox);
  }

  @AfterTest
  public void afterTest() {
	 driver.manage().deleteAllCookies();
	 driver.quit();
  }

}
