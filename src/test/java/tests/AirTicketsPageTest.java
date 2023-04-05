package tests;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import net.bytebuddy.dynamic.ClassFileLocator;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import pages.AirTicketsPage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.*;


public class AirTicketsPageTest {

    @Before
    public void setUp() throws ParseException {
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
//        SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd");
//        Date parsingDate = ft.parse("2024-02-07 14:19:30.000");
//        Date parsingDate2 = ft2.parse("2023-02-07");

        Cookie COOKIE = new Cookie("__Secure-refresh-token",
                "3.0.Kv0WupzsSZ-sI2MudhcWdQ.17.l8cMBQAAAABj4l3yAwA_06N3ZWKgAICQoA..20230207161930.FRW1KgRGvsFvmZlHsWXY4jLfNCyDvsOi58g5n1bDYPg");
        Cookie COOKIE2 = new Cookie("__Secure-ab-group", "17");
        Cookie COOKIE3 = new Cookie("__Secure-user-id", "0");
        Cookie COOKIE4 = new Cookie("__Secure-access-token", "3.0.Kv0WupzsSZ-sI2MudhcWdQ.17.l8cMBQAAAABj4l3yAwA_06N3" +
                "ZWKgAICQoA..20230207161930.eQA6cOGu8lo3qz5lOSjYP7UiAw-M742dWrxZ-_4rIk0");
        Cookie COOKIE5 = new Cookie("__cf_bm","mbV5sH3F5XFAxeQdU.96xRV9IQ6jzImvZdJHc57SB5w-1675779570-0-AXqvL64n7HzeZ" +
                "JY7mJTlrhAOJyarOlhh6fU//WanQaBlETKtLMGDZZzp9RKWhY2dY+PhTOOFoSI08JVgXD+wbBc=");
        Cookie COOKIE6 = new Cookie("AREA_ID","2");
        Cookie COOKIE7 = new Cookie("xcid","61dbfcd7c22a488449c9776494b81219");
        Cookie COOKIE8 = new Cookie("_land-labels","eyJMYW5kaW5nVVJMIjoiL3RyYXZlbC8ifQ==");
        Cookie COOKIE9 = new Cookie("__Secure-ext_xcid", "61dbfcd7c22a488449c9776494b81219");

//        WebDriverRunner.getWebDriver().manage().addCookie(COOKIE);
        open("https://www.ozon.ru/travel/?mwc_campaign=oztravel_horizontal-menu_flight");

        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE);
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE2);
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE3);
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE4);
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE5);
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE6);
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE7);
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE8);
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(COOKIE9);
//        refresh();
    }

    @Test
    public void goToTrainTicketsPageTest(){
        AirTicketsPage airTicketsPage = new AirTicketsPage();
        airTicketsPage.clickOnTrainTicketsButton();
        boolean displayed = $(Selectors.byText("ЖД билеты на поезд")).isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Test
    public void findAirTicketsTest(){
        AirTicketsPage airTicketsPage = new AirTicketsPage();
        airTicketsPage.setOrderAirTicketForm("Москва", "Шри-Ланка", "Март", 15,
                "Март", 30, 2, 0, 0, "Эконом");
    }
}
