package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	@FindBy(xpath ="//*[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")
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
	
	
}
