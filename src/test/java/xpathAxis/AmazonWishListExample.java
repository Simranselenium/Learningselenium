package xpathAxis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AmazonWishListExample {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
	
		
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("closing an application browser" );
		driver.close();
		driver.quit();
		
	}

	
	@Test
	public void WishListTest() {
		
		
		WebElement seeMore = driver.findElement(By.xpath("//h2[contains(text(),'essentials | Up to 60% off')]/parent::div/following-sibling::div[contains(@class,'foot')]/a"));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click()", seeMore);
		
		
//		seeMore.click();
		
		
		
		System.out.println("application title: " + driver.getTitle());	//Car and Bike
		
		
	}
	
}
