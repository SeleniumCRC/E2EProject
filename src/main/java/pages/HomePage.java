package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	

	@FindBy(xpath="//*[@class='mini-menu']//ul//li[1]")
	private WebElement currencyDropdown;

	@FindBys(@FindBy(xpath="//*[@class='mini-menu']//ul//li"))
	private List<WebElement> headerElements;
	
	 public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCurrencyDropdown() {
		return currencyDropdown;
		
	}

	

}
