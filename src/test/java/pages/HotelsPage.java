package pages;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HotelsPage {

    //текст для проверки перехода на страницу бронирования ЖД билетов
    private By hotelsPageText = Selectors.byText("Отели, апартаменты и хостелы");

    //кнопка перехода на вкладку "Отели"
    private By hotelsButton = Selectors.byXpath("//span[text()='Отели']");
    //клик по кнопке "Отели"
    public void clickOnHotelsButton(){
        $(hotelsButton).click();
    }

    //кнопка перехода на вкладку "Туры"
    private By toursButton = Selectors.byXpath("//span[text()='Туры']");
    //клик по кнопке "Туры"
    public void clickOnToursButton(){
        $(toursButton).click();
    }

    //кнопка перехода на вкладку "Авиабилеты"
    private By airTicketsButton = Selectors.byXpath("//span[text()='Авиабилеты']");
    //клик по кнопке "Авиабилеты"
    public void clickOnAirTicketsButton(){
        $(airTicketsButton).click();
    }

    //кнопка перехода на вкладку "ЖД билеты"
    private By trainTicketsButton = Selectors.byXpath("//span[text()='ЖД билеты']");
    //клик по кнопке "ЖД билеты"
    public void clickOnTrainTicketsButton(){
        $(trainTicketsButton).click();
    }

    //поле "Город или отель"
    private By townOrHotelField = Selectors.byText("Город или отель");
    //поле "Дата бронирования"
    private By bookingDateField = Selectors.byText("Даты бронирования");
    //поле "Размещение"
    private By placementField = Selectors.byText("Размещение");
    //кнопка "Найти отель"
    private By findHotelButton = Selectors.byText("Найти отель");

    //заполняем поле "Город или отель"
    public void setTownOrHotelField(String townOrHotel){
        $(townOrHotelField).setValue(townOrHotel);
    }
    //заполняем поле "Дата бронирования"
    public void setBookingDateField(String monthFrom, String monthTo, int dateFrom, int dateTo){
        $(bookingDateField).click();
        $(byXpath("//*[contains(text(),'" + monthFrom + " 2023')] /../..//*[text()='" + dateFrom + "']")).click();
        $(byXpath("//*[contains(text(),'" + monthTo + " 2023')] /../..//*[text()='" + dateTo + "']")).click();
    }
    //заполняем поле "Размещение"
    public void setPlacementField(int adultsCount, int childrenCount){
        $(placementField).click();
        for (int i = 0; i < adultsCount; i++) {
            $(byXpath("//*[contains(text(),'Взрослые')] /../..//button[2]")).click();
        }
        for (int i = 0; i < childrenCount; i++) {
            $(byXpath("//*[contains(text(),'Дети')] /../..//button[2]")).click();
        }
    }
    //кликаем на кнопку "Найти отель"
    public void clickOnFindHotelButton(){
        $(findHotelButton).click();
    }
    //заполнение формы поиска отеля
    public void setFindHotelForm(String townOrHotel, String monthFrom, String monthTo,
                                 int dateFrom, int dateTo, int adultsCount, int childrenCount){
        setTownOrHotelField(townOrHotel);
        setBookingDateField(monthFrom, monthTo, dateFrom, dateTo);
        setPlacementField(adultsCount, childrenCount);
        clickOnFindHotelButton();
    }
}
