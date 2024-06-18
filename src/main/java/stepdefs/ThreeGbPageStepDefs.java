package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ThreeGbPage;

public class ThreeGbPageStepDefs {
ThreeGbPage threeGbPage = new ThreeGbPage();

    @And("select three Gbps Fibre Broadband")
    public void selectThreeGbpsFibreBroadband() {
        threeGbPage.selectThreeGbpsFibreBroadbandCard();
    }

    @And("select Three GB Premium WiFi")
    public void selectThreeGBPremiumWiFi() {
        threeGbPage.selectThreeGBPremiumWF();
    }
}
