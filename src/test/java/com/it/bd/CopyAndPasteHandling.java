package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyAndPasteHandling extends BaseDriver{
	String url="https://demoqa.com/automation-practice-form";
	
	@Test
	public void copyAndPasteTest() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get(url);
		Actions action= new Actions(driver);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Muhsina");
		Thread.sleep(3000);
		
		//All Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		//Tab
		firstName.sendKeys(Keys.TAB);
		action.build().perform();
		Thread.sleep(3000);
		
		//paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		
		//jumping from one box to another
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(3000);
		
		//All Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		WebElement subjects = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
		subjects.click();
		Thread.sleep(3000);
		
		//paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
	}

}
