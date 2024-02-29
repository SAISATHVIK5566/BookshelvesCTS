package userDefinedLibraries;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait {
	
	public static WebDriverWait wait;
	
	
	public static void ExplicitlyWait(WebElement elem)
	{
		WebDriverWait wait = new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.visibilityOfAllElements(elem));
	}
	
	
	public static void ExplicitlyWaitList(List<WebElement> elem)
	{
		WebDriverWait wait = new WebDriverWait(DriverSetup.driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.visibilityOfAllElements(elem));
	}
}
