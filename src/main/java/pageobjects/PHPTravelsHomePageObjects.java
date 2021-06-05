package pageobjects;

import org.openqa.selenium.By;

public interface PHPTravelsHomePageObjects  {

	By destinationTextBox = By.xpath("(//span[@class='select2-chosen'])[1]");
	By searchButtonHotels = By.xpath("(//button[contains(text(),'Search')])[1]");
	By flightsTab = By.xpath("//*[@id='search']/div/div/div/div/div/nav/ul/li[2]/a");
	By flightsFrom  = By.xpath("(//span[@class='select2-chosen'])[2]");
	By flightsTo  = By.xpath("(//span[@class='select2-chosen'])[3]");
	By searchButtonFlights = By.xpath("(//button[contains(text(),'Search')])[2]");
	
	
}
