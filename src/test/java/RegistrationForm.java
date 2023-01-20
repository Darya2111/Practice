import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm {


    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {

        RegistrationFormPage registrationFormPage = new RegistrationFormPage();

        registrationFormPage.openPage();
        registrationFormPage.setFirstName("Ivan");
        registrationFormPage.setLastName("Ivanov");
        registrationFormPage.setEmail("Ivanov@mail.com");
        registrationFormPage.setGender("Female");
        registrationFormPage.setMobile("123456");
        registrationFormPage.setDateBirth("");
        registrationFormPage.setMonthOfBirth("November");
        registrationFormPage.setYearOfBirth("1998");

        registrationFormPage.setDayOfBirth("21");

        registrationFormPage.setSubject("Math");
        registrationFormPage.setHobbie("Reading");

        $("#uploadPicture").uploadFromClasspath("img/1.png");

        registrationFormPage.setCurrentAdress("Adress 123");
        registrationFormPage.setState("");
        registrationFormPage.setState2("NCR");
        registrationFormPage.setCity("");
        registrationFormPage.setCity2("Delhi");
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Ivan Ivanov"));

    }
}
