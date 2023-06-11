package com.it.bd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	//browser initialization
	WebDriver driver = null;
	
	@BeforeSuite
	public void start() {
		String browser = System.getProperty("browser","chrome");
		
		if(browser.contains("chrome")) {
			//communication with which browser??
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.contains("firebox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
			
	}
	@AfterSuite
	public void close() {
		driver.close();
	}
}