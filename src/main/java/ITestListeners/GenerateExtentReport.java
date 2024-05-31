package ITestListeners;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport implements ITestListener {
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;

	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		System.out.println("onTestStart");

	}

	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS, name + " is passed");
		System.out.println("onTestSuccess");
		

	}

	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.FAIL, name + " is failed");
		System.out.println("onTestFailure");
		

	}

	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.SKIP, name+ "   "+" is Skipped");
		System.out.println("onTestSkipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");

	}

	public void onStart(ITestContext context) {

		File path = new File("ExtentReports/testrun.html");
		spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("Selenium Batch");
		spark.config().setReportName("Dipam");
		spark.config().setTheme(Theme.STANDARD);
		report = new ExtentReports();
		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("Browser", "Chrome");
		//Attach spark report to extent report
		report.attachReporter(spark);

	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		report.flush();

	}

}
