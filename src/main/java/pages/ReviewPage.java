package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ReviewPage {
    private final SelenideElement placeOrderButton = $(By.id("DesktopBasket_OrderButton"));
    public void isDisplayedPlaceOrderButton() {
        sleep(1000);
        placeOrderButton.scrollIntoView(true);
        placeOrderButton.should(Condition.appear);

    }
}
