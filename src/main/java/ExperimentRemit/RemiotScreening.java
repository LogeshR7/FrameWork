package ExperimentRemit;

import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class RemiotScreening {
	public static void main(String[]args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://remit.dollarex.com.sg/day_close");
		driver.manage().window().maximize();
		WebDriverWait wait ;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.name("login")).sendKeys("dosth",Keys.TAB,"itsmedosth",Keys.ENTER);
		
		driver.findElement(By.id("masterMenuDropdown")).click();
		
		
		Actions bulider =new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[text()='Customer']"));
		bulider.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='Beneficiary']")).click();
		
		//WebElement screening=driver.findElement(By.xpath("//a[@title='Send Screening']"));
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	
		
		
		
		for(int i=0;i<100;i++) {
			
			Thread.sleep(12000);
			WebElement screening=driver.findElement(By.xpath("(//a[@title='Send Screening'])[8]"));
			WebElement scr1 = wait.until(ExpectedConditions.elementToBeClickable(screening));
			//Thread.sleep(10000);
			scr1.click();
			
		}
		
	

	}
}
