package driverandscriptspackage;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScriptsClass extends DriverClass {

	private WebDriver driver;
	
	public ScriptsClass() throws IOException {
		this.driver=getDriver();
	}
	public ScriptsClass(WebDriver driver) throws IOException {
		this.driver=driver;
	}

	protected void click(By by) {

		driver.findElement(by).click();
	}

	protected void enterText(By by, String message) {

		driver.findElement(by).sendKeys(message);
	}

	protected void highlight(By by) {

		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", driver.findElement(by));
	}
	protected void navigateTo(String URL) {
		
		driver.get(URL);
	}
	public void quitDriver() {
		driver.quit();
	}
	public String getSessionID() {
		return ((RemoteWebDriver)driver).getSessionId().toString();
	}

}
