package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomeHotelsPage extends TestBase{

	@FindBy(xpath = "//*[@class='menu-horizontal-wrapper-02']//li[1]/a")
	private WebElement hotelsHeaderButton;
	
		//*[@id="s2id_autogen1"]//a
	@FindBy(xpath = "//*[@id='s2id_autogen1']//a")
	private WebElement hotelsDestination;

	@FindBy(xpath = "//*[@id='airDatepickerRange-hotel']//*[@id='checkin']")
	private WebElement hotelsCheckIn;
	
	@FindBy(xpath = "//*[@id='airDatepickerRange-hotel']//*[@id='checkout']")
	private WebElement hotelsCheckOut;
	
	@FindBys(@FindBy(xpath="//*[@class='select2-result-sub']//li"))
	private List<WebElement> dropElements; 
	
	
	//driver.findElements(By.xpath("//*[@class='select2-result-sub']//li"));
	
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

	public List<WebElement> getDropElements() {
		return dropElements;
	}
	

}
	