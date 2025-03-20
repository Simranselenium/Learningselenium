package ddtExample;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HRMLogin extends BaseTest{
	
	
	
	@Test(dataProvider = "SampleData1")
	public void verifyLoginWithMultipleCred(String user, String pass) {
		
		
		System.out.println("user cred: " + user + " : " + pass);
		
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		
		
		driver.findElement(By.tagName("button")).click();
		
		
	}
	
	
	@DataProvider
	public Object[][] SampleData() {
		
		
		Object[][] data = { {"user1", "password1"},{"user2", "2131234"},{"user3", "password3"}};
		return data;
		
	}
	
	
	
	@DataProvider
	public Object[][] SampleData1() {
		
		
		Object[][] data = { {"usersample1", "password1"},{"user2", "2131234"},{"user3", "password3"}};
		return data;
		
	}
	
	
//	@DataProvider
//	public Object[][] sampleData() {
//		
//		//data
//		Object[][] data = { {"user1", "password1"},{"user2", "2131234"},{"user3", "password3"}};
//		
//		return data;
//	}
//	
////	
//	@DataProvider
//	public Object[][] regressionData() {
//		
//		//data
//		Object[][] data = { {"user_regression1", "password1"},{"user_regression2", "2131234"},{"user_regression3", "password3"},{"user_regression4", "password3"}};
//		
//		return data;
//	}

}
