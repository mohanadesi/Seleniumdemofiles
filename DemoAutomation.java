import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");
		
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://beta.foop.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	    driver.findElement(By.id("phone-form_mobile")).click();
	    driver.findElement(By.id("phone-form_mobile")).sendKeys("9655526408");
	    driver.findElement(By.cssSelector(".ant-btn > span")).click();
	    driver.findElement(By.cssSelector("div:nth-child(1) > input")).sendKeys("9");
	    driver.findElement(By.cssSelector("div:nth-child(2) > input")).sendKeys("6");
	    driver.findElement(By.cssSelector("div:nth-child(3) > input")).sendKeys("5");
	    driver.findElement(By.cssSelector("div:nth-child(4) > input")).sendKeys("5");
	    driver.findElement(By.cssSelector("div:nth-child(5) > input")).sendKeys("5");
	    driver.findElement(By.cssSelector("div:nth-child(6) > input")).sendKeys("2");
	    {
	        WebElement element = driver.findElement(By.cssSelector(".ant-menu-item:nth-child(2) a"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	      }
	      driver.findElement(By.cssSelector(".ant-menu-item-active a")).click();
	      {
	        WebElement element = driver.findElement(By.tagName("body"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element, 0, 0).perform();
	      }
		
		
	}

}
