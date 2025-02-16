package Session38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRunTime {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		
		File file = new File("crx file location");
		options.addExtensions(file);
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
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
