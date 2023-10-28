package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseUtil.TestBase;
import Pages.SavannaHomepageCustomerSearchPage;
import Pages.SavannaLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SavannaHomepageCustomerSearchSteps extends TestBase {

	public SavannaHomepageCustomerSearchSteps() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	SavannaLoginPage loginpage = new SavannaLoginPage();
	SavannaHomepageCustomerSearchPage savannaHomepageCustomerSearchPage = new SavannaHomepageCustomerSearchPage();

	@Given("^I am on Banking Customer page$")
	public void i_am_on_banking_customer_page() throws IOException, InterruptedException {
		loginpage.enterUsername("onikoyi");
		Thread.sleep(100);
		loginpage.enterPassword("PASSWORDlolade2*");
		Thread.sleep(100);
		loginpage.clickOnLoginButton();
		Thread.sleep(100);
		System.out.println("Clicking on Search button");
		savannaHomepageCustomerSearchPage.selectDesiredSearchGroup("Search Consumers");
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.selectDesiredCustomerGroup("Banking Customer");
		Thread.sleep(100);
	}

	@Given("^I am on Deceased Customer page$")
	public void i_am_on_deceased_customer_page() throws IOException, InterruptedException {
		loginpage.enterUsername("onikoyi");
		Thread.sleep(100);
		loginpage.enterPassword("PASSWORDlolade2*");
		Thread.sleep(100);
		loginpage.clickOnLoginButton();
		Thread.sleep(100);
		System.out.println("Clicking on Search button");
		savannaHomepageCustomerSearchPage.selectDesiredSearchGroup("Search Consumers");
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.selectDesiredCustomerGroup("Deceased");
		Thread.sleep(500);
	}

	@Given("^I am on failed customer application search page$")
	public void i_am_on_failed_customer_application_page() throws IOException, InterruptedException {
		loginpage.enterUsername("onikoyi");
		Thread.sleep(100);
		loginpage.enterPassword("PASSWORDlolade2*");
		Thread.sleep(100);
		loginpage.clickOnLoginButton();
		Thread.sleep(100);
		System.out.println("Clicking on Search button");
		savannaHomepageCustomerSearchPage.selectDesiredSearchGroup("Search Consumers");
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.selectDesiredCustomerGroup("Failed Applications");
		Thread.sleep(500);
	}

	@Given("^I am on pending customer application search page$")
	public void i_am_on_pending_customer_application_page() throws IOException, InterruptedException {
		loginpage.enterUsername("onikoyi");
		Thread.sleep(100);
		loginpage.enterPassword("PASSWORDlolade2*");
		Thread.sleep(100);
		loginpage.clickOnLoginButton();
		Thread.sleep(100);
		System.out.println("Clicking on Search button");
		savannaHomepageCustomerSearchPage.selectDesiredSearchGroup("Search Consumers");
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.selectDesiredCustomerGroup("Pending Applications");
		Thread.sleep(500);
	}

	@Given("^I am on rejected customer application search page$")
	public void i_am_on_rejected_customer_application_page() throws IOException, InterruptedException {
		loginpage.enterUsername("onikoyi");
		Thread.sleep(100);
		loginpage.enterPassword("PASSWORDlolade2*");
		Thread.sleep(100);
		loginpage.clickOnLoginButton();
		Thread.sleep(100);
		System.out.println("Clicking on Search button");
		savannaHomepageCustomerSearchPage.selectDesiredSearchGroup("Search Consumers");
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.selectDesiredCustomerGroup("Rejected Applications");
		Thread.sleep(500);
	}

	@Given("^I am on NonTransactional Customer page$")
	public void i_am_on_non_transactional_customer_page() throws IOException, InterruptedException {
		loginpage.enterUsername("onikoyi");
		Thread.sleep(100);
		loginpage.enterPassword("PASSWORDlolade2*");
		Thread.sleep(100);
		loginpage.clickOnLoginButton();
		Thread.sleep(100);
		System.out.println("Clicking on Search button");
		savannaHomepageCustomerSearchPage.selectDesiredSearchGroup("Search Consumers");
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.selectDesiredCustomerGroup("Non-Transactional Customer");
		Thread.sleep(500);
	}

	@When("^I input valid existing customer lastName (.*)$")
	public void i_input_valid_existing_customer_lName(String lName) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerLastName(lName);
		Thread.sleep(100);
	}

	@When("^I click on Search button$")
	public void i_click_on_search_button() throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.clickOnEnterSearchCriteriaSearchButton();
		Thread.sleep(100);
	}

	@SuppressWarnings("deprecation")
	@Then("^I should be navigated to Search Result page$")
	public void i_should_be_navigated_to_search_result_page() throws InterruptedException {
		System.out.println("Search result page url: " + driver.getCurrentUrl());
		String searchURL = "https://inte-smt.savanainc.com/nGageBanking_Customer/CustomerSearch.aspx";
		Assert.assertTrue(driver.getCurrentUrl().equals(searchURL));
		Thread.sleep(2000);
	}

	@Then("^The lastname in my search result should have (.*)$")
	public void the_lastname_in_my_search_result_should_have_lName(String lName)
			throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.validateSearchResultIndex1LastName(lName);
		Thread.sleep(100);
	}

	@When("^I enter valid existing customer firstName (.*)$")
	public void i_input_valid_existing_customer_fName(String fName) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerFirstName(fName);
		Thread.sleep(100);
	}

	@Then("^The firstName in my search result should have (.*)$")
	public void the_lastname_in_my_search_result_should_have_fName(String fName)
			throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.validateSearchResultIndex1FirstName(fName);
		Thread.sleep(100);
	}

	@Then("^I should see the no-result-found Search Result page$")
	public void i_should_see_the_no_result_found_Search_Result_page() throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.validateSearchResultNotFound();
		Thread.sleep(100);
	}

	@When("^I enter valid Tax ID existing customer (.*)$")
	public void i_enter_valid_Tax_ID_existing_customer(String Tax_ID) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerTaxId(Tax_ID);
		Thread.sleep(100);
	}

	@Then("^The Tax ID in my search result should have (.*)$")
	public void the_Tax_ID_in_my_search_result_should_have(String TaxID) throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.validateSearchResultIndex1TaxID(TaxID);
		Thread.sleep(100);
	}

	@When("^I enter valid PhoneNumber of existing customer (.*)$")
	public void i_enter_valid_PhoneNumber_of_existing_customer(String PhoneNumber)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerPhoneNumber(PhoneNumber);
		Thread.sleep(100);
	}

	@Then("^The PhoneNumber in my search result should have (.*)$")
	public void the_PhoneNumber_in_my_search_result_should_have(String PhoneNumber)
			throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.validateSearchResultIndex1PhoneNumber(PhoneNumber);
		Thread.sleep(100);
	}

	@When("^I enter valid Email of existing customer (.*)$")
	public void i_enter_valid_Email_of_existing_customer(String Email) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerEmail(Email);
		Thread.sleep(100);
	}

	@Then("^The Email in my search result should match (.*)$")
	public void the_Email_in_my_search_result_should_have(String Email) throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.validateSearchResultIndex1Email(Email);
		Thread.sleep(100);
	}

	@When("^I enter valid DOB of existing customer (.*)$")
	public void i_enter_valid_DOB_of_existing_customer(String DOB) throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerDOB(DOB);
		Thread.sleep(100);
	}

	@Then("^The DOB in my search result should match (.*)$")
	public void the_DOB_in_my_search_result_should_have(String DOB) throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.validateSearchResultIndex1DOB(DOB);
		Thread.sleep(100);
	}

	@When("^I enter valid CustomerID of existing customer (.*)$")
	public void i_enter_valid_CustomerID_of_existing_customer(String CustomerID)
			throws IOException, InterruptedException {
		savannaHomepageCustomerSearchPage.enterBusinessCustomerCustomerID(CustomerID);
		Thread.sleep(100);
	}

	@Then("^The CustomerID in my search result should match (.*)$")
	public void the_Customers_in_my_search_result_should_have(String CustomerID)
			throws InterruptedException, IOException {
		savannaHomepageCustomerSearchPage.selectDesiredVerificationMethod("Knowledge Based Verification");
		Thread.sleep(500);
		savannaHomepageCustomerSearchPage.clickOnVerificationCheckBox("Last_4_digits_of_SSN");
		Thread.sleep(100);
		savannaHomepageCustomerSearchPage.clickOnVerifiedWithQuestionButtonAndVerifyLandingPage();
		// savannaHomepageCustomerSearchPage.validateSearchResultIndex1CustomerID(CustomerID);
		Thread.sleep(500);

	}

}
