package com.it.bd;

import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver{
	
	@Test
	
	public void firstTest() throws InterruptedException {
		
		//browser opening
		
		driver.get("https://www.beecrowd.com.br/");
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
	}
}
