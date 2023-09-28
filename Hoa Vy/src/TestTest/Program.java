package TestTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program {
	   public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "Driver\\chromedriver.exe";
	    public WebDriver driver ; 
  @Test
  public void verifyHomepageTitle() {
     System.setProperty("webdriver.chrome.driver", driverPath);
     driver = new ChromeDriver();
     driver.get(baseUrl);
     String expectedTitle = "Welcome: Mercury Tours";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle, expectedTitle);
     driver.close();
  }
}
