package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeDashboardPage {
	private WebDriver driver;

	public OrangeDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='profile picture']")
	WebElement profilePicture;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutMenuItem;
	
	public void clickOnProfilePicture() {
		profilePicture.click();
	}
	
	public String getTagNameOfLogoutMenuItem() {
		String tagName = logoutMenuItem.getTagName();
		return tagName;
	}


}
