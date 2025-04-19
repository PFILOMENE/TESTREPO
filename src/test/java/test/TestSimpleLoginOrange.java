package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestSimpleLoginOrange extends BaseTest {
	
	@Test
	public void loginSimple() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//LOGIN PAGE
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		//button[starts-with(normalize-space(),'Login')]
		driver.findElement(By.xpath("//button[starts-with(normalize-space(),'Login')]")).sendKeys(Keys.ENTER);
		
		// DASHBOARD PAGE
		//img[@alt='profile picture']
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		
		//a[text()='Logout']
		String logoutLnkTag = driver.findElement(By.xpath("//a[text()='Logout']")).getTagName();
		System.out.println("Tag Name is: " + logoutLnkTag);
		
		Assert.assertEquals(logoutLnkTag, "a", "Incorrect Tag name found");
		
	}
	

}
