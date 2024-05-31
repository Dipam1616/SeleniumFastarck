package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Connect to the DataBase");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Pre Condition for test Runner");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("dipamkawale11@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dipam@123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		System.out.println("Post  Condition for test Runner");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("To DissConnect from the DataBase");
	}
	
	

}
