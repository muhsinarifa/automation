package com.it.bd;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample extends BaseDriver{
	String url="https://www.selenium.dev/";
	@Test
	public void testAssertion () throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		String expectedTitle="Selenium1";
		String actualTitle = driver.getTitle();
		//Hard Assertion
		//Assert.assertEquals(actualTitle,expectedTitle);
		
		//Soft Assertion
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle,expectedTitle);
		System.out.println("Pass");
		Thread.sleep(3000);
		soft.assertAll();
	}

}
