package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePageFlightsPage extends TestBase {

	@FindBy(xpath = "//*[@class='menu-horizontal-wrapper-02']//li[2]/a")
	private WebElement flightsHeaderButton;

	public HomePageFlightsPage() {

		PageFactory.initElements(driver, this);
	}

	public WebElement getFlightsHeaderButton() {
		return flightsHeaderButton;
	}

}
