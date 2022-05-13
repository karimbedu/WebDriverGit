package dataDriven;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataDrivenDemoOne {
	WebDriver driver;

	@Test
	public void prakampanamLogin() throws InterruptedException, BiffException, IOException {
		driver.get("http://www.prakampanam.com/user");
		
		FileInputStream fis=new FileInputStream("E:\\Selenium\\TestData\\Data\\TestDataOne.xls"); // Here your xls path.
		Workbook w=Workbook.getWorkbook(fis);
		Sheet s=w.getSheet(0);

		driver.findElement(By.id("edit-name")).sendKeys(s.getCell(0, 1).getContents());
		Thread.sleep(5000);
		driver.findElement(By.id("edit-pass")).sendKeys(s.getCell(1, 1).getContents());
		Thread.sleep(3000);
		driver.findElement(By.id("edit-submit")).click();
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
