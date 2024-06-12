package stepdefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.DetailsPage;
import pages.InstallationPage;

import io.cucumber.java.en.And;

public class InstallationPageStepDefs {
    InstallationPage installationPage = new InstallationPage();
    @And("click on right row of calendar to switch the week")
    public void clickOnRightRowOfCalendar() {
        installationPage.clickOnRightRowOfCalendar();
    }

    @And("click on right row of calendar to switch the week again")
    public void clickOnRightRowOfCalendarAgain() {
        installationPage.clickOnRightRowOfCalendarAgain();
    }
    @And("select a day")
    public void selectADay() {
        installationPage.selectADay();
    }
    @And("click on Confirm and Proceed to Payment")
    public void clickOnConfirmAndProceedToPayment() {
        installationPage.clickOnConfirmAndProceedToPayment();
    }

    @And("select a day for BOX")
    public void selectADayForBOX() {
        installationPage.selectADayForBOX();
    }
}
