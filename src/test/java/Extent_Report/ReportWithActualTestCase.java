package Extent_Report;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ITestListeners.BaseClassDWS;


@Listeners(ITestListeners.GenerateExtentReport.class)
public class ReportWithActualTestCase extends BaseClassDWS {

	@Test
	public void dwsLoginCorrect() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("admin01@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys("admin01");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();

	}

	@Test
	public void dwsLoginWrong() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("admin01@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys("admin02");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

	@Test(dependsOnMethods = "dwsLoginWrong")
	public void redbus() {

		driver.get("https://www.redbus.in/");
		assertEquals("dipam", "dk");

	}

}