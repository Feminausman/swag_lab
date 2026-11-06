package test_package;


import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base_package.Baseclass;

public class Logintest extends Baseclass{
	
	@Test(priority=1)
	public void titleverification()
	{
		String actualtitle=loginobj.titlemthd();
		Assert.assertEquals(actualtitle, "Swag Labs");
	}
	
	@Test(priority = 2)
	public void loginvalidationmthd()
	{
		loginobj.loginmthd("standard_user", "secret_sauce");
	}
	
	@Test(priority = 3)
	public void urlvalidation()
	{
		String homeurl=loginobj.urlmethd();
		System.out.println("Home url :"+homeurl);
		
		//method1
		//Assert.assertEquals(homeurl,"https://www.saucedemo.com/inventory.html");
		
		//method2
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
	

}
