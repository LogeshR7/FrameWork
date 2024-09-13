package FrameWorkBase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IRCTC extends SelenuimBAse {
	@Test
	public void ticketBooking() throws Exception{
		startup("https://www.irctc.co.in/nget/train-search");
		
		//Login
		click(element(Locators.XPATH,"//a[text()=' LOGIN ']" ));
		type(element(Locators.XPATH,"//input[@placeholder='User Name']"),"logesh244");
		type(element(Locators.XPATH,"//input[@placeholder='Password']"),"logesh244L");
		Thread.sleep(9000);
		click(element(Locators.XPATH,"//button[text()='SIGN IN']"));
		
		
		//From
		WebElement form=element(Locators.XPATH,"(//input[@aria-activedescendant='p-highlighted-option'])[1]");
		
		type(form,"CHENNAI EGMORE - MS (CHENNAI)");
		Thread.sleep(2000);
		//form.sendKeys(Keys.DOWN,Keys.ENTER);
		
		//Destination 
		WebElement destination=element(Locators.XPATH,"(//input[@aria-activedescendant='p-highlighted-option'])[2]");
		type(destination,"THIRUVARUR JN - TVR");
		
		//Date
		WebElement date=element(Locators.XPATH,"//span[@class='ng-tns-c58-10 ui-calendar']//input[1]");
		date.clear();
		Thread.sleep(2000);
		date.sendKeys("13/10/2024");
		
		
		
		//Search
		click(element(Locators.XPATH,"//button[text()='Search']"));
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
