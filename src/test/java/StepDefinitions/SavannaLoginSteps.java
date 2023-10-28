package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseUtil.TestBase;
import Pages.SavannaLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SavannaLoginSteps extends TestBase {

	public SavannaLoginSteps() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//WebDriver driver;
	SavannaLoginPage loginpage = new SavannaLoginPage();
	
	@Before()
	public void setWebDriver() throws Exception {
		System.out.println("initialization driver and launching url");
		TestBase.initialization();
	}
	
	@After()
	public void closeBrowser() throws Exception {
		System.out.println("Closing all Browser");
		TestBase.tearDown();
	}
	
	
	@SuppressWarnings("deprecation")
	@Given("^I am on savanna website$")
	public void i_am_on_savanna_website() throws InterruptedException, IOException {
		String UrlToVerify= "https://inte-smt.savanainc.com/nGageBanking/Login.aspx";
		Assert.assertTrue(loginpage.validateCurrentPageUrl().equals(UrlToVerify));
	}

	@When("^I enter (.*) and (.*)$")
	public void i_enter_userName_and_password(String u, String p) throws InterruptedException, IOException {
		System.out.println("I am entering username and password");
		loginpage.enterUsername(u);
		Thread.sleep(100);
		loginpage.enterPassword(p);
		Thread.sleep(100);
	}

	@When("^I click on SLP login button$")
	public void i_click_on_login_button() throws InterruptedException, IOException {
		System.out.println("I am clicking on login button");
		loginpage.clickOnLoginButton();
		Thread.sleep(100);
	}

	@SuppressWarnings("deprecation")
	@Then("^I should be on savanna home page$")
	public void i_should_be_on_savanna_home_page() throws IOException, InterruptedException {
		String UrlToVerify= "https://inte-smt.savanainc.com/nGageBanking_Customer/CustomerSearch.aspx";
		Assert.assertTrue(loginpage.validateCurrentPageUrl().equals(UrlToVerify));
	}
	
}
