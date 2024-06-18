package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class InstallationPage {
    private final SelenideElement rightRowOfCalendar = $(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div/div[1]/div[2]/div/div/div/form/div/div[3]/div/button[2]"));
    private final SelenideElement installationDayCFL = $(By.xpath("//span[contains(@class, 'MuiTypography-root') and contains(@class, 'MuiTypography-caption') and text()='08:00-13:00']"));

    private final SelenideElement installationDayBOX = $(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div/div[1]/div[2]/div/div/div/form/div/div[3]/div/div[2]/div[5]/div/button[1]/span[1]/span"));
    private final SelenideElement confirmButton = $(By.cssSelector("#step-2"));
    public void clickOnRightRowOfCalendar() {
        // Increase sleep to ensure the page is loaded
        rightRowOfCalendar.scrollIntoView(true);
        rightRowOfCalendar.should(Condition.clickable).click();
        // Increase sleep to allow time for any animations or changes
    }
    public void clickOnRightRowOfCalendarAgain() {
        sleep(1000);  // Increase sleep to ensure the page is loaded
        rightRowOfCalendar.scrollIntoView(true);
        rightRowOfCalendar.should(Condition.clickable).click();
        // Increase sleep to allow time for any animations or changes
    }
    public void selectADay() {
        sleep(2000);  // Increase sleep to ensure the page is loaded
        installationDayCFL.scrollIntoView(true);
        installationDayCFL.should(Condition.clickable).click();
        // Increase sleep to allow time for any animations or changes
    }
    public void selectADayForBOX() {
        sleep(2000);  // Increase sleep to ensure the page is loaded
        installationDayBOX.scrollIntoView(true);
        installationDayBOX.should(Condition.clickable).click();
        // Increase sleep to allow time for any animations or changes
    }
    public void clickOnConfirmAndProceedToPayment() {
        // Increase sleep to ensure the page is loaded
        confirmButton.scrollIntoView(true);
        confirmButton.should(Condition.clickable).click();
        // Increase sleep to allow time for any animations or changes
    }
}
