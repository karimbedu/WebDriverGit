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

public class DataDrivenValidation {
	WebDriver driver;


	@Test
	public void dataDrivenValidation() throws BiffException, IOException, Exception {
		
		FileInputStream fi=new FileInputStream("E:\\Selenium\\TestData\\Data\\Validation.xls"); // Here your xls path.
		Workbook w=Workbook.getWorkbook(fi);
		Sheet s=w.getSheet("Sheet1");
		
		for (int i = 1; i < s.getRows(); i++) 
		{
			
			driver.get("http://www.prakampanam.com/user");
			
			driver.findElement(By.id("edit-name")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.id("edit-pass")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.id("edit-submit")).click();
		
			try{
				Thread.sleep(5000);
				driver.findElement(By.linkText("Log out")).click();
				System.out.println("Pass");
			}
			catch(Exception e){
				System.out.println("Fail");
			}
		}
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
