package HandlingWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleWebtable {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// Handling Webtable rows:	
		List<WebElement> rows	= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));		
		int rowCount = rows.size();
		System.out.println("Total number of rows in the table are : " +rowCount);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2; i<=rowCount; i++)
		{
			String actualXpath = beforeXpath +i+ afterXpath;		
			WebElement element = driver.findElement(By.xpath(actualXpath));		
			System.out.println(element.getText());
		}
		
		System.out.println("********************");
				
		// Handling Webtable coloums:		
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
		int colsCount = cols.size();
		System.out.println("Total number of coloums in the table are : " +colsCount);
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		String beforeColXpath = "//*[@id=\"customers\"]/tbody/tr[1]/th[";
		String afterColXpath = "]";
		
		System.out.println("Coloum values are :");
		
		for(int i=1; i<=colsCount; i++)
		{
			String actualColsXpath = beforeColXpath + i + afterColXpath;
			WebElement element = driver.findElement(By.xpath(actualColsXpath));
			System.out.println(element.getText());
		}

}
}