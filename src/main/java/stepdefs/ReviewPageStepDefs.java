package stepdefs;

import io.cucumber.java.en.Then;
import pages.ReviewPage;


public class ReviewPageStepDefs {
    ReviewPage reviewPage= new ReviewPage();
    @Then("is displayed place order button")
    public void isDisplayedPlaceOrderButton() {
        reviewPage.isDisplayedPlaceOrderButton();
    }
}
