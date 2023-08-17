package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchCypressTest {
  @Test
  public void searchCypressTest1() {
	  WebDriver driver=new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait()
	  driver.manage().window().maximize();
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
	  String title =driver.getTitle();
	  System.out.println("Title   ---- "+title);
	  Assert.assertEquals(driver.getTitle(),"Cypress Tutorial - Google Search");
	  driver.quit();
	  
  }
}
