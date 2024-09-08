package com.hrm.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hrm.pages.LoginPage_POM;

public class BasePage {
	
	public WebDriver driver;
	public LoginPage_POM loginpage;
	
	public Properties Config;
	
	@BeforeMethod
	public void setup() {
		loadProperties();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(Config.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		loginpage = new LoginPage_POM(driver);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	public void loadProperties() {
		Config = new Properties();
		File ConfigPath = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Config.properties");
		try {
			FileInputStream ConfigFile = new FileInputStream(ConfigPath);
			Config.load(ConfigFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
