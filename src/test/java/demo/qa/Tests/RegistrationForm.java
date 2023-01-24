package demo.qa.Tests;

import demo.qa.Pages.CheckoutPage;
import demo.qa.Pages.RegistrationFormPage;
import dev.failsafe.internal.util.Assert;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;


public class RegistrationForm extends BaseTest{
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @Test
    void fillFormTest() {
        registrationFormPage.deleteBanAndFooter()
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

        MatcherAssert.assertThat("Expefdgdfgdfsg не совпадает",checkoutPage.IsTitleContains("Tааждоажфывдавыфодавыфлод"));

//        checkoutPage.shouldHaveTitle("Thanks for submitting the form")
//                    .shouldHaveStudentName("Hanna sdgfsdfsadgf")
//                    .shouldHaveStudentEmail("Ivanova@mail.com")
//                    .shouldHaveGender("Female")
//                    .shouldHaveMobile("1234567890")
//                    .shouldHaveDateOfBirth("Date of Birth 21 November,1998")
//                    .shouldHaveSubject("Math")
//                    .shouldHaveHobbi("Reading")
//                    .shouldHaveAddress("Address 123")
//                    .shouldHaveStateAndCity("NCR Delhi");
//

    }
}
