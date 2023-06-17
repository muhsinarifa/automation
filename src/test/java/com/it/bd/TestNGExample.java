package com.it.bd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("This before suite.");
	}
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("This is after suite.");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test.");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test.");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method.");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method.");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class.");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class.");
	}
	@Test(priority = 0)
	public void secondTest() {
		System.out.println("This is second test.");
	}
	@Test(priority = 1)
	public void firstTest() {
	System.out.println("This is first test.");
	}
}