import static com.codeborne.selenide.Selenide.$;

public class AddressComponent {
    public void setStateAndCity(String state, String city) {
        $(".css-yk16xz-control").selectOption(state);
        $(".css-yk16xz-control").selectOption(city);
    }
}

