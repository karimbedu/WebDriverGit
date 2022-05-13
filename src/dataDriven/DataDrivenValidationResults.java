package dataDriven;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataDrivenValidationResults {
	WebDriver driver;
	public String str;
	
	@Test
	public void PrintTestResultsinSheet() throws Exception{

	 
  
     //Reading the data from the input file      
     FileInputStream fi=new FileInputStream("E:\\Selenium\\TestData\\Data\\ValidationResults.xls");
     Workbook w=Workbook.getWorkbook(fi);
     Sheet s=w.getSheet("Sheet1");
     
     // Creating the result file under the result folder
     FileOutputStream fo=new FileOutputStream("E:\\Selenium\\TestData\\Data\\LathaValidationResultsOutput.xls");
     WritableWorkbook wb=Workbook.createWorkbook(fo);
     WritableSheet ws=wb.createSheet("Results", 0);

     for (int i = 1; i < s.getRows(); i++) {
         //Take the username, password and click on signin by taking the testdata from excel file    
    	 driver.get("http://www.prakampanam.com/user");  
         driver.findElement(By.id("edit-name")).clear();
         //driver.findElement(By.id("edit-name")).sendKeys(Keys.CONTROL, "a");
         Thread.sleep(2000);
         driver.findElement(By.id("edit-name")).sendKeys(s.getCell(0, i).getContents());
                     
         driver.findElement(By.id("edit-pass")).sendKeys(s.getCell(1, i).getContents());
         
         driver.findElement(By.id("edit-submit")).click();
         Thread.sleep(3000);
     
         //Validate logout, if available assign pass to str, else assign fail to str
         try{
            driver.findElement(By.linkText("Log out")).click();
             str="Pass";
         }catch(Exception e)
         {
        	 str="Fail";
        	 }
         //Add the str value under the Result column    
         Label result=new Label(2, i, str);
         ws.addCell(result);
         //Add the input data to the Result file
         for(int j=0; j<s.getColumns(); j++){
             System.out.println(s.getCell(j, i).getContents());
             Label l=new Label(j, i, s.getCell(j, i).getContents());
             ws.addCell(l);
         }
     }
     //Add the Heading
     Label un=new Label(0,0,"Username");
     Label pw=new Label(1,0,"Password");
     Label rs=new Label(2,0,"Results");
         ws.addCell(un);
         ws.addCell(pw);
         ws.addCell(rs);
         //Write and close the Result file
             wb.write();
             wb.close();
       }
	

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
