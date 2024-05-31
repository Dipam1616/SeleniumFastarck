package TestNGFashion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KalKi {
	
	@Parameters("url")
	@Test(groups = "regression")
	public void Abhiabhi() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com");
	}

}
