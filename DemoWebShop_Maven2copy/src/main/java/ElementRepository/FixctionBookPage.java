package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FixctionBookPage {
	
	@FindBy(xpath = "//input[@value='Add to wishlist']")
	private WebElement FixtionAddtowishlist;
	
	
	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement Addtocomparelist;
	
	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement Emailafriend;

	public FixctionBookPage(WebDriver driver) {
    	PageFactory.initElements( driver,this);
    }
	public WebElement getFixtionAddtowishlist() {
		return FixtionAddtowishlist;
	}

	public WebElement getAddtocomparelist() {
		return Addtocomparelist;
	}

	public WebElement getEmailafriend() {
		return Emailafriend;
	}
	

}
