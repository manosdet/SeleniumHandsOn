package Session38;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
public class RunTestIncognitoMode {

	public static void main(String[] args) {
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			
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
