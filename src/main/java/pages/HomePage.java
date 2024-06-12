package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement acceptCookiesButton = $(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
    private final SelenideElement searchBar = $(By.cssSelector("#addressesList"));
    private final SelenideElement addressOption = $(By.xpath("//*[@id=\"addressesList-option-0\"]"));

    public void acceptCookies() {
        acceptCookiesButton.shouldBe(Condition.clickable).click();
    }

    public void enterAddress(String address) {
        searchBar.shouldBe(Condition.appear).setValue(address).pressEnter();
    }

    public void clickOnAddress() {
        addressOption.shouldBe(Condition.clickable).click();
    }
}
