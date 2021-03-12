package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitSetup {

	public static WebDriver driver;

	// Created by Srinivas Naika on 01/02/2021
	// Updated by 
	// Method to do a Browser Setup
	public WebDriver browserSetup() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // Launch
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // changed the implicitwait from 5 to 10 , because of getting pagetimeout error

		driver.manage().deleteAllCookies(); // Delete all the cookies
	
		driver.manage().window().maximize(); // Maximize the window

		return driver;

	}
	
	

	// Created by Srinivas Naika on 01/02/2021
	// Updated by
	// Method to pass the site url
	public void passSiteURL() {
		driver.get("https://www.amazon.in/");
	}

	// Created by Srinivas Naika on 01/02/2021
	// Updated by
	// Method to do close the browser
	public void browserClose() {
		driver.close();
	}

}
