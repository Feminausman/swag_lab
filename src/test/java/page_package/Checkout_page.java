package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"first-name\"]") WebElement fname;
	@FindBy(xpath = "//*[@id=\"last-name\"]") WebElement lname;
	@FindBy(xpath = "//*[@id=\"postal-code\"]") WebElement zippostal;
	@FindBy(xpath="//*[@id=\"continue\"]") WebElement continuebtn;
	
	public Checkout_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entervalues(String fn,String ln,String zp)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		zippostal.sendKeys(zp);
		continuebtn.click();
	}
	

}
