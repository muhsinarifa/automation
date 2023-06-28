package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethodHandling extends BaseDriver{
	
	String url="https://www.amazon.com/";
	
	@Test
	public void slectTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement menuOptions = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//selectByIndex
		Select select = new Select(menuOptions);
		select.selectByIndex(5);
		Thread.sleep(5000);
		
		//taking value of item from list
		select.selectByValue("search-alias=kitchen-intl-ship");
		Thread.sleep(5000);
		
		//selectByVisibleText
		select.selectByVisibleText("Computers");
		Thread.sleep(5000);
		
		
	}
}
