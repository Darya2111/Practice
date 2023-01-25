package demo.qa.Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    // по идее с помощью этого я могла бы обращаться к локатору, но что-то не получается (
    private By element = By.className("table-responsive");


    public boolean IsTitleContains (String value){
        return $("#example-modal-sizes-title-lg").has(Condition.text(value));
    }
    public boolean IsStudentName (String value){
        return $("Student Name").parent().has(Condition.text(value));
    }
    public boolean IsStudentEmail (String value){
        return $(byText("Student Email")).parent().has(text(value));
    }
    public boolean IsGender (String value){
       return $(".table-responsive").$(byText("Gender")).parent().has(Condition.text(value));
    }
    public boolean IsMobile (String value){
        return $(".table-responsive").$(byText("Mobile")).parent().has(Condition.text(value));
    }
    public boolean IsDateOfBirth (String value){
        return $(".table-responsive").$(byText("Date of Birth"))
                .parent().has(Condition.text(value));
    }
    public boolean IsSubject (String value){
        return $(".table-responsive").$(byText("Subjects")).parent().has(Condition.text(value));
    }
    public boolean IsHobbie (String value){
        return $(".table-responsive").$(byText("Hobbies")).parent().has(Condition.text(value));
    }
    public boolean IsAddress (String value) {
        return $(".table-responsive").$(byText("Address")).parent().has(Condition.text(value));
    }
    public boolean IsStateAndCity(String value){
            return $(".table-responsive").$(byText("State and City")).parent().has(Condition.text(value));
    }

}
