package com.qa.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.base.InitSetup;

public class ExampleAlert extends InitSetup {

	@Test
	public void TC001() {
		
		
		browserSetup();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//*[@class= 'signinbtn']")).click();
		
		
		
		Alert alert = driver.switchTo().alert();
		
		 //get the Text on Alert
		System.out.println(alert.getText());
		
		
		alert.accept(); //Click on OK
		
		
//		alert.dismiss(); //Click on Cancel
//		alert.sendKeys("Java"); //method is used to send Value

	}

}
