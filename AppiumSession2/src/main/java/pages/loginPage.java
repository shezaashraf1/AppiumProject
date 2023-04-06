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

public class loginPage {

    public loginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(id = "com.booking:id/identity_account_start")
    public WebElement sign_withEmail;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement userName_txtField;

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement continue_btn;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public List<WebElement> password_txtField;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Show password']")
    public List<WebElement> imageEyeIcon;
    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement tittle_header;

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement createAccount_btn;

    @FindBy(id = "com.booking:id/genius_onbaording_bottomsheet_cta")
    public WebElement onboarding_btn;


    public void waitforElement(WebDriver d, WebElement elem){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public void waitforElement(WebDriver d, List<WebElement> elem){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfAllElements(elem));
    }

    public void clickOnCreateAccount(){
       waitforElement(AppDriver.getDriver(),sign_withEmail);
        sign_withEmail.click();
    }

    public void enterEmail(String email){
        waitforElement(AppDriver.getDriver(),userName_txtField);
        userName_txtField.sendKeys(email);
    }

    public void enterPassword(String pass){
        waitforElement(AppDriver.getDriver(), imageEyeIcon);
        waitforElement(AppDriver.getDriver(), password_txtField);
        password_txtField.get(0).sendKeys(pass);
    }

    public void enterConfirmPassword(String pass){
        waitforElement(AppDriver.getDriver(),password_txtField);
        password_txtField.get(1).sendKeys(pass);
    }

    public void clickContinueBtn (){
       waitforElement(AppDriver.getDriver(),continue_btn);
       continue_btn.click();
    }

    public void createAccountBtn(){
        waitforElement(AppDriver.getDriver(),createAccount_btn);
        createAccount_btn.click();
    }

    public void onbaordingBtn(){
        waitforElement(AppDriver.getDriver(),onboarding_btn);
        onboarding_btn.click();
    }

}
