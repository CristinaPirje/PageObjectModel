package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.MenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class StaleElementExceptionExample extends BaseTest {
	@Test
	public void staleExample() throws InterruptedException {
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.navigateTo(menuPage.shopLink);
		
		//ShopPage shopPage = new ShopPage(driver);
		//incarca in memorie un webelement (care este asociat cu un id de sesiune
		WebElement element = driver.findElement(By.name("orderby"));
		Select select = new Select(element);
		//se foloseste de element si selecteaza optiunea de la index 2
		select.selectByIndex(2);
		// ca urmare a selectiei se afce refresh la pagina
		Thread.sleep(5000);
		select.deselectByVisibleText("Sort by latest");
		//fix StaleElemnt
		element = driver.findElement(By.name("orderby"));
		select = new Select(element);
		select.selectByVisibleText("Sort by latest");
		
	}
	
	

}
