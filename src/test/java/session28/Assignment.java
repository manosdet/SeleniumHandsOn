package session28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * https://testautomationpractice.blogspot.com/
1) provide some string search for it
2) count number of links
3) click on each link using for loop
4) get window ID's for every browser window
5) close specific browser window
 */
public class Assignment {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
		//input[@id='Wikipedia1_wikipedia-search-input']
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
	List<WebElement> links = 	driver.findElements(By.id("wikipedia-search-result-link"));
		
	for(WebElement link:links) {
		link.click();
	}
	
	//Select last 3 checkboxes 
	}

}
