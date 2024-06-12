package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaymentPage;

import static com.codeborne.selenide.Selenide.sleep;

public class PaymentPageStepDefs {
    PaymentPage paymentPage= new PaymentPage();
    @When("enter {string} Account Holder Name")
    public void enterStringAccountHolderName(String accountNameHolder) {
        paymentPage.enterStringAccountHolderName(accountNameHolder);

    }

    @And("enter {string} Account Number")
    public void enterStringAccountNumber(String accountNumber) {
        paymentPage.enterStringAccountNumber(accountNumber);

    }

    @And("enter {string} Sort Code")
    public void enterStringSortCode(String sortCode){
        paymentPage.enterStringSortCode(sortCode);

    }

    @And("click on Proceed to Order Summary")
    public void clickOnProceedToOrderSummary() {
        paymentPage.clickOnProceedToOrderSummary();
        sleep(6000);
    }

}
