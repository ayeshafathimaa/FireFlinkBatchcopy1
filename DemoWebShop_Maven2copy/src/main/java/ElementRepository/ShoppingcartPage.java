package ElementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingcartPage {
	
	@FindBy(name="removefromcart")
	private WebElement removefromshopercart;
	
	
	@FindBy(name="updatecart")
	private WebElement Updatecartbutton;
	
	@FindBy(name="continueshopping")
	private WebElement continueshoppingbutton;


}
