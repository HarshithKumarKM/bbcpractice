package com.mindtree.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass {
	
ConfigRead config = new ConfigRead();
	
	public String baseUrl= config.getApplicationURL();
	public static WebDriver driver;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", config.getChromeDriverPath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	public void teardown() {
		driver.quit();
	}


}
