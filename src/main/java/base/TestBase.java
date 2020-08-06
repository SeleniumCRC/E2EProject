package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class TestBase {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	static String userDir = System.getProperty("user.dir");

	public WebDriver initialiseDriver() throws IOException {

		FileInputStream ip = new FileInputStream(userDir + "\\src\\main\\java\\Data\\Config.properties");
		Properties prop = new Properties();
		prop.load(ip);
		log.debug(" Cofiguration file loaded");
		// String browserName =System.getProperty("browser");
	 
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		log.debug("Property value got successfully Name : broswer ");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", userDir + "\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Chrome browser lauched suceessfully");

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", userDir + "\\src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.info(" Firefox lauched suceessfully");
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", userDir + "\\src\\main\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info(" IE lauched suceessfully");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		log.debug(" Implicit wait applied suceessfully");
		// driver.manage().window().maximize();
		String url = prop.getProperty("url");
		log.debug("Property value got successfully Name : url");
		driver.get(url);
		driver.manage().window().fullscreen();
		log.info("Browser window opened in full screen mode");
		log.info(" Url launched suceessfully");
		return driver;
	}

	public String takeScreenshot(String testCaseName, WebDriver driver) throws IOException {
		log.debug("In Screen shot taking method");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String des = userDir + "\\screenShots\\" + testCaseName + ".png";
		FileUtils.copyFile(src, new File(des));
		log.info("screen shot copied to desstination location");
	    return des;
	}
}
