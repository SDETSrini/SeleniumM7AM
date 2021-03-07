package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.base.InitSetup;

public class Menu  extends InitSetup {
	
	
	@Test
	public void TC001()
	{
		browserSetup();
		driver.get("https://www.timberland.co.uk");
		
		//Close Cookie consent
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.switchTo().defaultContent();
		
		//Close Welcome to Timberland PopuP
		driver.findElement(By.xpath("//a[@id = 'geo_popup_close']")).click();
		
				
		//Click on Menu - Men - men.html
//		driver.findElement(By.xpath("//a[@data-navigation = 'men']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement men  = driver.findElement(By.xpath("//a[@data-navigation = 'men']"));
		
		Actions action  = new Actions((WebDriver) men);
		
		action.moveToElement(driver.findElement(By.linkText("Shirts"))).build().perform();
		
		
	}

}
