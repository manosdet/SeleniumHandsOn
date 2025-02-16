package session25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	
	public static void main (String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	driver.manage().window().maximize();
	
	
	//self-Selects the current node 
String text=	driver.findElement(By.xpath("//a[contains(text(),'HFCL')]/self::a")).getText();
	
	System.out.println(text);
	
}
}
