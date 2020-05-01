package tests;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	@Test
	public void fillDetailsTC2() {
		homeHotel.getHotelsDestination().click();
		homeHotel.getHotelsDestination().sendKeys("ind");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfAllElements(homeHotel.getDropElements()));
		
		homeHotel.getHotelsDestination().sendKeys(Keys.DOWN);
		homeHotel.getHotelsDestination().sendKeys(Keys.DOWN);
		homeHotel.getHotelsDestination().sendKeys(Keys.ENTER);
		
		System.out.println("destination");
		//Select check in date
		homeHotel.getHotelsCheckIn().click();
		//month
		
		//day
		List<WebElement> dates =driver.findElements(By.xpath("//*[@class='datepicker--cell datepicker--cell-day']"));
		int count = dates.size();
		System.out.println(count);
		driver.findElements(By.xpath("//*[contains(text(),'datepicker--cell datepicker--cell-day')])"));
		
		for(int i=0;i<count;i++)
		{
		String text=dates.get(i).getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("27"))
		{
		dates.get(i).click();
		break;
		}

		}
			
	}
	@AfterMethod
	public void tearDown() {
		driver.close();

		log.info("Broswer window is clode. Driver closed");
	}

}
