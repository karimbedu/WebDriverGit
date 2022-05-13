package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.apache.commons.io.FileUtils;

public class TimeFormatScreenshot {
	WebDriver driver;
	
	public void FullPageScreenshot() throws IOException  {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time=dateFormat.format(date);
		System.out.println(time);


		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Lib\\Screenshot\\Images\\KMRBED"+time+".png")); 

	}   


	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("http://www.kmrbed.org/");
		//driver.findElement(By.name("search_block_form")).sendKeys("Screenshot") ;
		Thread.sleep(2000);
		FullPageScreenshot();
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\Screenshot\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}

}
