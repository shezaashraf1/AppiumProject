package Tests;

import baseTest.AppFactory;
import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.searchPageStays;
import utilities.excelReader;

import java.net.MalformedURLException;

public class searchTestsStays {
    excelReader excReader;

    searchPageStays searchStays;
    AppFactory factory;

    @BeforeTest
    public void setup() throws MalformedURLException {

        excReader = new excelReader();
        excReader.readExcelFile();
        factory = new AppFactory();
        factory.initializer();
        searchStays = new searchPageStays();
    }

    @Test
    @Epic("Booking.com")
    @Feature("Location Search")
    @Description("From this Test Case User should be able to search for a location from stays tab")
    @Story("When user should be able to search for a location from stays tab")
    @Severity(SeverityLevel.CRITICAL)
    public void searchLocation() throws Exception {

        String location = excelReader.GetCellValue(1,2);
        searchStays.cancelSignIn();
        searchStays.clickOnSearch();
        searchStays.clickOnStays();
        searchStays.clickOnAccLocation();
        searchStays.enterAccLocation(location);
        searchStays.clickOnTopLocation();
        searchStays.selectDatePicker();
        searchStays.clickOnOccupancy();
        searchStays.clickOnMemberAddition();
        searchStays.clickOnApply();
        searchStays.search();
    }

    @AfterTest
    public void quitDriver(){
        factory.quitDriver();
    }

}
