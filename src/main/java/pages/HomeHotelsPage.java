package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomeHotelsPage extends TestBase{
	public WebDriver driver;
	@FindBy(xpath = "//*[@class='menu-horizontal-wrapper-02']//li[1]/a")
	private WebElement hotelsHeaderButton;
	
	@FindBy(xpath = "//*[@id='s2id_autogen1']//a")
	private WebElement hotelsDestination;

	@FindBy(xpath = "//*[@id='airDatepickerRange-hotel']//*[@id='checkin']")
	private WebElement hotelsCheckIn;
	
	@FindBy(xpath = "//*[@id='airDatepickerRange-hotel']//*[@id='checkout']")
	private WebElement hotelsCheckOut;
	
	@FindBys(@FindBy(xpath="//*[@class='select2-result-sub']//li"))
	private List<WebElement> dropElements; 
	
	@FindBy(xpath = "//*[@id='datepickers-container']//div[1]//nav//div[2]")
	private WebElement middle;
	
	@FindBy(xpath = "//*[@id='datepickers-container']/child::div[1]/nav/child::div[@data-action='next']")
	private WebElement next;
	
	@FindBy(xpath = "//*[@id='datepickers-container']/child::div[1]/nav/child::div[@data-action='prev']")
	private WebElement prev;
	
	@FindBy(xpath = "//*[@id='datepickers-container']/child::div[2]/nav/child::div[2]")
	private WebElement checkoutMiddle;
	
	@FindBy(xpath = "//*[@id='datepickers-container']/child::div[2]/nav/child::div[@data-action='prev']")
	private WebElement checkoutPrev;
	
	@FindBy(xpath = "//*[@id='datepickers-container']/child::div[2]/nav/child::div[@data-action='next']")
	private WebElement checkoutNext;
	
	@FindBy(xpath ="//div[contains(@class,'col o2')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
	private WebElement adultsSelection;
	
	//driver.findElements(By.xpath("//*[@class='select2-result-sub']//li"));
	
	public HomeHotelsPage(WebDriver driver) {
		this.driver = driver;
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

	public List<WebElement> getDropElements() {
		return dropElements;
	}

	public WebElement getMiddle() {
		return middle;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getPrev() {
		return prev;
	}

	public WebElement getCheckoutMiddle() {
		return checkoutMiddle;
	}

	public WebElement getCheckoutPrev() {
		return checkoutPrev;
	}

	public WebElement getCheckoutNext() {
		return checkoutNext;
	}
	
	public WebElement getAdultsSelection() {
		return adultsSelection;
	}
}
	