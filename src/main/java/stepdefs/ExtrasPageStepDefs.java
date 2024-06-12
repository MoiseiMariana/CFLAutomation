package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ExtrasPage;
import pages.PackagesPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class ExtrasPageStepDefs {
    ExtrasPage extrasPage = new ExtrasPage();
    @When("add extras TV")
    public void addExtrasTV() {
        extrasPage.addExtrasTV();
    }

    @When("add extras Calls")
    public void addExtrasCalls() {
        extrasPage.addExtrasCalls();
    }

    @And("click on Go to checkout")
    public void clickOnGoToCheckout() {
        extrasPage.clickOnGoToCheckout();
    }

}
