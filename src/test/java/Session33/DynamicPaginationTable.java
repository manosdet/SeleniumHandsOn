package Session33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.click();
		username.clear();
		username.sendKeys("demo");

		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.click();
		password.clear();
		password.sendKeys("demo");


		driver.findElement(By.xpath("//button[@class='btn btn-primary'  and @type='submit']")).click();
		System.out.println("session complited");
       //close wndow if its available
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		driver.findElement(By.xpath("//a[@class='parent']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

	}
}
