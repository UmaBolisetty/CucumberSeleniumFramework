package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import BaseUtil.PropertiesFile;
import BaseUtil.TestBase;

public class SavannaHomepageCustomerSearchPage extends TestBase {

	// WebDriver driver=null;
	private PropertiesFile element = new PropertiesFile();

	public SavannaHomepageCustomerSearchPage() {
		super(driver);
	}

	public void selectDesiredSearchGroup(String searchGroupName) throws IOException, InterruptedException {
		// parameter can be Search Consumers, Search Organizations or Search Accounts
		WebElement ele_selectDesiredSearchGroup = driver
				.findElement(By.xpath(element.getProperties("savannaHomepageSearchBlock")));
		System.out.println("ele_selectDesiredSearchGroup.getText()= " + ele_selectDesiredSearchGroup.getText());
		if (ele_selectDesiredSearchGroup.getText().equals(searchGroupName)) {
			System.out.println(searchGroupName + " :selected on search block");
		} else {
			ele_selectDesiredSearchGroup.click();
			Thread.sleep(2000);
			WebElement ele_search_organization = driver
					.findElement(By.xpath(element.getProperties("search_organization")));
			WebElement ele_search_account = driver.findElement(By.xpath(element.getProperties("search_account")));
			if (searchGroupName.contains(ele_search_organization.getText())) {
				ele_search_organization.click();
				System.out.println(searchGroupName + " :selected on search block");
			} else {
				ele_search_account.click();
				System.out.println(searchGroupName + " :selected on search block");
			}
		}

	}

