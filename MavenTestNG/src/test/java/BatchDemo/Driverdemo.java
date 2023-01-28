package BatchDemo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverdemo {
	
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
	


