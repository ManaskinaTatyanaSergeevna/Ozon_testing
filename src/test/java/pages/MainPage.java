package pages;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    //кнопка для перехода на "Ozon Fresh"
    private By ozonFreshButton = Selectors.byLinkText("Ozon fresh");
    //Нажать на кнопку "Озон Fresh"
    public void ozonFreshButtonClick(){
        $(ozonFreshButton).click();
    }

    //кнопка для перехода на вкладку "Ozon карта"
    private By ozonCardButton = Selectors.byLinkText("Ozon Карта");
    //Нажать на кнопку "Озон Карта"
    public void clickOnOzonCardButton(){
        $(ozonCardButton).click();
    }

    //кнопка для перехода на вкладку "Билеты, Отели, Туры"
    private By ticketsHotelsToursButton = Selectors.byLinkText("Билеты, Отели, Туры");
    //Нажать на кнопку "Билеты, Отели, Туры"
    public void clickOnTicketsHotelsToursButton(){
        $(ticketsHotelsToursButton).click();
    }

    //кнопка для перехода на вкладку "Одежда и обувь"
    private By clothesAndShoesButton = Selectors.byLinkText("Одежда и обувь");
    //Нажать на кнопку "Одежда и обувь"
    public void clickOnClothesAndShoesButton(){
        $(clothesAndShoesButton).click();
    }

    //кнопка для перехода на вкладку "Электроника"
    private By electronicsButton = Selectors.byLinkText("Электроника");
    //Нажать на кнопку "Электроника"
    public void clickOnElectronicsButton(){
        $(electronicsButton).click();
    }

    //кнопка для перехода на вкладку "Дом и сад"
    private By houseAndGardenButton = Selectors.byLinkText("Дом и сад");
    //Нажать на кнопку "Дом и сад"
    public void clickOnHouseAndGardenButton(){
        $(houseAndGardenButton).click();
    }

    //кнопка для перехода на вкладку "Детские товары"
    private By childGoodsButton = Selectors.byLinkText("Детские товары");
    //Нажать на кнопку "Детские товары"
    public void clickOnChildGoodsButton(){
        $(childGoodsButton).click();
    }

    //кнопка для перехода на вкладку "Express"
    private By expressButton = Selectors.byLinkText("Express");
    //Нажать на кнопку "Express"
    public void clickOnExpressButton(){
        $(expressButton).click();
    }

    //кнопка для перехода на вкладку "Акции"
    private By promoButton = Selectors.byLinkText("Акции");
    //Нажать на кнопку "Акции"
    public void clickOnPromoButton(){
        $(promoButton).click();
    }

    //кнопка для перехода на вкладку "Premium"
    private By premiumButton = Selectors.byLinkText("Premium");
    //Нажать на кнопку "Premium"
    public void clickOnPremiumButton(){
        $(premiumButton).click();
    }

    //кнопка для перехода на вкладку "Бренды"
    private By brandsButton = Selectors.byLinkText("Бренды");
    //Нажать на кнопку "Бренды"
    public void clickOnBrandsButton(){
        $(brandsButton).click();
    }

    //кнопка для перехода на вкладку "Рассрочка"
    private By creditButton = Selectors.byLinkText("Рассрочка");
    //Нажать на кнопку "Рассрочка"
    public void clickOnCreditButton(){
        $(creditButton).click();
    }

    //кнопка выбора валюты
    private By currencyButton = Selectors.by("data-widget", "selectedCurrency");
    //Нажать на кнопку выбора валюты
    public void clickOnCurrencyButton(){
        $(currencyButton).click();
    }

    //кнопка выбора города и адреса
    private By townAndAddressButton = Selectors.by("data-widget", "addressBookBarWeb");
    //Нажать на кнопку выбора города и адреса
    public void clickOnTownAndAddressButton(){
        $(townAndAddressButton).click();
    }

    //кнопка для перехода на вкладку с корзиной
    private By shoppingCartButton = Selectors.byLinkText("Корзина");
    //Нажать на кнопку "Корзина"
    public void clickOnShoppingCartButton(){
        $(shoppingCartButton).click();
    }

    //кнопка для перехода на страницу "Заказы"
    private By ordersButton = Selectors.byLinkText("Заказы");
    //Нажать на кнопку "Заказы"
    public void clickOnOrdersButton(){
        $(ordersButton).click();
    }

    //кнопка для перехода в избранное
    private By favouritesButton = Selectors.byLinkText("Избранное");
    //Нажать на кнопку "Избранное"
    public void clickOnFavoritesButton(){
        $(favouritesButton).click();
    }

    //кнопка "Каталог"
    private By catalogButton = Selectors.by("data-widget","catalogMenu");
    //Нажать на кнопку "Каталог"
    public void clickOnCatalogButton(){
        $(catalogButton).click();
    }

    //поисковая строка
    private By searchBar = Selectors.by("data-widget", "searchBarDesktop");
    //Нажать на поисковую строку
    public void clickOnSearchBar(){
        $(searchBar).click();
    }

    //кнопка в столбце "Помощь" "Как сделать заказ"
    private By howToPlaceAnOrderButton = Selectors.byLinkText("Как сделать заказ");





}
