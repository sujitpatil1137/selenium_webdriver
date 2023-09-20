package BrokenLink;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoOfLink {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32112//chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
	
		options.setBinary("C://Program Files//HP//Sure Click//4.4.5.382//servers//manifests//chrome//brchromium//112.0.5615.206//BrChrome.exe");	
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++)
		{
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);			
		}		
	}
}
