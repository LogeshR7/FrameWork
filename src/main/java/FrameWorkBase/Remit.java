package FrameWorkBase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Remit extends SelenuimBAse {
	@Test
	 void remit() throws Exception{
		 startup("http://remittance.ocs.org/remittance/public/ddtransaction/unpost?unpost_id=11");
		 
	//Login;
		 type(element(Locators.ID, "login"),"dosth");
		 type(element(Locators.ID,"password"),"itsmedosth",Keys.ENTER);
		 
	//Un-post
		click(element(Locators.XPATH, "//span[text()='Remit']")) ;
		
		//cash
            click(element(Locators.XPATH, "(//span[@id='basic-addon2'])[2]"));    
           //customer 
            click(element(Locators.XPATH,"(//span[@class='checkmark'])[3]"));
             
           //Beneficiary Screening
            WebElement ele1=  element(Locators.XPATH, "//select[@name='beneficairy_screening']");
            Select select=new Select(ele1);
            select.selectByIndex(1);
            
           //Beneficiary
            type(element(Locators.XPATH,"//input[@placeholder='Enter Payee Name']"), "ragu");
            
            //orginator
            WebElement ele=element(Locators.XPATH, "//select[@name='orginator_screening']");
           Select select1=new Select(ele);
           select1.selectByIndex(1);
           
           //org check box
           click(element(Locators.XPATH, "//input[@class='same_customer_as_orginator']"));
           
           //purpose
          // element(Locators.XPATH,)
           
            
            
             
         
		 
		
		
		
	}
	
	

}
