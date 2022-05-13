package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestngFirstProgram {
	WebDriver driver;

	
	
	
	
	/*
	 @Test(dependsOnMethods={"method2"})
	    public void method1() {
	        driver.findElement(By.name("q")).sendKeys("seleniumlearn.com");
	        System.out.println("This is method 1");
	    }

	@Test
	    public void method2() throws Exception{
	        driver.get("http://www.google.com");
	        System.out.println("This is method 2");
	        Thread.sleep(3000);
	    }	
	
	
	
	
	
	
	@Test 
	public void withouttimeout() {

		driver.get("http://seleniumlearn.com/java");
		driver.findElement(By.name("search_block_form")).sendKeys("Testng");

	}


	@Test (timeOut=4000)
	public void withtimeout()  {
		driver.get("https://www.google.com");
		driver.navigate().to("http://seleniumlearn.com/selenium-quiz");
		driver.findElement(By.name("search_block_form")).sendKeys("Sikuli");

	}



	
	@Test(priority=0, enabled=false, description="Zomato Application")
	public void tc_001() {
		driver.get("https://www.zomato.com");
	}

	@Test(enabled=false,priority=1)
	public void twitter() {
		driver.get("https://www.twitter.com");
	}

	@Test(priority=2)
	public void google() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Test(enabled=false)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test(priority=4,enabled=false)
	public void gmail() {
		driver.get("https://www.gmail.com");
	//	driver.findElement(By.name("q")).sendKeys("TestNG");
	}

	 */
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}


	@AfterTest
	public void afterTest() {
	}

}
