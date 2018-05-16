package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import junit.framework.Assert;

public class TestBase {

	public WebDriver driver=null;
	@BeforeTest
	public void browserIntiate() {
		String projectPath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",projectPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org");
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
