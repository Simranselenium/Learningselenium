package testNGExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonAppTestDepends {
	
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("================launching an app================");
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("================closing an app================");
	}
	
	
	@Test(priority = -100)
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
		
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods = "addItems")
	public void updateOrder() {
		System.out.println("updateOrder test case");
		
	}
	
	@Test(priority = 1)
	public void payment() {
		System.out.println("payment test case");
		
	}

}
