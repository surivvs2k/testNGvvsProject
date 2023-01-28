package BatchDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
WebDriver driver = null;
	
	@Test
	public void testdemo() {
		
		
		
		
		System.out.println("..........................");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("...............Launching the Browser..........\n \n \n");
		
		driver.get("https://google.com");
		
		System.out.println("Page title is  :" + driver.getTitle());
		
		driver.close();
		
		System.out.println("...........Browser teardown.......");
		
		
		
		
		
	}	

	

}
