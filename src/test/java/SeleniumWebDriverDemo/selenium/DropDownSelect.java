package SeleniumWebDriverDemo.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Step#2- Launching URL
        driver.get("https://demoqa.com/select-menu");
 
        //Maximizing window
        driver.manage().window().maximize();
        
        WebElement sel1=driver.findElement(By.id("oldSelectMenu"));
        
        
        Select select=new Select(sel1);
        
        List<WebElement> lst = select.getOptions();
        for(WebElement options: lst) {
            System.out.println(options.getText());
            String bl="Voilet";
            if(bl.equals(options.getText())) {
            	select.selectByVisibleText(bl);
            }
	}
      System.out.println("**********Selecting by index");
    
        select.selectByIndex(8);
        
        Thread.sleep(2000);
        
        System.out.println("**************Selecting by value");
        Thread.sleep(2000);
        select.selectByValue("5");
        
        System.out.println("******************Select by visibleText");
        Thread.sleep(2000);
        select.selectByVisibleText("Yellow");
        Thread.sleep(2000);
          
	}

}
