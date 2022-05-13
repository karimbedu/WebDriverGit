package screenshot;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedLocator {

	WebDriver driver;


	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("http://seleniumlearn.com/github");
		WebElement screen = driver.findElement(By.id("edit-submit"));

		File f = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Lib\\Screenshot\\Images\\SearchButton.png"));
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\Screenshot\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}

}
