package Listeners;

import org.openqa.selenium.By;

import com.crm.POM.DWSloginPage;

import ITestListeners.BaseClassDWS;

public class CaptureScreenshot extends BaseClassDWS{
	
	public void dwsLoginCorrect() {
		driver.get("");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		DWSloginPage dw=new DWSloginPage(driver);
		dw.username(Email);
		dw.password(Email);
		dw.login_button();
		dw.equals(dw);
	
		
	}

}
