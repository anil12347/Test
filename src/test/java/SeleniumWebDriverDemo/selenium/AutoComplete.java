package SeleniumWebDriverDemo.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step#2- Launching URL
        driver.get("https://demoqa.com/auto-complete");
 
        //Maximizing window
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("autoCompleteSingleContainer"));
        element.sendKeys("r");
        
        List<WebElement> lst=driver.findElements(By.className("auto-complete__single-value"));
        
        System.out.println("Auto Suggest List ::" + lst.size());

	}

}
