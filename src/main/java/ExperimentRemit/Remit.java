package ExperimentRemit;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import FrameWorkBase.Locators;
import FrameWorkBase.SelenuimBAse;

public class Remit extends SelenuimBAse {

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
		
		//bene
				click(element(Locators.XPATH, "(//span[@id='basic-addon2'])[5]"));
				click(element(Locators.XPATH,"(//span[@class='checkmark'])[59]"));
		
		//bene screnning
		selectindex(element(Locators.XPATH,"//select[@name='beneficairy_screening']"), 1);
		
		
		
		
		
	}
}
