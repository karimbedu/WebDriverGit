package actionClass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionsScripts {
	WebDriver driver;

	@Test
	public void Google() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		driver.findElement(By.id("edit-name")).sendKeys("Jagadeesh");
		Thread.sleep(5000);
		driver.findElement(By.name("pass")).sendKeys("dsfhsdfhadh");
		driver.findElement(By.className("form-submit")).click();
		
		
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	/*

	@Test(enabled=false) //Right Click on Link,Button and Image etc.. using Selenium Webdriver
	public void rightClick() throws Exception {
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000); 

		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[7]/a/span"))).perform();
	}

	@Test(enabled=false) //Right Click on Link,Button and Image etc.. using Selenium Webdriver
	public void doubleClick() throws Exception {
		driver.get("http://www.seleniumlearn.com/double-click");
		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().perform();
	} 


	@Test(enabled=false)
	public void draganddropSqure() throws Exception {
		driver.get("http://www.seleniumlearn.com/drag-and-drop-html");

		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable")); // Find the first WebElement using the given method.
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();
	}

	@Test(enabled=false)
	public void draganddropCircle() throws Exception {

		driver.get("http://www.seleniumlearn.com/drag-and-drop");

		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droptarget"));
		act.dragAndDrop(source,target).perform();
		}
	
	@Test
    public void mouseover() throws Exception {
        driver.get("http://seleniumlearn.com/");
        Thread.sleep(3000);

        Actions act=new Actions(driver);

        act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().perform();

    }
	
	
	
*/

	

}
