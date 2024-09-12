package FrameWorkBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelenuimBAse implements SeleniumAPI {

	WebDriver driver;
	
	WebDriverWait wait;
	long maxWaittime=10;
	
	long timeout=20;
	public void startup(String url) {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,Duration.ofSeconds(maxWaittime));
		driver.get(url);
		
		
		
	}

	@Override
	public void startup(String browserName, String url) {
		switch (browserName) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "FireFox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			System.err.println("The given browser is not defiened");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
		driver.get(url);
		
		
	}

	
	public void close() {
		driver.close();
		
		
	}

	@Override
	public void quit() {
		driver.quit();
		
		
	}

	public WebElement Element(String type, String values) {
		
		switch (type) {
		case "id":
			return driver.findElement(By.id(values));
		
		
		case "name":
			return driver.findElement(By.name(values));
		
		case "xpath":
			return driver.findElement(By.xpath(values));
		
			
		case "LinkText":
			return driver.findElement(By.linkText(values));
			
			
		case "className":
			return driver.findElement(By.className(values));
			
			
		case "tagName" :
			return driver.findElement(By.tagName(values));
			
		
		case "partialLinkText":
			return driver.findElement(By.partialLinkText(values));
			
			
		case"cssSelector":
			return driver.findElement(By.cssSelector(values));
           
            
		default:
			System.err.println("Locator not found in the base");
			break;
		}
		
		return null;
		
	}

	
	@Override
	public void click(WebElement ele) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		element.click();
		
		
	}

	
	public void type(WebElement ele, String textdata) {
		WebElement type = wait.until(ExpectedConditions.visibilityOf(ele));
		type.clear();
		type.sendKeys(textdata);
	}

	@Override
	public void append(WebElement ele, String testdata) {
		WebElement append = wait.until(ExpectedConditions.visibilityOf(ele));
		append.sendKeys(testdata);
		
	}

	@Override
	public void switchtowindow(int i) {
		
		
	}

	@Override
	public void selectText(WebElement ele, String byVisiableText) {
		
		
	}

	@Override
	public void selectValue(WebElement ele, String byValue) {
		
		
	}

	@Override
	public void selectindex(WebElement ele, int position) {
		
		
	}

	@Override
	public String gettitle() {
		
		return null;
	}

	@Override
	public boolean isDisplayed() {
		
		return false;
	}

	@Override
	public String getURL() {
		
		return null;
	}

	@Override
	public boolean isEnabled() {
		
		return false;
	}

}
