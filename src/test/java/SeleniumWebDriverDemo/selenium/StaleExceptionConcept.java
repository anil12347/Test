package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleExceptionConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Refreshing the whole page then id gets changed or expired
		WebElement email=driver.findElement(By.name("email"));
		WebElement pass=driver.findElement(By.name("pass"));
		
		sendKeys(driver, email, 10, "Anil");
		sendKeys(driver, pass, 5, "Tom");
		
		

	}
public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value) {
		
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver,WebElement element,int timeout) {
		
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
