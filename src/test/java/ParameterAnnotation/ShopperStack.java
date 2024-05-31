package ParameterAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ShopperStack {
	@Parameters({"url", "Email","Password"})
	@Test
	public void shopperLogin(String url, String Email, String Password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Login']")));
		WebElement login_button = driver.findElement(By.xpath("//button[text()='Login']"));
		if (login_button.isEnabled()) {
			login_button.click();
			driver.findElement(By.id("Email")).sendKeys(Email);
			driver.findElement(By.id("Password")).sendKeys(Password);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
		} else {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", login_button);

		}
		
	
	}

}
