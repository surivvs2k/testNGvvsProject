package testNGvvsdemo.testNGvvsdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;


public class NewTest {
	
	
	WebDriver driver=null;
	
	//testNGvvsdemo.testNGvvsdemo
  @Test
  public void demo1() {
	  
	  System.out.println("This is my test area 1");
	  
	 
	  
  }
  
  @Test
  public void demo2() {
	  
	  System.out.println("This is my test area 2");
	  
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("This is my preconditions area");
	  
	 

  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("This is my postconditions area");

  }
  
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("I need a valid appliation url");
  }
  
  @AfterMethod
  public void aftermethod() {
	  System.out.println("close the application url");
  }

}
