package demo.qa.Components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddressComponent {

    // мне не нравится, что конкретные значения вшиты в код. Как можно сделать так, чтобы
    // машина сама выбирала рандомное (из возможных) значение?
    public void setState(String value) {
        $(byText("NCR")).click();
    }
    public void setCity(String value) {
        $(byText("Delhi")).click();
    }
}

