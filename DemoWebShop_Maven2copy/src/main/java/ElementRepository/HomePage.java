package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement Register;

	public WebElement getRegister() {
		return Register;
	}
	public HomePage(WebDriver driver) {
    	PageFactory.initElements( driver,this);
    }
	
	
	@FindBy (xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcart;
	
	@FindBy (xpath = "//span[text()='Wishlist']")
	private WebElement wishlist;
	
	@FindBy (xpath = "//a[contains(text(),'Log in')]")
	private WebElement login;
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")	
private WebElement Computers;

@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
private WebElement Electronics;

@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
private WebElement digitaldownload;

@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
private WebElement jwellery;

@FindBy (xpath = "(//a[contains(text(),'Gift Cards')])[1]")
private WebElement giftcards;

@FindBy(xpath = "//input[@id='small-searchterms']")
private WebElement searchtextfield;

@FindBy(xpath = "//a[text()='Log out']")
private WebElement LogoutButton;


public WebElement getShoppingcart() {
	return shoppingcart;
}
public WebElement getWishlist() {
	return wishlist;
}
public WebElement getLogin() {
	return login;
}
public WebElement getComputers() {
	return Computers;
}
public WebElement getElectronics() {
	return Electronics;
}
public WebElement getDigitaldownload() {
	return digitaldownload;
}
public WebElement getJwellery() {
	return jwellery;
}
public WebElement getGiftcards() {
	return giftcards;
}
public WebElement getSearchtextfield() {
	return searchtextfield;
}
public WebElement getLogoutButton() {
	return LogoutButton;
}

}
