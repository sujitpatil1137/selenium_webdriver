package SearchOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver-win64//chromedriver.exe");		

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("testing");
		
		List<WebElement> list =	driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		//By.xpath("//ul[@role='listbox']//li/descendant::div[@id='gLuoSb']")
		
		System.out.println("Total no of suggestions in the listbox : " +list.size());

		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("testing principles"))
			{
				list.get(i).click();
				break;
			}
			
		}
			
	}

}
