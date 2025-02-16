package handson;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandleAlert {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();//it opens alert 
		Thread.sleep(3000);

		//1)
		//	Alert alert = driver.switchTo().alert();
		//alert.accept();


		//2) using explicit wait 

		//WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));

		//Alert alert =	mywait.until(ExpectedConditions.alertIsPresent());
		//alert.dismiss();
		
		//3) javascript Executer
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		try {
			js.executeScript("window.alert=function{};");
		}catch(Exception e) {
			
		}
        //close driver
		driver.close();
	}
}
