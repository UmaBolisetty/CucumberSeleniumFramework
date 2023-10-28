package StepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import BaseUtil.TestBase;
import Pages.SavannaHomepageCustomerSearchPage;
import Pages.SavannaLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SavannaCustomerEmailUpdateWithSuccessfulVelocityChecksSteps extends TestBase {

	public SavannaCustomerEmailUpdateWithSuccessfulVelocityChecksSteps() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	SavannaLoginPage loginpage = new SavannaLoginPage();
	SavannaHomepageCustomerSearchPage savannaHomepageCustomerSearchPage = new SavannaHomepageCustomerSearchPage();


	@When("^I update customers email with (.*)$")
	public void i_update_customers_email(String email) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.clickOnCustomerPageTaskButton();
		Thread.sleep(500);
		savannaHomepageCustomerSearchPage.clickOnCustomerTaskListButtonByButtonTextAndVerifyLandingPage("Add Email");
		Thread.sleep(500);
		savannaHomepageCustomerSearchPage.enterNewEmailAddress(email);
		
	}

	@When("^I click on email field submit button$")
	public void i_click_on_email_field_submit_button() throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.clickOnEmailAddressFieldSubmitButton();
	}

	@Then("^Customers email update should be successful without approval from back office$")
	public void customers_email_update_should_be_successful_without_approval_from_back_office() throws IOException, InterruptedException {
		Thread.sleep(10000);
		savannaHomepageCustomerSearchPage.verifyCustomerEmailUpdateCreatedSuccessfully();
	}

}
