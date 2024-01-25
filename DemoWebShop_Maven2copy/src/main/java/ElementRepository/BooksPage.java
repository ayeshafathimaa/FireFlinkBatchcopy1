package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	
	@FindBy(xpath = "//a[text()='Fiction EX']")
	private WebElement Fixtionex;
	
	
	@FindBy(id="products-orderby")
	private WebElement sortdropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement displaydropdon;

	
	public BooksPage(WebDriver driver) {
    	PageFactory.initElements( driver,this);
    }
	public WebElement getFixtionex() {
		return Fixtionex;
	}

	public WebElement getSortdropdown() {
		return sortdropdown;
	}

	public WebElement getDisplaydropdon() {
		return displaydropdon;
	}

	
	
}
