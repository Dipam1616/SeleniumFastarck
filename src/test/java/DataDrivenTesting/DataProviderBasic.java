package DataDrivenTesting;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasic extends DataProviderBaseClass {
	
	@Test(dataProvider = "Login")
	public void reciever(String username, String password) throws InterruptedException {
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}
	
	@DataProvider(name = "Login")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		return DataProviderUtility.dwsLogin();
				
	}

}
