package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		System.out.println("================inside const==================");
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	//Identification
	
//	By txtUser = By.name("username");
//	By txtPass = By.name("password");
//	By btnLogin = By.tagName("button");
//	By lkuserDropdown = By.className("oxd-userdropdown-name");
//	By lkLogout = By.partialLinkText("Logo");
	
	
	@FindBy(name = "username")
	WebElement txt_User;
	
	
	
	@FindBy(how = How.NAME, using = "username")
	WebElement txt_User1;
	
	
	
	@FindBy(name = "password")
	WebElement txt_Pass;
	
	@FindBy(tagName  = "button")
	WebElement btn_Login;
	
	@FindBy(className  = "oxd-userdropdown-name")
	WebElement lk_userDropdown;
	
	@FindBy(partialLinkText  = "Logo")
	WebElement lk_Logout;
	
	
	
	
	//methods/Actions
	
	
	public void enterUser() {
		
		System.out.println("================enterUser==================");
		txt_User.sendKeys("Admin");
		
	}
	
	
	public void enterUser(String user) {
		
		txt_User.sendKeys(user);
	}
	
	
	public void enterPass(String pwd) {
		
		txt_Pass.sendKeys(pwd);
	}
	
	
	public void clickLoginButton() {
		
		btn_Login.click();;
	}
	
	
	public void clickuserDropdown() {
		
		lk_userDropdown.click();;
	}
	
	
	public void clickLogoutButton() {
		
		lk_Logout.click();;
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
		
//		return txt_User.isEnabled();
		
		return IsElementEnabled(txt_User1);
	}

	
	public boolean IsElementEnabled(WebElement ele) {
		
		return ele.isEnabled();
	}
}
