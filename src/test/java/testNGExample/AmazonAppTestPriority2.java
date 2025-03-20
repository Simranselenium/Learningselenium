package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonAppTestPriority2 {
	
	
	//priority
	
	//if priority is not defined, by default priority is 0
	//if test have same priority ---- execution as per naming conv
	//highest negative number having priority
	
	
	
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("================launching an app================");
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("================closing an app================");
	}
	
	
	@Test(priority = -100, description = "userStory: 123- login with valid cred", timeOut = 5000)
	public void login() {
		System.out.println("login test case");
		
	}
	
	@Test(priority = 2)
	public void logout() {
		System.out.println("logout test case");
		
	}
	
	@Test
	public void addItems() {
		System.out.println("addItems test case");
		
	}
	
	@Test(enabled = false)
	public void updateOrder() {
		System.out.println("updateOrder test case");
		
	}
	
	@Test(priority = 1, enabled = false)
	public void payment() {
		System.out.println("payment test case");
		
	}

}
