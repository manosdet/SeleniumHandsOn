package Session38;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		/*
		//1)full page screenshots
		TakesScreenshot ts =(TakesScreenshot)driver;

		File sourcefile = ts.getScreenshotAs(OutputType.FILE);

		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");

		sourcefile.renameTo(targetfile) // copy sourcefile to target file

		 

		//2) Capture the screenshots of specific section

		WebElement featuredProdcts =driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile =featuredProdcts.getScreenshotAs(OutputType.FILE);

		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\featureproduct.png");

		sourcefile.renameTo(targetfile); // copy sourcefile to target file

	*/
		//3) Capture the screen shot of Specific elements
		WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile =logo.getScreenshotAs(OutputType.FILE);

		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");

		sourcefile.renameTo(targetfile); // copy sourcefile to target file

				// close driver
		driver.quit();
	}

}
