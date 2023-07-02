package com.it.bd;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class waitExamples extends BaseDriver{
	String url="https://www.selenium.dev/";
	public void testWaits() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement blog1 = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Support')]")));
		blog1.click();
		// vul location khujar jonno 30 sec wait korbe
		WebElement blog2 = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Support1')]")));
		blog2.click();
		
		Thread.sleep(3000);	
		
	}
}
