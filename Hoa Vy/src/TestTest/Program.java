package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program {

	@Test
	public void verifyHomepageTitle() {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String driverPath = "Driver\\chromedriver.exe";
		WebDriver driver;
		System.out.println("Welcome to this page");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}

	@Test
	public void checkbox() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("passwd"));

		email.sendKeys("testuser199x@gmail.com");
		password.sendKeys("12345678x@X");
		System.out.println("Text Field Set");
		WebElement signIn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signIn.click();
		driver.close();

	}		

}
