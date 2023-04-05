package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.AirTicketsPage;
import pages.MainPage;
import pages.OzonBankPage;
import pages.OzonFreshPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class MainPageTest {


    @Before
    public void setUp(){
        open("https://www.ozon.ru");
    }

    @Test
    public void goToOzonFreshPageTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        Thread.sleep(1003);
        mainPage.clickOnOzonFreshButton();
        $(Selectors.byXpath("//div[@data-widget='resultsHeader']//h1[text()='OZON fresh']")).shouldHave(Condition.exactText("OZON fresh"));
    }

    @Test
    public void goToOzonBankPageTest(){
        MainPage mainPage = new MainPage();
        mainPage.clickOnOzonCardButton();
        Assert.assertEquals("https://finance.ozon.ru/", url());

    }

    @Test
    public void goToAirTicketsPage(){
        MainPage mainPage = new MainPage();
        mainPage.clickOnTicketsHotelsToursButton();
        Assert.assertEquals("https://www.ozon.ru/travel/?mwc_campaign=oztravel_horizontal-menu_flight", url());
//        AirTicketsPage airTicketsPage = new AirTicketsPage();
//        boolean displayed = $(airTicketsPage.getAirTicketsPageText()).isDisplayed();
//        Assert.assertTrue(displayed);
    }
}
