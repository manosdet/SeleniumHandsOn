package session31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutoSuggestDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
   Thread.sleep(5000);
   List<WebElement> lists = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
   
   for(WebElement list:lists) {
	 System.out.println(list.getText());
	 if(list.getText().equals("selenium testing")) {
		 list.click();
	 }
   }
	}
}
