package FrameWorkBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	public void startup(Browser browserName, String url) {
		switch (browserName) {
		case CHROME:
			driver=new ChromeDriver();
			break;
		case FIREFOX:
			driver=new FirefoxDriver();
			break;
			
		case EDGE:
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

	public WebElement element(Locators type, String values) {
		
		switch (type) {
		case ID:
			return driver.findElement(By.id(values));
		
		
		case NAME:
			return driver.findElement(By.name(values));
		
		case XPATH:
			return driver.findElement(By.xpath(values));
		
			
		case LINKTEXT:
			return driver.findElement(By.linkText(values));
			
			
		case CLASSNAME:
			return driver.findElement(By.className(values));
			
			
		case TAGNAME :
			return driver.findElement(By.tagName(values));
			
		
		case PARTIALLINKTEXT:
			return driver.findElement(By.partialLinkText(values));
			
			
		case CSSSELECTOR:
			return driver.findElement(By.cssSelector(values));
           
            
		default:
			System.err.println("Locator not found in the base");
			break;
		}
		
		return null;
		
	}

	
	@Override
	public void click(WebElement ele) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maxWaittime));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		element.click();
		
		
	}

	
	public void type(WebElement ele, String textdata) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maxWaittime));
		WebElement type = wait.until(ExpectedConditions.visibilityOf(ele));
		type.clear();
		type.sendKeys(textdata);
	}
	
	
	public void type(WebElement ele, String textdata,Keys keys) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maxWaittime));
		WebElement type = wait.until(ExpectedConditions.visibilityOf(ele));
		type.clear();
		type.sendKeys(textdata,keys);
	}
	
	/*
	 * public void type(WebElement ele, String textdata,Keys keys0,Keys keys1,Keys
	 * keys2) { wait=new WebDriverWait(driver,Duration.ofSeconds(maxWaittime));
	 * WebElement type = wait.until(ExpectedConditions.visibilityOf(ele));
	 * type.clear(); type.sendKeys(textdata,keys0,keys1,keys2); }
	 */

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
