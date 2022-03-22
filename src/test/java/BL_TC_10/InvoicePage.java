package BL_TC_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser_launch;

public class InvoicePage extends Browser_launch {
	
	public static void invoice() throws InterruptedException {
		
		//MyCompany
		Thread.sleep(4000);
		 driver.findElement(Locators.locators.Mycompany).click();
		Thread.sleep(4000);
		
		//invoicing
		driver.findElement(By.xpath("(//a[@routerlinkactive='active'])[4]")).click();
		Thread.sleep(4000);

		//read only data
		java.util.List<WebElement> invoicing=driver.findElements(By.xpath("//table[@class=\"table table-striped table-bordered table-sm row-border hover text-center no-footer dataTable\"]"));
		for(WebElement A:invoicing) {
		System.out.println(A.getText());
		}
		
	}

}
