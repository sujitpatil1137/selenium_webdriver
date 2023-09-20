package SwitchingWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingTabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();		
		//System.out.println(driver.getTitle());
		
		Set<String> keyValueOfWindows = driver.getWindowHandles();
		
		for(String idOfWindow:keyValueOfWindows)
		{
			System.out.println(idOfWindow);		
			String titleOfWindow =driver.switchTo().window(idOfWindow).getTitle();
			System.out.println(titleOfWindow);
			
			if(titleOfWindow.contains("Selenium"))
			{
				driver.close();
			}
		}
		
	}
}
