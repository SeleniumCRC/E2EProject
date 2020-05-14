package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class RegisterPage extends TestBase{
	
	@FindBy(xpath ="//*[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath ="//*[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath ="//*[@name='phone']")
	private WebElement mobileNumber;
	
	@FindBy(xpath ="//*[@name='email']")
	private WebElement email;

	@FindBy(xpath ="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath ="//*[@name='confirmpassword']")
	private WebElement confirmPassword;

	@FindBy(xpath ="//*[@class='form-group']//button[@type='submit']")
	private WebElement  signUpButton;
	
	
	public RegisterPage() {

		PageFactory.initElements(driver, this);
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getMobileNumber() {
		return mobileNumber;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getConfirmPassword() {
		return confirmPassword;
	}


	public WebElement getSignUpButton() {
		return signUpButton;
	}
	
	public void registerCustomer(String fname, String lname, String mobNo, String Email,
			String pwd, String cpassword) throws InterruptedException
	{
		firstName.clear();
		firstName.sendKeys(fname);
		
		lastName.clear();
		lastName.sendKeys(lname);
		
		mobileNumber.clear();
		mobileNumber.sendKeys(mobNo);
		
		email.clear();
		email.sendKeys(Email);
		
		password.clear();
		password.sendKeys(pwd);
		
		confirmPassword.clear();
		confirmPassword.sendKeys(cpassword);
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(signUpButton));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", signUpButton);
		js.executeScript("window.scrollTo(" + signUpButton.getLocation().x + "," +signUpButton.getLocation().y + ");");
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+signUpButton.getLocation().y+")");
		//Actions action = new Actions(driver);
		//action.moveToElement(signUpButton).click().build().perform();
		//signUpButton.click();
		//boolean invisibale = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class ='wow fadeIn cc-window cc-banner cc-type-info cc-theme-block cc-color-override--1961008818 ']")));
		//if(invisibale)
		//{
			//signUpButton.click();	
		//}
		//signUpButton.click();
		//Thread.sleep(5000);
		
	}
	
}
