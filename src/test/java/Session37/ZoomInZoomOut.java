package Session37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {
	
	public static void main(String [] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


	driver.get("https://www.practo.com/");
	//driver.manage().window().maximize();
	
	//WebElement location = driver.findElement(By.xpath("//input[@placeholder='Search location']"));

	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom='50%'");//set zoom level 50%
	Thread.sleep(5000);
	
	js.executeScript("document.body.style.zoom='80%'");//set zoom level 80%
	Thread.sleep(5000);
	
}
	
}
