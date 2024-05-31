package ClassAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dwsGiftCard {
	
	@Parameters({"url", "username", "password"})
	@Test
	public void dws(String url, String username, String password) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("(//div[@class='buttons'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@class='details']")).click();
		WebElement giftCardLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Gift Cards')]")));
	    giftCardLink.click();
		
	}

}
