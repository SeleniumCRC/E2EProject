package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomeHotelsPage extends TestBase {

	@FindBy(xpath = "//*[@class='menu-horizontal-wrapper-02']//li[1]/a")
	private WebElement hotelsHeaderButton;

	@FindBy(xpath = "//*[@id='s2id_autogen1']//a")
	private WebElement hotelsDestination;

	@FindBy(xpath = "//*[@id='airDatepickerRange-hotel']//*[@id='checkin']")
	private WebElement hotelsCheckIn;

	@FindBy(xpath = "//*[@id='airDatepickerRange-hotel']//*[@id='checkout']")
	private WebElement hotelsCheckOut;

	public HomeHotelsPage() {

		PageFactory.initElements(driver, this);
	}

	public WebElement getHotelsHeaderButton() {
		return hotelsHeaderButton;
	}

	public WebElement getHotelsDestination() {
		return hotelsDestination;
	}

	public WebElement getHotelsCheckIn() {
		return hotelsCheckIn;
	}

	public WebElement getHotelsCheckOut() {
		return hotelsCheckOut;
	}

}