package stepdefs;

import io.cucumber.java.en.And;
import pages.ThirtyFiveMbpsPage;

public class ThirtyFiveMbpsPageStepDefs {
    ThirtyFiveMbpsPage thirtyFiveMbpsPage = new ThirtyFiveMbpsPage();


    @And("select thirty five Mbps BB card")
    public void selectThirtyFiveMbpsBBCard() {
        thirtyFiveMbpsPage.selectThirtyFiveMbpsCard();

    }
}
