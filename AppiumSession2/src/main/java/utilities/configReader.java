package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configReader {

    public final Properties properties;

    public configReader(){

        BufferedReader reader;
        String propertyFilePath = "configuration/configuration.properties";

        try{
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try{
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

   public String getPlatformName(){
        String platformName = properties.getProperty("platformName");
        if(platformName != null) return platformName;
        else throw new RuntimeException("platform Name not found");
    }

    public String getPlatformVersion(){
        String platformVersion = properties.getProperty("platformVersion");
        if(platformVersion != null) return platformVersion;
        else throw new RuntimeException("platform Version not found");
    }

    public String getAutomationName(){
        String automationName = properties.getProperty("automationName");
        if(automationName != null) return automationName;
        else throw new RuntimeException("automation Name not found");
    }

    public String getDeviceName(){
        String deviceName = properties.getProperty("deviceName");
        if(deviceName != null) return deviceName;
        else throw new RuntimeException("device Name not found");
    }

    public String getExcelPath(){
        String excelPath = properties.getProperty("excelPath");
        if(excelPath != null) return excelPath;
        else throw new RuntimeException("excel Path not found");
    }

    public String getApkPath(){
        String apkPath = properties.getProperty("apkPath");
        if(apkPath != null) return apkPath;
        else throw new RuntimeException("apk Path not found");
    }

    public String getAppiumServerURL(){
        String appiumServerURL = properties.getProperty("appiumServerURL");
        if(appiumServerURL != null) return appiumServerURL;
        else throw new RuntimeException("appium Server URL not found");
    }
}
