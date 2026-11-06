package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Baseclass;

public class Carttest extends Baseclass
{
	
	@Test(priority = 1)
	public void clickbtn1()
	{
	cartobj.carticonbtn();
	System.out.println("Carticon is clicked");
	}
	
	@Test(priority = 3)
	public void clickbtn2()
	{
		cartobj.checkoutclick();
		System.out.println("Checkout button is clicked");
	}
	
	@Test(priority = 2)
	public void Textverification()
	{
		String yourcarttext=cartobj.cartverification();
		Assert.assertEquals(yourcarttext,"Your Cart");
	}

}
