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

public class SavannaCustomerAccountPage extends TestBase {

	// WebDriver driver=null;
	private PropertiesFile element = new PropertiesFile();

	public SavannaCustomerAccountPage() {
		super(driver);
	}

	public void verifyCustomerAccountNumberCountIsTwoOrMore() throws IOException, InterruptedException {
		WebElement ele_Customer_Account_Number_Index1 = driver
				.findElement(By.xpath(element.getProperties("Customer_Account_Number_Index1")));
		WebElement ele_Customer_Account_Number_Index2 = driver
				.findElement(By.xpath(element.getProperties("Customer_Account_Number_Index2")));
		Assert.assertTrue(ele_Customer_Account_Number_Index1.isDisplayed());
		Assert.assertTrue(ele_Customer_Account_Number_Index2.isDisplayed());
		Thread.sleep(100);
	}

	public void clickCustomerAccountNumberCountIndex(int index) throws IOException, InterruptedException {
		// Valid for only index 1 and 2
		if (index == 1) {
			WebElement ele_Customer_Account_Number_Index1 = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Number_Index1")));
			ele_Customer_Account_Number_Index1.click();
			Thread.sleep(8000);
		} else if (index == 2) {
			WebElement ele_Customer_Account_Number_Index2 = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Number_Index2")));
			ele_Customer_Account_Number_Index2.click();
			Thread.sleep(8000);
		}
		WebElement ele_Account_Number_individual_page = driver
				.findElement(By.xpath(element.getProperties("Account_Number_individual_page")));
		Assert.assertTrue(ele_Account_Number_individual_page.isDisplayed());
	}

	public void clickCustomerAccountTaskListButton() throws IOException, InterruptedException {
		WebElement ele_Customer_Account_Page_Task_Button = driver
				.findElement(By.xpath(element.getProperties("Customer_Account_Page_Task_Button")));
		ele_Customer_Account_Page_Task_Button.click();
		Thread.sleep(1000);
		WebElement ele_Customer_Account_Task_List_Header = driver
				.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Header")));
		String TaskListHeader = ele_Customer_Account_Task_List_Header.getText();
		Assert.assertTrue(ele_Customer_Account_Task_List_Header.isDisplayed());
		Assert.assertTrue(TaskListHeader.equals("Account Task List"));

	}

