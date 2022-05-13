package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IncludeExclude {
	WebDriver driver;

	@Test
	public void zomato() {
		driver.get("http://www.zomato.com");
	}

	@Test
	public void selenium() {
		driver.get("http://www.seleniumlearn.com");
	}

	@Test
	public void facebook() {
		driver.get("http://www.fb.com");
	}

	@Test
	public void twitter() {
		driver.get("http://www.twitter.com");
	}

	@Test
	public void google() {
		driver.get("http://www.google.com");
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}

}
