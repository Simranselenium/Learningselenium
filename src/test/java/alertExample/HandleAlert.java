package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert extends BaseTest{
	
	
	
	//@Test
	public void VerifySimpleAlert() throws Exception {
		
		
		driver.findElement(By.xpath("//*[contains(@value,'Me Al')]")).click();
		
		
		//handle an alert
		
		
		Thread.sleep(4000);
		
		
		Alert SimpleAlert = driver.switchTo().alert();
		
		
		System.out.println("Alert Text: " + SimpleAlert.getText());  //Hi.. This is alert message!
		
//		expectedValue = Hi.. This is alert message!
//		actualValue = SimpleAlert.getText()
		
		
		
		
		
		
		//validation
		Assert.assertEquals(SimpleAlert.getText(), "Hi.. This is alert message!");
		
		
		SimpleAlert.accept();
		
		
		
		//accept ---- ok
		//dismiss ---- cancel
		//getText ---- fetch text
		//sendKeys ---- enter value
		
				
		
		
	}
	
	
	

	//@Test
	public void VerifyConfirmAlert() throws Exception {
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		
		
		//handle an alert
		
		
		Thread.sleep(4000);
		
		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		System.out.println("Alert Text: " + confirmAlert.getText());  //Press 'OK' or 'Cancel' button!
		
//		expectedValue = Hi.. This is alert message!
//		actualValue = SimpleAlert.getText()
		
			//validation
		Assert.assertEquals(confirmAlert.getText(), "Press 'OK' or 'Cancel' button!");
		
		
		confirmAlert.accept();
//		confirmAlert.dismiss();
		
		
		//accept ---- ok
		//dismiss ---- cancel
		//getText ---- fetch text
		//sendKeys ---- enter value
		
		Thread.sleep(4000);
		
		
		String actual_ok_cancel = driver.findElement(By.cssSelector("[id=\"demo\"]")).getText();		//You pressed OK!
//		Assert.assertEquals(actual_ok_cancel, "You pressed OK!");
		
		
//		Assert.assertTrue(actual_ok_cancel.contains("OK"));
		Assert.assertTrue(actual_ok_cancel.contains("OK"), "Validation get failed.");
		
		
		
		
		
	}
	
	
	
	@Test
	public void VerifyPromptAlert() throws Exception {
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Pro')]")).click();
		
		
		//handle an alert
		
		
		Thread.sleep(4000);
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		System.out.println("Alert Text: " + promptAlert.getText());  //Your Name Please
		
//		expectedValue = Hi.. This is alert message!
//		actualValue = SimpleAlert.getText()
		
			//validation
		Assert.assertEquals(promptAlert.getText(), "Your Name Please");
		
		
		
		Thread.sleep(4000);
		promptAlert.sendKeys("Anil Gupta");
		Thread.sleep(4000);
		
		
		
		promptAlert.accept();

		
		
		//accept ---- ok
		//dismiss ---- cancel
		//getText ---- fetch text
		//sendKeys ---- enter value
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
