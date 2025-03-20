package controlExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleCheckboxFindElements extends BaseTest {
	
	
	
	
	@Test
	public void login() {
		
				
//		driver.findElement(By.cssSelector("[type='checkbox']")).click();  //multiple match ---3 // first element
		
		
		List<WebElement> allcheckbox = driver.findElements(By.cssSelector("[type='checkbox']"));
		
		int checkboxCount = allcheckbox.size();
		System.out.println("Checkbox count: " + checkboxCount);
		
//		allcheckbox.get(1).click();
//		allcheckbox.get(2).click();		
		
		

		for (int i = 0; i < checkboxCount; i++) {
			
								
			
			allcheckbox.get(i).click();
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
