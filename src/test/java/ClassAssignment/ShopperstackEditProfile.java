package ClassAssignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShopperstackEditProfile extends BaseClass {
	
	@Test
	public void editProfile() throws InterruptedException, AWTException {
		Actions action = new Actions(driver);
				
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li[class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		WebElement frstname = driver.findElement(By.id("First Name"));
		action.doubleClick(frstname).build().perform();
		frstname.sendKeys("Virat");
		WebElement lstname = driver.findElement(By.id("Last Name"));
		action.doubleClick(lstname).build().perform();
		lstname.sendKeys("Kohli");
		WebElement no = driver.findElement(By.id("Phone Number"));
		action.doubleClick(no).build().perform();
		no.sendKeys("7777799999");
		
		WebElement dropdown = driver.findElement(By.id("State"));
		Select select = new Select(dropdown);
		select.selectByValue("Maharashtra");
		
		WebElement dropdown1 = driver.findElement(By.id("City"));
		Select sel = new Select(dropdown1);
		sel.selectByValue("Nagpur");
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
    	rb.keyRelease(KeyEvent.VK_ENTER);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class='MuiBox-root css-5nwj3y']")).click();
		
		
		
				
		
	}

}
