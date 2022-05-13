package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {
	static WebDriver driver;

	public static void main(String[] args) throws Exception{
		Logger log = Logger.getLogger("Seleniumlearn.com");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome Browser Launched");
		
		driver.manage().window().maximize();
		log.info("Browser Maximized");
		
		driver.get("http://www.seleniumlearn.com");
		log.info("Seleniumlearn url launch");
		
		driver.findElement(By.linkText("Log4j")).click();
		log.info("Click on log4j in main menu");
		
		driver.findElement(By.id("edit-search-block-form--2")).sendKeys("log4j");
		log.info("Enter Log4j keyword enter in search field");
		
		Thread.sleep(2000);
		log.info("Wait for 2 seconds");
		
		driver.findElement(By.id("edit-search-block-form--2")).sendKeys(Keys.ENTER);
		log.info("Enter Key Button");
		
		Thread.sleep(4000);
		log.info("Wait for 4 seconds");
		
		driver.close();
		log.info("Browser Closed");
	}

}
