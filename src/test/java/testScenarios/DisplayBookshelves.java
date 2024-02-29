package testScenarios;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import testObjectRepository.HomePageBookShelves;
import testObjectRepository.HomePageByAtLiving;
import testObjectRepository.HomePageGiftCards;
import testObjectRepository.HomeSubmittedPageDetails;
import userDefinedLibraries.DriverSetup;
import userDefinedLibraries.ExcelWrite;
import userDefinedLibraries.ExplicitWait;
import userDefinedLibraries.ExtentReportManager;
import userDefinedLibraries.JsonRead;
import userDefinedLibraries.ScreenShot;


public class DisplayBookshelves extends DriverSetup {

	public static WebDriver driver;
	public static Actions action;
	public static ExtentReports report;
	public static ExtentTest logger;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet = null;
	public static XSSFCell cell;
	public static XSSFRow row;
	public static String[] bookShelves;
	public static String[] prices;
	public static String validationMessage;
	public static String browser;
	public static String os;
	public static String baseUrl;
	public static String path;
	public static JavascriptExecutor js;
	public static String[] submenuitems;
	public static SoftAssert softAssert;
	public static WebElement elem;
	public static Properties p;
	public static FileReader file;
	
	
	@BeforeGroups("Smoke Test one")
	public static void driverConfig () throws IOException {
		file = new FileReader(".//src/test/resources/Config.properties");//class
		p=new Properties();//creating obj of Properties
		p.load(file);//load properties file
		report = ExtentReportManager.getReportInstance();
		driver = DriverSetup.openDriver(p.getProperty("os"),p.getProperty("browser"), p.getProperty("url"));
		
	}
	
	@Test(priority = 0 , groups = { "Smoke Test one" })
	public static void testCaseReadJSON() {
		
		try {
			
			JsonRead.readJSONFile();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
	@Test(priority = 1 , groups = { "Smoke Test one" })
	public static void inputBox()
	{
		logger = report.createTest("Search Box");
		logger.log(Status.INFO, "To pass Bookshelves in search bar");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.inputBox(driver));
		HomePageBookShelves.inputBox(driver).click();
		HomePageBookShelves.inputBox(driver).sendKeys("BookShelves");
		
		logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 2 , groups = { "Smoke Test one" })
	public static void clickSearch()
	{
		logger = report.createTest("click search");
		logger.log(Status.INFO, "To click the search button");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.searchbtn(driver));
		HomePageBookShelves.searchbtn(driver).click();
		
		logger.log(Status.PASS, "PASSED");
	}

