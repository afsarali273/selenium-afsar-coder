package comwd;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestWindowsFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("loginsubmit")).click();
		
		
		
		
		
	//	driver.findElement(By.cssSelector("img[alt='Continue']")).click();
		
		
		
		String home=driver.getWindowHandle();
		
		
		
		
	Set<String> windowInstances=	driver.getWindowHandles();
		
		System.out.println(windowInstances.size());
		
for(String s : windowInstances)
		driver.switchTo().window(s);

driver.findElement(By.cssSelector("img[alt='Continue']")).click();

driver.switchTo().frame(driver.findElement(By.name("login_page")));

driver.findElement(By.cssSelector("img[alt='continue']")).click();


if((ExpectedConditions.alertIsPresent())!=null)
{
Alert alt=driver.switchTo().alert();
alt.accept();

System.out.println(alt.getText());

}





		
	}

}
