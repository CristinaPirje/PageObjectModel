package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pages.EventsPage;
import pages.GenericEvenPage;
import pages.MenuPage;
import utils.BaseTest;

public class WindowHandleExample extends BaseTest {
	
	@Test
	public void windowHandleTest() throws InterruptedException {
		
		MenuPage menu= new MenuPage(driver);
		EventsPage events = new EventsPage(driver);
		
		menu.navigateTo(menu.eventsLink);
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 800).perform();
		
		events.clickOnEvent(events.seminarEventLink);
		
		GenericEvenPage genericEvent = new GenericEvenPage(driver);
		
		action.scrollByAmount(0, 1000).perform();
		Thread.sleep(3000);
		//citesc fereastra curenta
		System.out.println("Current window: " + driver.getWindowHandle());
		//citesc care sunt toate ferestrele deschise
		System.out.println("All open windows :"+ driver.getWindowHandles());
		
		genericEvent.openMap();
		
		System.out.println("---------------------------------------");
		
		//citesc fereastra curenta
		System.out.println("Current window: " + driver.getWindowHandle());
		//citesc care sunt toate ferestrele deschise
		System.out.println("All open windows :"+ driver.getWindowHandles());
		
		
		System.out.println("---------------------------------------");
		
		List<String> browserTabs= new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs.get(1));
		
		//citesc fereastra curenta
		System.out.println("Current window: " + driver.getWindowHandle());
		
		driver.findElement(By.xpath("//span[contains(text(), 'Accept all')]")).click();
		driver.close();
		System.out.println("------------Dupa ce inchid  tabul-----------");
		Thread.sleep(4000);
		driver.switchTo().window(browserTabs.get(0));
		
		genericEvent.openMap();
		
		
	}

}