	public void selectDesiredCustomerGroup(String customerGroup) throws IOException, InterruptedException {
		// customergroup can either be- Non-Transactional Customer, Pending
		// Applications,Banking Customer, Failed Applications, Rejected Applications,
		// Deceased
		System.out.println("Searching for customerGroup: " + customerGroup);
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));
		if (customerGroup.contains(ele_customer_group.getText())) {
			System.out.println("customerGroup: " + customerGroup + " is already selected");
		} else {
			Select customer_group_dropdown = new Select(ele_customer_group);
			customer_group_dropdown.selectByVisibleText(customerGroup);
			System.out.println("customerGroup: " + customerGroup + " has been selected");
			Thread.sleep(100);
		}
	}

	public void enterBusinessCustomerLastName(String lastName) throws IOException, InterruptedException {
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));
		WebElement ele_enter_search_criteria_lastName = ele_customer_group
				.findElement(By.xpath(element.getProperties("enter_search_criteria_lastName")));
		ele_enter_search_criteria_lastName.sendKeys(lastName);
		Thread.sleep(100);
	}

	public void enterBusinessCustomerFirstName(String firstName) throws IOException, InterruptedException {
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));
		WebElement ele_enter_search_criteria_firstName = ele_customer_group
				.findElement(By.xpath(element.getProperties("enter_search_criteria_firstName")));
		ele_enter_search_criteria_firstName.sendKeys(firstName);
		Thread.sleep(100);
	}

	public void enterDeceasedCustomerFirstName(String firstName) throws IOException, InterruptedException {
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));

		WebElement ele_enter_search_criteria_firstName = ele_customer_group
				.findElement(By.xpath(element.getProperties("enter_search_criteria_firstName")));
		ele_enter_search_criteria_firstName.sendKeys(firstName);
		Thread.sleep(100);
	}

	public void enterBusinessCustomerTaxId(String TaxId) throws IOException, InterruptedException {
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));

		WebElement ele_enter_search_criteria_tax_id = ele_customer_group
				.findElement(By.xpath(element.getProperties("enter_search_criteria_tax_id")));
		ele_enter_search_criteria_tax_id.sendKeys(TaxId);
		Thread.sleep(100);
	}

	public void enterBusinessCustomerPhoneNumber(String PhoneNumber) throws IOException, InterruptedException {
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));

		WebElement ele_enter_search_criteria_phone_number = ele_customer_group
				.findElement(By.xpath(element.getProperties("enter_search_criteria_phone_number")));
		ele_enter_search_criteria_phone_number.sendKeys(PhoneNumber);
		Thread.sleep(100);
	}

	public void enterBusinessCustomerEmail(String Email) throws IOException, InterruptedException {
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));

		WebElement ele_enter_search_criteria_email = ele_customer_group
				.findElement(By.xpath(element.getProperties("enter_search_criteria_email")));
		ele_enter_search_criteria_email.sendKeys(Email);
		Thread.sleep(100);
	}

	public void enterBusinessCustomerDOB(String DOB) throws IOException, InterruptedException {
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));

		WebElement ele_enter_search_criteria_DOB = ele_customer_group
				.findElement(By.xpath(element.getProperties("enter_search_criteria_DOB")));
		ele_enter_search_criteria_DOB.sendKeys(DOB);
		Thread.sleep(100);
	}

	public void enterBusinessCustomerCustomerID(String CustomerID) throws IOException, InterruptedException {
		WebElement ele_customer_group = driver.findElement(By.xpath(element.getProperties("customer_group")));

		WebElement ele_enter_search_criteria_customerID = ele_customer_group
				.findElement(By.xpath(element.getProperties("enter_search_criteria_customerID")));
		ele_enter_search_criteria_customerID.sendKeys(CustomerID);
		Thread.sleep(100);
	}

	public void clickOnEnterSearchCriteriaSearchButton() throws IOException, InterruptedException {
		driver.findElement(By.xpath(element.getProperties("enter_search_criteria_page_search_button"))).click();
		Thread.sleep(100);
	}
	
	public void validateSearchResultNotFound() throws IOException, InterruptedException {
		WebElement ele_search_customers_no_result_found = driver
				.findElement(By.xpath(element.getProperties("search_customers_no_result_found")));
		Assert.assertTrue(ele_search_customers_no_result_found.isDisplayed());
		Thread.sleep(100);
	}
	
	public void verifySearchResultNotFound() throws IOException, InterruptedException {
		WebElement ele_search_customers_no_result_found = driver
				.findElement(By.xpath(element.getProperties("search_customers_no_result_found")));
		Assert.assertTrue(ele_search_customers_no_result_found.isDisplayed());
		Thread.sleep(200);
	}
	
	public void validateSearchResultIndex1LastName(String Lastname) throws IOException, InterruptedException {
		WebElement ele_verify_index1_lastname = driver
				.findElement(By.xpath(element.getProperties("verify_index1_lastname")));
		System.out.println("ele_verify_index1_lastname: " + ele_verify_index1_lastname.getText());
		Assert.assertTrue(ele_verify_index1_lastname.getText().equals(Lastname));
		Thread.sleep(100);
	}

	public void validateSearchResultIndex1TaxID(String TaxID) throws IOException, InterruptedException {
		WebElement ele_search_result_index1_taxID = driver
				.findElement(By.xpath(element.getProperties("search_result_index1_taxID")));
		System.out.println("ele_search_result_index1_taxID: " + ele_search_result_index1_taxID.getText());
		String value = ele_search_result_index1_taxID.getText();
		String taxidlast$Digits = String.valueOf(value).substring(6, 10);
		System.out.println("taxid lat 4 digits are: " + taxidlast$Digits);
		Assert.assertTrue(TaxID.toString().contains(taxidlast$Digits));
		Thread.sleep(100);
	}

	public void validateSearchResultIndex1FirstName(String FirstName) throws IOException, InterruptedException {
		WebElement ele_verify_index1_firstName = driver
				.findElement(By.xpath(element.getProperties("verify_index1_firstName")));
		System.out.println("ele_verify_index1_firstName: " + ele_verify_index1_firstName.getText());
		Assert.assertTrue(ele_verify_index1_firstName.getText().equals(FirstName));
		Thread.sleep(100);

	}

	public void validateSearchResultIndex1CustomerGroup(String CustomerGroup) throws IOException, InterruptedException {
		WebElement ele_search_result_index1_customer_group = driver
				.findElement(By.xpath(element.getProperties("search_result_index1_customer_group")));
		System.out.println(
				"ele_search_result_index1_customer_group: " + ele_search_result_index1_customer_group.getText());
		Assert.assertTrue(ele_search_result_index1_customer_group.getText().equals(CustomerGroup));
		Thread.sleep(100);

	}

	public void validateSearchResultIndex1CustomerID(String CustomerID) throws IOException, InterruptedException {
		WebElement ele_search_result_index1_customerID = driver
				.findElement(By.xpath(element.getProperties("search_result_index1_customerID")));
		System.out.println("ele_search_result_index1_customerID: " + ele_search_result_index1_customerID.getText());
		Assert.assertTrue(ele_search_result_index1_customerID.getText().equals(CustomerID));
		Thread.sleep(100);
	}

	public void validateSearchResultIndex1PhoneNumber(String PhoneNumber) throws IOException, InterruptedException {
		WebElement ele_search_result_index1_phoneNumber = driver
				.findElement(By.xpath(element.getProperties("search_result_index1_phoneNumber")));
		System.out.println("ele_search_result_index1_phoneNumber: " + ele_search_result_index1_phoneNumber.getText());
		Assert.assertTrue(ele_search_result_index1_phoneNumber.getText().equals(PhoneNumber));
		Thread.sleep(100);
	}

	public void validateSearchResultIndex1Email(String Email) throws IOException, InterruptedException {
		WebElement ele_search_result_index1_Email = driver
				.findElement(By.xpath(element.getProperties("search_result_index1_Email")));
		System.out.println("ele_search_result_index1_Email: " + ele_search_result_index1_Email.getText());
		Assert.assertTrue(ele_search_result_index1_Email.getText().equals(Email));
		Thread.sleep(100);
	}

	public void validateSearchResultIndex1DOB(String DOB) throws IOException, InterruptedException {
		WebElement ele_search_result_index1_DOB = driver
				.findElement(By.xpath(element.getProperties("search_result_index1_DOB")));
		System.out.println("ele_search_result_index1_DOB: " + ele_search_result_index1_DOB.getText());

		// String value= ele_search_result_index1_DOB.getText();
		String dOBLast4Digits = String.valueOf(DOB).substring(0, 4);
		System.out.println("dOBLast4Digits are: " + dOBLast4Digits);
		Assert.assertTrue(ele_search_result_index1_DOB.getText().contains(dOBLast4Digits));
		Thread.sleep(200);
	}

	public void clickOnSearchresultColumnIndex1() throws IOException, InterruptedException {
		WebElement ele_search_result_column_index1 = driver
				.findElement(By.xpath(element.getProperties("search_result_column_index1")));
		ele_search_result_column_index1.click();
		Thread.sleep(100);
	}

	public void selectDesiredVerificationMethod(String verificationMethod) throws IOException, InterruptedException {
		// verificationMethod can either be- Knowledge Based verification, Multi-Fator Authentication
		// Authentication
		System.out.println("Searching for customerGroup: " + verificationMethod);
		WebElement ele_verificationMethod = driver
				.findElement(By.xpath(element.getProperties("verify_customers_verification_method")));
		Select customer_group_dropdown = new Select(ele_verificationMethod);
		customer_group_dropdown.selectByVisibleText(verificationMethod);
		System.out.println("customerGroup: " + verificationMethod + " has been selected");
		Thread.sleep(100);
	}

	public void clickOnVerificationCheckBox(String verificationCheckText) throws IOException, InterruptedException {
		// Last 4 digits of SSN : *****9862
		// Mother's Maiden Name :
		// Date of Birth : 06/29/2000
		// Telephone Number : 1793547528
		// Email Address : ariellebuckridge@becker.com
		// Other
		if (verificationCheckText.equals("Last_4_digits_of_SSN")) {
			WebElement ele_Last_4_digits_of_SSN = driver
					.findElement(By.xpath(element.getProperties("verification_method_checkbox_index1")));
			ele_Last_4_digits_of_SSN.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Last_4_digits_of_SSN.isSelected());
			Thread.sleep(500);
		} else if (verificationCheckText.equals("Mother_Maiden_Name")) {
			WebElement ele_Mother_Maiden_Name = driver
					.findElement(By.xpath(element.getProperties("verification_method_checkbox_index2")));
			ele_Mother_Maiden_Name.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Mother_Maiden_Name.isSelected());
			Thread.sleep(500);
		} else if (verificationCheckText.equals("Date_of_Birth")) {
			WebElement ele_Date_of_Birth = driver
					.findElement(By.xpath(element.getProperties("verification_method_checkbox_index3")));
			ele_Date_of_Birth.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Date_of_Birth.isSelected());
			Thread.sleep(500);
		} else if (verificationCheckText.equals("Telephone_Number")) {
			WebElement ele_Telephone_Number = driver
					.findElement(By.xpath(element.getProperties("verification_method_checkbox_index4")));
			ele_Telephone_Number.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Telephone_Number.isSelected());
			Thread.sleep(500);
		} else if (verificationCheckText.equals("Email_Address")) {
			WebElement ele_Email_Address = driver
					.findElement(By.xpath(element.getProperties("verification_method_checkbox_index5")));
			ele_Email_Address.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Email_Address.isSelected());
			Thread.sleep(500);
		} else if (verificationCheckText.equals("Other")) {
			WebElement ele_Other = driver
					.findElement(By.xpath(element.getProperties("verification_method_checkbox_index6")));
			ele_Other.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Other.isSelected());
			Thread.sleep(500);
			enterNotesInNotesSection();
			Thread.sleep(500);
		}
	}

	public void clickOnVerifiedWithQuestionButtonAndVerifyLandingPage() throws IOException, InterruptedException {
		WebElement ele_verified_with_question_button = driver
				.findElement(By.xpath(element.getProperties("verified_with_question_button")));
		Assert.assertTrue(ele_verified_with_question_button.isEnabled());
		ele_verified_with_question_button.click();
		System.out.println("Customer page loading.....");
		Thread.sleep(20000);
		WebElement ele_landing_page_profile_picture = driver
				.findElement(By.xpath(element.getProperties("landing_page_profile_picture")));
		Assert.assertTrue(ele_landing_page_profile_picture.isDisplayed());
	}

	public void clickOnCustomerPageTaskButton() throws IOException, InterruptedException {
		WebElement ele_customer_page_task_button = driver
				.findElement(By.xpath(element.getProperties("customer_page_task_button")));
		ele_customer_page_task_button.click();
	}

	public void clickOnCustomerSearchRow1() throws IOException, InterruptedException {
		WebElement ele_customer_search_result_row1 = driver
				.findElement(By.xpath(element.getProperties("verify_index1_lastname")));
		ele_customer_search_result_row1.click();
	}

	public void clickOnCustomerTaskListButtonByButtonTextAndVerifyLandingPage(String text)
			throws IOException, InterruptedException {
		// text parameter: Add Address, Add Customer Card, Add Customer Complaint, Add
		// Customer Contact Event,Add Customer Document,
		// Add Customer Note, Add Customer Service Case, Add Email, Add Phone,Add
		// Related Party Group, Add Restriction,
		// Request Cashier's Check, Change Group, Invite Customer, Send Freeform
		// Notification, Verify Consumer.
		if (text.equals("Add Address")) {
			WebElement ele_customer_task_list_add_address_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_address_button")));
			ele_customer_task_list_add_address_button.click();
			Thread.sleep(500);
			WebElement ele_verify_customer_task_list_add_address_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_add_address_page")));
			Assert.assertTrue(ele_verify_customer_task_list_add_address_page.getText().equals("Add Address"));
		} else if (text.equals("Add Customer Card")) {
			WebElement ele_customer_task_list_add_customer_card_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_customer_card_button")));
			ele_customer_task_list_add_customer_card_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_customer_card_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_add_customer_card_page")));
			Assert.assertTrue(
					ele_verify_customer_task_list_add_customer_card_page.getText().equals("Add Customer Card"));
		} else if (text.equals("Add Customer Complaint")) {
			WebElement ele_customer_task_list_add_customer_complaint_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_customer_complaint_button")));
			ele_customer_task_list_add_customer_complaint_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_customer_complaint_page = driver.findElement(
					By.xpath(element.getProperties("verify_customer_task_list_add_customer_complaint_page")));
			Assert.assertTrue(
					ele_verify_customer_task_list_add_customer_complaint_page.getText().equals("Add Complaint"));
		} else if (text.equals("Add Customer Contact Event")) {
			WebElement ele_customer_task_list_add_customer_contact_event_button = driver.findElement(
					By.xpath(element.getProperties("customer_task_list_add_customer_contact_event_button")));
			ele_customer_task_list_add_customer_contact_event_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_customer_contact_event_page = driver.findElement(
					By.xpath(element.getProperties("verify_customer_task_list_add_customer_contact_event_page")));
			Assert.assertTrue(ele_verify_customer_task_list_add_customer_contact_event_page.getText()
					.equals("Add Customer Contact Event"));
		} else if (text.equals("Add Customer Document")) {
			WebElement ele_customer_task_list_add_customer_document_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_customer_document_button")));
			ele_customer_task_list_add_customer_document_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_customer_document_page = driver.findElement(
					By.xpath(element.getProperties("verify_customer_task_list_add_customer_document_page")));
			Assert.assertTrue(
					ele_verify_customer_task_list_add_customer_document_page.getText().equals("Add Document"));
		} else if (text.equals("Add Customer Note")) {
			WebElement ele_customer_task_list_add_customer_note_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_customer_note_button")));
			ele_customer_task_list_add_customer_note_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_customer_note_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_add_customer_note_page")));
			Assert.assertTrue(
					ele_verify_customer_task_list_add_customer_note_page.getText().equals("Add Customer Note"));
		} else if (text.equals("Add Customer Service Case")) {
			WebElement ele_customer_task_list_add_customer_service_case_button = driver.findElement(
					By.xpath(element.getProperties("customer_task_list_add_customer_service_case_button")));
			ele_customer_task_list_add_customer_service_case_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_customer_service_case_page = driver.findElement(
					By.xpath(element.getProperties("verify_customer_task_list_add_customer_service_case_page")));
			Assert.assertTrue(ele_verify_customer_task_list_add_customer_service_case_page.getText()
					.equals("Add Customer Service Case"));
		} else if (text.equals("Add Email")) {
			WebElement ele_customer_task_list_add_email_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_email_button")));
			ele_customer_task_list_add_email_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_email_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_add_email_page")));
			Assert.assertTrue(ele_verify_customer_task_list_add_email_page.getText().equals("Add Email"));
		} else if (text.equals("Add Phone")) {
			WebElement ele_customer_task_list_add_phone_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_phone_button")));
			ele_customer_task_list_add_phone_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_phone_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_add_phone_page")));
			Assert.assertTrue(ele_verify_customer_task_list_add_phone_page.getText().equals("Add Phone"));
		} else if (text.equals("Add Related Party Group")) {
			WebElement ele_customer_task_list_add_related_party_group_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_related_party_group_button")));
			ele_customer_task_list_add_related_party_group_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_related_party_group_page = driver.findElement(
					By.xpath(element.getProperties("verify_customer_task_list_add_related_party_group_page")));
			Assert.assertTrue(ele_verify_customer_task_list_add_related_party_group_page.getText()
					.equals("Add Related Party Group"));
		} else if (text.equals("Add Restriction")) {
			WebElement ele_customer_task_list_add_restriction_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_add_restriction_button")));
			ele_customer_task_list_add_restriction_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_add_restriction_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_add_restriction_page")));
			Assert.assertTrue(ele_verify_customer_task_list_add_restriction_page.getText().equals("Add Restriction"));
		} else if (text.equals("Change Group")) {
			WebElement ele_customer_task_list_change_group_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_change_group_button")));
			ele_customer_task_list_change_group_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_change_group_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_change_group_page")));
			Assert.assertTrue(
					ele_verify_customer_task_list_change_group_page.getText().equals("Change Customer Group"));
		} else if (text.equals("Invite Customer")) {
			WebElement ele_customer_task_list_invite_customer_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_invite_customer_button")));
			ele_customer_task_list_invite_customer_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_invite_customer_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_invite_customer_page")));
			Assert.assertTrue(ele_verify_customer_task_list_invite_customer_page.getText().equals("Invite Customer"));
		} else if (text.equals("Request Cashier's Check")) {
			WebElement ele_customer_task_list_request_cashiers_check_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_request_cashiers_check_button")));
			ele_customer_task_list_request_cashiers_check_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_request_cashiers_check_page = driver.findElement(
					By.xpath(element.getProperties("verify_customer_task_list_request_cashiers_check_page")));
			Assert.assertTrue(ele_verify_customer_task_list_request_cashiers_check_page.getText()
					.equals("Cashier's Check Request"));
		} else if (text.equals("Send Freeform Notification")) {
			WebElement ele_customer_task_list_send_freeform_notification_button = driver.findElement(
					By.xpath(element.getProperties("customer_task_list_send_freeform_notification_button")));
			ele_customer_task_list_send_freeform_notification_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_send_freeform_notification_page = driver.findElement(
					By.xpath(element.getProperties("verify_customer_task_list_send_freeform_notification_page")));
			Assert.assertTrue(ele_verify_customer_task_list_send_freeform_notification_page.getText()
					.equals("Send Freeform Notification"));
		} else if (text.equals("Verify Consumer")) {
			WebElement ele_customer_task_list_verify_customer_button = driver
					.findElement(By.xpath(element.getProperties("customer_task_list_verify_customer_button")));
			ele_customer_task_list_verify_customer_button.click();
			Thread.sleep(200);
			WebElement ele_verify_customer_task_list_verify_customer_page = driver
					.findElement(By.xpath(element.getProperties("verify_customer_task_list_verify_customer_page")));
			Assert.assertTrue(ele_verify_customer_task_list_verify_customer_page.getText().equals("Verify Consumers"));
		}

	}

	public void enterAddressLine1(String addressLine1) throws IOException, InterruptedException {
		WebElement ele_add_address_address_line1 = driver
				.findElement(By.xpath(element.getProperties("add_address_address_line1")));
		ele_add_address_address_line1.sendKeys(addressLine1);
		Thread.sleep(100);
	}

	public void enterCity(String city) throws IOException, InterruptedException {
		WebElement ele_add_address_city = driver
				.findElement(By.xpath(element.getProperties("add_address_city")));
		ele_add_address_city.sendKeys(city);
		Thread.sleep(100);
	}

	public void selectStateRegionByText(String stateRegionText) throws IOException, InterruptedException {
		WebElement ele_add_address_state_region = driver
				.findElement(By.xpath(element.getProperties("add_address_state_region")));
		Select address_state_region_dropdown = new Select(ele_add_address_state_region);
		address_state_region_dropdown.selectByVisibleText(stateRegionText);
		Thread.sleep(100);
	}

	public void enterZipCode(String ZipCode) throws IOException, InterruptedException {
		WebElement ele_add_address_zipcode = driver
				.findElement(By.xpath(element.getProperties("add_address_zipcode")));
		ele_add_address_zipcode.sendKeys(ZipCode);
		Thread.sleep(100);
	}

	public void selectCountry(String Country) throws IOException, InterruptedException {
		WebElement ele_add_address_country = driver
				.findElement(By.xpath(element.getProperties("add_address_country")));
		Select country_dropdown = new Select(ele_add_address_country);
		country_dropdown.selectByVisibleText(Country);
		Thread.sleep(200);
	}
	
	public void clickAddAddressFieldSubmitButton() throws IOException, InterruptedException {
		WebElement ele_add_address_submit = driver
				.findElement(By.xpath(element.getProperties("add_address_submit")));
		ele_add_address_submit.click();
		Thread.sleep(200);
		
	}
	public void clickAddAddressFieldCancelButton() throws IOException, InterruptedException {
		WebElement ele_add_address_cancel = driver
				.findElement(By.xpath(element.getProperties("add_address_cancel")));
		ele_add_address_cancel.click();
		Thread.sleep(200);
		
	}
	
	public void verifyCustomerNewAddressCreatedSuccessfully() throws IOException, InterruptedException {
		WebElement ele_verify_customer_address_created = driver
				.findElement(By.xpath(element.getProperties("verify_customer_address_created")));
		ele_verify_customer_address_created.click();
		Assert.assertTrue(ele_verify_customer_address_created.isDisplayed());
		Thread.sleep(200);
	}

	public void changeCustomersAddress(String addressLine1, String city, String stateRegionText, String zipCode,
			String country) throws IOException, InterruptedException {
		enterAddressLine1(addressLine1);
		Thread.sleep(200);
		enterCity(city);
		Thread.sleep(200);
		selectStateRegionByText(stateRegionText);
		Thread.sleep(200);
		enterZipCode(zipCode);
		Thread.sleep(200);
		selectCountry(country);
		Thread.sleep(200);
		clickAddAddressFieldSubmitButton();
	}
	
	public void enterNotesInNotesSection() throws IOException, InterruptedException {
		WebElement ele_other_notes = driver
				.findElement(By.xpath(element.getProperties("other_notes")));
		ele_other_notes.sendKeys("This is PRIMIS Project");
		Thread.sleep(200);
		
	}
	
	public void clickOnSendCodeViaTextButton() throws IOException, InterruptedException {
		WebElement ele_send_code_via_text_button = driver
				.findElement(By.xpath(element.getProperties("send_code_via_text_button")));
		ele_send_code_via_text_button.click();
		Thread.sleep(200);
	}
	
	public void clickOnSendCodeViaEmailButton() throws IOException, InterruptedException {
		WebElement ele_send_code_via_email_button = driver
				.findElement(By.xpath(element.getProperties("send_code_via_email_button")));
		ele_send_code_via_email_button.click();
		Thread.sleep(200);
	}
	
	public void clickOnVerifiedWithCodeButtonAndVerifiedlandingPage() throws IOException, InterruptedException {
		WebElement ele_verified_with_code_button = driver
				.findElement(By.xpath(element.getProperties("verified_with_code_button")));
		ele_verified_with_code_button.click();
		Thread.sleep(15000);
		WebElement ele_landing_page_profile_picture = driver
				.findElement(By.xpath(element.getProperties("landing_page_profile_picture")));
		Assert.assertTrue(ele_landing_page_profile_picture.isDisplayed());
	}
	
	public void clickOnCustomeTaskAddEmailOption() throws IOException, InterruptedException {
		WebElement ele_add_email_option = driver
				.findElement(By.xpath(element.getProperties("add_email_option")));
		ele_add_email_option.click();
		Thread.sleep(200);
	}
	
	public void clickOnCustomeTaskAddPhoneOption() throws IOException, InterruptedException {
		WebElement ele_add_phone_option = driver
				.findElement(By.xpath(element.getProperties("add_phone_option")));
		ele_add_phone_option.click();
		Thread.sleep(200);
	}
	
	public void enterNewEmailAddress(String Email) throws IOException, InterruptedException {
		WebElement ele_enter_email_field = driver
				.findElement(By.xpath(element.getProperties("enter_email_field")));
		ele_enter_email_field.sendKeys(Email);
		Thread.sleep(200);
	}
	
	public void enterNewPhoneNumber(String Phone) throws IOException, InterruptedException {
		WebElement ele_enter_email_field = driver
				.findElement(By.xpath(element.getProperties("enter_phone_field")));
		ele_enter_email_field.sendKeys(Phone);
		Thread.sleep(200);
	}
	
	public void clickOnEmailAddressFieldSubmitButton() throws IOException, InterruptedException {
		WebElement ele_add_phone_option = driver
				.findElement(By.xpath(element.getProperties("update_email_submit_button")));
		ele_add_phone_option.click();
		Thread.sleep(200);
	}
	
	public void clickOnPhoneNumberFieldSubmitButton() throws IOException, InterruptedException {
		WebElement ele_add_phone_option = driver
				.findElement(By.xpath(element.getProperties("update_phone_submit_button")));
		ele_add_phone_option.click();
		Thread.sleep(200);
	}
	
	public void verifyCustomerEmailUpdateCreatedSuccessfully() throws IOException, InterruptedException {
		WebElement ele_validate_successful_email_update = driver
				.findElement(By.xpath(element.getProperties("validate_successful_email_update")));
		Assert.assertTrue(ele_validate_successful_email_update.isDisplayed());
		Thread.sleep(200);
	}
	
	public void verifyCustomerPhoneNumberUpdateCreatedSuccessfully() throws IOException, InterruptedException {
		WebElement ele_validate_successful_phone_update = driver
				.findElement(By.xpath(element.getProperties("validate_successful_phone_update")));
		Assert.assertTrue(ele_validate_successful_phone_update.isDisplayed());
		Thread.sleep(200);
	}
	
	public void clickOnCustomerTaskNotVerifiedButton() throws IOException, InterruptedException {
		WebElement ele_not_verified_button = driver
				.findElement(By.xpath(element.getProperties("not_verified_button")));
		ele_not_verified_button.click();
		Thread.sleep(200);
	}
	
	public void selectCustomerHomePageSubpages(String subPagesTexts) throws IOException, InterruptedException {
		// Overview
		// Accounts
		// Profile
		// Contact Details
		// Notes
		// Documents
		// More
		if (subPagesTexts.equals("Overview")) {
			WebElement ele_Customer_HomePage_Overview_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_HomePage_Overview_Button")));
			ele_Customer_HomePage_Overview_Button.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Customer_HomePage_Overview_Button.isSelected());
			Thread.sleep(500);
		} else if (subPagesTexts.equals("Accounts")) {
			WebElement ele_Customer_HomePage_Account_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_HomePage_Account_Button")));
			ele_Customer_HomePage_Account_Button.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Customer_HomePage_Account_Button.isSelected());
			Thread.sleep(500);
		} else if (subPagesTexts.equals("Profile")) {
			WebElement ele_Customer_HomePage_Profile_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_HomePage_Profile_Button")));
			ele_Customer_HomePage_Profile_Button.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Customer_HomePage_Profile_Button.isSelected());
			Thread.sleep(500);
		} else if (subPagesTexts.equals("Contact Details")) {
			WebElement ele_Customer_HomePage_ContactDetails_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_HomePage_ContactDetails_Button")));
			ele_Customer_HomePage_ContactDetails_Button.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Customer_HomePage_ContactDetails_Button.isSelected());
			Thread.sleep(500);
		} else if (subPagesTexts.equals("Notes")) {
			WebElement ele_Customer_HomePage_Notes_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_HomePage_Notes_Button")));
			ele_Customer_HomePage_Notes_Button.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Customer_HomePage_Notes_Button.isSelected());
			Thread.sleep(500);
		} else if (subPagesTexts.equals("Documents")) {
			WebElement ele_Customer_HomePage_Document_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_HomePage_Document_Button")));
			ele_Customer_HomePage_Document_Button.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Customer_HomePage_Document_Button.isSelected());
			Thread.sleep(500);
		}else if (subPagesTexts.equals("More")) {
			WebElement ele_Customer_HomePage_More_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_HomePage_More_Button")));
			ele_Customer_HomePage_More_Button.click();
			Thread.sleep(100);
			Assert.assertTrue(ele_Customer_HomePage_More_Button.isSelected());
			Thread.sleep(500);
		
		}
	}
	
}
