package TestScripts;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import GenericLibrary.BaseTest1;

public class verifyuserableAddtoCartTest extends BaseTest1{
	@Test
	public void WishlistTestcase() throws InterruptedException, FileNotFoundException {
		//LaunchBrowser();
		//Login();
		// step1:Open Browser
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		//
//		driver.get("https://demowebshop.tricentis.com/");
//		// step2:validate demo web page is displayed or not
//		String loginPageTitle = driver.getTitle();
//		if (loginPageTitle.equals("Demo Web Shop")) {
//			System.out.println("demo web shop  page is displayed");
//		} else {
//			System.out.println("Fail....");
//
//		}
//		// step3:click on login
//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
//		// step4:verify login page is displayed
//		String bookspage1 = driver.getTitle();
//		if (bookspage1.equals("Demo Web Shop. Login")) {
//			System.out.println("pass");
//
//		} else {
//			System.out.println("fail");
//		}
//		// step4:perform Login
//		driver.findElement(By.id("Email")).sendKeys("ayeshafathi@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("ayesha@gmail");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		// step5:click on books
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]")).click();
		// step6:validate Book page is displayed or not
		String bookspage = driver.getTitle();
		if (bookspage.equals("Demo Web Shop. Books")) {
			System.out.println("pass");

		} else {
			System.out.println("fail");
		}
		// step7:clicking on Fiction product and add to wishlist
		driver.findElement(By.xpath("//a[text()='Fiction EX']")).click();
		// step8:validate Fiction EX page is displayed or not
		if (bookspage.equals("Demo Web Shop. Fiction EX")) {
			System.out.println("pass");

		} else {
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		Thread.sleep(2000);
		// step9:clicking on wishlist
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(2000);
		// step10:verify product is added or not
		WebElement wishlistproduct = driver.findElement(By.xpath("//a[text()='Fiction EX']"));
		System.out.println(wishlistproduct.isDisplayed());
		// step11:click on removefromcart checkbox
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		Thread.sleep(2000);
		// step12:click on updatecart
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		// step13:Performing logout
//		driver.findElement(By.xpath("//a[text()='Log out']")).click();
//		// step14:validate demo web page is displayed
//		String loginPageTitle2 = driver.getTitle();
//		if (loginPageTitle2.equals("Demo Web Shop")) {
//			System.out.println("demo web shop  page is displayed");
//		} else {
//			System.out.println("Fail....");
//		}
		//
		//Logout();
		//closeBrowser();
	}
}
