package SeleniumWebDriverDemo.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step#2- Launching URL
        driver.get("https://demoqa.com/select-menu");
 
        //Maximizing window
        driver.manage().window().maximize();
        
        WebElement sel1=driver.findElement(By.id("cars"));
        
        
        Select select=new Select(sel1);
        
        List<WebElement> lst = select.getOptions();

        for(WebElement selectedOption: lst) {
        	System.out.println(selectedOption.getText());
        }
       
        select.selectByIndex(2);
        Thread.sleep(5000);
        select.deselectByIndex(2);
        

	}

}
