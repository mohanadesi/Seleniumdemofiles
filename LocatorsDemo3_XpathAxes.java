import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

public class LocatorsDemo3_XpathAxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\Downloads\\Downloaded program files\\BrowserDrivers\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		//select self or current node
		String text = driver.findElement(By.xpath("//a[normalize-space()='Elecon Engg.']/self::a")).getText();
		System.out.println(text);
		//selects the parent of the current node(always one)
		text = driver.findElement(By.xpath("//a[normalize-space()='Elecon Engg.']/parent::td")).getText();
		System.out.println(text);
		//selct all children of the current node
		List<WebElement> childs=driver.findElements(By.xpath("//a[normalize-space()='Elecon Engg.']/ancestor::tr/child::td"));
		System.out.println(childs.size());
	//select all ancestors(parents, grandparents,etc)	
		text = driver.findElement(By.xpath("//a[normalize-space()='Elecon Engg.']/ancestor::tr")).getText();
		System.out.println(text);
	//select all descendants(children, grandchildren, etc)
		List<WebElement> descendants=driver.findElements(By.xpath("//a[normalize-space()='Elecon Engg.']/ancestor::tr/descendant::*"));
		System.out.println(descendants.size());
	//Following - selects everything in the document after the closing tag of the current node
		
		
		
		driver.close();
	}
	

}
