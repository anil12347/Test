package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Step#2- Launching URL
		driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        WebElement Element = driver.findElement(By.linkText("Linux"));
        Thread.sleep(1000);
       // js.executeScript("window.scrollBy(0,1000)");
        //js.executeScript("arguments[0].scrollIntoView();", Element);
        //Bottom to element
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
        
        WebElement horizontal = driver.findElement(By.linkText("VBScript"));
        
        js.executeScript("arguments[0].scrollIntoView()", horizontal);
        
        Thread.sleep(5000);
        

	}

}
