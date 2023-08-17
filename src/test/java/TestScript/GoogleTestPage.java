package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestPage {
	
	WebDriver driver;
	@BeforeMethod
	public void startMethod()
	{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
  @Test(priority =1)
  public void searchJAvaTest() {
	  WebDriver driver=new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait()
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  WebElement srcBox =driver.findElement(By.name("q"));
	  srcBox.sendKeys("Java");
	  srcBox.sendKeys(Keys.ENTER);
	  
	  Assert.assertEquals(driver.getTitle(),"Cypress Tutorial - Google Search");
	
	  
	  
	  
	 
  }
  @Test(alwaysRun=true ,dependsOnMethods="searchJAvaTest")
  public void searchCypressTest1() {
	 
	  driver.get("https://www.google.com/");
	  WebElement srcBox =driver.findElement(By.name("q"));
	  srcBox.sendKeys("Cypress Tutorial");
	  srcBox.sendKeys(Keys.ENTER);
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  Assert.assertEquals(driver.getTitle(),"Cypress Tutorial - Google Search");
	 
  }
  
  @Test(enabled=false)
  public void searchJavaTest1() {
	 
	  driver.get("https://www.google.com/");
	  WebElement srcBox =driver.findElement(By.name("q"));
	  srcBox.sendKeys("Java Tutorial");
	  srcBox.sendKeys(Keys.ENTER);
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
	 
  }
  @AfterMethod
  public void TearDown()
  
  {
	  driver.quit();
  }
  
  
}
