package vemuCollege;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VemuCollege {
	WebDriver driver;
	
  @Test
  public void menus() {
	  driver.findElement(By.xpath("//*[@id=\"nav\"]/li[10]/a")).click();
	  driver.findElement(By.name("full_name")).sendKeys("Keerthi K");
	  driver.findElement(By.name("email_id")).sendKeys("keerthi@gmail.com");
	  driver.findElement(By.name("phone_no")).sendKeys("9980251000");
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vemu.org/");
  }

}
