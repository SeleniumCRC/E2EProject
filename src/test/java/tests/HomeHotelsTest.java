package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomeHotelsPage;

public class HomeHotelsTest extends TestBase {

	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());

	HomeHotelsPage homeHotel;
	TestBase b = new TestBase();

	public HomeHotelsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		initialiseDriver();
		homeHotel = new HomeHotelsPage();
		log.info("Initialization of driver done");

	}

	@Test
	public void navigateHomeHotelUiTC1() {
		homeHotel.getHotelsHeaderButton().click();
		System.out.println("On Home hotels page ");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();

		log.info("Broswer window is clode. Driver closed");
	}

}
