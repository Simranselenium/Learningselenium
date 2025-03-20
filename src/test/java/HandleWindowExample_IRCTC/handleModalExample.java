package HandleWindowExample_IRCTC;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constant;

public class handleModalExample extends BaseTest{
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("=================launching app========================");
		driver = new ChromeDriver();
		System.out.println("Application URL: " + Constant.SampleApp);
		driver.get("https://www.bus.irctc.co.in/home");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
	}
	

	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(6000);
		System.out.println("=================closing app========================");
		driver.close();			//close the current instance
		driver.quit();			//all the instance created by driver
		
	}
	
	
	@Test
	public void VerifyFrame() throws Exception {
		
		
		
		driver.findElement(By.linkText("Login")).click();
		
		
		
		
		driver.findElement(By.cssSelector("input#loginuserid")).sendKeys("enter login");
		
		
	}
	
	
	
	
	
	

}
