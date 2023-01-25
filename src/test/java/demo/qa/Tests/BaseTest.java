package demo.qa.Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import demo.qa.Pages.CheckoutPage;
import demo.qa.Pages.RegistrationFormPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    static void setUp() {
        // тут можно поменять браузер
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        open("/automation-practice-form");
    }

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            currentAddress = faker.rickAndMorty().quote();

    @AfterEach
    void tearDown(){
        Selenide.closeWebDriver();
    }
}
