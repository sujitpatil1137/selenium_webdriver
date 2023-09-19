package TestSite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) throws IOException {
		
		// test comment
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/");
				
		//driver.findElement(By.name("email")).sendKeys("Sujit@gmail.com");
		
		//driver.findElement(By.name("pass")).sendKeys("1234");
		
		WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@name = 'pass']"));
		
		
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("sujit@gmail.com");
		}
	
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("Sujit");
		}
		
		driver.findElement(By.name("login")).click(); 
		
		String ActualTitle = driver.getTitle();
		
		String ExpectedTitle = "Log in to Facebook";
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Test case is Pass");
		}
		
		else
		{
			System.out.println("Test case is Fail");
		}
		
		
		// Taking Screenshot
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("C:/Users/Admin/Downloads/Screen.png"));
		System.out.println("Screenshot is captured");
		
}

}
