package HandleWindowExample_IRCTC;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constant;

public class HandleWindowTest_Amazon extends BaseTest{
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("=================launching app========================");
		driver = new ChromeDriver();
		System.out.println("Application URL: " + Constant.SampleApp);
		driver.get("https://www.amazon.in/");
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
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("before click on Hotel, window count: "+ driver.getWindowHandles().size());
		
		
		System.out.println("parentWindow: " + parentWindow);
		
		
		
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone 16"); 
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		
		
		driver.findElement(By.xpath("(//span[contains(text(),'iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and ')])[3]")).click();
		
		Thread.sleep(3000);
		
		System.out.println("after click on Hotel, window count: "+ driver.getWindowHandles().size());
		
		
		
		
		
		
		
		Set<String> allWin = driver.getWindowHandles();						//window1 and window2
		
		
		String win1 = (String) allWin.toArray()[0];
		String win2 = (String)allWin.toArray()[1];
		
		System.out.println("win1: " + win1);
		System.out.println("win2: " + win2);
		
		
		//switch to window2
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		
		
		System.out.println("Application Title, after swicth to window2: " + driver.getTitle());
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		
		
		System.out.println("Application Title, after swicth to window1: " + driver.getTitle());
		
		
		//switch to window2
				Thread.sleep(5000);
				driver.switchTo().window(win2);
				
				
				System.out.println("Application Title, after swicth to window2: " + driver.getTitle());
		
		
		
	}
	
	
	
	
	
	

}
