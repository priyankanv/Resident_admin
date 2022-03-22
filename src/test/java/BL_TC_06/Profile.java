package BL_TC_06;

import org.openqa.selenium.By;

import Browser.Browser_launch;
import Locators.locators;

public class Profile extends Browser_launch {
	
	public static void myprofile() throws InterruptedException {

	
	
	//click on myprofile

	Thread.sleep(8000);
	driver.findElement(locators.myprofile).click();
	Thread.sleep(2000);

	//click on edit profile
	driver.findElement(locators.Editprofile).click();
	Thread.sleep(2000);

	//click on first name
	driver.findElement(locators.firstname).clear();
	driver.findElement(locators.firstname).sendKeys("priyanka");
	Thread.sleep(2000);

	//Click on lastname	
	driver.findElement(locators.lastname).clear();
	driver.findElement(locators.lastname).sendKeys("Malviya prasad");
	Thread.sleep(2000);

	//Click on title
	driver.findElement(locators.Title).clear();
	driver.findElement(locators.Title).sendKeys("QA");
	Thread.sleep(2000);

	//Click on Phone number
	driver.findElement(locators.phoneNumber).clear();
	driver.findElement(locators.phoneNumber).sendKeys("9876543210");
	Thread.sleep(2000);
	
	
	//Click on "Update" Button
     driver.findElement(By.xpath("//button[@class='btn biolabBtn float-right mr-2']")).click();
     Thread.sleep(2000);
	
	
}
}
