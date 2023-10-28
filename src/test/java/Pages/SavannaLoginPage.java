package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BaseUtil.PropertiesFile;
import BaseUtil.TestBase;


public class SavannaLoginPage extends TestBase {

	//WebDriver driver;
	private PropertiesFile element = new PropertiesFile();
	SavannaHomepageCustomerSearchPage savannaHomepageCustomerSearchPage;

	public SavannaLoginPage() {
		super(driver);
	}

	public String validateLoginPageTitle() throws IOException {
		String title= driver.getTitle();
		return title;	
	}
	
	public String validateCurrentPageUrl() throws IOException {
		String title= driver.getCurrentUrl();
		return title;	
	}
	
	public void enterUsername(String userName) throws IOException {
		WebElement ele_savanna_userName = driver
				.findElement(By.xpath(element.getProperties("savanna_userName")));
		ele_savanna_userName.sendKeys(userName);
	}

	public void enterPassword(String password) throws IOException {
		WebElement ele_savanna_password = driver
				.findElement(By.xpath(element.getProperties("savanna_password")));
		ele_savanna_password.sendKeys(password);
	}

	public void clickOnLoginButton() throws IOException, InterruptedException {
		WebElement ele_savanna_loginButton = driver
				.findElement(By.xpath(element.getProperties("savanna_loginButton")));
		ele_savanna_loginButton.click();
		Thread.sleep(100);
	}

}
