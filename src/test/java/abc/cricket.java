package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cricket {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver= new ChromeDriver();
			    driver.get("https://www.espncricinfo.com/");
			     driver.manage().window().maximize();
			    driver.findElement(By.cssSelector(".ds-shrink-0:nth-child(4) .ds-text-tight-s > span")).click();
			    {
			      WebElement element = driver.findElement(By.cssSelector("div:nth-child(1) > .ds-p-2 .ci-team-score:nth-child(1)"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element).perform();
			    }
			    {
			      WebElement element = driver.findElement(By.tagName("body"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element, 0, 0).perform();
			    }
			    {
			      WebElement element = driver.findElement(By.cssSelector("div:nth-child(1) > .ds-p-2:nth-child(1) .ci-team-score:nth-child(1) .ds-text-tight-s:nth-child(2)"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element).perform();
			    }
			    driver.findElement(By.cssSelector("div:nth-child(1) > .ds-p-2:nth-child(1) .ci-team-score:nth-child(1) .ds-text-tight-s:nth-child(2)")).click();
			    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			   driver.findElement(By.className("No thanks")).click();
			    driver.findElement(By.cssSelector(".ds-relative:nth-child(2) .ds-shrink-0:nth-child(3) .ds-text-tight-m")).click();
			    {
			      WebElement element = driver.findElement(By.cssSelector(".ds-relative:nth-child(2) .ds-shrink-0:nth-child(3) .ds-text-tight-m"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element).perform();
			    }
			    {
			      WebElement element = driver.findElement(By.tagName("body"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element, 0, 0).perform();
			    }
			    {
			      WebElement element = driver.findElement(By.linkText("Games"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element).perform();
			    }
			  }
			

	}


