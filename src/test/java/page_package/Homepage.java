package page_package;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span") WebElement products;
	@FindBy(tagName="a")List<WebElement>links;
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]") WebElement addtocart;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public String textmthd()
	{
		String actualtext=products.getText();
		return(actualtext);
	}
	
	public int linkcountmthd()
	{
		int count=links.size();
		return count;
	}
	
	public void cartmthd()
	{
		addtocart.click();
	} 
	

}
