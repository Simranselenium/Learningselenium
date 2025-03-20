package crossBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.Constant;

public class HandleCheckboxRadioButton {
	
	
	WebDriver driver;
	
	
	@Parameters("br_details")
	@BeforeTest
	public void launchApp(String brInfo) throws Exception {
		
		System.out.println("=================launching app========================");
		
		
		String br = brInfo;
		System.out.println("extract value from XML file : " + brInfo);
		
		
		
		
		if(br.equalsIgnoreCase("chrome")) {
			System.out.println("execution on chrome browser");
			driver = new ChromeDriver();
			
		}
		else if(br.equalsIgnoreCase("edge")) {
			System.out.println("execution on edge browser");
			driver = new EdgeDriver();
		}
		
		else if(br.equalsIgnoreCase("firefox")) {
			System.out.println("execution on firefox browser");
			driver = new FirefoxDriver();
		}
		else {
			
			System.out.println("========EXECUTION ON DEFAULT BROWSER================");
			driver = new ChromeDriver();
			
		}
		
		
//		driver = new ChromeDriver();
		
//		driver = new EdgeDriver();
		
		
		
		
		
		
		
		
		
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
