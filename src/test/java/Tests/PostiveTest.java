package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Wiki_Language_Selection_Page;
import Pages.Wiki_Main_Page;
import common.TestBase;

public class PostiveTest extends TestBase {

	@Parameters({"searchValue"})
	@Test
	public void searchWithValidTest( @Optional ("Capgemini")String searchValue) {
		Wiki_Language_Selection_Page wikiLanguageSelectionPage=PageFactory.initElements(driver, Wiki_Language_Selection_Page.class);
		wikiLanguageSelectionPage.clickOnEnglishLanguage();
		Wiki_Main_Page wikiMainPage=PageFactory.initElements(driver, Wiki_Main_Page.class);
		wikiMainPage.searchWithValue(searchValue);
		wikiMainPage.clickOnSearch();
		wikiMainPage.verifyValidSearch();
	}
	
}
