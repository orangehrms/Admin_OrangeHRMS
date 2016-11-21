/**
 * 
 */
package com.page_opjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author madhubs 
 * set up browser and url
 */
public class OrangeSetupPage {

	WebDriver driver;

	OrangeSetupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@BeforeClass
	public static void setup(WebDriver driver) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selle.trials54.orangehrmlive.com/");
	}
	
	@AfterClass
	public static void quit(WebDriver driver){
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
