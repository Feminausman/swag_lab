package test_package;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base_package.Baseclass;

public class Hometest extends Baseclass{
	@Test(priority =1)
	public void textverify()
	{
		//loginobj.loginmthd("standard_user", "secret_sauce");//to call the login method before executing home page method
		String producttext=homeobj.textmthd();
		Assert.assertEquals(producttext,"Products");
	}
	
	@Test(priority = 2)
	public void linkcount()
	{
		int linkcount=homeobj.linkcountmthd();
		System.out.println("-----No of links-----"+linkcount);
		
	}
	
	@Test(priority = 3)
	public void addtocart()
	{
		homeobj.cartmthd();
		System.out.println("Add to Cart clicked");	
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	

}
