package com.it.bd;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitExamples extends BaseDriver{
	String url="https://www.selenium.dev/";
	@Test
	public void testWaits() {
		driver.manage().window().maximize();
		driver.get(url);
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//explicit wait
		
		
	}
}
