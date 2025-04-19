package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestSimpleSelenium  extends BaseTest{
	
	@Test
	public void simpleTest() {
		driver.get("https://www.selenium.dev");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		Assert.assertEquals(pageTitle, "Selenium", "Title did not match");
		
	}

}
