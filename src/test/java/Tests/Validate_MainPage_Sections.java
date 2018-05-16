package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import Pages.Wiki_Language_Selection_Page;
import Pages.Wiki_Main_Page;
import common.TestBase;

public class Validate_MainPage_Sections extends TestBase {
	@Test
	public void verifySectionsInMainPageTest() {
		Wiki_Language_Selection_Page wikiLanguageSelectionPage=PageFactory.initElements(driver, Wiki_Language_Selection_Page.class);
		wikiLanguageSelectionPage.clickOnEnglishLanguage();
		Wiki_Main_Page wikiMainPage=PageFactory.initElements(driver, Wiki_Main_Page.class);
		wikiMainPage.verifySectionsInMainPage();
		
	}
}
