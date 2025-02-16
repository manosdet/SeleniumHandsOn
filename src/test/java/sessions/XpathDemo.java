package sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
	//	driver.get("https://demo.opencart.com/");
//		driver.manage().window().maximize();
		
		//Xpath with single atrribute 
	//	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iPhone17");
		
		//Xpath with multiple atribbuter
	//	driver.findElement(By.xpath("//input[@name = 'Search'][@placeholder='Search']")).sendKeys("iPhone17");
		
		
		//xpath with and or operator 
	//	driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']"));
		
	//	driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']"));
		
		//Xpath with text() - inner text 
		//driver.findElement(By.xpath("//*[text()='MackBook']")).click();
		
		//Xpath with contains() 
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		//xpath with start-with()
		//driver.findElement("//input[starts-with@placeholder,'Sea')]")).sendKeys("Tshirts");
		int num = 37;
		System.out.println(num%9);
		System.out.println(num/10);
		
	}

}
