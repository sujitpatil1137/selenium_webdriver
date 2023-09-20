package Frames;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com./");		
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("spp1137@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sujit@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		

}
}
