package testObjectRepository;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageByAtLiving {

	public static WebDriver driver;
	public static WebElement element;
	public static List<WebElement> listOfSeatingandChairitem = null;
	public static List<WebElement> price = null;
	
	public static WebElement txtscrolltill(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//a[@href='/help']"));
		return element;
		
	}
	
	public static WebElement optHoverLiving(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
		return element;
		
	}
	
	public static List<WebElement> listOfSeatingandChairitems(WebDriver driver) {
		
		listOfSeatingandChairitem = driver.findElements(By.xpath("//li[@class='topnav_item livingunit']//div//div//ul//li[1]//ul//li"));
		return listOfSeatingandChairitem;
		
	}
	
	public static WebElement txtSeatingChair(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']//a[contains(text(),'Seating & Chairs')]"));
		return element;
		
	}
	
}
