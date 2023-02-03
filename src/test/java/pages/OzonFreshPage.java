package pages;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

public class OzonFreshPage {

    //текст для проверки перехода на страницу "Ozon Fresh"
    private By ozonFreshText = Selectors.byXpath("//div[@data-widget='resultsHeader']//h1[text()='OZON fresh']");
}
