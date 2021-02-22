package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String URL = "https://demoqa.com/droppable/";
		 
		driver.get(URL);
		 
		// It is always advisable to Maximize the window before performing DragNDrop action		 
		driver.manage().window().maximize();
		
		
		Actions action=new Actions(driver);
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to =driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(from, to).perform();;
		
		System.out.println(to.getText());

	}

}
