package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setup()	{
		System.out.println("Setup system property for Chrome browser");
	}
		
	@BeforeTest
	public void login()	{
		System.out.println("Log in to the system");
	}
	
	@BeforeClass
	public void validate() 	{
		System.out.println("Validate the credentials");
	}
		
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");				
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("URL invoked");
	}	
		
	@Test
	public void getCurrentURL()	{
		System.out.println("URL of the link is : " +driver.getCurrentUrl());
		System.out.println("Titale of the page is : " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@AfterMethod
	public void ValidatePage()	{
		boolean validate = driver.getTitle().contains("Facebook – log in or sign up");
		System.out.println("Page title is validated : " +validate);
	}
		
	public void closeTab() {
		System.out.println("Current tab is closed");
	}
		
	@AfterTest
	public void clearCookies() 	{
		driver.manage().deleteAllCookies();
		System.out.println("All the cookies are deleted");
	}
		
	@AfterSuite
	public void close()	{
		System.out.println("Close the browser");
		driver.quit();		
	}
	
	
/*	
    Setup system property for Chrome browser -- @BeforeSuite
	Log in to the system  -- @BeforeTest
	Validate the credentials  -- @BeforeClass
	URL invoked  -- @BeforeMethod
	URL of the link is : https://www.facebook.com/  -- @Test
	Titale of the page is : Facebook – log in or sign up  -- @Test
	Page title is validated : true  -- @AfterMethod
	Current tab is closed  --  @ AfterClass
	All the cookies are deleted  --  @AfterTest
	Close the browser  -- @AfterSuite
*/

}
