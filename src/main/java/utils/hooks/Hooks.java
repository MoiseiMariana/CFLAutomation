package utils.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeOptions;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Hooks {

    @Before
    public void setUp() {
        // Configurarea browserului Edge
        Configuration.browser = "edge";
        Configuration.baseUrl = "https://communityfibre.co.uk";
        open("/");
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario) {
        sleep(2000);
        if (scenario.isFailed()) {
            // Atașarea capturii de ecran
            final byte[] screenshot = ((TakesScreenshot) WebDriverRunner.getWebDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
        WebDriverRunner.getWebDriver().quit();
    }


}

