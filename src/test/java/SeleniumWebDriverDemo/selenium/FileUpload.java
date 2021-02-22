package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 String baseUrl = "http://demo.guru99.com/test/upload/";
	     driver.get(baseUrl);
	     WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
	     
	     uploadElement.sendKeys("D:\\naveenautomation2\\selenium\\driver\\Testing.html");
	     
	       driver.findElement(By.id("terms")).click();
 
	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();
	     
	     
		

	}

}
