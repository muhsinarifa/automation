package com.it.bd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class AlertHandle extends BaseDriver{
	
	
	String url="https://demoqa.com/alerts";
	
	public void alertTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);	
		
		////button[@id='alertButton']
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		Thread.sleep(3000);	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.click();
		Thread.sleep(3000);
		//alert.accept();
		alert.dismiss();
		Thread.sleep(3000);
		
		//span[@id='confirmResult']
		WebElement confirmResult = driver.findElement(By.id("confirmResult"));
		System.out.println(confirmResult.getText());
		
		//button[@id='promtButton']
		WebElement promtButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promtButton.click();
		Thread.sleep(3000);
		alert.sendKeys("Hello");
		alert.accept();
		Thread.sleep(3000);
		
	}

}
