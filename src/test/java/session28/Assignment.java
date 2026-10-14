package session28;

import java.time.Duration;
import java.util.ArrayList;
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
		
		//driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
	List<WebElement> links = 	driver.findElements(By.xpath("//a[@class='link']"));
	int availableLinks = links.size();
		System.out.println(availableLinks);
		// Store URLs
		List<String> linkUrls = new ArrayList<>();
		
		for (WebElement link : links) {
		    linkUrls.add(link.getDomAttribute("href"));
		}
		// Click each link using for-each
		for (String url : linkUrls) {
		    driver.navigate().to(url);
		    driver.navigate().back();
		}
	Set<String> windowIDs = driver.getWindowHandles();
	for(String windowID:windowIDs) {
		 driver.switchTo().window(windowID);

		    System.out.println("Window ID: " + windowID);
		    System.out.println("Window Title: " + driver.getTitle());
	}

	for (String windowID : windowIDs) {
	    driver.switchTo().window(windowID);

	    if (driver.getTitle().contains("Automation Testing Practice")) {
	        driver.close();
	        break;
	    }
	}

}
}
