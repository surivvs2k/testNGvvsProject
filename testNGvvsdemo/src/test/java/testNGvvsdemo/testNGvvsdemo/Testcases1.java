package testNGvvsdemo.testNGvvsdemo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Testcases1 {
	
	  WebDriver driver=null;

	
  @Test ()
  public void verifyabout() {
	  
	  System.out.println("#1");

	  
	  driver.findElement(By.id("navbarDropdown")).click();
	  
	  WebElement aboutlink = driver.findElement(By.xpath("//a[contains(text(),'About Selenium')]"));
	  aboutlink.click();
	  
	  String title = driver.getTitle();
	  System.out.println("my current page is " +title);
	  
	  Assert.assertEquals(title, "About Selenium | Selenium");
	  
  }
  
  @Test ()
  public void verifydocumentation() {
	  
	  System.out.println("#2");

	  
	  driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
	  
	  WebElement gridtext = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/p[2]/a[1]"));
	  gridtext.click();
	  
	  String title = driver.getTitle();
	  System.out.println("my current page is " +title);
	  
	 
	  
	  
	  String freetext = driver.findElement(By.xpath("//p[contains(text(),'Selenium Grid allows the execution of WebDriver sc')]")).getText();
	  System.out.println(" copied text from maven page is :\n" +freetext);
	  
  }
  
  @Test ()
  public void verifysupport() {
	  
	  System.out.println("#3");

	  
	  driver.findElement(By.xpath("//span[contains(text(),'Support')]")).click();
	  
	  WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Official User Group')]"));
	  
	  if(element.isDisplayed()) {
		  System.out.println("Official user group link is displayed");
	  } else {
		  System.out.println("Official user group link is not displayed");

	  }
	  
  }
  
  
  
  
  @BeforeClass(alwaysRun = true)
  
  @Parameters("browser")
  
  public void beforeClass(String browser) {
	  

	  /*
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshDemo\\workspace05\\testNGvvsdemo\\servers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  */
	  
	  /*
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  */	
	  /*
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
  	  */
	  
	  if(browser.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver(); 
		  
	  }else if(browser.equalsIgnoreCase("firefox")) {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  
	  }else if(browser.equalsIgnoreCase("IE")) {
		  
		  WebDriverManager.iedriver().setup();
		  driver = new InternetExplorerDriver();
		  
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  
	  }
		  
		  
	  		
	  
			  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.get("https://www.selenium.dev/");

	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  
	 System.out.println("testcase"); 
	 
	 driver.quit();
	  
  }

}
