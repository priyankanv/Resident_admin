package BL_TC_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser_launch;
import Locators.locators;

public class biolabs_site_staff extends Browser_launch {
	
	public static void ResidentStaff() throws InterruptedException {
		
		//Biolabs Site Staff
		Thread.sleep(4000);
		driver.findElement(locators.site_staff).click();
		Thread.sleep(4000);
		
		java.util.List<WebElement> biolabssitestaff= driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-xl-5 row-cols-lg-4 row-cols-md-3 row-cols-sm-2 mt-3']"));
		for(WebElement AB:biolabssitestaff) {
		System.out.println(AB.getText());
		}
		
	}

}
