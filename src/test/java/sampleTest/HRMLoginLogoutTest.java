package sampleTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMLoginLogoutTest {

	// short-cut ---- add/remove imports

	@Test
	public void verifyLogin() throws Exception {

//		WebDriver driver = new ChromeDriver();

//		WebDriver driver = new EdgeDriver();

		WebDriver driver = new FirefoxDriver();

		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("Admin123456");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("welcome1234567");

		Thread.sleep(7000);

		driver.close();

	}

}
