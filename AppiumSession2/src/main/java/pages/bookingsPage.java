package pages;

import baseTest.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class bookingsPage {

    public bookingsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Bookings\"]")
    public WebElement bookings_btn;

    @FindBy(id = "com.booking:id/importBooking")
    public WebElement bookingdetails_btn;

    @FindBy(id = "com.booking:id/textManageCarBooking")
    public WebElement carrentals_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.EditText")
    public WebElement email_textField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[4]/android.widget.EditText")
    public WebElement bookingref_textField;

    @FindBy(xpath = "//android.widget.Button[contains (@text, 'Find my booking')]")
    public WebElement findbooking_Btn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement cancelsignin_btn;

    @FindBy(id = "com.booking:id/action_bar_root")
    public WebElement screen;


    public void waitforElement(WebDriver d, WebElement elem){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public void clickOnBooking(){
        waitforElement(AppDriver.getDriver(),bookings_btn);
        bookings_btn.click();
    }

    public void clickOnBookingDetails(){
        waitforElement(AppDriver.getDriver(),bookingdetails_btn);
        bookingdetails_btn.click();
    }

    public void clickOnCarRental(){
        waitforElement(AppDriver.getDriver(),carrentals_btn);
        carrentals_btn.click();
    }

    public void enterEmailId(String email){
        waitforElement(AppDriver.getDriver(),email_textField);
        email_textField.click();
        email_textField.sendKeys(email);
    }

    public void enterBookingRef(String bookref){
        waitforElement(AppDriver.getDriver(),bookingref_textField);
        bookingref_textField.click();
        bookingref_textField.sendKeys(bookref);
    }

    public void clickOnFindBooking(){
        waitforElement(AppDriver.getDriver(),findbooking_Btn);
        findbooking_Btn.click();
    }

    public void cancelSignIn(){
        waitforElement(AppDriver.getDriver(),cancelsignin_btn);
        cancelsignin_btn.click();
    }

    public void clickOnScreen(){
        waitforElement(AppDriver.getDriver(),screen);
        screen.click();
    }
}
