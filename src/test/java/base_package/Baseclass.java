package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_package.Cartpage;
import page_package.Checkout_page;
import page_package.Homepage;
import page_package.Loginpage;
import page_package.Paymentpage;

public class Baseclass {
	public static WebDriver driver;
	public static Loginpage loginobj;
	public static Homepage homeobj;
	public static Cartpage cartobj;
	public static Checkout_page checkobj;
	public static Paymentpage payobj;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
	}
	
	@BeforeMethod
	public void objectmthd()
	{
		loginobj=new Loginpage(driver);
		homeobj=new Homepage(driver);
		cartobj=new Cartpage(driver);
		checkobj=new Checkout_page(driver);
		payobj=new Paymentpage(driver);
	}
	
	
	

}
