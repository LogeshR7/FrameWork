package FrameWorkBase;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

public interface SeleniumAPI {
	
/**
 * @param url
 * @author Logesh
 * @return This will provide url to the driver
 * @exception NoSuchElementException
 */
	public void startup(String url);
	/**
	 * @author Logesh
	 * @param browserName
	 * @param url
	 * @return This is used to open WebBroswer
	 */

	public void startup(String browserName,String url);
	
/**
 * @return This will close the current tab
 *  @author Logesh
 */
	
	public void close();
	
	/**
	 * @return This will close the browser
	 * @author Logesh
	 */
	public void quit();
	
	
	/**
	 * @return This will used to find element
	 * @param type
	 * @param values
	 * @exceptione {@link NoSuchElementException}
	 * 
	 */
	//WebElement
	public void WebElement(Locator type,String values);
	/**
	 * @return used to click the element
	 * @param ele
	 * @author logesh
	 */
	public void click(WebElement ele);
	
	/**
	 * @return Used to type the text in the field
	 * @param text
	 */
	public void type(WebElement ele,String textdata);
	
	/**
	 * @return Used to append the text data with the existing test data
	 * @param ele
	 * @param testdata
	 */
	public void append(WebElement ele,String testdata);
	/**
	 * @return This is used to switch windows in the browser
	 * @param i
	 */
	
	/**
	 * @return This is used to switch one window to another
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
	 * @return this is Used to select a drop down by using the value
	 * @param ele
	 * @param byValue
	 */
	public void selectValue(WebElement ele,String byValue);
	
	/**
	 * @param ele
	 *@return This is used to select a dropdown by using index 
	 */
	public void selectindex(WebElement ele,int position);
	
	/*@return This will return the current page title
	 *@param 
	 */
	String gettitle();
	
	/**
	 * 
	 * @return this will turn the element is visible or not
	 */
	boolean isDisplayed();
	/**
	 * 
	 * @return This will return the current page url
	 */
	
	String getURL();

	
	
}

