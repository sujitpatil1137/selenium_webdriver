package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C://Users//Admin//eclipse//geckodriver-v0.33.0-win-aarch64//geckodriver.exe");		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/");
		
		System.out.println("The title of the page is : "+driver.getTitle());
		
		System.out.println("The URL of the current page is : "+driver.getCurrentUrl());
		
		String text = driver.findElement(By.xpath("//a[text()=' Bootcamps']")).getText();
		
		System.out.println(text);
		
		
		driver.findElement(By.xpath("//a[@title='Translate W3Schools']")).click();
		
		driver.findElement(By.xpath("//a[@class='VIpgJd-ZVi9od-xl07Ob-lTBxed']")).click();
		
		
		
		

	}

}
