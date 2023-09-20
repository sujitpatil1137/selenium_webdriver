package HandlingDropdown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_withoutSelectClass {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
	    driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();		
		Thread.sleep(2000);
		
		String month_xpath = "//select[@id='month']//option";
		String year_xpath = "//select[@id='year']//option";
		String day_xpath = "//select[@id='day']//option";
		
		selectValueFromDropdown(day_xpath, "31");
		selectValueFromDropdown(month_xpath, "May");
		selectValueFromDropdown(year_xpath, "1994");
		
}
	
	public static void selectValueFromDropdown(String xpathValue, String value)
	{
		List<WebElement> monthList = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());
		
		for(int i=0; i<monthList.size(); i++)
		{
			System.out.println(monthList.get(i).getText());
			
			if(monthList.get(i).getText().equals(value))
			{
				monthList.get(i).click();
				break;
			}
		}
	}
}