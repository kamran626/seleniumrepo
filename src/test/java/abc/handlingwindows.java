package abc;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class handlingwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.salesforce.com/in/?ir=1");
	driver.findElement(By.partialLinkText("Watch de")).click();
	Thread.sleep(2000);
	Set<String>windowhandles=driver.getWindowHandles();
	System.out.println(windowhandles);
	Iterator<String> iterator= windowhandles.iterator();
	String parentwindow= iterator.next();
	String childwindow= iterator.next();
	driver.switchTo().window(childwindow);
	Thread.sleep(4000);
	driver.findElement(By.name("UserFirstName")).sendKeys("40484801");
	driver.findElement(By.name("UserLastName")).sendKeys("Pak");
	Select drpCountry = new Select(driver.findElement(By.name("UserTitle")));
	drpCountry.selectByVisibleText("IT Manager");
	Select country = new Select(driver.findElement(By.name("CompanyEmployees")));
	country.selectByIndex(1);
	
	
	
}
}