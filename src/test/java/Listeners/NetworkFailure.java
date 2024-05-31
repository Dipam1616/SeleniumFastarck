package Listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetworkFailure {
	
	@Test(retryAnalyzer = ITestListeners.NetworkRetry.class)
	public void fail() {
		WebDriver driver = new ChromeDriver();
		assertEquals("Dipam", "dk");
		//*
		driver.findElement(By.cssSelector("ico-login")).click();
	   driver.findElement(By.cssSelector("ico-login"));
	   driver.findElement(By.id("d"));

		
	}
	

}
