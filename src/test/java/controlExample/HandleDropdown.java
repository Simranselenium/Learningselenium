package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropdown extends BaseTest {
	
	//http://only-testing-blog.blogspot.com/2013/11/new-test.html
	
	
	//@Test
	public void listboxExample() throws InterruptedException {
		
		WebElement countryDropdown = driver.findElement(By.name("FromLB"));		
		
		
		
		Select li = new Select(countryDropdown);
		
		System.out.println("is dropdown accept multiple selection:" +li.isMultiple());
		
		li.selectByIndex(0);			//USA
//		li.selectByIndex(2);
//		li.selectByIndex(4);
		
		
		li.selectByValue("India");		//India
		
		li.selectByVisibleText("Italy"); //Italy
		li.selectByVisibleText("Spain");	//Spain
		
		
		Thread.sleep(4000);
		
		
		li.deselectAll();
		
		Thread.sleep(4000);
		li.selectByValue("India");		//India
		
		li.selectByVisibleText("Italy"); //Italy
		li.selectByVisibleText("Spain");	//Spain
		
		
		Thread.sleep(4000);
		li.deselectByValue("Spain");		//India
	}
	
	
	@Test
	public void listboxExample2() throws InterruptedException {
		
		WebElement carDropdown = driver.findElement(By.xpath("//select"));					//first	
		
		
		
		Select li = new Select(carDropdown);
		
		
		System.out.println("is car dropdown accept multiple selection: " + li.isMultiple());
		
		Thread.sleep(2000);
		li.selectByIndex(1);		//saab
		
		Thread.sleep(2000);
		li.selectByValue("Singapore");	//Opel
		
		Thread.sleep(2000);
		li.selectByVisibleText("Toyota");//Toyota
		
		
	}
	
	
	
	

}
