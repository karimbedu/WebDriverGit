package actionClass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class JavascriptExecutorDemo {
	
	WebDriver driver;
	
	
  @Test
  public void scrollDown() {
	  driver.get("http://www.techlearn.in");
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(0, 1500)"); // Y value is scroll down
  }
  
  @Test
  public void scrollUp() {
	  driver.get("http://www.techlearn.in"); 
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(1500, 0)"); // X value is scroll Up
  }
  
  
  @Test //Indentify Loacator Element
  public void IndentifyLoacatorElement() throws Exception {
  driver.get("https://www.selenium.dev/downloads/");
  {
      WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[10]/div/div/p/a"));
      Coordinates coordinate = ((Locatable)element).getCoordinates(); 
      coordinate.onPage(); 
      coordinate.inViewPort();
       }    
    }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
