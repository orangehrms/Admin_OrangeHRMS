package com.orange_hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.page_opjects.HomePage;

public class TestHomePage {

	WebDriver driver;

/*	@BeforeTest
	public void setup() {
		// OrangeSetupPage.setup(driver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selle.trials54.orangehrmlive.com/");
	}
*/
	@Test
	public void verifyHRMSHomePage() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selle.trials54.orangehrmlive.com/");
		
		HomePage homepage = new HomePage(driver);
		homepage.verifyLogo(driver);
		homepage.verifyLoginImmage(driver);
		homepage.verifyLinkText(driver);
		homepage.verifyLinkedinGlyphIcon(driver);
		homepage.verifyTwitGlyphIcon(driver);
		homepage.verifyFacebookGlyphIcon(driver);
		homepage.verifyYtubeGlyphIcon(driver);
		driver.quit();
	}

/*	@AfterTest
	public void quit() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	//	OrangeSetupPage.quit(driver);
		driver.manage().deleteAllCookies();
		driver.quit();
	}*/
}
