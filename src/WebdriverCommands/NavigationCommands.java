package WebdriverCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) {
		
		// Navigation commands
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.cricbuzz.com/live-cricket-scores/65805/aus-vs-ind-final-icc-world-test-championship-final-2023");
		System.out.println(driver.getTitle());
		
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		
	}

}
