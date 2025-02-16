package Session37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageByUsingJSE {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
		
		WebElement location = driver.findElement(By.xpath("//input[@placeholder='Search location']"));
		
		//passing the text into input box - Alternative of sendKeys()
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		//1) Scroll down page By pixel number 
	
		WebElement videoConsult = driver.findElement(By.xpath("//div[contains(text(),'Video Consult')]"));
		js.executeScript("arguments[0].click()", videoConsult);
		//js.executeScript("window.scrollBy(0,1500)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//2 Sroll the page till element is visible
		//WebElement helthQuery = driver.findElement(By.xpath("//h2[normalize-space()='Health Queries']"));
		
		//js.executeScript("arguments[0].scrollIntoView()", helthQuery);
		
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//3)Scroll page till initial of the page.
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//4) scroll up to top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//5) sroll horizontal page
		
		WebElement expdoctor = driver.findElement(By.xpath("//h2[normalize-space()='Experience online doctor consultations']"));
		js.executeScript("arguments[0].scrollIntoView()", expdoctor);
		js.executeScript("window.scrollBy(1000,0)");
		
		
		
	}
}
