package screenshot;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;


	@Test 
	public void TakeScreenshot() throws Exception {      
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		try {                
			driver.findElement(By.name("asgadsheHEATDFBDF")).sendKeys("Screenshot");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}
		catch(Exception e) {      
			System.out.println("Element Not Found");     
			takeScreenshot();       
		}      
	}
	public void takeScreenshot() throws Exception {              
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Lib\\Screenshot\\Images\\FailedScreenshot.png"));
	}



	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\Screenshot\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}

}
