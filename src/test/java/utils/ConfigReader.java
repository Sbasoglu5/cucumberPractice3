package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebElement;

public class ConfigReader {
    public static Properties prop;
    public static Properties readProperties() {

        try {
            FileInputStream file = new FileInputStream(Constants.PROPERTY_FILE_PATH);
            prop=new Properties();
            prop.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       return prop;
    }
    public static String getPropertyValue(String propKey){
        return readProperties().getProperty(propKey);
    }
}
