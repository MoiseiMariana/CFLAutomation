package stepdefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PackagesPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PackagesPageStepDefs {
    PackagesPage packagesPage = new PackagesPage();
    @And("select BB card One Gb Fibre Broadband")
    public void selectBBCardOneGbFibreBroadband() {
        packagesPage.selectBBCardOneGbFibreBroadband();
    }

    @And("click on Continue")
    public void clickOnContinue() {
        packagesPage.clickOnContinue();
    }

    @And("select one {string}")
    public void selectOneBBCard(String arg0) {
        packagesPage.selectBBCard(arg0);
    }

    @And("select twelve months")
    public void selectTwelveMonths() {
        packagesPage.clickOnTwelveMonthsButton();
    }
}
