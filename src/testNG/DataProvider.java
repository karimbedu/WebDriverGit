package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataProvider {
	WebDriver driver;
	String str;

	@org.testng.annotations.DataProvider(name="datainput")
	public String[][] login()
	{
		return new String[][]{
			{"dharashan","InValidPassword"},
			{"indraja","9980251000"},
			{"InvalidUser","InvalidPassword"}
		};
	}

	@Test (dataProvider="datainput")
	public void login(String userid, String userpass) throws Exception {
		driver.get("http://prakampanam.com/user");
		driver.findElement(By.id("edit-name")).sendKeys(userid);
		driver.findElement(By.id("edit-pass")).sendKeys(userpass);
		driver.findElement(By.id("edit-submit")).click();
		try{
			driver.findElement(By.linkText("Log out")).click(); 
			str="Pass";
		}
		catch(Exception e){
			str="Fail";
		}  
	}




	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}

}
