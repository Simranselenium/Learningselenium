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



public class AmazonWishListExample2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		

		
		driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
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
		
		
		WebElement checkbox = driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input"));
		
		checkbox.click();
		
		
	}
	
}
