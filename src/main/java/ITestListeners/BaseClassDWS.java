package ITestListeners;

import java.io.IOException;
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

import com.crm.ExternelData.ExcelFile;
import com.crm.ExternelData.PropertiesFile;

public class BaseClassDWS {
    public static WebDriver driver;
    public String URL;
    public String Email;
    public String Password;
    public String recipient_name;
    public String recipient_email;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Connect to the DataBase");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Pre Condition for test Runner");
    }

    @BeforeClass
    public void beforeClass() throws IOException {
        URL = PropertiesFile.propertiesRead("url");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(URL);
    }

    @BeforeMethod
    public void beforeMethod() throws IOException {
        Email = PropertiesFile.propertiesRead("username");
        Password = PropertiesFile.propertiesRead("password");
        
        recipient_name = ExcelFile.excelFile(0, 1);
        recipient_email = ExcelFile.excelFile(1, 1);
        
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.id("Password")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("logic for LogOut");
    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(2000);
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        System.out.println("Post Condition for test Runner");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("To DissConnect from the DataBase");
    }
}
