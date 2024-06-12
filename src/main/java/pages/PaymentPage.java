package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PaymentPage {
    private final SelenideElement accoundHolderFld = $(By.cssSelector("#accountHolderName"));
    private final SelenideElement accountNumberFld = $(By.cssSelector("#accountNumber"));
    private final SelenideElement sortCodeFld = $(By.cssSelector("#sortCode"));
    private final SelenideElement proceedToOrderButton = $(By.cssSelector("#step-3"));
    public void enterStringAccountHolderName(String accountNameHolder) {
        accoundHolderFld.should(Condition.appear).sendKeys(accountNameHolder);
    }
    public void enterStringAccountNumber(String accountNumber) {
        accountNumberFld.should(Condition.appear).sendKeys(accountNumber);
    }
    public void enterStringSortCode(String sortcode) {
        sortCodeFld.should(Condition.appear).sendKeys(sortcode);
    }
    public void clickOnProceedToOrderSummary() {
        // Increase sleep to ensure the page is loaded
        proceedToOrderButton.scrollIntoView(true);
        proceedToOrderButton.should(Condition.clickable).click();
        // Increase sleep to allow time for any animations or changes
    }

}
