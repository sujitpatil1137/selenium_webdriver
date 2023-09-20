
/*
 * Test Case:
 * 1. Open browser
 * 2. Open URL
 * 3. Enter Username
 * 4. Enter Password
 * 5. Click on OK
 * 6. Check the Page title
*/

package TestSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSite {

	public static void main(String[] args) {
		
		//To launch the browser
		System.setProperty("webdriver.firefox.marionette", "C://Users//Admin//eclipse//geckodriver-v0.33.0-win-aarch64//geckodriver.exe");		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		//To open URL in the browser
		driver.get("https://demo.guru99.com/test/newtours/");
			
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		//To Enter the Username
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("Sujit");
		
		//To Enter the Password
		driver.findElement(By.name("password")).sendKeys("1234");
		
		//To click the button
		driver.findElement(By.name("submit")).click();
				
		//To validate the title of the page
		String expTitle = "Welcome: Mercury Tours";
		 
		String actTitle = driver.getTitle();
		
		if(expTitle.equals(actTitle)) 
		{
			System.out.println("test case is Pass");
		}
		
		else
		{
			System.out.println("test case is Fail");
		}
				
		// To Close the browser
		driver.close();
				
		//driver.manage().window().maximize();     To maximize the window
		
	}

}
