package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ThirtyFiveMbpsPage {
    private final SelenideElement checkoutNow = $(By.xpath("//span[text()='Checkout now']/parent::button"));
    public void selectThirtyFiveMbpsCard() {
        checkoutNow.should(Condition.visible).click();

    }
}
