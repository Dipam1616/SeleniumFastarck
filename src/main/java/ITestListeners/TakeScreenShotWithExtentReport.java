package ITestListeners;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TakeScreenShotWithExtentReport extends BaseClassDWS implements ITestListener {
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;

	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		test.log(Status.INFO, "Welcome to our class");
		test.log(Status.INFO, "My wonderfull fellows...");

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Your test case has passed");

	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Your test case has failed");
		TakesScreenshot ts =  (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromPath(from);
		

	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Your test case has skipped");

	}

	public void onStart(ITestContext context) {
		File path = new File("ExtentReports/Capture.html");
		spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("mujhe pata nahi...");
		spark.config().setReportName("DK Dipam");
		spark.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);

	}

	public void onFinish(ITestContext context) {
		report.flush();

	}

}
