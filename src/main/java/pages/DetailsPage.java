package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class DetailsPage {
    private final SelenideElement firstnameFld = $(By.cssSelector("#firstName"));
    private final SelenideElement lastnameFld = $(By.cssSelector("#lastName"));
    private final SelenideElement emailFld = $(By.cssSelector("#email"));
    private final SelenideElement mobileNumberFld = $(By.cssSelector("#phone"));
    private final SelenideElement nextButton = $(By.cssSelector("#step-1 > span.MuiButton-label > p"));
    public void enterStringFirstName(String firstname) {
        firstnameFld.should(Condition.appear).sendKeys(firstname);
    }
    public void enterStringLastName(String lastname) {
        lastnameFld.should(Condition.appear).sendKeys(lastname);
    }
    public void enterStringEmail(String firstname) {
        emailFld.should(Condition.appear).sendKeys(firstname);
    }
    public void enterStringMobileNumber(String firstname) {
        mobileNumberFld.should(Condition.appear).sendKeys(firstname);
    }
    public void clickOnNext() {
        // Increase sleep to ensure the page is loaded
        nextButton.scrollIntoView(true);
        nextButton.should(Condition.clickable).click();
        // Increase sleep to allow time for any animations or changes
    }
}

