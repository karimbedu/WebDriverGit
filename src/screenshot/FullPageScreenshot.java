package screenshot;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FullPageScreenshot {
	WebDriver driver;
	
	public DefaultSelenium selenium=new DefaultSelenium("localhost",5826,"*firefox","http://techlearn.in");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	/*@Test
	  public void fullPageScreenshot() throws IOException {
		  driver.get("http://seleniumlearn.com/java");		
	      Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	      ImageIO.write(s.getImage(),"PNG",new File("E:\\Lib\\Screenshot\\FullPageScreenshot.png"));
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");  
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	  }
*/
}
