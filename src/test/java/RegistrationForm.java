import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void fillFormTest() {
        registrationFormPage.openPage()
                            .setFirstName("Ivan")
                            .setLastName("Ivanov")
                            .setEmail("Ivanov@mail.com")
                            .setGender("Female")
                            .setMobile("123456")
                            .setDateBirth("1998", "November", "21")
                            .setSubject("Math")
                            .setHobbie("Reading");

        $("#uploadPicture").uploadFromClasspath("img/1.png");

        registrationFormPage.setCurrentAddress("Address 123")
                            .setStateAndCity("NCR", "Delhi");
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Ivan Ivanov"));

    }
}
