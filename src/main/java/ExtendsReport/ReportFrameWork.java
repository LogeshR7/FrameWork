package ExtendsReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportFrameWork {
	
	ExtentReports report;
	ExtentTest test;
	
	String testname="";
	String buliderName="";
	String cat="";
	
	
	protected void Create() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./framereport.html");
		report=new ExtentReports();
		report.attachReporter(spark);
		
	}
	
	
	protected void save() {
		report.flush();
			
	}
	
	
	void createtest() {
		report.createTest(testname);
		test.assignAuthor(buliderName);
		test.assignCategory(cat);
		
	}
	
	void teststatus(String status,String desc) {
		switch ("status".toLowerCase()) {
		case "pass":
			test.pass(desc);
			break;
		
		case "fail":
			test.fail(desc);
			break;
			
		case "info":
			test.info(desc);
			break;
		
		case "Warning":
			test.warning(desc);
			break;
			
		default:
			System.err.println("Status not found");
			break;
		}
	}

}
