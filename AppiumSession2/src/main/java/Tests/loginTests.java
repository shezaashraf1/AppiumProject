package Tests;

import baseTest.AppFactory;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.loginPage;
import utilities.excelReader;

import java.net.MalformedURLException;
import java.util.Random;

public class loginTests {
    excelReader excReader;
    loginPage login;
    AppFactory factory;

    @BeforeTest
    public void setup() throws MalformedURLException {

        excReader = new excelReader();
        excReader.readExcelFile();
        factory = new AppFactory();
        factory.initializer();
        login = new loginPage();
    }

    @Test
    @Epic("Booking.com")
    @Feature("Account Creation")
    @Description("From this Test Case User should be able to create a New Account")
    @Story("When user should create a New Account for login into the application")
    @Severity(SeverityLevel.CRITICAL)
    public void createAccount() throws Exception {

        String email = excelReader.GetCellValue(1,0);
        String password = excelReader.GetCellValue(1,1);
        login.clickOnCreateAccount();
        login.enterEmail("sheza" + rand() + email);
        login.clickContinueBtn();
        login.enterPassword(password);
        Assert.assertTrue(login.tittle_header.isDisplayed());
        login.enterConfirmPassword(password);
        login.createAccountBtn();
        //Thread.sleep(15000);
        login.onbaordingBtn();
    }

    @AfterTest
    public void quitDriver(){
        factory.quitDriver();
    }

    public int rand(){
        Random rnd = new Random();
        char c = (char) ('a' + rnd.nextInt(26));
        return c;
    }
}
