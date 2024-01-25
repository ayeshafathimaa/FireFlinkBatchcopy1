package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

	
	@FindBy(name = "removefromcart")
	private WebElement removefromcartcheckbox;
	
	
	@FindBy(name =   "updatecart")
	private WebElement Updatewishlistbutton;
	
	@FindBy(name="addtocartbutton")
	private WebElement addtocartbutton;

	public WishlistPage(WebDriver driver) {
    	PageFactory.initElements( driver,this);
    }
	
	public WebElement getRemovefromcartcheckbox() {
		return removefromcartcheckbox;
	}

	public WebElement getUpdatewishlistbutton() {
		return Updatewishlistbutton;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
	
}
