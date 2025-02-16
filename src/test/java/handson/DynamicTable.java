package handson;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Handle a Dynamic Table with Changing Rows and Columns
public class DynamicTable {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		
		
		for(int r=1;r<=rows.size();r++) {
			
		WebElement name = driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]//td[1]"));
		
		if(name.getText().equals("Chrome")) {
			String cpuload = driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText().trim();
			System.out.println(cpuload);
			String value = driver.findElement(By.xpath("//p[@class='bg-warning p-1']")).getText();
			System.out.println(value);
			if(value.contains(cpuload)) {
				System.out.println("Cpu Load of chrome is  equal.");
			}else{
				System.out.println("Cpu Load of chrome is not equal.");
			}
			break;
		}
		}
		
		
		
		
		//Close browser
		driver.quit();
	}
}
