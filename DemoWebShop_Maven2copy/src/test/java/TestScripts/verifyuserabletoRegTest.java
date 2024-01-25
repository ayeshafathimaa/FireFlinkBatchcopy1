package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ElementRepository.HomePage;
import ElementRepository.RegisterPage;
import GenericLibrary.DataUtility;
import GenericLibrary.commonUtility;

public class verifyuserabletoRegTest  {
@Test(groups="Integration",dataProvider = "Register")
	public void Registertestcase(String FirstName,String LastName,String email,String password,String confirmpassword) throws FileNotFoundException {
		// TODO Auto-generated method stub
	DataUtility data_utility=new DataUtility();
	commonUtility common_utlity=new commonUtility();
	
	String modEmail=common_utlity.getRandomNumber()+email;
		//step1:Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(data_utility.getDataFromProperties("url"));
        //step2:validate demo web page is displayed or not
//        String loginPageTitle=driver.getTitle();
//        if(loginPageTitle.equals("Demo Web Shop"))
//        {
//        	System.out.println("demo web shop  page is displayed");
//        }
//        else
//        {
//        	System.out.println("Fail....");
//        
//        }
       //validating using assert 
        org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
		//System.out.println("Demo Web Shop page is displayed");
        Reporter.log("demo web shop  page is displayed",true); 
        
        
        
        HomePage hm=new HomePage(driver);
    	hm.getRegister().click();
        
        
        
        RegisterPage register_Page=new RegisterPage(driver);
		register_Page.getMaleRadioButton().click();
		register_Page.getFirstnameTextfield().sendKeys(FirstName);
		register_Page.getLastnameTextfield().sendKeys(LastName);
		register_Page.getEmailTextfield().sendKeys(modEmail);
		register_Page.getPasswordTextfield().sendKeys(password);
		register_Page.getConfirmpasswordTextfield().sendKeys(confirmpassword);
		register_Page.getRegisterButton().click();
		
        //Step3:Clicking on Register button
//        driver.findElement(By.xpath("//a[text()='Register']")).click();
//        String loginPageTitle1=driver.getTitle();
//        //step4:validate demo register page is displayed or not
//        if(loginPageTitle.equals("Demo Web Shop. Register"))
//        {
//        	System.out.println("Demo Web ShopRegister is dislpayed");
//        }
//        else
//        {
//        	System.out.println("Fail...");
//        
//        }
//        driver.findElement(By.name("Gender")).click();
//        driver.findElement(By.name("FirstName")).sendKeys(FirstName);
//        driver.findElement(By.name("LastName")).sendKeys(LastName);
//        driver.findElement(By.name("Email")).sendKeys(email);
//        driver.findElement(By.name("Password")).sendKeys(password);
//        driver.findElement(By.name("ConfirmPassword")).sendKeys(confirmpassword);
//        driver.findElement(By.name("register-button")).click();
        //step5:validate regiter completed displayed or not
       WebElement regist = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
	System.out.println(regist.isDisplayed());
	
	driver.close();
	
	}

@DataProvider(name="Register")
public Object[][] datasupply() throws EncryptedDocumentException, IOException
{
	return DataUtility.getAllDataFromExcel("Sheet1");
}
}
