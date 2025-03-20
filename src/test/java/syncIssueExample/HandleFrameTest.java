package syncIssueExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleFrameTest extends BaseTest{
	
	
	
	
	
	
	@Test
	public void VerifyFrame() throws Exception {
		
		
		//conditional wait example
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));			//specific element 
		
		
		
		
		WebElement ele = driver.findElement(By.cssSelector("#text3"));
		ele.sendKeys("enter value");
		
		
	}
	
	
	
	
	
	

}
