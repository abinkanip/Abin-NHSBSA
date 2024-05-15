package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {

	  public static Properties readProperties() throws IOException {
	        Properties prop = new Properties();
	        String configFilePath = System.getProperty("user.dir") + "/src/main/resources/config/config.properties";
	        FileInputStream fis = new FileInputStream(configFilePath);
	        prop.load(fis);
	        fis.close();
	        return prop;
	    }
	}