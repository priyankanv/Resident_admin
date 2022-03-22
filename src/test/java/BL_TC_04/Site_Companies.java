package BL_TC_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser_launch;

public class Site_Companies extends Browser_launch {

	public static void sitecompanies() throws InterruptedException {
		
		//site companies
		Thread.sleep(4000);
		 driver.findElement(Locators.locators.sitecompanies).click();
		Thread.sleep(4000);
	
		java.util.List<WebElement> sitecompanies= driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-xl-5 row-cols-lg-4 row-cols-md-3 row-cols-sm-2 mt-3']"));
		for(WebElement AC:sitecompanies) {
		System.out.println(AC.getText());
		}
	}
}