	@Test(priority = 3 , groups = { "Smoke Test one" })
	public static void popupclose() {
		logger = report.createTest("close popup");
		logger.log(Status.INFO, "To close the popup");
		
		try {
			
			ExplicitWait.ExplicitlyWait(HomePageBookShelves.popup(driver));
			HomePageBookShelves.popup(driver).click();	
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 4 , groups = { "Smoke Test one" })
	public static void scroll()
	{
		logger = report.createTest("scroll");
		logger.log(Status.INFO, "To scroll to Bookshelves");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.txtScrolltill(driver));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);",HomePageBookShelves.txtScrolltill(driver));
	    logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 5 , groups = { "Smoke Test one" })
	public static void hoverCategory()
	{
		logger = report.createTest("hover category");
		logger.log(Status.INFO, "To hover to the category option");
		
		action= new Actions(driver);
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.opthovercategory(driver));
		action = new Actions(driver);
		action.moveToElement(HomePageBookShelves.opthovercategory(driver)).perform();
		logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 6 , groups = { "Smoke Test one" })
	public static void selectCategory()
	{
		logger = report.createTest("select category");
		logger.log(Status.INFO, "To select category as bookshelves");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.chkbookshelves(driver));
		HomePageBookShelves.chkbookshelves(driver).click();
		logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 7 , groups = { "Smoke Test one" })
	public static void hoverPrice()
	{
		logger = report.createTest("hover to price");
		logger.log(Status.INFO, "To hover to price");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.hoverprice(driver));
		action.moveToElement(HomePageBookShelves.hoverprice(driver)).perform();
		logger.log(Status.PASS, "PASSED");
	}
	
	public static void waitForSlider()
	{
		logger = report.createTest("wait for slider");
		logger.log(Status.INFO, "To wait for slider to appear to set price");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.slideprice(driver));
		logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 8 , groups = { "Smoke Test one" })
	public static void slidePrice() throws InterruptedException
	{
		logger = report.createTest("slide price");
		logger.log(Status.INFO, "slide the price slider to set amount");
		
		System.out.println("The Current position of the Max slider is"+HomePageBookShelves.slideprice(driver).getLocation());
		Thread.sleep(4000);
		action.moveToElement(HomePageBookShelves.slideprice(driver)).dragAndDropBy(HomePageBookShelves.slideprice(driver), -212, 0).perform();
		Thread.sleep(4000);
		System.out.println("The Current position of the Max slider is"+HomePageBookShelves.slideprice(driver).getLocation());
		logger.log(Status.PASS, "PASSED");
	}
	
	
	@Test(priority = 9 , groups = { "Smoke Test one" })
	public static void hoverSort()
	{
		logger = report.createTest("hover to sort");
		logger.log(Status.INFO, "To hover to sort to sort by price high to low");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.hoversort(driver));
		action.moveToElement(HomePageBookShelves.hoversort(driver)).perform();
		logger.log(Status.PASS, "PASSED");
	}
	
	public static void selectSortHighToLow()
	{
		logger = report.createTest("select high to low");
		logger.log(Status.INFO, "To select the price high to low");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.hightolowprice(driver));
		HomePageBookShelves.hightolowprice(driver).click();
		logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 10 , groups = { "Smoke Test one" })
	public static void inStockSelction()
	{
		logger = report.createTest("In stock selection");
		logger.log(Status.INFO, "To select the in stock option");
		
		ExplicitWait.ExplicitlyWait(HomePageBookShelves.btnstock(driver));
		HomePageBookShelves.btnstock(driver).click();
		logger.log(Status.PASS, "PASSED");
	}
	
	
	
	@Test(priority = 11 , groups = { "Smoke Test one" })
	public static void collectingBookShelvesList() {
		
		logger = report.createTest("Collecting Bookshelves list and Writing into Excel File");
		logger.log(Status.INFO, "To collect the bookshelves list and write it into excel file");
		
		bookShelves = new String[HomePageBookShelves.nameOfBookShelves(driver).size()];
		prices = new String[HomePageBookShelves.priceOfBookShelves(driver).size()];
		
		for(int i=0; i<HomePageBookShelves.bookshelves.size(); i++) {
			
			bookShelves[i] = HomePageBookShelves.nameOfBookShelves(driver).get(i).getText();
			prices[i] = HomePageBookShelves.priceOfBookShelves(driver).get(i).getText();
			prices[i] = prices[i].replaceAll("[^0-9]", "");
			
		}
		
		ExcelWrite.below15000BookShelves(bookShelves , prices , 3);
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 12 , groups = { "Smoke Test one" })
	public static void displayingBookShelves() {
		
		logger = report.createTest("Displaying bookshelves in the Console");
		logger.log(Status.INFO, "To display the bookshelves list in the console");
		
		for(int i=0; i<3; i++) {
			
			System.out.println(bookShelves[i] + " - Rs." + prices[i]);
			
		}
	
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 13 , groups = { "Smoke Test one" })
	public static void screenShotOfBookShelves() {
		
		logger = report.createTest("Taking Screenshot of Bookshelves");
		logger.log(Status.INFO, "To capture the screenshot of bookshelves list");
		
		try {
			
			ScreenShot.screenShotTestCase(driver);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	
	@Test(priority = 14 , groups = { "Regression Test one" })
	public static void scrollUp()
	{	
		logger = report.createTest("Scroll Till Living Menu");
		logger.log(Status.INFO, "To Scroll Till the Living to Get Submenu");
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", HomePageByAtLiving.txtscrolltill(driver));	
		logger.log(Status.PASS, "PASSED");
	}
	
	
	@Test(priority = 15 ,groups = { "Regression Test one" })
	public static void hoverLiving()
	{
		logger = report.createTest("Hovering Mouse to Brand Filter");
		logger.log(Status.INFO, "To hover the mouse over the brand filter");
		action = new Actions(driver);
		ExplicitWait.ExplicitlyWait(HomePageByAtLiving.optHoverLiving(driver));
		action.moveToElement(HomePageByAtLiving.optHoverLiving(driver)).perform();
		logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 16 ,groups = { "Regression Test one" })
	public static void waitForSubmenuToAppear()
	{
		logger = report.createTest("Wait for submenu");
		logger.log(Status.INFO, "To wait for Submenu to appear for living submenu");
		ExplicitWait.ExplicitlyWait(HomePageByAtLiving.txtSeatingChair(driver));
		logger.log(Status.PASS, "PASSED");
	}
	
	
	@Test(priority = 17 ,groups = { "Regression Test one" })
	public static void listOFseatingAndChairExcel()
	{
		logger = report.createTest("Stroring the list of submenu to Excel");
		logger.log(Status.INFO, "To Store the items under Seating and Chair in Excel");
		ExplicitWait.ExplicitlyWaitList(HomePageByAtLiving.listOfSeatingandChairitems(driver));
		
		submenuitems= new String[HomePageByAtLiving.listOfSeatingandChairitems(driver).size()];
		
		for(int i=0;i<HomePageByAtLiving.listOfSeatingandChairitems(driver).size();i++)
		{
			submenuitems[i]= HomePageByAtLiving.listOfSeatingandChairitems(driver).get(i).getText();
		}
		ExcelWrite.byAtHomeLiving(submenuitems, HomePageByAtLiving.listOfSeatingandChairitems(driver).size());
		logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 18 ,groups = { "Regression Test one" })
	public static void displaySubMenuSeatingandChair()
	{
		
		logger = report.createTest("Displaying submenu items");
		logger.log(Status.INFO, "To display the living submenu list in the console");
		System.out.println("The submenu items under Seating and Chaires:");
		for(int i=0;i<HomePageByAtLiving.listOfSeatingandChairitems(driver).size();i++)
		{
			System.out.println(submenuitems[i]);
		}
		logger.log(Status.PASS, "PASSED");
	}
	

	@Test(priority = 19 ,groups = { "Regression Test one" })
	public static void screenShotOfByAtLiving() {
		
		logger = report.createTest("Taking Screenshot of Living");
		logger.log(Status.INFO, "To capture the screenshot of bookshelves submenu Living");
		
		try {
			
			action.moveToElement(HomePageByAtLiving.optHoverLiving(driver)).perform();
			ScreenShot.screenShotTestCase(driver);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 20 ,groups = { "Smoke Test two" })
	public static void waitForGiftCardVisibility() {
		
		logger = report.createTest("Waiting for visibility of Gift Cards Menu");
		logger.log(Status.INFO, "To wait for the gift card menu to visible");

		ExplicitWait.ExplicitlyWait(HomePageGiftCards.giftCardMenu(driver));//(//*[contains(text(),'Gift Cards')])[1]
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 21 ,groups = { "Smoke Test two" })
	public static void clickOnGiftCard() {
		
		logger = report.createTest("Clicking Gift Card Menu");
		logger.log(Status.INFO, "To click on the gift card menu");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", HomePageGiftCards.giftCardMenu(driver));//(//*[contains(text(),'Gift Cards')])[1]
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 22 ,groups = { "Smoke Test two" })
	public static void clickOnBirthdayOrAnniversary() {
		
		logger = report.createTest("Clicking Birthday/Anniversary Sub-Menu");
		logger.log(Status.INFO, "To click on the Birthday/Anniversary sub-menu");
		
		HomePageGiftCards.birthDayOrAnniversary(driver).click();
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 23 ,groups = { "Smoke Test two" })
	public static void enteringAmount() {
		
		logger = report.createTest("Entering Amount");
		logger.log(Status.INFO, "To enter amount in the field");
		
		HomePageGiftCards.findingAmount(driver).sendKeys(JsonRead.amount);
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 24 ,groups = { "Smoke Test two" })
	public static void clickOnNext() {
		
		logger = report.createTest("Clicking on NEXT");
		logger.log(Status.INFO, "To click on the next button");
		
		HomePageGiftCards.nextButton(driver).click();
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 25 ,groups = { "Smoke Test two" })
	public static void enterRecipientName() {
		
		logger = report.createTest("Entering Receipient's Name");
		logger.log(Status.INFO, "To enter recipient's name");
		
		HomePageGiftCards.recepientName(driver).sendKeys(JsonRead.recipientName);
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 26 ,groups = { "Smoke Test two" })
	public static void enterRecipientEmail() {
		
		logger = report.createTest("Entering Recipient's Email");
		logger.log(Status.INFO, "To enter recipient's email");
		
		HomePageGiftCards.recepientEmail(driver).sendKeys(JsonRead.recipientEmail);
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 27 ,groups = { "Smoke Test two" })
	public static void enterRecipientMobile()
	{
		ExplicitWait.ExplicitlyWait(HomePageGiftCards.recepientMobile(driver));
		HomePageGiftCards.recepientMobile(driver).sendKeys(JsonRead.recipientmobile);
	}
	
	
	
	@Test(priority = 28 ,groups = { "Smoke Test two" })
	public static void enterCustomerName() {
		
		logger = report.createTest("Entering Customer's Name");
		logger.log(Status.INFO, "To enter customer's name");
		
		HomePageGiftCards.customerName(driver).sendKeys(JsonRead.customerName);
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 29 ,groups = { "Smoke Test two" })
	public static void enterCustomerEmail() {
		
		logger = report.createTest("Entering Customer's Email");
		logger.log(Status.INFO, "To enter customer's email");
		
		HomePageGiftCards.customerEmail(driver).sendKeys(JsonRead.customerEmail);
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 30 ,groups = { "Smoke Test two" })
	public static void enterCustomerMobileNumber() {
		
		logger = report.createTest("Entering Customer's Mobile Number");
		logger.log(Status.INFO, "To enter customer's mobile number");
		
		HomePageGiftCards.customerMobileNumber(driver).sendKeys(JsonRead.customerMobile);
		
		logger.log(Status.PASS, "PASSED");
		
	}
	@Test(priority = 31 ,groups = { "Smoke Test two" })
	public static void enterAddressofCustomer() 
	{
		
		ExplicitWait.ExplicitlyWait(HomePageGiftCards.enterCustomerAddress(driver));
		HomePageGiftCards.enterCustomerAddress(driver).sendKeys(JsonRead.customerAddress);
		
	}
	
	@Test(priority = 32,groups = { "Smoke Test two" })
	public static void enterPinofCustomerPin()
	{
		
		ExplicitWait.ExplicitlyWait(HomePageGiftCards.enterCustomerPin(driver));
		HomePageGiftCards.enterCustomerPin(driver).sendKeys(JsonRead.customerPin);
	}
	
	
	@Test(priority = 33 ,groups = { "Smoke Test two" })
	public static void enterMessage() {
		
		logger = report.createTest("Entering Message");
		logger.log(Status.INFO, "To enter message");
		
		HomePageGiftCards.optionalMessage(driver).sendKeys(JsonRead.message);
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 34 ,groups = { "Smoke Test two" })
	public static void clickOnConfirm() {
		
		logger = report.createTest("Clicking On CONFIRM Button");
		logger.log(Status.INFO, "To click on confirm button");
		
		HomePageGiftCards.confirmButton(driver).click();
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 35 ,groups = { "Smoke Test two" })
	public static void screenShotOfErrorMessage() {
		
		logger = report.createTest("Taking Screenshot of Error Message");
		logger.log(Status.INFO, "To capture the screenshot of error message displayeg on the web page");
		
		try {
			
			ScreenShot.screenShotTestCase(driver);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		logger.log(Status.PASS, "PASSED");
		
	}
	
	@Test(priority = 36 ,groups = { "Smoke Test two" })
	public static void displayErrorMessage() {
		
		logger = report.createTest("Displaying Error Message in the Console");
		logger.log(Status.INFO, "To display the error message in the console");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", HomePageGiftCards.recepientEmail(driver));
	    System.out.println(validationMessage);
	    
	    logger.log(Status.PASS, "PASSED");
	    
	}
	
	
	
	@Test(priority = 37,groups = { "Smoke Test two" })
	public static void clearrecipientmail()
	{
		HomePageGiftCards.recepientEmail(driver).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		HomePageGiftCards.recepientEmail(driver).sendKeys(Keys.DELETE);
	}
	
	
	@Test(priority = 38,groups = { "Smoke Test two" })
	public static void enterCorrectDeatils()
	{
		ExplicitWait.ExplicitlyWait(HomePageGiftCards.recepientEmail(driver));;
		HomePageGiftCards.recepientEmail(driver).sendKeys(JsonRead.correctemail);
	}
	
	@Test(priority = 39,groups = { "Smoke Test two" })
	public static void clickConfirmWithcorrectEmail() 
	{
		logger = report.createTest("Clicking On CONFIRM Button");
		logger.log(Status.INFO, "To click on confirm button");
		
		HomePageGiftCards.confirmButton(driver).click();
		
		logger.log(Status.PASS, "PASSED");
	}
	
	@Test(priority = 40,groups = { "Smoke Test two" })
	public static void confirmDetailsPage()//if always pass testNG test either fails or pass
	{
		
		
		WebElement elem = HomePageGiftCards.txtConfirmDetailsHeading(driver);
		boolean b= elem.isDisplayed();//if confirm page heading diplayed after submission success
		if(b)
		{
			System.out.println("Successfully submitted Details and now on verify Details Page:");
		}
		else
		{
			System.out.println("Failed to submit Details and not on verify Details Page:");
		}

	}
	
	@Test(priority = 41 ,groups = { "Smoke Test two" })
	public static void screenShotOfconfirmationPage() {
		
		logger = report.createTest("Taking Screenshot ");
		logger.log(Status.INFO, "To capture the screenshot ");
		
		try {
			
			ScreenShot.screenShotTestCase(driver);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		logger.log(Status.PASS, "PASSED");
		
	}
	@Test(priority = 42,groups = { "Regression Test two" })
	public static void confirmamountEnetered()
	{
		
		
		WebElement elem = HomeSubmittedPageDetails.amountEnetered(driver);
		String elementText = elem.getText();	
		String[] parts = elementText .split(",");
		String part1 = parts[0]; 
		String part2= parts[1];
		String concatenatedText = part1 + part2;
		String numericValue = concatenatedText.replaceAll("[^0-9]", "");//replace rupee sign
		System.out.println(numericValue);
		
		if(numericValue.equalsIgnoreCase(JsonRead.amount))
				{
					System.out.println("amount matched:"+numericValue);
				}
		else
		{
			System.out.println("amount not matching with confirmation page");
		}
		
	}
	
	
	@Test(priority = 43,groups = { "Regression Test two" })//hard assertion if fails terminate all further test cases//Assert.assertEquals(p, JsonRead.recipientName, "RecipientName mismatch");
	public static void confirmrecipientName()
	{
		
		
		softAssert = new SoftAssert();
		WebElement elem = HomeSubmittedPageDetails.recipientName(driver);
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.recipientName, "RecipientName mismatch");
		softAssert.assertAll();
		

	}
	@Test(priority = 44,groups = { "Regression Test two" })
	public static void confirmrecipientEmail()//soft assertion if fails run all further test cases
	{
		
		elem = HomeSubmittedPageDetails.recipientEmail(driver);
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.correctemail, "recipientEmail mismatch");
		softAssert.assertAll();
		

	}
	@Test(priority = 45,groups = { "Regression Test two" })
	public static void confirmrecipientMobile()
	{
		
		elem = HomeSubmittedPageDetails.recipientMobile(driver);
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.recipientmobile, "recipientMobile mismatch");
		softAssert.assertAll();
		
	}
	@Test(priority = 46,groups = { "Regression Test two" })
	public static void confirmcustomerName()
	{
		
		WebElement elem = HomeSubmittedPageDetails.customerName(driver);
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerName, "customerName mismatch ");
		softAssert.assertAll();
		

	}
	@Test(priority = 47,groups = { "Regression Test two" })
	public static void confirmcustomerEmail()
	{
		
		WebElement elem = HomeSubmittedPageDetails.customerEmail(driver);
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerEmail, "customerEmail mismatch ");
		softAssert.assertAll();
		
	}
	@Test(priority = 48,groups = { "Regression Test two" })
	public static void confirmcustomerMobile()
	{
		
		WebElement elem = HomeSubmittedPageDetails.customerMobile(driver);
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerMobile, "customerMobile mismatch ");
		softAssert.assertAll();
		

	}
	@Test(priority = 49,groups = { "Regression Test two" })
	public static void confirmcustomerCity()
	{
		
		WebElement elem = HomeSubmittedPageDetails.customerCity(driver);
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerAddress, "customerCity mismatch ");
		softAssert.assertAll();
		

	}
	@Test(priority = 50,groups = { "Regression Test two" })
	public static void confirmcustomerPinCode()
	{
		
		
		WebElement elem = HomeSubmittedPageDetails.customerPinCode(driver);
		//System.out.println(elem.getText());//gives both parts zip with city
		String elementText = elem.getText();
		String[] parts = elementText .split(",");
		String part1 = parts[0]; // "110059"//only zip
		System.out.println(part1);
		softAssert.assertEquals(part1, JsonRead.customerPin, "customerPinCode mismatch ");
		softAssert.assertAll();
	

	}

	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		
		if (result.getStatus() == ITestResult.FAILURE) {
		
			logger.log(Status.FAIL, "Failed");
			path = ScreenShot.screenShotTestCase(driver);
		   logger.addScreenCaptureFromPath(path);		
		}
		
	}
	
	@AfterGroups("Regression Test two")
	public static void closingBrowser () {
		
		report.flush();
		DriverSetup.closeDriver();
		
	}
	
	
}
