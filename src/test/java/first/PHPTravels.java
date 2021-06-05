package first;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.PHPTravelsHomePage;

public class PHPTravels {
	
	
	@BeforeMethod
	public void navigateToHomepage() throws IOException, InterruptedException {
		//Thread.sleep(20000);
		/*
		 * phpHomePage= new PHPTravelsHomePage(); phpHomePage.navigatetohomepage();
		 */
		
	}
  @Test(enabled=true)
  public void flightBooking() throws IOException {
	  PHPTravelsHomePage  phpHomePage= new PHPTravelsHomePage();
		phpHomePage.navigatetohomepage();
	  phpHomePage.searchFlights();
	  phpHomePage.quitDriver();
  }
  @Test(enabled=true)
  public void destinationBooking() throws IOException {
	  PHPTravelsHomePage  phpHomePage= new PHPTravelsHomePage();
		phpHomePage.navigatetohomepage();
	  phpHomePage.searchDestinations();
	  phpHomePage.quitDriver();
  }
  @AfterMethod
	public void cleanDriver() throws IOException {
	  
	  
	}
  
}
