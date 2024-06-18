package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PackagesPage {
    private final SelenideElement oneGBFibreBroadband = $(By.xpath("//*[@id=\"RES_BB24_STD_1000MB_26_SU0\"]/div/nav/button/span[1]"));
    private final SelenideElement continueButton= $(By.xpath("//*[@id=\"orderBottomBar\"]/div/div/div[2]/button/span[1]"));
    private final SelenideElement twelveMonthsButton= $(By.xpath("//span[text()='12 Months']/parent::button"));
    public void selectBBCardOneGbFibreBroadband() {
        oneGBFibreBroadband.scrollIntoView(true);
        oneGBFibreBroadband.should(Condition.clickable).click();
    }
    public void clickOnContinue() {
        continueButton.scrollIntoView(true);
        continueButton.should(Condition.clickable).click();
    }

    public void selectBBCard(String bbCard) {
        $(By.xpath(String.format("//*[@id='%s']/div/nav/button/span[1]", bbCard))).should(Condition.clickable).click();
    }

    public void clickOnTwelveMonthsButton() {
        twelveMonthsButton.should(Condition.visible).click();

    }
}

