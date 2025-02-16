package sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		
		//tag and id combinations  tag#id
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-pants");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-pants");
		
		
		//tag class tag.classname tag#classname
		//driver.findElement(By.cssSelector("input.search-box-tesxt")).sendKeys("jaddu bom");
		//driver.findElement(By.cssSelector(".search-box-tesxt")).sendKeys("jaddu bom");
		
		
		//tag atrribute tag[atribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("iPhone");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("iPhone");
		
		//tag class and attribute 
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("iPad");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("iPad");
	}

}
