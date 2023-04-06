package baseTest;

import org.openqa.selenium.WebDriver;

public class AppDriver {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return driver.get();
    }

    public static void setDriver(WebDriver Driver){
        driver.set(Driver);
    }
}
