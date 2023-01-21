import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    DateComponent calendar = new DateComponent();
    AddressComponent address = new AddressComponent();
    public RegistrationFormPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }
    public RegistrationFormPage setFirstName(String value){
        $("#firstName").setValue(value);
        return this;
    }
    public RegistrationFormPage setLastName(String value){
        $("#lastName").setValue(value);
        return this;
    }
    public RegistrationFormPage setEmail(String value){
        $("#userEmail").setValue(value);
        return this;
    }
    public RegistrationFormPage setGender(String value){
        $("#gender-radio-2").parent().click();
        return this;
    }
    public RegistrationFormPage setMobile (String value){
        $("#userNumber").setValue(value);
        return this;
    }

    public RegistrationFormPage setDateBirth (String year, String month, String day){
        $("#dateOfBirthInput").click();
        calendar.setDate(year, month, day);
        return this;
    }

    public RegistrationFormPage setSubject (String value){
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPage setHobbie (String value){
        $("#hobbies-checkbox-2").parent().click();
        return this;
    }
    public RegistrationFormPage setCurrentAddress (String value){
        $("#currentAddress").setValue(value);
        return this;
    }
    public RegistrationFormPage setStateAndCity (String state, String city){
        $("#state").click();
        address.setStateAndCity(state, city);
        return this;
    }

}
