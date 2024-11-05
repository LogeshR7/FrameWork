package ExperimentRemit;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import FrameWorkBase.Locators;
import FrameWorkBase.SelenuimBAse;

public class Remit extends SelenuimBAse {
WebDriver driver;
	@Test
	public void remit() throws Exception {
		startup("http://remittance.ocs.org/remittance/public/login");
		type(element(Locators.NAME,"login"),"dosth");
		type(element(Locators.NAME,"password"),"itsmedosth",Keys.ENTER);
		
		//Remit
		click(element(Locators.XPATH, "//span[text()='Remit']"));
		
		//customer
		click(element(Locators.LINKTEXT, "Customer Code"));
		Thread.sleep(2000);
		click(element(Locators.XPATH, "(//span[@class='checkmark'])[2]"));
		
		//remark
		click(element(Locators.XPATH, "//span[@aria-hidden='true']"));
		
		//bene
				click(element(Locators.XPATH, "(//span[@id='basic-addon2'])[5]"));
				Thread.sleep(2000);
				click(element(Locators.XPATH,"(//span[@class='checkmark'])[152]"));
		
		//bene screnning
		selectindex(element(Locators.XPATH,"//select[@name='beneficairy_screening']"), 1);
		
		//originator screening
		selectindex(element(Locators.XPATH, "//select[@name='orginator_screening']"), 1);
		
		//originator
		click(element(Locators.XPATH, "//input[@name='same_customer_as_orginator']"));
		
		//Purpose
		selectindex(element(Locators.XPATH, "//select[@name='Purpose']"), 3);
		
		//currency
		type(element(Locators.XPATH, "//input[@placeholder='Enter Currency Code']"), "MYR");
		
		//SGd total
		Thread.sleep(2000);
		type(element(Locators.ID,"lamount"), "4478");
		Thread.sleep(2000);
		type(element(Locators.ID,"lamount"), "44781");
		
		
		//soi
		selectindex(element(Locators.ID, "sourceofincome"), 1);
		
		//Save
		
		Actions bulider=new Actions(driver);
		WebElement dd = element(Locators.XPATH,"//button[@id='save_btn']");
		
		Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",dd);
		 bulider.click(dd).perform();
		 
		
		
		
		
		
		
	}
}
