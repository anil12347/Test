package SeleniumWebDriverDemo.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllUrls {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step#2- Launching URL
        driver.get("https://demoqa.com/links");
        driver.manage().window().maximize();
 
        List<WebElement> element=driver.findElements(By.tagName("a"));
        System.out.println("Total links on the Wb Page: " + element.size());
        
       Iterator<WebElement> it= element.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next().getText());
       }
       driver.quit();

	}

}
