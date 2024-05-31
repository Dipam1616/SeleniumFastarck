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
import org.testng.annotations.Parameters;

public class BaseClassDWS {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Connect to the DataBase");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Pre Condition for test Runner");
		
	}
	
	@Parameters("url")
	@BeforeClass
	public void beforeClass(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	
	@Parameters({"username", "password"})
	@BeforeMethod
	public void beforeMethod(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
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
