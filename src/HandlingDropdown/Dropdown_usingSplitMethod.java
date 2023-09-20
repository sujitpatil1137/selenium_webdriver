package HandlingDropdown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_usingSplitMethod {
	
	public static void main(String[] args) throws IOException, InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));			
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));		
		WebElement year = driver.findElement(By.id("year"));	
		
		String dob = "31-Mar-2001";
		String dobArr[]= dob.split("-");
		
		selectValueFromDropdown(day, dobArr[0]);
		selectValueFromDropdown(month, dobArr[1]);
		selectValueFromDropdown(year, dobArr[2]);
}
	
	public static void selectValueFromDropdown(WebElement element, String value) 
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

}
