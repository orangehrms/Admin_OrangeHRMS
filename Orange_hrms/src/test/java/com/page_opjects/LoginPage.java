package com.page_opjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	By username = By.id("txtUsername");
	By Password = By.id("txtPassword");
	By longinbtn = By.id("btnLogin");
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void AdminUserName(WebDriver driver){
		driver.findElement(username).sendKeys("Admin");
	}
	
	public void AdminPassword(WebDriver driver){
		driver.findElement(Password).sendKeys("welc0meadm1n");
	}
	
	public void AdminLoginBtn(WebDriver driver){
		driver.findElement(longinbtn).click();
	}
}
