package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage {
    private final SelenideElement acceptCookiesButton = $(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
    private final SelenideElement searchBar = $(By.cssSelector("#addressesList"));
    private final SelenideElement addressOption = $(By.xpath("//*[@id=\"addressesList-option-0\"]"));
    private final SelenideElement broadbandButton = $(By.xpath("//p[contains(@class, 'MuiTypography-root') and contains(@class, 'MuiTypography-body2') and contains(@class, 'differentFontWeightOnHover_d1ymd2kv') and text()='Broadband']"));
    private final SelenideElement thirtyFiveMbpsButton = $(By.xpath("//p[text()='Essential 35 Mbps']/parent::a[@href='/35-mbps']/parent::li"));
    private final SelenideElement threeGigaFastButton = $(By.xpath("//p[text()='3 Gbps Fibre Broadband ']/parent::a[@href='/3-gigafast']/parent::li"));
    private final SelenideElement checkAvailability = $(By.xpath("//*[@id='RES_BB12_STD_150MB_27_SU0']//span[text()='Check Availability']"));

    public void acceptCookies() {
        acceptCookiesButton.shouldBe(Condition.clickable).click();
    }

    public void enterAddress(String address) {
        searchBar.shouldBe(Condition.appear).setValue(address).pressEnter();
    }

    public void clickOnAddress() {
        addressOption.shouldBe(Condition.clickable).click();
    }

    public void hoverBroadband() {
        broadbandButton.should(Condition.visible).hover();

    }

    public void clickOnSuboption(String suboption) {
        $(By.xpath("//p[text()='%s']")).should(Condition.visible).click();

    }

    public void clickOnThreeGigaButton() {
        threeGigaFastButton.should(Condition.visible).click();
    }

    public void clickOn35Mbps() {
        thirtyFiveMbpsButton.should(Condition.visible).click();
    }

    public void clickOnCheckAvailability() {
        checkAvailability.should(Condition.visible).click();


    }
}
