package Locators;

import org.openqa.selenium.By;

public class locatorslogin {

	public static By loginButton = By.xpath("//button[text()='BioLabs Member Log In']");
	public static By username = By.xpath("/html/body/app-root/div/div/app-public/app-login/div/div/div/div/div/form/div[1]/input");
	public static By pasword = By.xpath("/html/body/app-root/div/div/app-public/app-login/div/div/div/div/div/form/div[2]/input");
	public static By login = By.xpath("/html/body/app-root/div/div/app-public/app-login/div/div/div/div/div/form/div[3]/div[1]/button");



}
