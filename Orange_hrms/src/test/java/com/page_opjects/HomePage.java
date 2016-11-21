package com.page_opjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	
	WebDriver driver;
	By HRMSLogo = By.xpath("//img[@src='/webres_5807100ccf9d88.89058111/themes/default/images/login/logo.png']");
	By LoginImmage = By.id("divLoginImageGlow");
	By OrangeHRMSLinkText = By.linkText("OrangeHRM, Inc");
	By LinkedinGlyphIcon = By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
	By FacebookGlyphIcon = By.xpath("//img[@alt='OrangeHRM on Facebook']");
	By TwitGlyphIcon = By.xpath("//img[@alt='OrangeHRM on twitter']");
	By YtubeGlyphIcon = By.xpath("//img[@alt='OrangeHRM on youtube']");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void verifyLogo(WebDriver driver) {
		driver.findElement(HRMSLogo);
		}
	
	public void verifyLoginImmage(WebDriver driver){
		driver.findElement(LoginImmage);
	}

	public void verifyLinkText(WebDriver driver){
		driver.findElement(OrangeHRMSLinkText);
	}
	
	public void verifyLinkedinGlyphIcon(WebDriver driver){
		driver.findElement(LinkedinGlyphIcon);
	}
	
	public void verifyFacebookGlyphIcon(WebDriver driver){
		driver.findElement(FacebookGlyphIcon);
	}
	
	public void verifyTwitGlyphIcon(WebDriver driver){
		driver.findElement(TwitGlyphIcon);
	}
	
	public void verifyYtubeGlyphIcon(WebDriver driver){
		driver.findElement(YtubeGlyphIcon);
	}
}
