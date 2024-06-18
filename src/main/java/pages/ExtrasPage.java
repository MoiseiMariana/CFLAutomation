package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ExtrasPage {
    private final SelenideElement addTVButton = $(By.xpath("//span[text()='Select']/parent::span/parent::button"));
    private final SelenideElement tVButton = $(By.xpath("//span[text()='Select']/parent::span/parent::button[@id='VOICE_24M']"));
    private final SelenideElement readMoreTVButton = $(By.cssSelector("#__next > div > div > div > div.MuiCollapse-container.MuiCollapse-entered > div > div > div.MuiBox-root.jss250.jss6.jss9.jss10 > div > div.MuiTypography-root.jss21.jss252.MuiTypography-h3.MuiTypography-colorPrimary.MuiTypography-alignCenter"));
    private final SelenideElement addCallsButton = $(By.xpath("//button[@data-section='calls']/span/span[text()='Select']"));
    private final SelenideElement readMoreCalls = $(By.cssSelector("#VOICE_24M_secondaryBTN > span.MuiButton-label"));
    private final SelenideElement continueToCheckoutButton = $(By.xpath("//*[@id='orderBottomBar']/div/div/div[2]/button/span[1]"));

    public void addExtrasTV() {
       //tVButton.scrollIntoView(true).should(Condition.visible).click();
   addTVButton.should(Condition.clickable).click();


    }


    public void addExtrasCalls() {

        addCallsButton.scrollIntoView(true);
        addCallsButton.shouldBe(Condition.visible).shouldBe(Condition.enabled).click();

    }

    public void clickOnGoToCheckout() {
        continueToCheckoutButton.shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
    }
}

