package ExperimentRemit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class srimurgan {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://newpos.srimurugantrading.com.sg/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("durai",Keys.TAB,"Mani1206*",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Purchase']")).click();
		
		driver.findElement(By.xpath("(//span[@class='shortcutkey']/following-sibling::i)[2]")).click();
		
		
	WebElement ment=	driver.findElement(By.id("location_code"));
		Select drop=new Select(ment) ;
		drop.selectByIndex(0);
		
		driver.findElement(By.xpath("(//button[@class='btn btn-zone btn-primary'])[1]")).click();
		
		
		
		
		driver.findElement(By.xpath("//i[@class='fa fa-edit']")).click();
		WebElement ele=driver.findElement(By.xpath("(//button[@name='purchase_button'])[2]"));
		Actions bulider=new Actions(driver);
		Thread.sleep(4000);
		bulider.doubleClick(ele).perform();
	}

}
