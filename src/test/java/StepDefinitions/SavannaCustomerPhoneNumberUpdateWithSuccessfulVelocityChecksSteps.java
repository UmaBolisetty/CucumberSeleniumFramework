package StepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import BaseUtil.TestBase;
import Pages.SavannaHomepageCustomerSearchPage;
import Pages.SavannaLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SavannaCustomerPhoneNumberUpdateWithSuccessfulVelocityChecksSteps extends TestBase {

	public SavannaCustomerPhoneNumberUpdateWithSuccessfulVelocityChecksSteps() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	SavannaLoginPage loginpage = new SavannaLoginPage();
	SavannaHomepageCustomerSearchPage savannaHomepageCustomerSearchPage = new SavannaHomepageCustomerSearchPage();

	@When("^I update customers PhoneNumber with (.*)$")
	public void i_update_customers_email_with_123gb_gmamail_com(String PhoneNumber) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.clickOnCustomerPageTaskButton();
		Thread.sleep(1000);
		savannaHomepageCustomerSearchPage.clickOnCustomerTaskListButtonByButtonTextAndVerifyLandingPage("Add Phone");
		Thread.sleep(500);
		savannaHomepageCustomerSearchPage.enterNewPhoneNumber(PhoneNumber);
		
	}

	@When("^I click on PhoneNumber field submit button$")
	public void i_click_on_email_field_submit_button() throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.clickOnPhoneNumberFieldSubmitButton();
	}

	@Then("^Customers PhoneNumber update should be successful without approval from back office$")
	public void customers_email_update_should_be_successful_without_approval_from_back_office() throws IOException, InterruptedException {
		Thread.sleep(10000);
		savannaHomepageCustomerSearchPage.verifyCustomerPhoneNumberUpdateCreatedSuccessfully();
	}
}
