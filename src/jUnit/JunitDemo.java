package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	//	driver.get("http://seleniumlearn.com/github");
	}
	@Disabled
	@Test
	void selenium_Learn_Signup() {
		driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]")).sendKeys("Purushotham");
		driver.findElement(By.id("edit-submit")).click();		
	}
	@Disabled
	@Test
	void selenium_Learn_Sighin() {
		driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]")).sendKeys("Purushotham");
		driver.findElement(By.id("edit-submit")).click();		
	}
	
	@Disabled
	@Test
	void selenium_Learn_ForgetPassword() {
		driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]")).sendKeys("Purushotham");
		driver.findElement(By.id("edit-submit")).click();		
	}

	@Test
	void verifygoogletitle() throws InterruptedException  {
		driver.get("http://prakampanam.com/");
		
		String ex = "Prakampanam |";
		System.out.println("Expected Result is :"+ex);
		
		String ac = driver.getTitle();
		System.out.println("prakampanam Title is:: "+ac);
		
		Assert.assertEquals(ex,ac);
		
	}
	
	@Test
	public void P_4_Verify_URL() throws Exception{
		//Assert.assertTrue(true);
		driver.get("http://prakampanam.com/");
		
		String expectedURL = "http://prakampanam.com/";
		System.out.println("ISF page URL Is : "+expectedURL);
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("ISF page URL Is : "+actualURL);
		
		Assert.assertEquals(expectedURL,actualURL);

	}

	
	@Disabled	
	@Test
	void selenium_Learn_Menu_Links() throws InterruptedException  {
		driver.findElement(By.linkText("Java")).click();
		driver.findElement(By.partialLinkText("scripts")).click();
		Thread.sleep(5000);		
	}
	
	@Disabled
	@Test
	void selenium_Learn_Search() {
		driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]")).sendKeys("Purushotham");
		driver.findElement(By.id("edit-submit")).click();		
	}
	
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	//	driver.close();
	//	driver.quit();
	}

}
