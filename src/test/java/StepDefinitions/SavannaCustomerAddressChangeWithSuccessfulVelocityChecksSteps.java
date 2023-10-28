package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import BaseUtil.TestBase;
import Pages.SavannaHomepageCustomerSearchPage;
import Pages.SavannaLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SavannaCustomerAddressChangeWithSuccessfulVelocityChecksSteps extends TestBase {

	public SavannaCustomerAddressChangeWithSuccessfulVelocityChecksSteps() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	SavannaLoginPage loginpage = new SavannaLoginPage();
	SavannaHomepageCustomerSearchPage savannaHomepageCustomerSearchPage = new SavannaHomepageCustomerSearchPage();

	@Given("^I am on banking customer task list page$")
	public void I_am_on_customer_task_list_page() throws IOException, InterruptedException {
		loginpage.enterUsername("onikoyi");
		Thread.sleep(100);
		loginpage.enterPassword("PASSWORDlolade2*");
		Thread.sleep(100);
		loginpage.clickOnLoginButton();
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.selectDesiredSearchGroup("Search Consumers");
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.selectDesiredCustomerGroup("Banking Customer");
		Thread.sleep(100);

	}

	@When("^I successfully login to customer (.*) page by selecting knowledge based verification with last 4 digits of ssn (.*)$")
	public void i_successfully_login_to_customer_page_ssn(String lName, String verificationCheck)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(200);
		savannaHomepageCustomerSearchPage.clickOnCustomerSearchRow1();
		Thread.sleep(400);
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Knowledge Based Verification");
		Thread.sleep(2000);
		savannaHomepageCustomerSearchPage.clickOnVerificationCheckBox(verificationCheck);
		Thread.sleep(10000);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithQuestionButtonAndVerifyLandingPage();
	}

	@When("^I successfully login to customer (.*) page by selecting knowledge based verification with Date of Birth (.*)$")
	public void i_successfully_login_to_customer_page_DOB(String lName, String verificationCheck)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(200);
		savannaHomepageCustomerSearchPage.clickOnCustomerSearchRow1();
		Thread.sleep(400);
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Knowledge Based Verification");
		Thread.sleep(2000);
		savannaHomepageCustomerSearchPage.clickOnVerificationCheckBox(verificationCheck);
		Thread.sleep(300);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithQuestionButtonAndVerifyLandingPage();
	}

	@When("^I successfully login to customer (.*) page by selecting knowledge based verification with Telephone Number (.*)$")
	public void i_successfully_login_to_customer_page_telephone_number(String lName, String verificationCheck)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(200);
		savannaHomepageCustomerSearchPage.clickOnCustomerSearchRow1();
		Thread.sleep(400);
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Knowledge Based Verification");
		Thread.sleep(2000);
		savannaHomepageCustomerSearchPage.clickOnVerificationCheckBox(verificationCheck);
		Thread.sleep(300);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithQuestionButtonAndVerifyLandingPage();
	}

	@When("^I successfully login to customer (.*) page by selecting knowledge based verification with Email Address (.*)$")
	public void i_successfully_login_to_customer_page_email_address(String lName, String verificationCheck)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(200);
		savannaHomepageCustomerSearchPage.clickOnCustomerSearchRow1();
		Thread.sleep(400);
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Knowledge Based Verification");
		Thread.sleep(2000);
		savannaHomepageCustomerSearchPage.clickOnVerificationCheckBox(verificationCheck);
		Thread.sleep(300);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithQuestionButtonAndVerifyLandingPage();
	}

	@When("^I successfully login to customer (.*) page by selecting knowledge based verification with Other (.*)$")
	public void i_successfully_login_to_customer_page_other(String lName, String verificationCheck)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(200);
		savannaHomepageCustomerSearchPage.clickOnCustomerSearchRow1();
		Thread.sleep(400);
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Knowledge Based Verification");
		Thread.sleep(2000);
		savannaHomepageCustomerSearchPage.clickOnVerificationCheckBox(verificationCheck);
		Thread.sleep(300);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithQuestionButtonAndVerifyLandingPage();
	}

	@When("^I successfully login to customer (.*) page by selecting knowledge based verification with Mother Maiden Name (.*)$")
	public void i_successfully_login_to_customer_page_mother_maiden_name(String lName, String verificationCheck)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(200);
		savannaHomepageCustomerSearchPage.clickOnCustomerSearchRow1();
		Thread.sleep(400);
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Knowledge Based Verification");
		Thread.sleep(2000);
		savannaHomepageCustomerSearchPage.clickOnVerificationCheckBox(verificationCheck);
		Thread.sleep(300);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithQuestionButtonAndVerifyLandingPage();
		
	}
	
	@When("^I successfully login to customer (.*) page by selecting multi-factor authentication with send code via text option$")
	public void i_successfully_login_to_customer_page_multi_factor_authentication_text_option(String lName)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(200);
		savannaHomepageCustomerSearchPage.clickOnCustomerSearchRow1();
		Thread.sleep(400);
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Multi-Factor Authentication");
		Thread.sleep(2000);
		savannaHomepageCustomerSearchPage.clickOnSendCodeViaTextButton();
		Thread.sleep(1000);
		savannaHomepageCustomerSearchPage.enterNotesInNotesSection();
		Thread.sleep(300);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithCodeButtonAndVerifiedlandingPage();

	}
	
	@When("^I successfully login to customer (.*) page by selecting multi-factor authentication with send code via email option$")
	public void i_successfully_login_to_customer_page_multi_factor_authentication_email_option(String lName)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(200);
		savannaHomepageCustomerSearchPage.clickOnCustomerSearchRow1();
		Thread.sleep(400);
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Multi-Factor Authentication");
		Thread.sleep(2000);
		savannaHomepageCustomerSearchPage.clickOnSendCodeViaEmailButton();
		Thread.sleep(1000);
		savannaHomepageCustomerSearchPage.enterNotesInNotesSection();
		Thread.sleep(300);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithCodeButtonAndVerifiedlandingPage();

	}

	@When("^I update customers address with AddressLine1 (.*)$")
	public void i_change_customersess(String addressLine1) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.clickOnCustomerPageTaskButton();
		Thread.sleep(500);
		savannaHomepageCustomerSearchPage.clickOnCustomerTaskListButtonByButtonTextAndVerifyLandingPage("Add Address");
		Thread.sleep(500);
		savannaHomepageCustomerSearchPage.enterAddressLine1(addressLine1);

	}

	@When("^I update customers address with City (.*)$")
	public void i_change_address(String city) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterCity(city);

	}

	@When("^I update customers address with State (.*)$")
	public void customers_address(String stateRegionText) throws IOException, InterruptedException {
		// savannaHomepageCustomerSearchPage.selectStateRegionByText(stateRegionText);

	}

	@When("^I update customers address with Zipcode (.*)$")
	public void i_dress(String zipCode) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterZipCode(zipCode);
		Thread.sleep(500);
	}

	@When("^I update customers address with Country (.*)$")
	public void _customers_address(String country) throws IOException, InterruptedException {
		// savannaHomepageCustomerSearchPage.selectCountry(country);

	}

	@When("^I click on submit button$")
	public void _customers_address() throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.clickAddAddressFieldSubmitButton();

	}

	@Then("^Customers address update should be successful without approval from back office$")
	public void Customers_address_change_should_be_successful() throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.verifyCustomerNewAddressCreatedSuccessfully();
		Thread.sleep(500);
	}

}
