package pages;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TrainTicketsPage {

    //текст для проверки перехода на страницу бронирования ЖД билетов
    private By trainTicketsPageText = Selectors.byText("ЖД билеты на поезд");

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
    //поле с датой "Туда"
    private By dateThereField = Selectors.byText("Туда");
    //поле с датой "Обратно"
    private By dateBackField = Selectors.byText("Обратно");
    //поле "Сколько пассажиров?"
    private By passengersField = Selectors.byXpath("//label/div/div/div[contains(text(),'пассажир')]");
    //кнопка "Найти билеты"
    private By findTicketsButton = Selectors.byText("Найти билеты");

    //заполнить поле "Откуда"
    public void setWhereFromField(String fromTown){
        $(whereFromField).setValue(fromTown);
    }
    //заполнить поле "Куда"
    public void setWhereToField(String toTown){
        $(whereToField).setValue(toTown);
    }
    //заполнить поле с датой "Туда"
    public void setDateThereField(String monthTo, int dateTo){
        $(dateThereField).click();
        $(byXpath("//*[contains(text(),'" + monthTo + " 2023')] /../..//*[text()='" + dateTo + "']")).click();
    }
    //заполнить поле с датой "Обратно"
    public void setDateBackField(String monthBack, int dateBack){
        $(dateBackField).click();
        $(byXpath("//*[contains(text(),'" + monthBack + " 2023')] /../..//*[text()='" + dateBack + "']")).click();
    }
    //заполнить поле "Сколько пассажиров?"
    public void setPassengersField(int adultsCount, int childrenCount, int babiesCount){
        $(passengersField).click();
        for (int i = 0; i < adultsCount; i++) {
            $(byXpath("//*[contains(text(),'Взрослые')] /../..//button[2]")).click();
        }
        for (int i = 0; i < childrenCount; i++) {
            $(byXpath("//*[contains(text(),'от 0 до 10')] /../..//button[2]")).click();
        }
        for (int i = 0; i < babiesCount; i++) {
            $(byXpath("//*[contains(text(),'до 5')] /../..//button[2]")).click();
        }
    }
    //нажать на кнопку "Найти билеты"
    public void clickOnFindTicketsButton(){
        $(findTicketsButton).click();
    }
    //заполнить форму для поиска ЖД билетов
    public void setFormFindTrainTickets(String fromTown, String toTown, String monthTo,
                                        int dateTo, String monthBack, int dateBack,
                                        int adultsCount, int childrenCount, int babiesCount){
        setWhereFromField(fromTown);
        setWhereToField(toTown);
        setDateThereField(monthTo, dateTo);
        setDateBackField(monthBack, dateBack);
        setPassengersField(adultsCount, childrenCount, babiesCount);
        clickOnFindTicketsButton();
    }
}
