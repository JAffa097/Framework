package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import driverandscriptspackage.ScriptsClass;
import pageobjects.PHPTravelsHomePageObjects;


public class PHPTravelsHomePage extends ScriptsClass implements PHPTravelsHomePageObjects  {

	public PHPTravelsHomePage() throws IOException {
		super();
		
	}
	public PHPTravelsHomePage(WebDriver driver) throws IOException {
		super(driver);
		
	}
	public void navigatetohomepage() {
		navigateTo("https://www.phptravels.net/home");
	}

	public void searchDestinations()  {
		System.err.println("searchDestinations       "+getSessionID());
		highlight(destinationTextBox);
		//enterText(destinationTextBox, "Delhi");
		
		click(searchButtonHotels);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchFlights() {
		System.err.println("searchFlights       "+getSessionID());
		click(flightsTab );
		//enterText(flightsFrom, "London");
		//enterText(flightsTo, "Delhi");
		click(searchButtonFlights);
		
	}
	
	
	
	
	
}
