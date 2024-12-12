package FrameWorkBase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.reactivex.rxjava3.functions.Action;

public class mc extends SelenuimBAse{
	
	
	
	@Test
	public void MCDouble() {
		WebDriver driver = null;
		
		startup("http://moneyexchange.ocs.org/moneyexchange/public/buysell_list");
		
		type(element(Locators.ID, "login"),"dosth");
		type(element(Locators.ID,"password"),"itsmedosth",Keys.ENTER);
		
		click(element(Locators.XPATH, "//div[normalize-space(text())='Transaction']"));
		 
		click(element(Locators.LINKTEXT,"Buy Sell List"));
		 click(element(Locators.XPATH, "//a[@class='transaction_buysell_delete list_action']"));
		 type(element(Locators.ID, "transaction_delete_remark"), "test");
		 click(element(Locators.NAME, "deleteConfirmStatus"));
	
		Actions bulider=new Actions(driver);
		WebElement ele=driver.findElement(By.id("transactiondeleteFormSubmit"));
		bulider.doubleClick(ele).perform();
		 
	/*	 click(element(Locators.ID,"transactiondeleteFormSubmit"));
	}transactiondeleteFormSubmit"
*/
	
	}
}
