package ClassAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoWebShop extends BaseClassDWS {
	
	@Test
	public void dwsShop() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='buttons'])[3]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,926);");
		
		//click on facebook
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[text()='RSS']")).click();
		
		
	}

}
