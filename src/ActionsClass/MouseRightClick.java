package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MouseRightClick {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		action.contextClick(button).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		String text = driver.switchTo().alert().getText();		
		//System.out.println(text);
		Assert.assertEquals(text, "clicked: copy");
		
		driver.switchTo().alert().accept();
		
		
	
}
}
