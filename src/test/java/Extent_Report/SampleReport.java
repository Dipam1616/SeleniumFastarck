package Extent_Report;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	
	@Test
	public void launchTheReport() {
		
		ExtentReports report = new ExtentReports();
		File path = new File("ExtentReports/sample.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("Selenium Batch");
		spark.config().setReportName("Dipam");
		spark.config().setTheme(Theme.DARK);
		
		//Attach the spark report to extent report
		report.attachReporter(spark);
		
		//Create the test case
		ExtentTest test1 = report.createTest("test1");
		test1.log(Status.FAIL, "login function error");
		report.flush();
	}

}
