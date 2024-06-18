package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ThreeGbPage {
    private final SelenideElement continueToCheckout = $(By.xpath("//span[text()='Continue to checkout ']/parent::button"));
    private final SelenideElement checkoutNow = $(By.xpath("//span[text()='Checkout now']/parent::button"));

    public void selectThreeGbpsFibreBroadbandCard() {
        continueToCheckout.should(Condition.visible).click();

    }

    public void selectThreeGBPremiumWF() {
        checkoutNow.should(Condition.visible).click();

    }
}
