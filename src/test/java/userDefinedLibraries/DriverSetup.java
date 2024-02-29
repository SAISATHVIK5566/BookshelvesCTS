package userDefinedLibraries;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class DriverSetup {

	public static WebDriver driver;
	public static String exePath;
	public static String browserName;
	public static String baseUrl1;
	public static Properties p;
	
	 @SuppressWarnings("deprecation")
	public static WebDriver openDriver(String os,String browser, String baseUrl) throws IOException {
		
		 browserName = browser;
		 baseUrl1 = baseUrl;
 
			//loading properties file
			FileReader file = new FileReader(".//src/test/resources/Config.properties");//class
			p=new Properties();//creating obj of Properties
			p.load(file);//load properties file

			//Remote
			if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
			{
				DesiredCapabilities capabilities = new DesiredCapabilities();
				
				//decide os
				if(os.equalsIgnoreCase("windows"))
				{
					capabilities.setPlatform(Platform.WINDOWS);
				}
				else if(os.equalsIgnoreCase("mac"))
				{
					capabilities.setPlatform(Platform.MAC);
				}
				else
				{
					System.out.println("No matching OS...");
				}
				//decide browser
				switch(browser.toLowerCase())
				{
				case "chrome" :
					capabilities.setBrowserName("chrome");
					break;
				case "edge":
					capabilities.setBrowserName("MicrosoftEdge");
					break;
				default :
					System.out.println("No matching browser..");
					return driver;
				}
				driver = new RemoteWebDriver(new URL("http://10.66.136.196:4444"),capabilities);//node/grid URL is fixed

			}
			
			
			//Local
			else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
			{
	
				switch(browser.toLowerCase())
				{
				case "chrome":
					driver = new ChromeDriver();
					break;
				case "edge":
					driver = new EdgeDriver();
					break;
				default:
					System.out.println("not matching browser");
					return driver;

				}
			} 

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(baseUrl1);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
		}
	 
	 public static void closeDriver() {
		 //driver.close();
		 driver.quit();
		 
	 }
}
