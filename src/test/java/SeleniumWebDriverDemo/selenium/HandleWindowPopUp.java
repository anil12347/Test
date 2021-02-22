package SeleniumWebDriverDemo.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		 // Open new child window within the main window
        driver.findElement(By.id("windowButton")).click();
        
		Thread.sleep(2000);
		//String parentWindowHandle=driver.getWindowHandle();
		//System.out.println("Parent Window handle : "+parentWindowHandle);
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		Iterator<String> it=allWindowHandles.iterator();
		
		System.out.println(allWindowHandles);
		
		String pareentWindow=it.next();
		System.out.println("Parent Window handle : "+pareentWindow);
		String childWindow=it.next();
		System.out.println("Child Window handle : "+childWindow);
		driver.switchTo().window(childWindow);
		
		String childTitle=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Child window popup title : "+childTitle);
		driver.close();
		driver.switchTo().window(pareentWindow);
		System.out.println("Parent window popup title : "+driver.getTitle());

	}

}
