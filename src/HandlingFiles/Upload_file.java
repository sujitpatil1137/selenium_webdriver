package HandlingFiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver_win32//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		
		driver.findElement(By.xpath("//input[@name='userfile']")).sendKeys("C:\\Users\\Admin\\Downloads\\chuvash.docx");

}

}
