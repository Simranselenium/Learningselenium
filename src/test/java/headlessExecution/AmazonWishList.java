package headlessExecution;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import utility.Constants;

public class AmazonWishList {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--headless");
//		
//		
//		
//		driver = new ChromeDriver(opt);    //session 
		
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--headless");
		
		
		
		driver = new EdgeDriver(opt);    //session 
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //https://www.amazon.in/
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close(); 
		driver.quit();
		
	}
	
	
	@Test
	public void moveToWishList() throws Exception {
		
		
		driver.findElement(By.tagName("button")).click();;
		System.out.println("application title: " + driver.getTitle());
		
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targetLocation = new File("./screenshot/HRM_LOGIN.png");
		
		FileUtils.copyFile(screenshotFile, targetLocation);
		
		
		
		
	}
	
}
