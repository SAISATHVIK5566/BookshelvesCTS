package stepDefinitionFile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import userDefinedLibraries.DriverSetup;

public class HooksFile {

	public static WebDriver driver=DriverSetup.driver;
     
    @AfterAll
    public static void After_All()
    {
    	driver.quit();
    }

    
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        boolean b = scenario.isFailed();
        
        if (!b) {
        	// Attach the screenshot for passed steps
            scenario.attach(screenshot, "image/png", "PassedStepScreenshot");
        } else {
            
        	// Attach the screenshot for failed steps
            scenario.attach(screenshot, "image/png", "FailedStepScreenshot");
           
        }
    }
   
}

