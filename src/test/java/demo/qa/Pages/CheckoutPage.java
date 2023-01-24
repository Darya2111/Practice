package demo.qa.Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    public boolean IsTitleContains (String value){
        return $("#example-modal-sizes-title-lg").has(Condition.text(value));
    }
    public CheckoutPage shouldHaveStudentName (String value){
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(value));
        return this;
    }
    public CheckoutPage shouldHaveStudentEmail (String value){
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(value));
        return this;
    }
    public CheckoutPage shouldHaveGender (String value){
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text(value));
        return this;
    }
    public CheckoutPage shouldHaveMobile (String value){
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(value));
        return this;
    }
    public CheckoutPage shouldHaveDateOfBirth (String value){
        $(".table-responsive").$(byText("Date of Birth"))
                .parent().shouldHave(text(value));
        return this;
    }
    public CheckoutPage shouldHaveSubject (String value){
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text(value));
        return this;
    }
    public CheckoutPage shouldHaveHobbi (String value){
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text(value));
        return this;
    }
    public CheckoutPage shouldHaveAddress (String value) {
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text(value));
        return this;
    }
    public CheckoutPage shouldHaveStateAndCity(String value){
            $(".table-responsive").$(byText("State and City")).parent().shouldHave(text(value));
            return this;
    }
}
