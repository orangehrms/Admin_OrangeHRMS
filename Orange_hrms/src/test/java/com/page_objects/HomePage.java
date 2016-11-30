package com.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.orange_hrms.utils.Assertion;
import com.orange_hrms.utils.Log4jConfig;


public class HomePage {
	
	WebDriver driver;
	WebElement element;
		
	@FindBy(xpath = "//img[@src='/webres_5807100ccf9d88.89058111/themes/default/images/login/logo.png'")
	@CacheLookup
	WebElement HRMSLogo;
	
	@FindBy(id = "divLoginImageGlow")
	@CacheLookup
	WebElement LoginImmage;
	
	@FindBy(linkText = "OrangeHRM, Inc")
	@CacheLookup
	WebElement OrangeHRMSLinkText;
	
	@FindBy(xpath = "//img[@alt='LinkedIn OrangeHRM group']")
	@CacheLookup
	WebElement LinkedinGlyphIcon;
	
	@FindBy(xpath = "//img[@alt='OrangeHRM on Facebook']")
	@CacheLookup
	WebElement FacebookGlyphIcon;
	
	@FindBy(xpath = "//img[@alt='OrangeHRM on twitter']")
	@CacheLookup
	WebElement TwitGlyphIcon;
	
	@FindBy(xpath = "//img[@alt='OrangeHRM on youtube']")
	@CacheLookup
	WebElement YtubeGlyphIcon;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void Logo() {
		Assertion.assertTrue(HRMSLogo.isDisplayed());
		Log4jConfig.Logg("HRMS Logo is Displayed");
	}
	
	public void LoginImmage(){
		Assertion.assertTrue(LoginImmage.isDisplayed());
		Log4jConfig.Logg("HRMS Login Immage is Displayed");
	}

	public void LinkText(){
		Assertion.assertTrue(OrangeHRMSLinkText.isDisplayed());
		Log4jConfig.Logg("HRMS LinkText is Displayed");
	}
	
	public void LinkedinGlyphIcon(){
		Assertion.assertTrue(LinkedinGlyphIcon.isDisplayed());
		Log4jConfig.Logg("Linkedin Glyph Icon is Displayed");
	}
	
	public void FacebookGlyphIcon(){
		Assertion.assertTrue(FacebookGlyphIcon.isDisplayed());
		Log4jConfig.Logg("FacebookGlyphIcon is Displayed");
	}
	
	public void TwitGlyphIcon(){
		Assertion.assertTrue(TwitGlyphIcon.isDisplayed());
		Log4jConfig.Logg("TwitGlyphIcon is Displayed");
	}
	
	public void YtubeGlyphIcon(){
		Assertion.assertTrue(YtubeGlyphIcon.isDisplayed());
		Log4jConfig.Logg("YtubeGlyphIcon is Displayed");
	}
}
