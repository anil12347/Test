package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		//driver.close(); //Close the browser
		
		//System.out.println(driver.getTitle());//org.openqa.selenium.NoSuchSessionException: invalid session id
		
		driver.quit();
		System.out.println(driver.getTitle()); //org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}

}
