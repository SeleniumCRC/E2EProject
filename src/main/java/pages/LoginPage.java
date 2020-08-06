package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage	extends TestBase{
		public WebDriver driver;
		@FindBy(name="username")
		private WebElement email;
		

		@FindBy(name="password")
		private WebElement password;
		
		@FindBy(xpath="//*[@class ='custom-control-label']")
		private WebElement rememberMeCheckbox;
		
		@FindBy(xpath="//*[@class='btn btn-primary btn-lg btn-block loginbtn']")
		private WebElement login;
		
		@FindBy(xpath="//*[@class='btn btn-success br25 btn-block form-group']")
		private WebElement signUp;
		
		@FindBy(xpath="//*[@class='btn btn-warning br25 btn-block']")
		private WebElement forgotPassword;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getRememberMeCheckbox() {
			return rememberMeCheckbox;
		}

		public WebElement getLogin() {
			return login;
		}

		public WebElement getSignUp() {
			return signUp;
		}

		public WebElement getForgotPassword() {
			return forgotPassword;
		}
		

}
