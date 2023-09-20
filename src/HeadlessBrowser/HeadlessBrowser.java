package HeadlessBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32112//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.setBinary("C://Program Files//HP//Sure Click//4.4.5.382//servers//manifests//chrome//brchromium//112.0.5615.206//BrChrome.exe");
		
		//options.setHeadless(true); 
		// OR    options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);		
		driver.get("https://www.cricbuzz.com/");		
		System.out.println("Title of the page is : " +driver.getTitle());

	}

}
