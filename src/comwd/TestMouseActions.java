package comwd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Afsar\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();

		driver.get("http://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement from=driver.findElement(By.xpath
				("/html/body/form/div[5]/div[3]/div[1]/div[2]/div/div[1]/div/div/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
		
	WebElement to=driver.findElement(By.xpath
			("//*[@id='ctl00_ContentPlaceholder1_priceChecker']"));
	
	
	Actions act1=new Actions(driver);
	
	//act1.
	act1.dragAndDrop(from, to).build().perform();
	
	driver.findElement(By.id("")).click();
	}

}
