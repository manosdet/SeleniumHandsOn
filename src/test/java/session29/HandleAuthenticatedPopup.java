package session29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAuthenticatedPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
				
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
				//Syntax:
				driver.get("http://Username:password@the-internet.herokuapp.com/basic_auth");
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
				driver.manage().window().maximize();
	}
}
