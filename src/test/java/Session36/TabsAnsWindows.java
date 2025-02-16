package Session36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAnsWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://demo.opencart.com/admin/index.php");
		
		//Selenium 4.x
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://orangehrm.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
