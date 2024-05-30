package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
		
		
		
	}
	public By loginLink = By.linkText("Login");
	public By contactsLink = By.linkText("CONTACTS");
	public By shopLink = By.linkText("BOOKS");
	public By aboutlink=By.linkText("ABOUT");
	public By bloglink=By.linkText("BLOG");
	public By eventsLink= By.linkText("EVENTS");
	
	/*public void navigatetoLogin(){
		
		driver.findElement(By.linkText("Login")).click();
		
	}*/
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
//navigateTo(loginLink)
//navigateTo(contactsLink)	
	
	public void hoverElement(By locator) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	
}
