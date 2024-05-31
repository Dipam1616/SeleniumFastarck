package TestNG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProductRetryAnalyzer {
	
	@Test(retryAnalyzer = ITestListeners.ListenersRetry.class)
	public void searchProduct() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		assertEquals("dipam", "dip");
			
		
	}

}
