package DataDrivenTesting;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import DataDrivenTesting.ShopperStackUtility;

public class ShoppersStack {
	
	@Test(dataProvider = "login")
	public void login(String username,String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
	@org.testng.annotations.DataProvider(name="login")
	public Object[][]sender() throws EncryptedDocumentException, IOException{
		return ShopperStackUtility.shoppersLogin();
	}

}