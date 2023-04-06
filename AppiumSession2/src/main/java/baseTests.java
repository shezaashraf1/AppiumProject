import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utilities.configReader;


import java.net.MalformedURLException;
import java.net.URL;

public class baseTests {

    public static AppiumDriver driver;

    public static configReader confgReader;

    public void initializer() throws MalformedURLException {

        DesiredCapabilities cap= new DesiredCapabilities();
        confgReader = new configReader();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, confgReader.getAutomationName());
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, confgReader.getPlatformName());
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, confgReader.getPlatformVersion());
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, confgReader.getDeviceName());
        cap.setCapability(MobileCapabilityType.APP, confgReader.getApkPath());

        URL url= new URL(confgReader.getAppiumServerURL());

        driver= new AppiumDriver(url,cap);

    }
}
