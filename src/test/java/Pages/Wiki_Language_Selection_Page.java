package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wiki_Language_Selection_Page {

	@FindBy(xpath = ".//*[@id='js-link-box-en']")
	WebElement english;

	public void clickOnEnglishLanguage() {
		english.click();
	}
}
