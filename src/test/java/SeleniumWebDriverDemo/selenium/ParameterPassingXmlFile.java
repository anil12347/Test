package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassingXmlFile {
 public	WebDriver driver;

	@Test
	@Parameters({"browser"})
	public void launchUrl(String browser) {
		System.out.println("Browser Running");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		}else if(browser.equals("firfox")) {
			
		}
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	@Parameters({"email","password"})
	public void loginPage(String email,String password) {
		WebElement emailElement=driver.findElement(By.id("email"));
		emailElement.sendKeys(email);
	WebElement passElement=	driver.findElement(By.id("pass"));
		passElement.sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
}
