package handson;
// How to Check if a List Box is Sorted
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropDownList {
 public static void main(String[] args) {
	 
 
	WebDriver driver =new ChromeDriver();

	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	Select dropDown=new Select(driver.findElement(By.xpath("//select[@id='animals']")));
	ArrayList orignalList = new ArrayList();
	ArrayList tempList=new ArrayList();
	List<WebElement> options = dropDown.getOptions();
	
	for(WebElement option:options) {
		orignalList.add(option.getText());
		tempList.add(option.getText());
		
	}
	
	System.out.println("Before sorting ......");
	System.out.println("Orignal list: "+ orignalList);
	System.out.println("Temp list : "+ tempList);
	
	Collections.sort(tempList);//sorted the temp list 
	
	System.out.println("Before sorting ......");
	System.out.println("Orignal list: "+ orignalList);
	System.out.println("Temp list : "+ tempList);
	
	if(orignalList.equals(tempList)) {
		System.out.println("Listbos is sorted ...");
		
	}else {
		System.out.println("Listbos is not sorted ...");
	}
	driver.quit();
 }
 
}
