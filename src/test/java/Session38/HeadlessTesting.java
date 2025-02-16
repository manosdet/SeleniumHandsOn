package Session38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadlessTesting {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless=new");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("nopCommerce demo store")) {
			System.out.println("Test Passed ");
		}else {
			System.out.println("Test Failed");
		}
		
		
		driver.quit();

	}

}
