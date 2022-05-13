package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LaunchCromeBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
	driver.get("https://www.google.com");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Google Links Count :"+links.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*Get the Broken Links*/
	/*	driver.get("http://archives.peoplesdemocracy.in/");
        Thread.sleep(5000);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links are "+links.size());
        for(int i=0;i<links.size();i++)
        {
            WebElement ele= links.get(i);
            String url=ele.getAttribute("href");
            verifyLinkActive(url);
        }
    }


 
    public static void verifyLinkActive(String linkUrl)
    {
try 
        {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()==200)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
            {
System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
        }
    }
    
  */  
    
		/*
		 * driver.get("https://www.google.com"); List<WebElement>
		 * totallinks=driver.findElements(By.tagName("a"));
		 * System.out.println("Total No of links in Google:"+totallinks.size());
		 */
		
		
		
		
		//driver.get("http://hyderabadreport.com/");
	//	driver.findElement(By.partialLinkText("Us")).click();
		//driver.findElement(By.linkText("Ghmc")).click();
		
	/*	driver.findElement(By.id("edit-name")).sendKeys("indraja");
		driver.findElement(By.name("pass")).sendKeys("9980251000");
		driver.findElement(By.className("form-submit")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("form-submit")).click();
		driver.findElement(By.cssSelector("input.form-submit")).click();
		
	 
	 */
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.get("https://www.google.com");
		 * driver.findElement(By.name("q")).sendKeys("Selenium WebDriver 4.1.3");
		 * driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 */
		
	
	}
}

