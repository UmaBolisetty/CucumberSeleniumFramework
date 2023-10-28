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

public class CommonSteps extends TestBase {

	public CommonSteps() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	SavannaLoginPage loginpage = new SavannaLoginPage();
	SavannaHomepageCustomerSearchPage savannaHomepageCustomerSearchPage = new SavannaHomepageCustomerSearchPage();

	
}
