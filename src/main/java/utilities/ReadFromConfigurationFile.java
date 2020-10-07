package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromConfigurationFile {
    public static String readPublicProperties(String fileName, String key)
    {
        Properties properties=new Properties();
        String value;
        String workingDir=System.getProperty("user.dir");
        try {
            properties.load(new FileInputStream(workingDir+ File.separator+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        value=properties.getProperty(key);
        return value;
    }







}
