package Session37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo1 {
	
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	driver.get("https://www.practo.com/");
	driver.manage().window().maximize();
	
	WebElement location = driver.findElement(By.xpath("//input[@placeholder='Search location']"));
	
	//passing the text into input box - Alternative of sendKeys()
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//js.executeScript("arguments[0].setAttribute('value',Pune')", location);
	
	//Clicking on element -alternate of click()
	
	WebElement videoConsult = driver.findElement(By.xpath("//div[contains(text(),'Video Consult')]"));
	js.executeScript("arguments[0].click()", videoConsult);
	
	
	
}
}
