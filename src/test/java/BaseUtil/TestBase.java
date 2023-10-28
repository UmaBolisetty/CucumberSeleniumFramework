package BaseUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	private static PropertiesFile project = new PropertiesFile();

	protected static WebDriver driver;

	public TestBase(WebDriver driver) {
		driver = TestBase.driver;
	}

	// @Before(order=0)
	public static void initialization() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (project.getProjectProperties("Project").equals("Savanna")) {
			driver.get("https://inte-smt.savanainc.com/nGageBanking/Login.aspx");
		} else if (project.getProjectProperties("Project").equals("Apiture")) {
			// Coming soon
			// driver.get("https://inte-smt.savanainc.com/nGageBanking/Login.aspx");
		}

	}

	// @After(order=0)
	public static void tearDown() throws InterruptedException {
		driver.quit();
	}

}
