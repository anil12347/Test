package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); //Ok button
		
		//alert.dismiss();//cancel button
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(5000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.sendKeys("Testing");
		al.accept();
		

	}

}
