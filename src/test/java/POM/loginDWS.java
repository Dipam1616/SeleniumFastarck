package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.POM.DWSloginPage;

public class loginDWS {

	@Test
	public void login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");

		DWSloginPage dws = new DWSloginPage(driver);
//		Thread.sleep(2000);
//		dws.username.sendKeys("admin01@gmail.com");
//		Thread.sleep(2000);
//		dws.password.sendKeys("admin01");
//		Thread.sleep(2000);
//		dws.login_button.click();
		
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login_button();

	}

}
