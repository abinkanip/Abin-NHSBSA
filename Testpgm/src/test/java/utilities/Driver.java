package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	private WebDriver driver; 

    public WebDriver getDriver(String browserType) {
        if (driver == null) {
            
            switch (browserType.toLowerCase()) {
                case "chrome":
                	 driver = new ChromeDriver();
                	   driver.manage().deleteAllCookies();
                       driver.manage().window().maximize();
                    break;
                case "firefox":
                	 driver = new FirefoxDriver();
                	   driver.manage().deleteAllCookies();
                       driver.manage().window().maximize();
                    break;
                default:
                	 driver = new ChromeDriver();
                    break;
            }
        }
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
