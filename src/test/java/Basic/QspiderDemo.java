package Basic;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Type something']")).sendKeys("I need Job");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Dipam@123");
		driver.findElement(By.cssSelector("input[name='confirmpass']")).sendKeys("Dipam@123");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("dipamkawale11@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='URL']")).sendKeys("URL");
		driver.findElement(By.cssSelector("input[name='digits']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='number']")).sendKeys("7507721789");
		driver.findElement(By.cssSelector("input[name='alphanum']")).sendKeys("ABCD@123");
		driver.findElement(By.cssSelector("input[name='minLength']")).sendKeys("abcdedf");
		driver.findElement(By.cssSelector("input[name='maxLength']")).sendKeys("abcdefgh");
		driver.findElement(By.cssSelector("input[placeholder='Max 6 chars.']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='minValue']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name='maxValue']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[name='rangeValue']")).sendKeys("647839247");
	}

}
