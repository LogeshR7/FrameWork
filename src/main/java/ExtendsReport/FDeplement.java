package ExtendsReport;

import org.testng.annotations.Test;

public class FDeplement extends ReportFrameWork{
	
	void create() {
		testname="tc001";
		buliderName="Logesh";
		cat="Smoke";
		
	}

	
	
	@Test
	void mytest() {
		System.out.println("Test begin");
		teststatus("pass", "logeh the mass");
		System.out.println("Test end");
	}

}
