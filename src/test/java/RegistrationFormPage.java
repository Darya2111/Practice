import com.codeborne.selenide.SelenideElement;

import javax.swing.text.html.parser.Element;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    public void openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }
    public void setFirstName(String value){
        $("#firstName").setValue(value);
    }
    public void setLastName(String value){
        $("#lastName").setValue(value);
    }
    public void setEmail(String value){
        $("#userEmail").setValue(value);
    }
    public void setGender(String value){
        $("#gender-radio-2").parent().click();
    }
    public void setMobile (String value){
        $("#userNumber").setValue(value);
    }

    public void setDateBirth (String value){
        $("#dateOfBirthInput").click();}
    public void setMonthOfBirth (String value){
        $(".react-datepicker__month-select").selectOption(value);}
    public void setYearOfBirth (String value){

        $(".react-datepicker__year-select").selectOption(value);}
    public void setDayOfBirth (String value){

    }
    public void setSubject (String value){
        $("#subjectsInput").setValue(value).pressEnter();
    }
    public void setHobbie (String value){
        $("#hobbies-checkbox-2").parent().click();
    }
    public void setCurrentAdress (String value){
        $("#currentAddress").setValue(value);
    }
    public void setState (String value){
        $("#state").click();
    }
    public void setState2 (String value){
        $("#stateCity-wrapper").selectOption(value);
    }
    public void setCity (String value){
        $("#city").click();}
    public void setCity2 (String value){
        $("#stateCity-wrapper").selectOption(value);
    }
}
