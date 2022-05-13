package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GroupTest {
	WebDriver driver;


	@Test(groups={"smoke"})
	public void fb() {
		
		driver.get("http://www.fb.com");
		System.out.println("FB is Smoke");
	}
	
	@Test(groups={"sanity"})
	public void gmail() {
	
		driver.get("http://www.gmail.com");
		System.out.println("Gmail is Sanity");
	}  
	
	@Test(groups={"sanity"})
	public void google() {
	
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Testng Group Test");
		System.out.println("Gmail is Sanity");
	}  
	
	@Test(groups={"Retesting"})
	public void twitter() {
		driver.get("http://www.twitter.com");
		System.out.println("Twitter is Retesting");
	}
	
	@Test(groups={"Regression"})
	public void quora() {
		driver.get("http://www.quora.com");
		System.out.println("Quora is Regression");
	}
	
	@Test(groups={"sanity"})
	public void googleLangs() {
		driver.get("https://www.google.co.in/imghp");
		System.out.println("Sanity");
	}  


	@BeforeTest(groups={"sanity"})
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}

}
