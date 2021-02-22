package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		String valueFrame=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(valueFrame	);
	}

}
