package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDatafromPropertieFile {
	@Test
	public void dws() throws IOException, InterruptedException {
	  Properties prop = new Properties();
	  FileInputStream fis = new FileInputStream("./PropertiesFile/DWSFile.properties"); 
	  prop.load(fis);
	  String url = prop.getProperty("URL");
	  String username = prop.getProperty("USERNAME");
	  String password = prop.getProperty("PASSWORD");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(url);
	  Thread.sleep(2000);
	  driver.findElement(By.className("ico-login")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("Email")).sendKeys(username);
	  Thread.sleep(2000);
	  driver.findElement(By.id("password")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}