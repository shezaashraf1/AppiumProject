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

public class searchPageStays {

    public searchPageStays(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    //<--Stays Tab-->

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]")
    public WebElement search_Btn;
    @FindBy(id = "com.booking:id/facet_entry_point_item_label")
    public WebElement stays_tabBtn;
    @FindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    public WebElement acclocation_txtBtn;

    @FindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    public WebElement acclocation_txtField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public WebElement topacclocation_btn;

    @FindBy(id = "com.booking:id/facet_date_picker_confirm")
    public WebElement datepicker_btn;

    @FindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    public WebElement occupancy_txtBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[2]")
    public WebElement add_members;

    @FindBy(id = "com.booking:id/group_config_apply_button")
    public WebElement apply_btn;

    @FindBy(id = "com.booking:id/facet_search_box_cta")
    public WebElement search_btn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement cancelsignin_btn;



    public void waitforElement(WebDriver d, WebElement elem){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public void clickOnSearch(){
        waitforElement(AppDriver.getDriver(),search_Btn);
        search_Btn.click();
    }
    public void clickOnStays(){
        waitforElement(AppDriver.getDriver(),stays_tabBtn);
        stays_tabBtn.click();
    }
    public void clickOnAccLocation(){
        waitforElement(AppDriver.getDriver(),acclocation_txtBtn);
        acclocation_txtBtn.click();
    }

    public void enterAccLocation(String location){
        waitforElement(AppDriver.getDriver(),acclocation_txtField);
        acclocation_txtField.sendKeys(location);
    }

    public void clickOnTopLocation(){
        waitforElement(AppDriver.getDriver(),topacclocation_btn);
        topacclocation_btn.click();
    }


    public void selectDatePicker(){
        waitforElement(AppDriver.getDriver(),datepicker_btn);
        datepicker_btn.click();
    }
    public void clickOnOccupancy(){
        waitforElement(AppDriver.getDriver(),occupancy_txtBtn);
        occupancy_txtBtn.click();
    }

    public void clickOnMemberAddition(){
        waitforElement(AppDriver.getDriver(),add_members);
        add_members.click();
    }

    public void clickOnApply(){
        waitforElement(AppDriver.getDriver(),apply_btn);
        apply_btn.click();
    }

    public void search(){
        waitforElement(AppDriver.getDriver(),search_btn);
        search_btn.click();
    }

    public void cancelSignIn(){
        waitforElement(AppDriver.getDriver(),cancelsignin_btn);
        cancelsignin_btn.click();
    }
}
