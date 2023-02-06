package pages;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AirTicketsPage {

    //текст для проверки перехода на страницу бронирования билетов, отелей и туров
    private By airTicketsPageText = Selectors.byText("Поиск дешёвых авиабилетов");

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

    //поле "Откуда"
    private By whereFromField = Selectors.byText("Откуда");
    //поле "Куда"
    private By whereToField = Selectors.byText("Куда");
    //поле даты "Туда"
    private By dateThereToField = Selectors.byText("Туда");
    //поле даты "Обратно"
    private By dateThereFromField = Selectors.byText("Обратно");
    //поле кол-ва пассажиров
    private By passengersField = Selectors.byXpath("//label/div/div/div[contains(text(),'пассажир')]");
    //кнопка "Найти билеты"
    private By findTicketsButton = Selectors.byText("Найти билеты");

    //заполняем поле "Откуда"
    public void setWhereFromField(String fromTown){
        $(whereFromField).setValue(fromTown);
    }
    //заполняем поле "Куда"
    public void setWhereToField(String toTown){
        $(whereToField).setValue(toTown);
    }
    //заполняем поле даты "Туда"
    public void setDateThereToField(String monthTo, int dateTo){
        $(dateThereFromField).click();
        $(byXpath("//*[contains(text(),'" + monthTo + " 2023')] /../..//*[text()='" + dateTo + "']")).click();
    }
    //заполняем поле даты "Обратно"
    public void setDateThereBackField(String monthBack, int dateBack){
        $(dateThereToField).click();
        $(byXpath("//*[contains(text(),'" + monthBack + " 2023')] /../..//*[text()='" + dateBack + "']")).click();
    }
    //заполняем поле кол-ва пассажиров
    public void setPassengersField(int adultsCount, int childrenCount, int babiesCount, String comfortClass){
        $(passengersField).click();
        $(Selectors.byText(comfortClass)).click();
        for (int i = 0; i < adultsCount; i++) {
            $(byXpath("//*[contains(text(),'Взрослые')] /../..//button[2]")).click();
        }
        for (int i = 0; i < childrenCount; i++) {
            $(byXpath("//*[contains(text(),'от 2 до 11')] /../..//button[2]")).click();
        }
        for (int i = 0; i < babiesCount; i++) {
            $(byXpath("//*[contains(text(),'младше 2')] /../..//button[2]")).click();
        }
    }
    //клик по кнопке "Найти билеты"
    public void clickOnFindAirTicketsButton(){
        $(findTicketsButton).click();
    }
    //заполняем форму по заказу авиабилетов
    public void setOrderAirTicketForm(String fromTown, String toTown, String monthTo,
                                      int dateTo, String monthBack, int dateBack,
                                      int adultsCount, int childrenCount, int babiesCount, String howClass){
        setWhereFromField(fromTown);
        setWhereToField(toTown);
        setDateThereToField(monthTo, dateTo);
        setDateThereBackField(monthBack, dateBack);
        setPassengersField(adultsCount, childrenCount, babiesCount, howClass);
        clickOnFindAirTicketsButton();
    }

}
