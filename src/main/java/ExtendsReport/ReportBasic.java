package ExtendsReport;

import javax.naming.ldap.ExtendedRequest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportBasic {
	
	public static void main(String[] args) {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./Logesh.html");
		ExtentReports extend=new ExtentReports();
		extend.attachReporter(spark);
		
		ExtentTest test = extend.createTest("Logesh applicatio0n");
		test.pass("dai varain da ",MediaEntityBuilder.createScreenCaptureFromPath("./Cr7.jpeg").build());
		extend.flush();

		
		
		
		 
		 
		 
		 
	 }

}
