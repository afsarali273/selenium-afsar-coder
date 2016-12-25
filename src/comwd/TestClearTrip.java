package comwd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestClearTrip {
	
	
	@Test
	public static void HDFC() throws InterruptedException{
	
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Afsar\\Downloads\\Selenium Testing\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Afsar\\Downloads\\selenium\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
	WebDriver driver=new InternetExplorerDriver();
		//WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://www.cleartrip.com");
	
	WebElement fromTag=driver.findElement(By.id("FromTag"));
	Actions act1=new Actions(driver);	
	act1.sendKeys(fromTag,"hyd");
	Thread.sleep(2000);
	act1.sendKeys(fromTag,Keys.ARROW_DOWN).sendKeys(fromTag,Keys.ENTER).
	build().perform();
	
	WebElement toTag=driver.findElement(By.id("ToTag"));
	
	Actions act2=new Actions(driver);	
	act2.sendKeys(toTag,"ban");
	Thread.sleep(2000);
	act2.sendKeys(toTag,Keys.ARROW_DOWN).sendKeys(toTag,Keys.ENTER).
	build().perform();
	Thread.sleep(2000);
	driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[1]/a")).click();
	
	System.out.println("Title of the page   :"+driver.getClass().getName());
	System.out.println("Title of the page   :"+driver.getClass().getSimpleName());
	System.out.println("Title of the page   :"+driver.getClass().getCanonicalName().length());
	System.out.println("Title of the page   :"+driver.getCurrentUrl());
	System.out.println("Title of the page   :"+driver.getTitle());
	}

}

