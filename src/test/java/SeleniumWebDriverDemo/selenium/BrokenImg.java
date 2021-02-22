package SeleniumWebDriverDemo.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImg {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step#2- Launching URL
        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();
        
        List<WebElement> links=driver.findElements(By.tagName("img"));
        System.out.println(links.size());
        
        for(int i=0;i<links.size();i++) {
        	WebElement image= links.get(i);
        	String imageUrl=image.getAttribute("src");
        	System.out.println("URL of Image " + (i+1) + " is: " + imageUrl);
        	verifyBrokenImg(imageUrl);
        	 //Validate image display using JavaScript executor
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                }else {
                     System.out.println("DISPLAY - BROKEN");
                }
            } 
            catch (Exception e) {
             System.out.println("Error Occured");
            }
        }
        
        
     driver.quit();

	}

	private static void verifyBrokenImg(String imageUrl) {
	
		try {
		URL url=new URL(imageUrl);
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.connect();
		if(connection.getResponseCode()>=400) {
			System.out.println("HTTP STATUS -" + connection.getResponseCode() +"Borken");
		}else {
			System.out.println("HTTP STATUS -" + connection.getResponseCode());
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
