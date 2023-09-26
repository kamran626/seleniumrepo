package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Abc {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://www.quackit.com/html/tags/html_iframe_tag.cfm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,240)");
		driver.switchTo().frame("result4");
		System.out.println("Switch to frame");
		driver.findElement(By.xpath("/html/body/p[2]/a")).click();
		//driver.findElement(By.id("email")).sendKeys("Kamran_jan44@yahoo.com");
		//driver.findElement(By.id("pass")).sendKeys("40484801");
		//driver.findElement(By.name("login")).click();
	}
}