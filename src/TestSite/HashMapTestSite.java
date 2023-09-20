package TestSite;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapTestSite {
	
	
	static HashMap<String, String> LoginData()
	{
		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		hashmap.put("X","Sujit@Sujit123" );
		hashmap.put("Y","Aaksash@Aakash123" );
		hashmap.put("Z","Kalpesh@Kalpesh123" );
		
		return hashmap;	
	}
	
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.firefox.marionette", "C://Users//Admin//eclipse//geckodriver-v0.33.0-win-aarch64//geckodriver.exe");			
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demo.guru99.com/test/newtours/");
	
	//Login as X
	
	String credentials = LoginData().get("X");
			
	String arr[] = credentials.split("@");
	
	driver.findElement(By.name("userName")).sendKeys(arr[0]);
	driver.findElement(By.name("password")).sendKeys(arr[1]);
	driver.findElement(By.name("submit")).click();
	
	//Validation:
	

}
	
}
