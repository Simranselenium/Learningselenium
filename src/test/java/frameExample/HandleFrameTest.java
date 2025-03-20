package frameExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleFrameTest extends BaseTest{
	
	
	
	
	
	
	@Test
	public void VerifyFrame() throws Exception {
		
		
		WebElement myFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		
		//switch to frame
		//index -- start from 0
		//name or id
		//webElement
		
		
		
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("name or id");
		driver.switchTo().frame(myFrame);
		
//		Thread.sleep(3000);
		
		
		String tagname = driver.findElement(By.cssSelector("[src*='tatras3']")).getTagName();
		
		System.out.println("tagname value: " + tagname);
		
		
		
	}
	
	
	
	
	
	

}
