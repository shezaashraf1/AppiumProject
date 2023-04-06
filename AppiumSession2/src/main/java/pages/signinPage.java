package pages;

import baseTest.AppDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class signinPage {

    AppDriver app = new AppDriver();
    public signinPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Sign in\"]")
    public WebElement signin_btn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Contact Customer Service\"]")
    public WebElement customerservice_btn;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Airport taxis\"]/android.widget.RelativeLayout")
    public WebElement airporttaxi_btn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Manage booking\"]")
    public WebElement managebooking_btn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Can I cancel my booking?\"]")
    public WebElement cancelbooking_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.Button[1]")
    public WebElement thumbsup_btn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement cancelsignin_btn;



    public void waitforElement(WebDriver d, WebElement elem){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(elem));
    }


    public void clickOnSignIn(){
        waitforElement(AppDriver.getDriver(),signin_btn);
        signin_btn.click();
    }

    public void scroll(String str){ app.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).index(0)).scrollIntoView" + "(new UiSelector().text" + "(\""+str+"\"))"));}

    public void clickOnCustomerService(){
        waitforElement(AppDriver.getDriver(),customerservice_btn);
        customerservice_btn.click();
    }

    public void clickOnAirportTaxi(){
        waitforElement(AppDriver.getDriver(),airporttaxi_btn);
        airporttaxi_btn.click();
    }

    public void clickOnManageBooking(){
        waitforElement(AppDriver.getDriver(),managebooking_btn);
        managebooking_btn.click();
    }

    public void clickOnCancelBooking(){
        waitforElement(AppDriver.getDriver(),cancelbooking_btn);
        cancelbooking_btn.click();
    }

    public void clickOnThumbsUp(){
        waitforElement(AppDriver.getDriver(),thumbsup_btn);
        thumbsup_btn.click();
    }

    public void cancelSignIn(){
        waitforElement(AppDriver.getDriver(),cancelsignin_btn);
        cancelsignin_btn.click();
    }
}

