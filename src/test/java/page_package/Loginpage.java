package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"user-name\"]")WebElement username;
	@FindBy(xpath = "//*[@id=\"password\"]")WebElement password;
	@FindBy(xpath = "//*[@id=\"login-button\"]")WebElement login;
	
	public Loginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	public String titlemthd()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void loginmthd(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
	}
	
	public String urlmethd()
	{
		String actualurl=driver.getCurrentUrl();
		return(actualurl);
	}
}

	
