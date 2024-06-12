package stepdefs;

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
}
