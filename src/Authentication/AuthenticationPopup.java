package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		// Normal Url
		driver.get("https://the-internet.herokuapp.com/basic_auth");
				
		// Format:   http://username:password@test.com		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				
		String text = driver.findElement(By.cssSelector("p")).getText();	
		System.out.println(text);		
		driver.close();
	
	}
}
