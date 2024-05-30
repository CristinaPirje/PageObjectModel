package tests;

import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.MenuPage;
import utils.BaseTest;

public class IframeExample extends BaseTest {
	
	@Test
	public void iframeExampleTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		ContactsPage contacts= new ContactsPage(driver);
		menu.navigateTo(menu.contactsLink);
		Thread.sleep(3000);
		//facem switch catre DOM ul iframe ului
		driver.switchTo().frame(driver.findElement(contacts.iframe));
		contacts.zoomMap(contacts.zoomInBtn);
		contacts.zoomMap(contacts.zoomInBtn);
		contacts.zoomMap(contacts.zoomInBtn);
		
		//facem switch inapoi catre DOM-ul principal
		driver.switchTo().defaultContent();
		driver.findElement(contacts.name).sendKeys("Harry Potter");
		// nu mai merge pentru ca am iesit din iframe, trebuie facut switch inapoi daca vreau sa apas pe butoane
		
		contacts.zoomMap(contacts.zoomOutBtn);
	}

}
