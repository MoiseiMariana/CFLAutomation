package stepdefs;

import io.cucumber.java.en.And;
import pages.DetailsPage;
import pages.ExtrasPage;

import static com.codeborne.selenide.Selenide.sleep;

public class DetailsPageStepDefs {
    DetailsPage detailsPage = new DetailsPage();
    @And("enter {string} First Name")
    public void enterStringFirstName(String firstname) {
        detailsPage.enterStringFirstName(firstname);

    }

    @And("enter {string} Last Name")
    public void enterStringLastName(String lastname) {
        detailsPage.enterStringLastName(lastname);

    }

    @And("enter {string} Email")
    public void enterStringEmail(String email) {
        detailsPage.enterStringEmail(email);

    }

    @And("enter {string} Mobile Number")
    public void enterStringMobileNumber(String number) {
        detailsPage.enterStringMobileNumber(number);
    }

    @And("click on Next")
    public void clickOnNext() {
        detailsPage.clickOnNext();
    }

    @And("click on Extras")
    public void clickOnExtras() {
        detailsPage.clickOnExtrasButton();
    }

    @And("click on Back to Packages")
    public void clickOnBackToPackages() {
        detailsPage.clickBackToPackages();
    }
}
