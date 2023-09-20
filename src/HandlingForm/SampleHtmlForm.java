package HandlingForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleHtmlForm {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Admin\\OneDrive - HP Inc\\Documents\\Trainings\\SampleForm.html");
		
		// Text
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sujit");	
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Patil");
		
		// Radio button
		//System.out.println(driver.findElement(By.xpath("//input[@value='male']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='male']")).isSelected());
		driver.findElement(By.xpath("//input[@value='male']")).click();
		
		// Email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sujit@gmail.com");
		
		// Address
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("At post Bhusawal (425311)");		
		
}
}