package Login_page;

import Browser.Browser_launch;
import Locators.locatorslogin;

public class LoginPage extends Browser_launch{

	
	public static void pagelogin() {

		driver.findElement(locatorslogin.loginButton).click();
		driver.findElement(locatorslogin.username).sendKeys("prinres@mailinator.com");
		driver.findElement(locatorslogin.pasword).sendKeys("test@123");
		driver.findElement(locatorslogin.login).click();
	}

}
