package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/Downloads/HtmlTable.html");
		
		int r = driver.findElements(By.xpath("html/body/table/tbody/tr")).size();	
		System.out.println(r);
		
		int c =	driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();		
		System.out.println(c);
			
		for(int i=2; i<=r; i++) 
		{
			for (int j=1; j<=c; j++) 
			{
				//html/body/table/tbody/tr[2]/td[2]				
				System.out.print(driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
						
			}
			
			System.out.println();
		}
		
		driver.quit();

	}

}
