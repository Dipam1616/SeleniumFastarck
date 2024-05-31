package TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwsAddToProduct extends BaseClass{
	
	@Test
	public void addTocart() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> products = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		
		for (WebElement web : products) {
		web.click();
		}
		
		
	}

}
