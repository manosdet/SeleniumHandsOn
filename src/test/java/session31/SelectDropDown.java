package session31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();


		WebElement dropCountryEle = driver.findElement(By.xpath("//select[@id='country']"));

		Select dropCountry = new Select(dropCountryEle);

		//Select option from drop down 
		//dropCountry.selectByVisibleText("France")
		//dropCountry.selectByValue("usa");
		//dropCountry.selectByIndex(1);
		
		
		//Capture the options from dropdown
	List<WebElement> options=	dropCountry.getOptions();
	System.out.println(options.size());
	//printing the options
	/*for(int i=0;i<options.size();i++) {
		
		System.out.println(options.get(i).getText());
	
	}
*/
	//printing options using enhanced loop
	
	for(WebElement op:options) {
		op.getText();
		}
	driver.close();
	}
}
