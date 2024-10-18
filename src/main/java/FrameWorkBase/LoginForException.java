package FrameWorkBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginForException extends SelenuimBAse {
	
	@BeforeMethod
	public void login() {
		startup("http://juzapps.upc.org/smm_juzapps/index.php?route=common/home");
	}
	
	@AfterMethod(alwaysRun = true)
	public void cleanup() {
		quit();
	}
	
	@Test
	
	public void code() {
		
		type(element(Locators.NAME,"email"), "durai");
		type(element(Locators.NAME,"password1"),"Mani1206*");
		click(element(Locators.CSSSELECTOR, "buttonbtn btn-info pull-right1"));
		
		
		
	}
	

}
