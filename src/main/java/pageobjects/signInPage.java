package pageobjects;

import org.openqa.selenium.By;

public interface signInPage {
By createAccountEmailIDTextBox = By.id("email_create");
By createButton = By.id("SubmitCreate");
By genderMale = By.id("uniform-id_gender1");
By firstName = By.id("customer_firstname");
By lastName = By.id("customer_lastname");
By password  = By.id("passwd");
By addressFirstName = By.id("firstname");
By addressLastName = By.id("lastname");
By address = By.id("address1");
By city = By.id("city");
By stateDropDown = By.id("id_state");
By zipCode = By.id("postcode");
By countryDropDown = By.id("id_country");
By mobilePhone = By.id("phone_mobile");
By registerButton = By.id("submitAccount");
By myAccount = By.xpath("//span[@text()='My account']");
}
