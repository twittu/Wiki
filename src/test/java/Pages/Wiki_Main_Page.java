package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wiki_Main_Page {

	@FindBy(xpath = ".//*[@id='searchInput']")
	WebElement search;

	@FindBy(xpath = ".//*[@id='searchButton']")
	WebElement goSubmit;

	@FindBy(xpath = ".//*[@id='firstHeading']")
	WebElement capgeminiText;

	@FindBy(xpath = ".//*[@id='mw-content-text']/div/p[1]/i/a[1]")
	WebElement textDoesNotExist;

	//.//*[@id='mp-tfa-h2']/span[2]
	@FindBy(xpath = ".//*[contains(text(),\"From today's featured article\")]")
	WebElement fromTodayFeaturedArticle;

	@FindBy(xpath = ".//*[@id='On_this_day...']")
	WebElement onThisDay;

	@FindBy(xpath = ".//*[@id='Did_you_know...']")
	WebElement didYouKnow;

	@FindBy(xpath = ".//*[@id='In_the_news']")
	WebElement inTheNews;

	public void searchWithValue(String searchValue) {
		search.sendKeys(searchValue);
	}

	public void clickOnSearch() {
		goSubmit.click();
	}

	public void verifyValidSearch() {
		if (capgeminiText.isDisplayed()) {
			System.out.println("Validate Capgemini");
		} else {
			System.out.println("Invalidate Capgemin");
		}
	}

	public void verifyInValidSearch() {
		if (textDoesNotExist.isDisplayed()) {
			System.out.println("Search Invalid ");
		} else {
			System.out.println("Search Valid");
		}
	}
	public void verifySectionsInMainPage() {
		if (fromTodayFeaturedArticle.isDisplayed()) {
			System.out.println("FromTodayFeaturedArticle is Displayed");
		} else {
			System.out.println("FromTodayFeaturedArticle is not Displayed");
		}
		if (onThisDay.isDisplayed()) {
			System.out.println("onThisDay is Displayed");
		} else {
			System.out.println("onThisDay is not Displayed");
		}
		if (didYouKnow.isDisplayed()) {
			System.out.println("didYouKnow is Displayed");
		} else {
			System.out.println("didYouKnow is not Displayed");
		}if (inTheNews.isDisplayed()) {
			System.out.println("inTheNews is Displayed");
		} else {
			System.out.println("inTheNews is not Displayed");
		}
	}

}
