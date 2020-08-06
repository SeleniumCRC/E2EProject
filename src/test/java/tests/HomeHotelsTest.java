package tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomeHotelsPage;
import utils.UtilMethods;

public class HomeHotelsTest extends TestBase {

	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	HomeHotelsPage homeHotel;
	UtilMethods util;
	public HomeHotelsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		driver = initialiseDriver();
		log.info("Initialization of driver done");
		homeHotel = new HomeHotelsPage(driver);
		log.info("Home Hotels page object is created");
		util =new UtilMethods();
		log.info("Utils object created");	
	}

	@Test
	public void navigateHomeHotelUiTC1() {
		homeHotel.getHotelsHeaderButton().click();
		log.debug("Navigation done on Home place");
	}

	@Test
	public void HotelSearch() throws InterruptedException {
		homeHotel.getHotelsDestination().click();
		homeHotel.getHotelsDestination().sendKeys("ind");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfAllElements(homeHotel.getDropElements()));
		homeHotel.getHotelsDestination().sendKeys(Keys.DOWN);
		homeHotel.getHotelsDestination().sendKeys(Keys.ENTER);
		String date = "05/12/2021";
		Thread.sleep(5000);
		homeHotel.getHotelsCheckIn().click();
		util.getDate(date, homeHotel.getMiddle(), homeHotel.getNext(), homeHotel.getPrev());
		String checkOutdate = "08/12/2021";
		Thread.sleep(5000);
		homeHotel.getHotelsCheckOut().click();
		util.getDate(checkOutdate, homeHotel.getCheckoutMiddle(), homeHotel.getCheckoutNext(), homeHotel.getCheckoutPrev());
		
		util.selectGenderCount(homeHotel.getAdultsSelection(), 2);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		log.info("Broswer window is clode. Driver closed");
	}

}
