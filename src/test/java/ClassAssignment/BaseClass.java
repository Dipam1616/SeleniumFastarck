package ClassAssignment;

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
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("Email")).sendKeys("dipamkawale11@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dipam@2207");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.cssSelector("svg[data-testid='LogoutIcon']")).click();
		driver.close();
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.close();
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
