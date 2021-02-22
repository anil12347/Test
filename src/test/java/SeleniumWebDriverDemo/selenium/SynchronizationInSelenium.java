package SeleniumWebDriverDemo.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);//Dynamic wait : 2 sec element appears then 18 sec ignored
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Dynamic wait : 2 sec element appears then 18 sec ignored
		//Implicity wait always applied globally - is available for all web element 
		//Dynamic in naturee
		//it can changed anywhere and  at anytime in code
		
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.name("email"));
		WebElement pass=driver.findElement(By.name("pass"));
		
		sendKeys(driver, email, 10, "Anil");
		sendKeys(driver, pass, 5, "Tom");
		
		WebElement forgetPassword=driver.findElement(By.linkText("Forgotten password?"));
		
	
		
		clickOn(driver, forgetPassword, 5);
		
		WebElement mobilenumber=driver.findElement(By.xpath("//input[@id='identify_email']"));
		sendKeys(driver, mobilenumber, 10, "9036589314");
		WebElement submit =driver.findElement(By.xpath("//button[@id='did_submit']"));
		clickOn(driver, submit, 5);
		

	}
	
	//Explicit wait
	//1. no explicit keyword or method
	//2.available with webdriverwait  with some expectedConditions
	//specific to the element
	//dynamic nature
	//We should never use implicit wait and explicit wait together
	//Selenium WebDriver will wait for the element first because of implicit wait and then explicit wait will be applied
	//Total sync wait will be increased for each element
	
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
