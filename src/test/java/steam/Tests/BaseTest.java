package steam.Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import demo.qa.Pages.CheckoutPage;
import demo.qa.Pages.RegistrationFormPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    static void setUp() {
        // тут можно поменять браузер
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout=80000;
        Configuration.baseUrl = "https://store.steampowered.com/";
        Configuration.browserSize = "1920x1080";
        open("https://store.steampowered.com/");
    }

   @AfterEach
    void tearDown(){
        Selenide.closeWebDriver();
    }
}
