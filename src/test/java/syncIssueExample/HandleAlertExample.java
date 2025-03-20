package syncIssueExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constant;

public class HandleAlertExample {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("=================launching app========================");
		driver = new ChromeDriver();
		System.out.println("Application URL: " + Constant.SampleApp);
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");
		driver.manage().window().maximize();

		// implict wait ------ any element on webPage

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.delay));

//		Thread.sleep(8000);

	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(6000);
		System.out.println("=================closing app========================");
		driver.close();
		driver.quit();

	}

	@Test
	public void VerifyFrame() throws Exception {

		// conditional wait example
//		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.alertIsPresent());			//specific element 


		String alertText = driver.switchTo().alert().getText();
		System.out.println("===================:"+ alertText);
		
		
		
		driver.switchTo().alert().accept();

	}

}
