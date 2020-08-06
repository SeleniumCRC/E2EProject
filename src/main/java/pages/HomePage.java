package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	public WebDriver driver;
	@FindBy(xpath = "//*[@class='mini-menu']//ul//li[1]")
	private WebElement currencyDropdown;

	@FindBys(@FindBy(xpath = "//*[@class='mini-menu']//ul//li"))
	private List<WebElement> headerElements;

	@FindBy(xpath = "//*[@class='mini-menu']//ul//li[3]")
	private WebElement myAccount;

	@FindBy(xpath = "//*[@class='mini-menu']//ul//li[3]//a[@class='dropdown-item active tr']")
	private WebElement login;

	
	@FindBy(xpath = "//*[@class='mini-menu']//ul//li[3]//a[@class='dropdown-item tr']")
	private WebElement register;

	
	@FindBy(xpath = "//*[@class='navbar-phone d-none d-lg-block o1']")
	private WebElement phone;
	
	public HomePage(WebDriver driver) {

		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCurrencyDropdown() {
		return currencyDropdown;

	}
	
	public WebElement getRegister() {
		return register;
	}

	public WebElement getLogin() {
		return login;
	}
	public List<WebElement> getHeaderElements() {
		return headerElements;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getPhone() {
		return phone;
	}

	
}
