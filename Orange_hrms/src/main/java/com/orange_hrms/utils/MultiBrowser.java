package com.orange_hrms.utils;

//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class MultiBrowser {

	public static WebDriver driver = null;

	@Parameters({"browser","url"})
	@BeforeClass
	public static WebDriver Browser(String browser, String url) {
		// if the browser is Firefox,
		if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.get(url);
		}

		// if the browser is google Chrome
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.chrome.driver", "F:\\Brawsers\\Chorme\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}

		/*// if the browser is Internet Explorer
		if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("WebDriver.ie.driver", "---");
			driver = new InternetExplorerDriver();
		}
		// if the browser is Safari
		if (browser.equalsIgnoreCase("safari")) {
			System.setProperty("WebDriver.safari.driver", "");
			driver = new SafariDriver();
		}
	*/
		return driver;
	}
	@AfterClass
	public void afterTest(){
		driver.quit();
		
	}
	
}
