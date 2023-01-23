import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class RegistrationForm {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @BeforeAll
    static void setUp() {
        // тут можно поменять браузер
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void fillFormTest() {
        registrationFormPage.openPage()
                            .setFirstName("Hanna")
                            .setLastName("Ivanova")
                            .setEmail("Ivanova@mail.com")
                            .setGender("Female")
                            .setMobile("1234567890")
                            .setDateBirth("1998", "November", "21")
                            .setSubject("Math")
                            .setHobbie("Reading")
                            .uploadFile()
                            .setCurrentAddress("Address 123")
                            .setState("NCR")
                            .setCity("Delhi")
                            .clickSubmit();

        checkoutPage.shouldHaveTitle("Thanks for submitting the form")
                    .shouldHaveStudentName("Hanna Ivanova")
                    .shouldHaveStudentEmail("Ivanova@mail.com")
                    .shouldHaveGender("Female")
                    .shouldHaveMobile("1234567890")
                    .shouldHaveDateOfBirth("Date of Birth 21 November,1998")
                    .shouldHaveSubject("Math")
                    .shouldHaveHobbi("Reading")
                    .shouldHaveAddress("Address 123")
                    .shouldHaveStateAndCity("NCR Delhi");


    }
    @AfterAll
    static void tearDown(){
        Selenide.closeWebDriver();
    }
}
