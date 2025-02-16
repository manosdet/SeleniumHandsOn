package sessions32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandStaticleWebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();


		//1) find totle number of rows in a table 
		int rows =	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);

		//2) find totle number of columns in a table

		int column =driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(column);


		//3)Read data from specific row and column in Table
		String booname =	driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();

		System.out.println(booname);
		//4) Read data from all the rows and column 
		for(int r=2; r<=rows; r++) {

			for(int c=1;c<=column;c++) {
			String data =	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			
			System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		//5) print book name if other is Mukesh
		
		for(int r=2; r<=rows; r++) {
    
			String autherName =	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		//	System.out.println(autherName);
			if(autherName.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName +"\t" + autherName);
			}
			
			System.out.println();
		}
		//6) find totle price all the book
		int total =0;
		for(int r=2; r<=rows; r++) {
		    
			String price =	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		      total=total +Integer.parseInt(price);
			
			
		}
		System.out.println("Total price of the book is" + total);

		driver.quit();
	}
}
