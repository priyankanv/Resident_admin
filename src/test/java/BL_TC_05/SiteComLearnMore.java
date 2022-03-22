package BL_TC_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser_launch;
import Locators.locators;

public class SiteComLearnMore extends Browser_launch {

	public static void LearnMore() throws InterruptedException {
		

	
	// Directory
			//driver.findElement(By.xpath("//a[text()= 'Directory']")).click();
			Thread.sleep(4000);
				
			//site companies
			driver.findElement(Locators.locators.sitecompanies).click();
			Thread.sleep(4000);
		
			
			//learn more
			driver.findElement(By.xpath("(//button[text() = ' LEARN MORE '])[1]")).click();
			Thread.sleep(4000);
			
			
			java.util.List<WebElement> left=driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 border']"));
			for(WebElement D:left) {
			System.out.println(D.getText());
			}

			java.util.List<WebElement> UP=driver.findElements(By.xpath("//div[@class='status']"));

			for(WebElement D1:UP)
			{
			System.out.println(D1.getText());
			}

			java.util.List<WebElement> Right= driver.findElements(By.xpath("//div[@class='border-secondar text-dark text']"));
			for(WebElement D2:Right) {
			System.out.println(D2.getText());
		
			
}
	
}
}


