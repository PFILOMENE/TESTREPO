package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage {

	private WebDriver driver;
	
	public OrangeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//button[starts-with(normalize-space(),'Login')]")
	WebElement loginButton;
	
	public void LoginToOrange(String uname,String pswd) {
		usernameTextbox.sendKeys(uname);
		passwordTextbox.sendKeys(pswd);
		loginButton.sendKeys(Keys.ENTER);
	}
}
