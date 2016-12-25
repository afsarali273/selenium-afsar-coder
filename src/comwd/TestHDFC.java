package comwd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestHDFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Afsar\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();

		driver.get("http://www.hdfcbank.com/");
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	WebElement products=driver.findElement(By.xpath("//a[@href='/personal/products']"));

	//WebElement demat=driver.findElement(By.linkText("//a[@href='/personal/products/demat']"));
	
	
	Actions act1=new Actions(driver);
	//act1.moveToElement(products).build().perform();
	
	/*WebElement demat=driver.findElement(By.xpath("//a[@href='/personal/products/demat']"));
	//Actions act2=new Actions(driver);
	act1.moveToElement(products).moveToElement(demat).build().perform();*/
	

	WebElement netsafe=
	driver.findElement(By.xpath("//li[@id='netsafe']"));
	
	
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("arguments[0].click();",netsafe);
	js.executeAsyncScript("arguments[0].click()", netsafe);
	
	
	}

}
