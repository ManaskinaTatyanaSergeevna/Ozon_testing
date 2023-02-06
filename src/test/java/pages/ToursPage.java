package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ToursPage {

    //текст для проверки перехода на страницу бронирования ЖД билетов
    private By toursPageText = Selectors.byText("Поиск туров");

    //кнопка перехода на вкладку "Отели"
    private By hotelsButton = byXpath("//span[text()='Отели']");
    //клик по кнопке "Отели"
    public void clickOnHotelsButton(){
        $(hotelsButton).click();
    }

    //кнопка перехода на вкладку "Туры"
    private By toursButton = byXpath("//span[text()='Туры']");
    //клик по кнопке "Туры"
    public void clickOnToursButton(){
        $(toursButton).click();
    }

    //кнопка перехода на вкладку "Авиабилеты"
    private By airTicketsButton = byXpath("//span[text()='Авиабилеты']");
    //клик по кнопке "Авиабилеты"
    public void clickOnAirTicketsButton(){
        $(airTicketsButton).click();
    }

    //кнопка перехода на вкладку "ЖД билеты"
    private By trainTicketsButton = byXpath("//span[text()='ЖД билеты']");
    //клик по кнопке "ЖД билеты"
    public void clickOnTrainTicketsButton(){
        $(trainTicketsButton).click();
    }

    //поле "Откуда"
    private By whereFromField = byXpath("//div/p[text()='Откуда']");
    //поле "Страна или город"
    private By countryOrTownField = byXpath("//div/p[text()='Страна или город']");
    //поле "Дата вылета"
    private By departureDateField = byXpath("//div/p[text()='Дата вылета']");
    //поле "Количество ночей"
    private By numberOfNightsField = byXpath("//div/p[text()='Количество ночей']");
    //поле "Туристы"
    private By touristsField = byXpath("//div/p[text()='Туристы']");
    //кнопка "Найти туры"
    private By findToursButton = byXpath("//div/p[text()='Найти туры']");

    //ввод "Откуда"
    public void setWhereFromField(String town){
        $(whereFromField).setValue(town);
    }
    //ввод страны или города
    public void setCountryOrTownField(String countryOrTown){
        $(countryOrTownField).setValue(countryOrTown);
    }
    //ввод даты вылета
    public void setDepartureDateField(String month, int date){
        $(departureDateField).click();
        $(byXpath("//*[contains(text(),'" + month + " 2023')] /../..//*[text()='" + date + "']")).click();
    }
    //ввод количества дней
    public void setNumberOfNightsField(){
        $(numberOfNightsField).click();
        WebElement source = element(byXpath("//div[@style='width: 25%; left: -7.14286%;']"));
//        byXpath("//div[@style='width: 25%; left: -7.14286%;']");
        WebElement target = element(byXpath("//div[@style='width: 50%; left: -7.14286%;']"));
        actions().dragAndDrop(source, target).perform();
    }
    //ввод количества туристов
    public void setTouristsField(int adultsCount, int childrenCount){
        $(touristsField).click();
        for (int i = 0; i < adultsCount; i++) {
            $(byXpath("//*[contains(text(),'Взрослые')] /../..//button[2]")).click();
        }
        for (int i = 0; i < childrenCount; i++) {
            $(byXpath("//*[contains(text(),'Дети')] /../..//button[2]")).click();
        }
    }
    //нажать на кнопку "Найти туры"
    public void clickOnFindToursButton(){
        $(findToursButton).click();
    }
    //заполнить форму поиска тура
    public void setFindForm(String town, String countryOrTown, String month,
                            int date, int adultsCount, int childrenCount){
        setWhereFromField(town);
        setCountryOrTownField(countryOrTown);
        setDepartureDateField(month, date);
        setNumberOfNightsField();
        setTouristsField(adultsCount, childrenCount);
        clickOnFindToursButton();
    }

}
