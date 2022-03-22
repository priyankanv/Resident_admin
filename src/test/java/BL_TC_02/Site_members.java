package BL_TC_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser_launch;

public class Site_members extends Browser_launch{

public static void sitemembers() throws InterruptedException {
	
	//site members
	Thread.sleep(4000);
	 driver.findElement(Locators.locators.site_members).click();
	Thread.sleep(4000);
	
	java.util.List<WebElement> sitemembers= driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-xl-5 row-cols-lg-4 row-cols-md-3 row-cols-sm-2 mt-3']"));
	for(WebElement CC:sitemembers) {
	System.out.println(CC.getText());
	}
}

}
