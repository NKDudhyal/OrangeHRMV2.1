package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM {

	public WebDriver driver;
	
	public LoginPage_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	public void set_username(String userN) {
		username.sendKeys(userN);
	}
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password; 
	public void set_password(String pwd) {
		password.sendKeys(pwd);
	}
	
	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement login;
	public void btn_login() {
		login.click();
	}
	
	@FindBy(xpath = "//div[@role='alert']//p")
	private WebElement errorMsg;
	public String get_errorMsg() {
		return errorMsg.getText();
	}
}
