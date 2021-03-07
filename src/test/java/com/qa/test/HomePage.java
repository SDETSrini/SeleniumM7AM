package com.qa.test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.InitSetup;

public class HomePage extends InitSetup {
	
	//Test to Verify Header and Footer
	
	
	
	@Test
	public void HeaderValiation()
	{
		
		browserSetup();
		passSiteURL();
		
		//Code to Verify the Header Validation
		
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
		
		//Code to close the browser Session
		browserClose();
		
		
	}

	//Test to Verify Cart is 0 by default
	

}
