package FrameWorkBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bytecode.Throw;

public class SelenuimBAse implements SeleniumAPI {

	private static final Exception NoSuchElementException = null;

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
		
		try {
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
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.err.println("No element found Please check the element  =>"+e.getMessage());
			//throw new org.openqa.selenium.NoSuchElementException("Element not found please check");
			
		}catch (NullPointerException e) {
			System.err.println("Value is null  =>"+e.getMessage());
			
		}
		
		return null;
		
	}

	
	@Override
	public void click(WebElement ele) {
		try {
			wait=new WebDriverWait(driver,Duration.ofSeconds(maxWaittime));
			WebElement element = isdisplayed(ele);
			element.click();
		} catch (org.openqa.selenium.NoSuchElementException e) {
		System.err.println("No no no"+e.getMessage());
			e.printStackTrace();
		}
		
		
	}

	private WebElement isdisplayed(WebElement ele) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}

	
	public void type(WebElement ele, String textdata) {
		try {
			wait=new WebDriverWait(driver,Duration.ofSeconds(maxWaittime));
			WebElement type = wait.until(ExpectedConditions.visibilityOf(ele));
			type.clear();
			type.sendKeys(textdata);
		} catch (NoSuchElementException e) {
			System.err.println("No element found =>"+e.getMessage());
			
		}catch (NullPointerException e) {
			System.err.println("value is null =>"+e.getMessage());
		}
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
	Set<String>windowsHandle=driver.getWindowHandles();
	List<String>handle=new ArrayList<String>(windowsHandle);
	driver.switchTo().window(handle.get(i));
		
		
	}

	@Override
	public void selectText(WebElement ele, String byVisiableText) {
		WebElement element=isdisplayed(ele);
		new Select(element).selectByVisibleText(byVisiableText);
		
		
	}

	@Override
	public void selectValue(WebElement ele, String byValue) {
		WebElement element=isdisplayed(ele);
		new Select(element).selectByValue(byValue);
		
		
	}

	@Override
	public void selectindex(WebElement ele, int position) {
		WebElement element=isdisplayed(ele);
		new Select(element).selectByIndex(position);
		
	}

	@Override
	public String gettitle() {
		
		return driver.getTitle();
	}

	@Override
	public boolean isDisplayed(WebElement ele) {
		WebElement element=isdisplayed(ele);
		return element.isDisplayed();
	}

	@Override
	public String getURL() {
		
		return null;
	}

	@Override
	public boolean isEnabled(WebElement ele) {
		WebElement element=isdisplayed(ele);
		return element.isEnabled();
		
	}

	@Override
	public boolean isSelected(WebElement ele) {
		WebElement element=isdisplayed(ele);
		return element.isSelected();
	}
}
