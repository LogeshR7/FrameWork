package FrameWorkBase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearch extends SelenuimBAse{
	
	@Test
	public void searched() throws Exception {
		startup(Browser.CHROME,"https://www.google.com/");
		WebElement data=element(Locators.NAME,"q");
		
		type(data, "football",Keys.ENTER);
		Thread.sleep(3000);
		quit();
		
		
	}
	
	

}
