package actionExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWishList {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("=================launching app========================");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
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
	public void VerifyWishList() throws Exception {
		
		
		WebElement SignIn = driver.findElement(By.xpath(""));
		WebElement wishlist = driver.findElement(By.xpath(""));
		
		
		//mouse-hover operation
		Actions act = new Actions(driver);
		act.moveToElement(SignIn).perform();
		act.moveToElement(SignIn).perform();
		act.click().perform();
		
		
		//app2
		//move to SignIn -----move to Wishlist ----click
		act.moveToElement(SignIn).moveToElement(wishlist).click().perform();
		
		//app3
		//move to SignIn -----move to Wishlist ----click
		act.moveToElement(SignIn).click(wishlist).perform();
		
			
		//app4
		act.moveToElement(SignIn).click(wishlist).build().perform();

	}

}
