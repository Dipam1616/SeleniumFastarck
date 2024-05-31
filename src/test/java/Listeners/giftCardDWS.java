package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ITestListeners.BaseClassDWS;

@Listeners(ITestListeners.DwsLogin.class)
public class giftCardDWS extends BaseClassDWS {

    @Test
    public void addGiftCard() throws InterruptedException {
        // Click on Gift Card
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[3]")).click();
        
        // Click on Gift Card Product
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='item-box']")).click();
        
        // Enter Recipient name from Excel file 
        Thread.sleep(2000);
        driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(recipient_name);
        
        // Enter Recipient Email from Excel file
        Thread.sleep(2000);
        driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(recipient_email);
        
        //Click on Quantity and change the quantity
        WebElement quantity = driver.findElement(By.id("addtocart_1_EnteredQuantity"));
        quantity.clear();
        quantity.sendKeys("5");
        
        //Click on Add to Cart Button
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-button-1")).click();
    }
}
