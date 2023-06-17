package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExample extends BaseDriver{
	@Test
	public void testLocators() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us");
		Thread.sleep(5000);
		
		//By ID
//		WebElement bus_A = driver.findElement(By.id("purpose"));
//		bus_A.click();
//		Thread.sleep(5000);
		//By name
//		WebElement bus_B = driver.findElement(By.name("purpose"));
//		bus_B.click();
//		Thread.sleep(9000);
		
		//By link text
//		WebElement launch = driver.findElement(By.linkText("Launch"));
//		launch.click();
//		Thread.sleep(3000);
		
		//By Class 
//		WebElement button= driver.findElement(By.className("btn")); // single-line is css.first word is class name
//		button.click();
//		Thread.sleep(3000);
		
		//Custom -> //tagName[@attribute='value']
		//tagName[contains(text().'Bus')]
		//*[contains(text().'Bus')] // hidden+displayed
		
//		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("test@nomail.com");
//		Thread.sleep(3000);
		
		//By partial link text
		WebElement launch = driver.findElement(By.partialLinkText("Lau"));
		launch.click();
		Thread.sleep(3000);
		
		//css ->  elementName[attributeName='attributeValue']
		WebElement name = driver.findElement(By.cssSelector("input[name='dest_from']"));
	}
}
