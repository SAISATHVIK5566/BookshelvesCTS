package stepDefinitionFile;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testScenarios.DisplayBookshelves;

public class stepDefinitions {
	

@Given("User is already on UrbanLadder WebPage")
public void user_is_already_on_urban_ladder_web_page() throws IOException {
	DisplayBookshelves.driverConfig();
    
}

@Then("User search for Bookshelves in Search Box")
public void user_search_for_bookshelves_in_search_box() {
	DisplayBookshelves.inputBox();
}

@Then("User Click Search button")
public void user_click_search_button() {
	DisplayBookshelves.clickSearch();
}

@Then("User Close the popup")
public void user_close_the_popup() {
	DisplayBookshelves.popupclose();
}

@Then("User Scroll Down page Till Bookshelves Available")
public void user_scroll_down_page_till_bookshelves_available() {
	DisplayBookshelves.scroll();
}

@When("User Hover to the Category option")
public void user_hover_to_the_category_option() {
	DisplayBookshelves.hoverCategory();

}

@Then("User Select category as Bookshelve")
public void user_select_category_as_bookshelve() {
	DisplayBookshelves.selectCategory();

}

@When("User Hover to Price option")
public void user_hover_to_price_option() {
	DisplayBookshelves.hoverPrice();

}

@Then("User wait for Price Slide Bar")
public void user_wait_for_price_slide_bar() {
	DisplayBookshelves.waitForSlider();

}

@Then("User slide Max price to {double}")
public void user_slide_max_price_to(Double double1) throws InterruptedException {
	DisplayBookshelves.slidePrice();

}

@When("User hover to SortBy option")
public void user_hover_to_sort_by_option() {
	DisplayBookshelves.hoverSort();

}

@Then("User Select Sort By Price High to Low")
public void user_select_sort_by_price_high_to_low() {
	DisplayBookshelves.selectSortHighToLow();

}

@Then("User select in stock option")
public void user_select_in_stock_option() {
	DisplayBookshelves.inStockSelction();

}

@Then("User fetch all the Available Bookshelves and Store Top three in excel")
public void user_fetch_all_the_available_bookshelves_and_store_top_three_in_excel() {
	DisplayBookshelves.collectingBookShelvesList();

}

@Then("User Print the top three Bookshelves on console")
public void user_print_the_top_three_bookshelves_on_console() {
	DisplayBookshelves.displayingBookShelves();

}

@Then("User scroll page up till living is present")
public void user_scroll_page_up_till_living_is_present() {
	DisplayBookshelves.scrollUp();
    

}

@When("User hover to living option")
public void user_hover_to_living_option() {
	DisplayBookshelves.hoverLiving();

}

@Then("User wait for submenu to appear")
public void user_wait_for_submenu_to_appear() {
	DisplayBookshelves.waitForSubmenuToAppear();

}

@Then("User fetch all option Available under Seating and Chair and store in excel")
public void user_fetch_all_option_available_under_seating_and_chair_and_store_in_excel() {
	DisplayBookshelves.listOFseatingAndChairExcel();

}

@Then("User Print the Available items on Console")
public void user_print_the_available_items_on_console() {
	DisplayBookshelves.displaySubMenuSeatingandChair();
    

}

@Then("User wait for Gift Cards option visibility")
public void user_wait_for_gift_cards_option_visibility() {
	DisplayBookshelves.waitForGiftCardVisibility();
    

}

@Then("User Click Gift Cards button")
public void user_click_gift_cards_button() {
	DisplayBookshelves.clickOnGiftCard();

}

@Then("Load the Json File for input as in this project input taken from Json File")
public void load_the_json_file_for_input_as_in_this_project_input_taken_from_json_file() {
	DisplayBookshelves.testCaseReadJSON();

}

@When("User Select BirthdayOrAnniversary Gift option")
public void user_select_birthday_or_anniversary_gift_option() {
	DisplayBookshelves.clickOnBirthdayOrAnniversary();

}

@Then("User Fill the Amount")
public void user_fill_the_amount() {
	DisplayBookshelves.enteringAmount();

}

@When("User click Next button")
public void user_click_next_button() {
	DisplayBookshelves.clickOnNext();

}

@Then("User Fill the Recipient Name")
public void user_fill_the_recipient_name() {
	DisplayBookshelves.enterRecipientName();

}

@Then("User Fill the Incorrect Recipient Email")
public void user_fill_the_incorrect_recipient_email() {
	DisplayBookshelves.enterRecipientEmail();

}

@Then("User Fill the Recipient Mobile number")
public void user_fill_the_recipient_mobile_number() {
	DisplayBookshelves.enterRecipientMobile();

}

@Then("User Fill the Customer Name")
public void user_fill_the_customer_name() {
	DisplayBookshelves.enterCustomerName();

}

@Then("User Fill the Customer Email")
public void user_fill_the_customer_email() {
    
	DisplayBookshelves.enterCustomerEmail();
}

@Then("User Fill the Customer Mobile Number")
public void user_fill_the_customer_mobile_number() {
	DisplayBookshelves.enterCustomerMobileNumber();

}

@Then("User Fill the Customer Address")
public void user_fill_the_customer_address() {
	DisplayBookshelves.enterAddressofCustomer();

}

@Then("User Fill the Customer Pin")
public void user_fill_the_customer_pin() {
	DisplayBookshelves.enterPinofCustomerPin();

}

@Then("User Fill the Optional Message")
public void user_fill_the_optional_message() {
	DisplayBookshelves.enterMessage();

}

@When("User Click the Confirm button")
public void user_click_the_confirm_button() {
	DisplayBookshelves.clickOnConfirm();

}

@Then("User Capture the Error Message and Print it on Console")
public void user_capture_the_error_message_and_print_it_on_console() {
	DisplayBookshelves.displayErrorMessage();

}

@Then("User Clear the Recipient Email Box")
public void user_clear_the_recipient_email_box() {
    
	DisplayBookshelves.clearrecipientmail();
}

@Then("User Fill the correct Recipient Email")
public void user_fill_the_correct_recipient_email() {
	DisplayBookshelves.enterCorrectDeatils();

}

@When("User Again Click the Confirm button")
public void user_again_click_the_confirm_button() {
	DisplayBookshelves.clickConfirmWithcorrectEmail();

}

@Then("User Successfully submitted the details and on confirm details page")
public void user_successfully_submitted_the_details_and_on_confirm_details_page() {
	DisplayBookshelves.confirmDetailsPage();

}

@Then("User Verify amount Enetered")
public void user_verify_amount_enetered() {
	DisplayBookshelves.confirmamountEnetered();

}

@Then("User Verify Recipient Name")
public void user_verify_recipient_name() {
	DisplayBookshelves.confirmrecipientName();

}

@Then("User Verify Recipient Email")
public void user_verify_recipient_email() {
	DisplayBookshelves.confirmrecipientEmail();

}

@Then("User Verify Recipient Mobile")
public void user_verify_recipient_mobile() {
	DisplayBookshelves.confirmrecipientMobile();

}

@Then("User Verify Customer Name")
public void user_verify_customer_name() {
	DisplayBookshelves.confirmcustomerName();

}

@Then("User Verify Customer Email")
public void user_verify_customer_email() {
	DisplayBookshelves.confirmcustomerEmail();

}

@Then("User Verify Customer Mobile")
public void user_verify_customer_mobile() {
	DisplayBookshelves.confirmcustomerMobile();

}

@Then("User Verify Customer City")
public void user_verify_customer_city() {
	DisplayBookshelves.confirmcustomerCity();

}

@Then("User Verify Customer PinCode")
public void user_verify_customer_pin_code() {
	DisplayBookshelves.confirmcustomerPinCode();

}


}
