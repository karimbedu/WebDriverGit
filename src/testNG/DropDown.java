package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDown {
	WebDriver driver;
	
  @Test
  public void dropDown() {
	  driver.get("http://www.gangaaram-tech.com/registration/");
	  driver.findElement(By.id("text-19008954354")).sendKeys("Purushotham");
	  driver.findElement(By.id("field-5L9mpCXbv5Jc0Ww-0")).click();
	//  new Select(driver.findElement(By.id("field-g6DwleBs8pMJNxL"))).selectByVisibleText("Core Java");
	//  new Select(driver.findElement(By.id("field-g6DwleBs8pMJNxL"))).selectByValue("DevOps Training");
	  new Select(driver.findElement(By.id("field-g6DwleBs8pMJNxL"))).selectByIndex(0);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
  }

}
