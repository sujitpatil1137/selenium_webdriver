package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		// Ctrl+Shift+O 
		Thread.sleep(3000);
		WebElement firstImage  =driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(firstImage, trash).build().perform();
		
}
}