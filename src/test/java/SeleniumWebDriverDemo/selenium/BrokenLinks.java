package SeleniumWebDriverDemo.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step#2- Launching URL
        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();
 
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links on the Wb Page: " + links.size());
        
        for(int i=0;i<links.size();i++) {
        	WebElement el=links.get(i);
        	String url=el.getAttribute("href");
        	verifyLinks(url);
        }
        
        driver.quit();

	}

	private static void verifyLinks(String linkurl) {
		try {
			
			URL url=new URL(linkurl);
			
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			connection.connect();
			if(connection.getResponseCode()>=400) {
				System.out.println(linkurl+" - "+connection.getResponseMessage()+"is a broken link");
			}else {
				System.out.println(linkurl+" - "+connection.getResponseMessage());
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
