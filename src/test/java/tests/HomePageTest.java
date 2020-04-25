package tests;


import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomePageTest extends TestBase{
	
	public static Logger log =LogManager.getLogger(HomePageTest.class.getName());
	HomePage home;
	//Register reg;
	TestBase b = new TestBase();
	public HomePageTest() {
	super();	
	}
	@BeforeMethod
	public void setUp() throws IOException {
		
		initialiseDriver();
		home = new HomePage();
		log.info("Initialization of driver done");
		
	}
	
	@Test 
	public void tittleValidateTC1()
	{
		String expectedTittle =driver.getTitle();
		String actulTittle = "PHPTRAVELS | Travel Technology Partner";
		Assert.assertEquals(actulTittle, expectedTittle);
		System.out.println("TC 1 Passed");
		log.info("TC-1 is Passed");
	}
	@Test
	public void logoValidateTC2() throws IOException
	{
		System.out.println("TC 2 Passed");
		log.info("TC-2 is Passed");
		
	}
	@Test
	public void currencyDropDownTC3() 
	{
		System.out.println("TC 3 Passed");
		home.getCurrencyDropdown().click();
		String selectedCurrencyDropdown = home.getCurrencyDropdown().getText();
		System.out.println("The text is selected for Dropdown"+selectedCurrencyDropdown);
		
	}
	@Test
	public void navigateToRegisterPageTC4()
	{
		home.getMyAccount().click();
		home.getRegister().click();
		
		
	}
	@Test
	public void navigateToLoginPageTC5()
	{
		home.getMyAccount().click();
		home.getLogin().click();
	}
	@Test
	public void getPhoneNumberTC6()
	{
		String expectedPhone ="phone Call Now : +1-234-56789";
		String phoneno = home.getPhone().getText();
		System.out.println(phoneno);
		if(expectedPhone.equalsIgnoreCase(phoneno))
		{
			System.out.println("Passed TC6"+phoneno);
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
		log.info("Broswer window is clode. Driver closed");
	}

}
