package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class MouseHover {
	
public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();	
		Thread.sleep(3000);
				
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));	
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();	
		Thread.sleep(2000);
		
	/*	driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='User Management ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Users']")).click();
		Thread.sleep(2000); */
		
		
		Actions action = new Actions(driver);
		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		action.moveToElement(admin).build().perform();
		
		WebElement userManagement = driver.findElement(By.xpath("//span[text()='User Management ']"));
		action.moveToElement(userManagement).build().perform();
		
		WebElement users = driver.findElement(By.xpath("//a[text()='Users']"));
		action.moveToElement(users).click().build().perform();
		
		
		driver.findElement(By.xpath("//button[@type='button' and @class='oxd-icon-button oxd-main-menu-button']")).click();
		
		int rowCount = driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border' and @role='row'] ")).size();
		
		System.out.println(rowCount);
		
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[2]/div  
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div/div[2]/div
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[4]/div/div[2]/div
		
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div -----  Xpath of entire row
		
		String beforeRowXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[";
		String afterRowXpath = "]/div/div[2]/div";
		
		for(int i=2; i<=rowCount; i++)
		{
			String rowXpath = beforeRowXpath + i + afterRowXpath;			
			WebElement element = driver.findElement(By.xpath(rowXpath));
			System.out.println(element.getText());
		}
		
	}

}
