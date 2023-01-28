package AssertionExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {
	
	@Test(enabled = false)
	public void Asserttest1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String currenttitle = driver.getTitle();
		
		//Assert.assertEquals(currenttitle, "Google", "verifying the page title actual vs expected");
		
		boolean flag = false;
		if(currenttitle.contains("Gook")) {
			flag = true;
			
			
		}
		
		Assert.assertTrue(flag, "verifying the page title contains a String - Goo");
		
		driver.navigate().refresh();
		
		driver.close();
		
		
	}
	
	@Test
	public void Asserttest2() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String currenttitle = driver.getTitle();
		
		SoftAssert softassertion = new SoftAssert();
		//softassertion.assertEquals(currenttitle, "google",  "verifying the page title actual vs expected");
		
		boolean flag = false;
		if(currenttitle.contains("Gook")) {
			flag = true;
			
			
		}
		
		softassertion.assertTrue(flag, "verifying the page title contains a String - Goo");
		
		driver.navigate().refresh();
		
		driver.close();
		
		softassertion.assertAll();
		
		
		
	}

}
