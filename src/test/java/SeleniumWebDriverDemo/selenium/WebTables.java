package SeleniumWebDriverDemo.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\naveenautomation2\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//Break the pattern
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Row Count : "+rows);
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=2;i<=rows.size();i++) {
			String xpath=beforeXpath+i+afterXpath;
		WebElement element=driver.findElement(By.xpath(xpath));
		
		System.out.println(element.getText());
		if(element.getText().equals("Island Trading")) {
			System.out.println("Company name : "+ 	element.getText() + "is found" + " at position : "+(i-1));
			break;
		}
		}
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		String afterXpathContact="]/td[2]";
		System.out.println("********************");
		for(int i=2;i<=rows.size();i++) {
			String xpath=beforeXpath+i+afterXpathContact;
		WebElement element=driver.findElement(By.xpath(xpath));
		
		System.out.println(element.getText());
		if(element.getText().equals("Helen Bennett")) {
			System.out.println("Contact: "+ 	element.getText() + "is found" + " at position : "+(i-1));
			break;
		}
		}
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
				String afterXpathCountry="]/td[3]";
				System.out.println("********************");
				for(int i=2;i<=rows.size();i++) {
					String xpath=beforeXpath+i+afterXpathCountry;
				WebElement element=driver.findElement(By.xpath(xpath));
				
				System.out.println(element.getText());
				if(element.getText().equals("Austria")) {
					System.out.println("Country : "+ 	element.getText() + "is found" + " at position : "+(i-1));
					break;
				}
				}
				//*[@id="customers"]/tbody/tr[1]/th[1]
				//*[@id="customers"]/tbody/tr[1]/th[2]
				//*[@id="customers"]/tbody/tr[1]/th[3]
				
				String columnbeforeXpath="//*[@id='customers']/tbody/tr[1]/th[";
				String columnAfterXpath="]";
				
			List<WebElement> ele=	driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
				int column=ele.size();
				System.out.println("column : "+column);
				
				for(int i=1;i<=column;i++) {
					String xpath=columnbeforeXpath+i+columnAfterXpath;
				WebElement text=	driver.findElement(By.xpath(xpath));
				System.out.println(text.getText());
				}
				
				driver.quit();
				
	}

}
