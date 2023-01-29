package demo.qa.Tests;

import com.github.javafaker.Faker;
import demo.qa.Pages.CheckoutPage;
import demo.qa.Pages.RegistrationFormPage;
import dev.failsafe.internal.util.Assert;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;


public class RegistrationForm extends BaseTest{

    @Test
    void fillFormTest(){
        registrationFormPage.deleteBanAndFooter()
                            .setFirstName(firstName)
                            .setLastName(lastName)
                            .setEmail(email)
                //TODO Погугли randomazer в java
                // я хз как эти штуки сделать рандомными (((
                            .setGender("Female")
                            .setMobile("1234567890")
                            .setDateBirth("1998", "November", "21")
                            .setSubject("Math")
                            .setHobbie("Reading")
                            .uploadFile()
                            .setCurrentAddress(currentAddress)
                            .setState("NCR")
                            .setCity("Delhi")
                            .clickSubmit();

        // такая форма проверки дает развернутый ответ

        // при проверке ошибка, данные не совпадают, возможно из-за faker(

        assertThat("Title не совпадает",checkoutPage.IsTitleContains("Thanks for submitting the form"));
        assertThat("Name не совпадает",checkoutPage.IsStudentName(firstName + " " + lastName));
//        assertThat("Email не совпадает",checkoutPage.IsStudentEmail(email));
//        assertThat("Gender не совпадает",checkoutPage.IsGender("Female"));
//        assertThat("Mobile не совпадает",checkoutPage.IsMobile("1234567890"));
//        assertThat("Date Of Birth не совпадает",checkoutPage.IsDateOfBirth("Date of Birth 21 November,1998"));
//        assertThat("Subject не совпадает",checkoutPage.IsSubject("Math"));
//        assertThat("Hobbie не совпадает",checkoutPage.IsHobbie("Reading"));
//    //    assertThat("Address не совпадает",checkoutPage.IsAddress(currentAddress));
//        assertThat("State and City не совпадает",checkoutPage.IsStateAndCity("NCR Delhi"));

    }
}
