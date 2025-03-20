package logExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Constant;

public class HRMLoginLogoutTest extends BaseTest{
	
	
	
	@Test
	public void VerifyLogin() throws Exception {
		
		log.info("enter username: " + Constant.userName);
		driver.findElement(By.name("username")).sendKeys(Constant.userName);
		
				
		
		
	}
	
	
	

	
	
	
	
	
	

}
