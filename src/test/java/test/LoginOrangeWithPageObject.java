package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.OrangeDashboardPage;
import pages.OrangeLoginPage;

public class LoginOrangeWithPageObject extends BaseTest{
	
	@Test
	public void testLoginWithPageObject() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		OrangeLoginPage orangeLogin = new OrangeLoginPage(driver);
		orangeLogin.LoginToOrange("Admin", "admin123");
		
		OrangeDashboardPage orangeDashboard = new OrangeDashboardPage(driver);
		orangeDashboard.clickOnProfilePicture();
		String logoutMenuItemTag = orangeDashboard.getTagNameOfLogoutMenuItem();
		
		System.out.println("Tag Name is: " + logoutMenuItemTag);
		Assert.assertEquals(logoutMenuItemTag, "a", "Incorrect Tag name found");
	}
	
}
