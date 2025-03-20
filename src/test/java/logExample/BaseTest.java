package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constant;

public class BaseTest {
	
	
WebDriver driver;
Logger log;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		//log file
		log = Logger.getLogger("HRM Application");
		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		
		
		log.info("-------------info---------------");
		log.warn("-------------warn---------------");
		log.error("-------------error---------------");
		
		log.info("=================launching app========================");
		driver = new ChromeDriver();
		log.info("Application URL: " + Constant.SampleApp);
		
		
		
		driver.get(Constant.hrmApp);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
	}
	

	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(6000);
		log.info("=================closing app========================");
		driver.close();
		driver.quit();
		
	}
	
	
	

}
