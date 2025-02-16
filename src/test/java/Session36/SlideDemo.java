package Session36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SlideDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//Min Slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		System.out.println("Location of the min slider " + min_slider.getLocation());//(58,249)=(x,y)
		
		act.dragAndDropBy(min_slider, 120, 196).perform();
		
		
		System.out.println("Location of the min slider after moving  " + min_slider.getLocation());//(58,249)=(x,y)
		
		
		//driver.close();
    WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		
		System.out.println("Location of the max slider " + max_slider.getLocation());//(58,249)=(x,y)
		
		act.dragAndDropBy(max_slider, -98, 196).perform();
		
		
		System.out.println("Location of the max slider after moving  " + max_slider.getLocation());//(58,249)=(x,y)
		
	}

}
