package Assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ClassAssignment.BaseClassDWS;

public class AssertEqual extends Assertions.BaseClassDWS {
	
	@Test
	public void HardAssert() {
	
		String a = "Dipam";
		String b = null;
		SoftAssert ass = new SoftAssert();
		String actual_result = driver.getCurrentUrl();
//		assertEquals(expected_result, actual_result);
		boolean result = expected_result.equals(actual_result);
		ass.assertTrue(result);
		driver.findElement(By.id("small-searchterms")).sendKeys("Dipam");
		ass.assertNull(b);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		ass.assertAll();
		
	}

}
