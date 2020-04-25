package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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

	public static WebDriver driver;
	public static Logger log =LogManager.getLogger(TestBase.class.getName());
	public static void initialiseDriver() throws IOException {
		//Chrome
		FileInputStream ip = new FileInputStream("E:\\project\\E2EProject\\src\\main\\java\\Data\\Config.properties");
		Properties prop =new Properties();
		prop.load(ip);
		log.debug(" Cofiguration file loaded");
		
		//String browserName =System.getProperty("browser");
		String browserName = prop.getProperty("browser");
		 
		System.out.println(browserName);
		log.debug("Property value got successfully Namw : broswer ");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
			driver = new ChromeDriver();	
			log.info("Chrome lauched suceessfully");
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Material\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.info(" Firefox lauched suceessfully");
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\Selenium Material\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info(" IE lauched suceessfully");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		log.debug(" Implicit wait applied suceessfully");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url= prop.getProperty("url");
		log.debug("Property value got successfully Name : url");
		driver.get(url);
		log.info(" Url lauched suceessfully");
	}
	
	
	public void takeScreenshot(ITestResult result) throws IOException
	{
		System.out.println("in ss method");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\project\\E2EProject\\screenShots\\SS"+result.getName()+"-1.png");
		Files.copy(src,des);
		
	}
}
