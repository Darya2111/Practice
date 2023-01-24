package demo.qa.Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    DateComponent calendar = new DateComponent();
    AddressComponent address = new AddressComponent();
    public RegistrationFormPage deleteBanAndFooter(){
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
    public RegistrationFormPage setState (String value){
        $("#state").click();
        address.setState(value);
        return this;
    }
    public RegistrationFormPage setCity (String value){
        $("#city").click();
        address.setCity(value);
        return this;
    }
    public RegistrationFormPage uploadFile(){
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        return this;
    }
    public RegistrationFormPage clickSubmit(){
        $("#submit").click();
        return this;
    }
}
