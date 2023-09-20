package HeadlessBrowser;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitDriver {

	public static void main(String[] args) {
		
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.redbus.in/");
		
		System.out.println("Title of the page is : " +driver.getTitle());
		
		System.out.println("The Current URL of the page is : " +driver.getCurrentUrl());
		
		
	}

}
