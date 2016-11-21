package com.orange_hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.page_opjects.LoginPage;

public class TestLoginPage {
	WebDriver driver;
	
/*	@BeforeTest
	public void setup(){
		OrangeSetupPage.setup(driver);
	}
*/	
  @Test
  public void verfyValidLogin() {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://selle.trials54.orangehrmlive.com/");
	  
	  //OrangeSetupPage.setup(driver);
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.AdminUserName(driver);
	  loginpage.AdminPassword(driver);
	  loginpage.AdminLoginBtn(driver);
	  
	  driver.quit();
  }
  
  /*@AfterTest
	public void quit(){
		OrangeSetupPage.quit(driver);
	}*/
}
