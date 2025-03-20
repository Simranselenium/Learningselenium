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

public class AmazonWishList2 {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("=================launching app========================");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
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
		
		
		WebElement rightBtn = driver.findElement(By.xpath("//span[contains(text(),'right click')]"));
		//WebElement wishlist = driver.findElement(By.xpath(""));
		
		
		//mouse-hover operation
		Actions act = new Actions(driver);
		act.contextClick(rightBtn).perform();
		
		
		
		//app2
		act.moveToElement(rightBtn).contextClick().perform();
		

	}

}
