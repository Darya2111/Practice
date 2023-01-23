package demo.qa;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddressComponent {
    public void setState(String value) {
        $(byText("NCR")).click();
    }
    public void setCity(String value) {
        $(byText("Delhi")).click();
    }
}

