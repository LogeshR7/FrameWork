package ExtendsReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportBasic {
	
	public static void main(String[] args) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./SampleReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("samplereort");
		test.pass("create a report");
		test.pass("user see the list");
		test.pass("user are able to click the rport",MediaEntityBuilder .createScreenCaptureFromPath("./Car.jpg").build());
	   
		
		
		
		
		
		
		extent.flush();
		
		
		
		 
		 
		 
		 
	 }

}
