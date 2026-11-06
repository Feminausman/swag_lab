package test_package;

import org.testng.annotations.Test;

import base_package.Baseclass;

public class Checkouttest extends Baseclass {
	
	@Test
	public void values()
	{
		checkobj.entervalues("abcd", "zyxw", "12346");
	}

}
