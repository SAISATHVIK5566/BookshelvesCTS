package testObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeSubmittedPageDetails {
	
	public static WebElement element = null;
	
	
	public static WebElement amountEnetered(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@class='BCLqs']"));
		return element;
		
	}
	
	public static WebElement recipientName(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[1]"));
		return element;
	}
	
	public static WebElement recipientEmail(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[2]"));
		return element;
	}
	
	public static WebElement recipientMobile(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[3]"));
		return element;
	}
	
	public static WebElement customerName(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[1]"));
		return element;
	}
	
	public static WebElement customerEmail(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[2]"));
		return element;
	}
	public static WebElement customerMobile(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[3]"));
		return element;
	}
	
	public static WebElement customerCity(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[4]"));
		return element;
	}
	
	public static WebElement customerPinCode(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[5]"));
		return element;
	}
	
}


