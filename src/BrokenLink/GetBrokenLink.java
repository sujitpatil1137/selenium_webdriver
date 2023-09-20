package BrokenLink;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetBrokenLink {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/");	
		Thread.sleep(5000);
		
		// Capture links from webpage
		//WebElement links =  driver.findElement(By.tagName("a"));
		
	    List<WebElement> allURLs = driver.findElements(By.tagName("a"));		
		System.out.println(allURLs.size());
				
		for(int i=0; i<allURLs.size(); i++) 
		{
			// By using href we can get the URLs of required links
			WebElement element = allURLs.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			// Create a connection using url object 'link'		
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();			
			Thread.sleep(2000);			
			httpconn.connect();
			
			// Return response code
			int resCode = httpconn.getResponseCode();
			
			if(resCode >= 400)
			{
				System.out.println(url +": is broken link");
			}
			
			else
			{
				System.out.println(url +": is valid link");
			}			
		}				
	}
			
}


