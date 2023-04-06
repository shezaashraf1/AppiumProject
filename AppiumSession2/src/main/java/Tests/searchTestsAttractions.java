package Tests;

import baseTest.AppFactory;
import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.searchPageAttractions;
import utilities.excelReader;

import java.net.MalformedURLException;

public class searchTestsAttractions {
    excelReader excReader;
    searchPageAttractions searchAttractions;
    AppFactory factory;

    @BeforeTest
    public void setup() throws MalformedURLException {

        excReader = new excelReader();
        excReader.readExcelFile();
        factory = new AppFactory();
        factory.initializer();
        searchAttractions = new searchPageAttractions();
    }

    @Test
    @Epic("Booking.com")
    @Feature("Location Search")
    @Description("From this Test Case User should be able to search for a location")
    @Story("When user should be able to search for a location")
    @Severity(SeverityLevel.CRITICAL)
    public void searchLocation() throws Exception {

        String destination = excelReader.GetCellValue(1,3);
        searchAttractions.cancelSignIn();
        searchAttractions.scroll("Attractions");
        searchAttractions.clickOnAttractionsTab();
        searchAttractions.searchForDestination();
        searchAttractions.enterDestination(destination);
        searchAttractions.selectUSA();
        searchAttractions.clickOnDatePicker();
        searchAttractions.pickDate();
        searchAttractions.clickOnApply();
        searchAttractions.clickOnSearch();
        searchAttractions.scroll("New York Intrepid Sea, Air and Space Museum 4.6 / 5(73 reviews) Posted on Viator Free cancellation available From US$36");
    }

    @AfterTest
    public void quitDriver(){
        factory.quitDriver();
    }
}
