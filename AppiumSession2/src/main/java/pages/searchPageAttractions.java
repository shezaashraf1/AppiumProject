package pages;

import baseTest.AppDriver;
import baseTest.AppFactory;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class searchPageAttractions {

    AppDriver app = new AppDriver();
    public searchPageAttractions(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }


    //<--Attractions Tab-->

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]")
    public WebElement searchmenu_Btn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[4]")
    public WebElement attractions_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")
    public WebElement going_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText")
    public WebElement going_txtField;

    @FindBy(xpath = "//*[contains (@text, 'New York, New York State United States')]")
    public WebElement usa_btn;

    @FindBy(xpath = "//*[contains (@text, 'Select your dates')]")
    public WebElement date_textBtn;

    @FindBy(xpath = "//*[contains (@text, '28 April 2023')]")
    public WebElement date_select;

    @FindBy(xpath = "//*[contains (@text, 'Apply')]")
    public WebElement applyatt_Btn;

    @FindBy(xpath = "//*[contains (@text, 'Search')]")
    public WebElement searchatt_Btn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement cancelsignin_btn;

    public void waitforElement(WebDriver d, WebElement elem){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public void scroll(String str){
        app.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).index(0)).scrollIntoView" + "(new UiSelector().text" + "(\""+str+"\"))"));}

    public void clickOnAttractionsTab(){
        waitforElement(AppDriver.getDriver(),attractions_btn);
        attractions_btn.click();
    }

    public void searchForDestination(){
        waitforElement(AppDriver.getDriver(),going_btn);
        going_btn.click();
    }

    public void enterDestination(String destination){
        waitforElement(AppDriver.getDriver(),going_txtField);
        going_txtField.sendKeys(destination);
    }

    public void selectUSA(){
        waitforElement(AppDriver.getDriver(),usa_btn);
        usa_btn.click();
    }

    public void clickOnDatePicker(){
        waitforElement(AppDriver.getDriver(),date_textBtn);
        date_textBtn.click();
    }

    public void pickDate(){
        waitforElement(AppDriver.getDriver(),date_select);
        date_select.click();
    }

    public void clickOnApply(){
        waitforElement(AppDriver.getDriver(),applyatt_Btn);
        applyatt_Btn.click();
    }

    public void clickOnSearch(){
        waitforElement(AppDriver.getDriver(),searchatt_Btn);
        searchatt_Btn.click();
    }

    public void cancelSignIn(){
        waitforElement(AppDriver.getDriver(),cancelsignin_btn);
        cancelsignin_btn.click();
    }




}