	public void selectAndClickAccountTaskListDesiredContent(String accountTaskListContentText)
			throws IOException, InterruptedException {
		//Add Account Cards //Add Electronic Acceptance //Request Account Cashier's Check
		//Add Account Complaints //Add Hold //Set Up Overdraft Linkage
		//Add Order //Add New Check Series
		//Add Account Contact Event //Add Order
		//Add Account Document //Add Related Party
		//Add Account Limits //Add Stop
		//Add Account Note //Close Account
		//Add Account Restriction //Disburse Interest
		//Add Account Service Case //Originate Outgoing Wire
		//Add Dispute Without Existing Transaction //Post a Transaction
		if (accountTaskListContentText.equals("Add Account Cards")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Card_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Card_Button")));
			ele_Customer_Account_Task_List_Add_Account_Card_Button.click();
		} else if (accountTaskListContentText.equals("Add Account Complaints")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Conplaints_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Conplaints_Button")));
			ele_Customer_Account_Task_List_Add_Account_Conplaints_Button.click();
		}else if (accountTaskListContentText.equals("Add Account Contact Event")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Contact_Event_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Contact_Event_Button")));
			ele_Customer_Account_Task_List_Add_Account_Contact_Event_Button.click();
		}else if (accountTaskListContentText.equals("Add Account Document")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Document_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Document_Button")));
			ele_Customer_Account_Task_List_Add_Account_Document_Button.click();
		}else if (accountTaskListContentText.equals("Add Account Limits")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Limit_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Limit_Button")));
			ele_Customer_Account_Task_List_Add_Account_Limit_Button.click();
		}else if (accountTaskListContentText.equals("Add Account Note")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Notes_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Notes_Button")));
			ele_Customer_Account_Task_List_Add_Account_Notes_Button.click();
		}else if (accountTaskListContentText.equals("Add Account Restriction")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Restriction_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Restriction_Button")));
			ele_Customer_Account_Task_List_Add_Account_Restriction_Button.click();
		}else if (accountTaskListContentText.equals("Add Account Service Case")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Service_Case_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Service_Case_Button")));
			ele_Customer_Account_Task_List_Add_Account_Service_Case_Button.click();
		}else if (accountTaskListContentText.equals("Add Dispute Without Existing Transaction")) {
			WebElement ele_Customer_Account_Task_List_Add_Account_Dispute_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Account_Dispute_Button")));
			ele_Customer_Account_Task_List_Add_Account_Dispute_Button.click();
		}else if (accountTaskListContentText.equals("Add Electronic Acceptance")) {
			WebElement ele_Customer_Account_Task_List_Add_Electronic_Acceptance_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Electronic_Acceptance_Button")));
			ele_Customer_Account_Task_List_Add_Electronic_Acceptance_Button.click();
		}else if (accountTaskListContentText.equals("Add Hold")) {
			WebElement ele_Customer_Account_Task_List_Add_Hold_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Hold_Button")));
			ele_Customer_Account_Task_List_Add_Hold_Button.click();
		}else if (accountTaskListContentText.equals("Add New Check Series")) {
			WebElement ele_Customer_Account_Task_List_Add_New_Check_Series_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_New_Check_Series_Button")));
			ele_Customer_Account_Task_List_Add_New_Check_Series_Button.click();
		}else if (accountTaskListContentText.equals("Add Order")) {
			WebElement ele_Customer_Account_Task_List_Add_Order_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Order_Button")));
			ele_Customer_Account_Task_List_Add_Order_Button.click();
		}else if (accountTaskListContentText.equals("Add Related Party")) {
			WebElement ele_Customer_Account_Task_List_Add_Related_Party_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Related_Party_Button")));
			ele_Customer_Account_Task_List_Add_Related_Party_Button.click();
		}else if (accountTaskListContentText.equals("Add Stop")) {
			WebElement ele_Customer_Account_Task_List_Add_Stop_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Add_Stop_Button")));
			ele_Customer_Account_Task_List_Add_Stop_Button.click();
		}else if (accountTaskListContentText.equals("Close Account")) {
			WebElement ele_Customer_Account_Task_List_Close_Account_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Close_Account_Button")));
			ele_Customer_Account_Task_List_Close_Account_Button.click();
		}else if (accountTaskListContentText.equals("Disburse Interest")) {
			WebElement ele_Customer_Account_Task_List_Disburse_Interest_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Disburse_Interest_Button")));
			ele_Customer_Account_Task_List_Disburse_Interest_Button.click();
		}else if (accountTaskListContentText.equals("Originate Outgoing Wire")) {
			WebElement ele_Customer_Account_Task_List_Originate_Outgoing_Wire_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Originate_Outgoing_Wire_Button")));
			ele_Customer_Account_Task_List_Originate_Outgoing_Wire_Button.click();
		}else if (accountTaskListContentText.equals("Post a Transaction")) {
			WebElement ele_Customer_Account_Task_List_Post_A_Transaction_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Post_A_Transaction_Button")));
			ele_Customer_Account_Task_List_Post_A_Transaction_Button.click();
		}else if (accountTaskListContentText.equals("Request Account Cashier's Check")) {
			WebElement ele_Customer_Account_Task_List_Request_Account_Transfer_check_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_Request_Account_Transfer_check_Button")));
			ele_Customer_Account_Task_List_Request_Account_Transfer_check_Button.click();
		}else if (accountTaskListContentText.equals("Set Up Overdraft Linkage")) {
			WebElement ele_Customer_Account_Task_List_SetUp_Overdraft_Linkage_Button = driver
					.findElement(By.xpath(element.getProperties("Customer_Account_Task_List_SetUp_Overdraft_Linkage_Button")));
			ele_Customer_Account_Task_List_SetUp_Overdraft_Linkage_Button.click();
		}
	}
}
