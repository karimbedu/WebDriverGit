package sikuliDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliWebDesktop {
	WebDriver driver;
	Screen s = new Screen();

	@Test
	public void sikuliWeb() throws Exception {
		driver.get("http://prakampanam.com/"); 
		Thread.sleep(5000);
		s.click("G:\\Lib\\Sikuli\\Facebook.PNG");
		
		
		//driver.findElement(By.xpath("//*[@id=\"social-icons\"]/div[1]/a/img")).click();
	}
	
	
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
