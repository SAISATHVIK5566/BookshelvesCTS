package testObjectRepository;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageBookShelves {

	public static WebElement element = null;
	public static List<WebElement> bookshelves = null;
	public static List<WebElement> price = null;
	public static WebDriver driver;
	
	
	public static WebElement inputBox (WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@id='search']"));
		return element;
		
	}
	
	public static WebElement searchbtn(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//button[@id='search_button']"));
		return element;
		
	}
	
	public static WebElement popup(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		return element;
		
	}
	
	public static WebElement txtScrolltill(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//h2[contains(text(),'Search results for')]"));
		return element;
		
	}
	
	public static WebElement opthovercategory(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[@data-group='category' and @class='item']"));
		return element;
		
	}
	
	public static WebElement chkbookshelves(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@type='checkbox' and @value='Bookshelves']"));
		return element;
		
	}
	
	public static WebElement hoverprice(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[@data-group='price' and @class='item']"));
		return element;
		
	}
	
	
	public static WebElement slideprice(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-upper']"));
		return element;
		
	}
	
	public static WebElement btnstock(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@value='In Stock Only']"));
		return element;
		
	}
	
	public static WebElement hoversort(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@data-group='sorting' and @class='item']"));
		return element;
		
	}
	
	public static WebElement hightolowprice(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//ul[@class='sortoptions']//li[3]"));
		return element;
		
	}
	
	
	public static List<WebElement> nameOfBookShelves(WebDriver driver){
		
		bookshelves = driver.findElements(By.xpath("//*[@id='content']//div[3]//ul//li//div//div[5]//a//div[1]//span"));
		return bookshelves;
		
	}
	
	public static List<WebElement> priceOfBookShelves(WebDriver driver) {
		
		price = driver.findElements(By.xpath("//*[@id='content']//div[3]//ul//li//div//div[5]//a//div[2]//span"));
		return price;
		
	}
	
}
