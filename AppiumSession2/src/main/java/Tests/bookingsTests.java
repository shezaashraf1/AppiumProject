package Tests;

import baseTest.AppFactory;
import io.qameta.allure.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.bookingsPage;
import utilities.excelReader;

import java.net.MalformedURLException;
import java.util.Random;


public class bookingsTests {
    excelReader excReader;
    bookingsPage bookings;
    AppFactory factory;

    @BeforeTest
    public void setup() throws MalformedURLException {

        excReader = new excelReader();
        excReader.readExcelFile();
        factory = new AppFactory();
        factory.initializer();
        bookings = new bookingsPage();
    }

    @Test
    @Epic("Booking.com")
    @Feature("Booking Deatils ")
    @Description("From this Test Case User should be able to create a New Account")
    @Story("When user should create a New Account for login into the application")
    @Severity(SeverityLevel.CRITICAL)
    public void searchBookings() throws Exception {

        String email = excelReader.GetCellValue(1,0);
        String bookref = excelReader.GetCellValue(1,4);
        bookings.cancelSignIn();
        bookings.clickOnBooking();
        bookings.clickOnBookingDetails();
        bookings.clickOnCarRental();
        bookings.enterEmailId("sheza_ashraf" + rand() + email);
        bookings.clickOnScreen();
        Thread.sleep(5000);
        bookings.enterBookingRef(bookref);
        bookings.clickOnFindBooking();
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
