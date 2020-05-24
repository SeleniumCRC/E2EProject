package utils;

import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class UtilMethods extends TestBase {
	
	public WebDriverWait getExplicitelyWait() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait;
	
	}
	


	}
	