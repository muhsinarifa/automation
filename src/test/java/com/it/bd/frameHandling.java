package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class frameHandling extends BaseDriver{
	String url="https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	@Test
	public void frameHandlingTest() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframeNumber);
		
		//for accessing content in iframe, switching to iframe is required
		//reltv path
		driver.switchTo().frame("packageListFrame");
		WebElement selenium = driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]"));
		selenium.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		WebElement alert = driver.findElement(By.xpath("//span[contains(text(),'Alert')]"));
		alert.click();
		Thread.sleep(5000);
		
		
	}

}
