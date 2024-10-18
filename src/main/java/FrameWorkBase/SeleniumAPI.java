package FrameWorkBase;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

public interface SeleniumAPI {
	
/**
 *This will provide url to the driver
 * @param url
 * @author Logesh
 * 
 * @exception NoSuchElementException
 */
	public void startup(String url);
	/**
	 * This is used to open  different WebBroswer
	 * @author Logesh
	 * @param browserName
	 * @param url
	 *  
	 */

	public void startup(Browser browserName,String url);
	
/**
 *  This will close the current tab
 *  @author Logesh
 */
	
	public void close();
	
	/**
	 * This will close the browser
	 * @author Logesh
	 */
	public void quit();
	
	
	/**
	 *  This will used to find element
	 * @param type
	 * @param values
	 * @exceptione {@link NoSuchElementException}
	 * 
	 */
	//WebElement
	public WebElement element(Locators type,String values);
	/**
	 *  This will wait the element is clickable then click
	 * @param ele
	 * @author logesh
	 */
	public void click(WebElement ele);
	
	/**
	 *  Used to clear the text data with the existing test data and send a new data
	 * @param text
	 */
	public void type(WebElement ele,String textdata);
	
	/**
	 *  Used to append with the exsting data
	 * @param ele
	 * @param testdata
	 */
	public void append(WebElement ele,String testdata);
	
	
	/**
	 *  This is used to switch one window to another
	 * @param i
	 */

	public void switchtowindow(int i);
	
	/**
	 * This is used to select a drop down by using visiable text
	 * @param ele
	 * @param byValue
	 */
	public void selectText(WebElement ele,String byVisiableText);
	
	/**
	 *  this is Used to select a drop down by using the value
	 * @param ele
	 * @param byValue
	 */
	public void selectValue(WebElement ele,String byValue);
	
	/**
	 * @param ele
	 * This is used to select a dropdown by using index 
	 */
	public void selectindex(WebElement ele,int position);
	
	/* This will return the current page title
	 *@param 
	 */
	String gettitle();
	
	/**
	 * 
	 *  this will turn the element is visible or not
	 */
	boolean isDisplayed(WebElement ele);
	/**
	 * 
	 *  This will return the current page url
	 */
	
	String getURL();
	
	/**
	 * 
	 *  This will says the element or field is intertable or not
	 */
	boolean isEnabled(WebElement ele);

	boolean isSelected(WebElement ele);
	
}

