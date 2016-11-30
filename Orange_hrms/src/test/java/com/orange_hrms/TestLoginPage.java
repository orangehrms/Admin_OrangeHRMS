package com.orange_hrms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orange_hrms.utils.Log4jConfig;
import com.page_objects.LoginPage;

public class TestLoginPage {
	
	WebDriver driver;
	//LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	
	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://selle.trials54.orangehrmlive.com/");
	}

	@Test
	public void verfyValidLogin() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.AdminUserName("Admin");
		Log4jConfig.Logg("user name entered");
		loginpage.AdminPassword("welc0meadm1n");
		Log4jConfig.Logg("passward entered");
		loginpage.AdminLoginBtn();
		Log4jConfig.Logg("click submit button");
	//	return PageFactory.initElements(driver, HomepageTest.class);
	}

	@AfterTest
	public void quitb() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}