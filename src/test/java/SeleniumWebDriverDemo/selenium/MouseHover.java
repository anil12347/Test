package SeleniumWebDriverDemo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement menuOption=driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		actions.moveToElement(menuOption).perform();
		System.out.println("Menu option");
		
		WebElement subMenuOption=driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Sub Menu option");
		
		WebElement subMenuList1=driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
		subMenuList1.click();
		System.out.println("List is clicked");
		
		

	}

}
