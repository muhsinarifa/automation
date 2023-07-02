package com.it.bd;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabHandling extends BaseDriver{
	String url1="https://www.shohoz.com/";
	String url2="https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	String url3="https://www.daraz.com.bd/";
	
	@Test
	public void tabHandlingTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url1);
		String originalTab = driver.getWindowHandle();
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url2);
		String secondTab = driver.getWindowHandle();
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(url3);
		Thread.sleep(5000);
		
		driver.switchTo().window(originalTab);
		Thread.sleep(10000);
		
		driver.switchTo().window(secondTab);
		driver.close();
		//second tab has to be closed otherwise first tab may not work in functioning
		driver.switchTo().window(originalTab);
		Thread.sleep(10000);
		
	}
}
