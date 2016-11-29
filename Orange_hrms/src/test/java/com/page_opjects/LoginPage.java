package com.page_opjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	WebElement element;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(id = "txtUsername")
	@CacheLookup
	WebElement username;
	
	@FindBy(id = "txtPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy(id = "btnLogin")
	@CacheLookup
	WebElement Loginbtn;
	
	public void AdminUserName(String uname) {
		username.sendKeys(uname);
	}

	public void AdminPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void AdminLoginBtn() {
		Loginbtn.click();
	}
}
