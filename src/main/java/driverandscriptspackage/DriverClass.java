package driverandscriptspackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DriverClass {
	private ThreadLocal<ChromeDriver> driver= new ThreadLocal();
	public static FileInputStream file;
	public static Properties properties;

	public void initializeDriver() throws IOException {
		try {

		file = new FileInputStream("src/main/resources/config.properties");
		//Thread.sleep(1000);
		System.out.println(file);
		properties = new Properties();
		properties.load(file);
		//Thread.sleep(2000);
		System.out.println(properties);
		System.out.println(properties.getProperty("browser", "chrome"));
		if ("chrome".equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", properties.getProperty("chromedriverpath"));
			//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver.set(new ChromeDriver());

		} else {
			System.setProperty("webdriver.edge.driver", properties.getProperty("edgedriverpath"));
			//driver = new EdgeDriver();
		}
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public WebDriver getDriver() throws IOException {
		if(driver.get()==null)
			initializeDriver();
		return driver.get();
	}

}
