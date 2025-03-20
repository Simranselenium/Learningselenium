package exercise;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMApp_Locator {
	
	
	
	@Test
	public void VerifyLogin() throws Exception {


		WebDriver driver = new ChromeDriver();  //launch a chrome browser
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		
		
		//locators
		//name
		
//		WebElement user = driver.findElement(By.name("username"));        	// single webelement
//		
//		List<WebElement> userlist = driver.findElements(By.name("username"));							//list of webelement
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		//tagname
		driver.findElement(By.tagName("button")).click();						//unique match
		
		
		
		Thread.sleep(3000);
		
		
		//validation
		String actualAppURL = driver.getCurrentUrl();
		System.out.println("Application URL after login: " + actualAppURL);
		
		//assertion
		
		
		
		//className
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		
		
		//linkText
		driver.findElement(By.linkText("Logout")).click();       //exact text
		
		
		//partialLinkText
//		driver.findElement(By.partialLinkText("ogou")).click();	//partial text	   Logout			
		
		Thread.sleep(3000);
		
		
		//validation
		String actualAppURLAfterLogout = driver.getCurrentUrl();
		System.out.println("Application URL after logout: " + actualAppURLAfterLogout);
				
		//assertion
		
		
		
		
		
		Thread.sleep(3000);
		//xpath
		
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("AdminXPATH");
		
		
		
		Thread.sleep(3000);
		
		//css 
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("AdminExample");
		
		
		
		
		
		
		Thread.sleep(6000);
		
		
		//close the application
		driver.close();
		
	}
	
	

}
