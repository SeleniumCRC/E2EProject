package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

	public static Logger log = LogManager.getLogger(LoginPageTest.class.getName());
	HomePage home;
	HomePageTest homeTest;
	LoginPage login;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		initialiseDriver();
		login = new LoginPage();
		home = new HomePage();
		homeTest = new HomePageTest();
		log.info("Initialization of driver done");
		homeTest.navigateToLoginPageTC5();
		log.info("Login page is loaded successfully");

	}
	@Test
	public void ValidateLogin()
	{
		System.out.println("in login methods");
		login.getEmail().sendKeys("b@gmail.com");
		login.getPassword().sendKeys("abc12345");
		login.getRememberMeCheckbox().click();
		login.getLogin().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@AfterMethod
	public void tearDown() {
		driver.close();

		log.info("Broswer window is clode. Driver closed");
	}

}
