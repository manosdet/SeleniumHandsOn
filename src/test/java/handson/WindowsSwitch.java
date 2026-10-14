package handson;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSwitch {
  static WebDriver driver;
	public static void main(String[] args) {
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window 
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String > handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		if(switchToRightWindow("Human Resources Management Software | OrangeHRM HR Software", hList)){
			System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
			driver.close();
		
	}
		//closeAllWindows(hList, parentWindowId);
			
		
	switchToParentWindow(parentWindowId);
	System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
	
   driver.close();
}
	public static void closeAllWindows(List<String> hList,String parentWindowId) {
		for(String e: hList) {
			if(!e.equals(parentWindowId)) {
				driver.switchTo().window(e).close();
			}
		}
	}
	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
	}

	private static boolean switchToRightWindow(String windowTitle, List<String> hList) {
		for(String e : hList) {
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle)) {
				System.out.println("Found the right window");
				return true;
			}
		}
		return false;
		
	}
	}


