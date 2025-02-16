package Session36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
		
		WebElement videoConsult= driver.findElement(By.xpath("//div[contains(text(),'Video Consult')]"));
		
		
		Actions act = new Actions(driver);
		//Ctrl+Videoconsult link
		act.keyDown(Keys.CONTROL).click(videoConsult).keyUp(Keys.CONTROL).perform();
		
		
		//get window handles
		List<String> ids = new ArrayList(driver.getWindowHandles());
		//Switch to videoConsult 
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//a[contains(text(), 'Consult Now')]")).click();
		
		
		//Switch back to home page
		driver.switchTo().window(ids.get(0));
		
		//Search doctor  
		driver.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']")).sendKeys("Allergy");
;	}

}
