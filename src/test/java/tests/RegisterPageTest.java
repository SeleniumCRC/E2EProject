package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterPageTest extends TestBase {

	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());
	HomePage home;
	HomePageTest homeTest;
	RegisterPage reg;
	TestBase b = new TestBase();

	public RegisterPageTest() {
	super();	
	}

	@BeforeMethod
	public void setUp() throws IOException {

		initialiseDriver();
		reg = new RegisterPage();
		home = new HomePage();
		homeTest = new HomePageTest();
		log.info("Initialization of driver done");
		

	}
	@Test
	public void registerCustomer() throws InterruptedException
	{
		
		homeTest.navigateToRegisterPageTC4();
		reg.registerCustomer("Ch", "chend", "1201201202", "c@gmail.com", "abc12345", "abc12345");	
		System.out.println("Done with reg");
		
		String url =driver.getCurrentUrl();
		String tittle =driver.getTitle();
		System.out.println(url+"     "+tittle);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();

		log.info("Broswer window is clode. Driver closed");
	}

}
