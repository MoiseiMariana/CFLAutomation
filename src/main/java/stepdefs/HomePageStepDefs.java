package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();

    @When("accept cookies")
    public void acceptCookies() {
        homePage.acceptCookies();
    }

    @When("enter {string}")
    public void enter(String address) {
        homePage.enterAddress(address);
    }

    @When("click on address")
    public void clickOnAddress() {
        homePage.clickOnAddress();
    }

    @And("hover to Broadband")
    public void hoverToBroadband() {
        homePage.hoverBroadband();
    }

    @And("click on Broadband {string}")
    public void clickOnBroadband(String suboption) {
        homePage.clickOnSuboption(suboption);
    }

    @And("click on three giga fast")
    public void clickOnThreeGigaFast() {
        homePage.clickOnThreeGigaButton();
    }

    @And("click on Essential thirty five Mbps")
    public void clickOnEssentialThirtyFiveMbps() {
        homePage.clickOn35Mbps();
    }

    @And("Click check Availability for twelve months BB card")
    public void clickCheckAvailabilityForTwelveMonthsBBCard() {
        homePage.clickOnCheckAvailability();
    }
}
