package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_launch {

	public static WebDriver driver; 

	public static void chrome_browser() {

		WebDriverManager.chromedriver().browserVersion("99").setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://connect-insight-ui-sit.azurewebsites.net/home");
	}



	public static void firefox_browser() {

		WebDriverManager.firefoxdriver().setup();//setup

		driver = new FirefoxDriver();//launch

		driver.manage().window().maximize();//maximize

		driver.get("https://connect-insight-ui-sit.azurewebsites.net/home");

	}


	public static void edge_browser() {

		WebDriverManager.edgedriver().setup();//setup

		driver = new EdgeDriver();//launch

		driver.manage().window().maximize();//maximize

		driver.get("https://connect-insight-ui-sit.azurewebsites.net/home");

	}
}