package tests;

import org.testng.annotations.Test;

public class LoginTest extends TestBase{
	
	
	
	@Test
	public void VerifyLogin() throws Exception {
		
		System.out.println(lp.IsUserNameEnabled());
		lp.enterUser("Admin");
		lp.enterPass("admin123");
		lp.clickLoginButton();
		

		
		
//		lp.login("", "");
		
		
		//verification
		lp.verifyApplicationTitle("HRM");
		
		
		lp.clickuserDropdown();
		lp.clickLogoutButton();
		
		
		//verification
		lp.verifyApplicationTitle("HRM");
		
		
		
		
		
		
	}

}
