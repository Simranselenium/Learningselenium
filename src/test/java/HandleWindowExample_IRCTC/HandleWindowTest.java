package HandleWindowExample_IRCTC;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleWindowTest extends BaseTest{
	
	
	
	@Test
	public void VerifyFrame() throws Exception {
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("before click on Hotel, window count: "+ driver.getWindowHandles().size());
		
		
		System.out.println("parentWindow: " + parentWindow);
		System.out.println("Application Title: " + driver.getTitle());
		
		
		
		//click on Hotel
		driver.findElement(By.partialLinkText("HOT")).click();     //window - 2
		
		Thread.sleep(3000);
		
		System.out.println("after click on Hotel, window count: "+ driver.getWindowHandles().size());
		
		
		
		
		
		
		
		Set<String> allWin = driver.getWindowHandles();						//window1 and window2
		
		
		String win1 = (String) allWin.toArray()[0];
		String win2 = (String)allWin.toArray()[1];
		
		System.out.println("win1: " + win1);
		System.out.println("win2: " + win2);
		
		
		//switch to window2
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		
		
		System.out.println("Application Title, after swicth to window2: " + driver.getTitle());
		
		
//		Thread.sleep(5000);
//		driver.switchTo().window(win1);
//		
//		
//		System.out.println("Application Title, after swicth to window1: " + driver.getTitle());
		
		
	}
	
	
	
	
	
	

}
