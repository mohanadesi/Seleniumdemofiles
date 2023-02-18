import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Locatorsdemo2_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //Absolute xpath
	    //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Dell Laptops");
	    //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")).click();
	    
	    
	    //Relative xpath
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung mobile");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    
	    driver.findElement(By.xpath("//span[normalize-space()='Samsung Galaxy S23 5G (Cream, 8GB, 256GB Storage)']")).click();
	}

}
