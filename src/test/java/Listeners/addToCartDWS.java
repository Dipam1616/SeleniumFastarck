package Listeners;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ITestListeners.BaseClassDWS;

@Listeners(ITestListeners.DwsLogin.class)
public class addToCartDWS extends BaseClassDWS {

	@Test
	public void addtocart() throws IOException, InterruptedException {

		// Click on Digital Downloads
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();

		// Click on Product
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("img[title='Show details for 3rd Album']")).click();

		// Click on Add to cart quantity
		driver.findElement(By.id("addtocart_53_EnteredQuantity")).click();

		// Read data from Excel file
		FileInputStream fis = new FileInputStream("src\\test\\resources\\LoginFile.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet3");
		int quantity = (int) sheet.getRow(0).getCell(0).getNumericCellValue();

		// Set the Quantity of Product
		WebElement Quantity_of_product = driver.findElement(By.id("addtocart_53_EnteredQuantity"));
		Quantity_of_product.clear();
		Quantity_of_product.sendKeys(String.valueOf(quantity));

		// Click on Add to Cart
		driver.findElement(By.id("add-to-cart-button-53")).click();

	}

}
