package com.orange_hrms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange_hrms.utils.Assertion;
import com.orange_hrms.utils.Log4jConfig;
import com.page_opjects.HomePage;

public class TestHomePage {

	WebDriver driver;
//	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selle.trials54.orangehrmlive.com/");
	}

	@Test(priority = 0)
	public void verifyHRMSHomePage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = driver.getCurrentUrl();
		Assertion.assertEquil(URL, "http://selle.trials54.orangehrmlive.com/");
		Log4jConfig.Logg("Login OrangeHRMS homepage");
	}

	@Test(priority = 1)
	public void verifyLogo() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.Logo();
	}

	@Test(priority = 2)
	public void verifyLoginImmage() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.LoginImmage();
	}

	@Test(priority = 3)
	public void verifyLinkText() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.LinkText();
	}

	@Test(priority = 4)
	public void verifyLinkedinIcon() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.LinkedinGlyphIcon();
	}

	@Test(priority = 5)
	public void verifyTwitIcon() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.TwitGlyphIcon();
	}

	@Test(priority = 6)
	public void verifyFacebookIcon() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.FacebookGlyphIcon();
	}

	@Test(priority = 7)
	public void verifyYouTubeIcon() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.YtubeGlyphIcon();
	}

	@AfterClass
	public void quitb() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
