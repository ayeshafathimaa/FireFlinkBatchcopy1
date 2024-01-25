package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameter {
	@Test
	public void testcase() {
		String url=System.getProperty("url");
		String email=System.getProperty("email");
		String password=System.getProperty("password");
		
		System.out.println(url);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		
	}

}
