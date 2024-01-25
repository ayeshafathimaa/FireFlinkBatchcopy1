package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
    @FindBy(name="FirstName")
	private WebElement firstnameTextfield;
    @FindBy(css="[id='LastName']")
    private WebElement lastnameTextfield;
    @FindBy(id="Email")
    private WebElement emailTextfield;
    @FindBy(id="Password")
    private WebElement passwordTextfield;
    @FindBy(id="ConfirmPassword")
    private WebElement confirmpasswordTextfield;
    @FindBy(id="register-button")
    private WebElement RegisterButton;
    
    public RegisterPage(WebDriver driver) {
    	PageFactory.initElements( driver,this);
    }
    
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}
	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getConfirmpasswordTextfield() {
		return confirmpasswordTextfield;
	}
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
    
    
    
}
