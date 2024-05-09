package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
		
		
		
	}
	public By loginLink = By.linkText("Login");
	public By contactsLink = By.linkText("CONTACTS");
	public By shopLink = By.linkText("BOOKS");
	/*public void navigatetoLogin(){
		
		driver.findElement(By.linkText("Login")).click();
		
	}*/
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
//navigateTo(loginLink)
//navigateTo(contactsLink)	
	
	
	
	
}
