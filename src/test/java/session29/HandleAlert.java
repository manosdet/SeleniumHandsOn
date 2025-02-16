package session29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				driver.manage().window().maximize();
			/*	//1) Mormal alert OK button 
				driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
				Thread.sleep(5000);
			Alert myalert =	driver.switchTo().alert();
		  System.out.println(myalert.getText());
		myalert.accept();
		
		//2) Confirmation Alert -Ok & Cancle
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();// close aler using OK button
		driver.switchTo().alert().dismiss();//close alert using Cancel button 
		*/
		//3) Prompt alert _input Box
				
				driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
				Thread.sleep(5000);
				
				Alert myalert = driver.switchTo().alert();
				
				myalert.sendKeys("Welcome");
				myalert.accept();
	}
}
