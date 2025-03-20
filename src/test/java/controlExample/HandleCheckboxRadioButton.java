package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constant;

public class HandleCheckboxRadioButton {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("=================launching app========================");
		driver = new ChromeDriver();
		System.out.println("Application URL: " + Constant.SampleApp_DEV);
		driver.get(Constant.SampleApp_DEV);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
	}
	
	@Test
	public void login() {
		
				
		System.out.println("login test case");
		driver.findElement(By.cssSelector("[value=\"Boat\"]")).click();
				
		driver.findElement(By.cssSelector("[value=\"female\"]")).click();
	}
	
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(6000);
		System.out.println("=================closing app========================");
		driver.close();
		driver.quit();
		
	}
	
	
	
	
	

}
