package utilities;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() throws IOException {
    	Properties prop = ConfigReader.readProperties();
        String browserName = prop.getProperty("browser");
    	driver = new Driver().getDriver(browserName);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        if (driver != null) {
        	driver.quit();
            driver = null;
        }
    }
}