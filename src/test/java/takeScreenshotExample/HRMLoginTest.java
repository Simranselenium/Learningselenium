package takeScreenshotExample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMLoginTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("=================launching app========================");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(6000);
		System.out.println("=================closing app========================");
		driver.close(); // close the current instance
		driver.quit(); // all the instance created by driver

	}

	@Test
	public void VerifyLoginTest() throws Exception {
		
		Thread.sleep(3000);
		
		
		//login
		
		//capture screenshot after login
		CaptureScreenshot(driver, "HRMLoginTestScenrio1");
		
		
		//logout
		//capture screenshot after logout

	}
	
	
	
	
	public void CaptureScreenshot(WebDriver driver, String filename) throws Exception {
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File targetLocation = new File(".//screenshot//"+filename+"_Q12025.png");
		
		
		FileUtils.copyFile(screenshotFile, targetLocation);
	}

}
