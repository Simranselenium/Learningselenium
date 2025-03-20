package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage_WithoutPageFactory {

	
	WebDriver driver;
	
	public LoginPage_WithoutPageFactory(WebDriver driver) {
		
		System.out.println("================inside const==================");
		this.driver = driver;
		
	}
	
	
	
	
	//Identification
	
	By txtUser = By.name("username");
	By txtPass = By.name("password");
	By btnLogin = By.tagName("button");
	By lkuserDropdown = By.className("oxd-userdropdown-name");
	By lkLogout = By.partialLinkText("Logo");
	
	
	
	
	
	
	
	//methods/Actions
	
	
	public void enterUser() {
		
		System.out.println("================enterUser==================");
		driver.findElement(txtUser).sendKeys("Admin");
		
	}
	
	
	public void enterUser(String user) {
		
		driver.findElement(txtUser).sendKeys(user);
	}
	
	
	public void enterPass(String pwd) {
		
		driver.findElement(txtPass).sendKeys(pwd);
	}
	
	
	public void clickLoginButton() {
		
		driver.findElement(btnLogin).click();;
	}
	
	
	public void clickuserDropdown() {
		
		driver.findElement(lkuserDropdown).click();;
	}
	
	
	public void clickLogoutButton() {
		
		driver.findElement(lkLogout).click();;
	}
	
	
	public void verifyApplicationTitle(String expValue) throws Exception {
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains(expValue));
	}
	
	
	
	public void login(String user, String pass) {
		
		enterUser(user);
		enterPass(pass);
		
		clickLoginButton();
	}
	
	
	public boolean IsUserNameEnabled() {
		
		return driver.findElement(txtUser).isEnabled();
	}

}
