package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePageFlightsPage;

public class HomePageFlightsTest extends TestBase {

	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());

	HomePageFlightsPage homeFlight;
	TestBase b = new TestBase();

	public HomePageFlightsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		initialiseDriver();
		homeFlight = new HomePageFlightsPage();
		log.info("Initialization of driver done");

	}

	@Test
	public void navigateHomeFlightUiTC1() {
		homeFlight.getFlightsHeaderButton().click();
		System.out.println("On Home Flights page ");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();

		log.info("Broswer window is clode. Driver closed");
	}

}
