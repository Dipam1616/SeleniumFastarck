package ClassAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShopperStack extends BaseClass {
	
	@Test
	public void Shopper() throws InterruptedException {
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.id("men"));
		action.moveToElement(product).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.xpath("//button[text()='add to cart']"));
		for (WebElement web : products) {
			web.click();
			
		}
		
	}

}
