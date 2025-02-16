package Session37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

     /* //Single File Upload
		
		
		  driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\premk\\OneDrive\\Documents\\JobD.txt");
		 if( driver.findElement(By.xpath("//ul[@id='fileList']")).getText().equals("JobD.txt")) {
			 System.out.println("File is successfully uploaded");
		 }else {
		  System.out.println("file not uploaded ");
		 }
		 */
		String file1="C:\\Users\\premk\\OneDrive\\Documents\\JobD.txt";
		
		String file2="C:\\Users\\premk\\OneDrive\\Documents\\JD.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	int noofFiles =	driver.findElements(By.xpath("//ul[@id='fileList']//li")).size(); 
	 if( noofFiles == 2) {
		 System.out.println("File is successfully uploaded");
	 }else {
	  System.out.println("file not uploaded ");
	 }
	 
	 //Validate files names
	 
	 if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("JobD") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("JD")) {
		 System.out.println("File name is matching");
	 }else {
	  System.out.println("file name is not matching");
	 }
	
	}

}
