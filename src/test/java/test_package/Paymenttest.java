 package test_package;

import org.testng.annotations.Test;

import base_package.Baseclass;

public class Paymenttest extends Baseclass {
	
	@Test(priority = 1)
	public void ssbtn() throws Exception
	{
		payobj.sspage();
		System.out.println("Screenshot taken");
	}
	@Test(priority = 2)
	public void finishclick()
	{
		payobj.finishbutton();
		System.out.println("Finish button clicked");
	}

}
