package steam.Tests;
import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class Games extends BaseTest {

    @Test
    public void gameSearchSims() {
        // Configuration.pageLoadTimeout=3000;
        open("https://store.steampowered.com/");
        $("#store_nav_search_term").setValue("The sims").pressEnter();
        $(By.id("sort_by_trigger")).click();
        $(By.id("Price_ASC")).click();  // по возрастанию

        // обозначаем коллекцию элементов, собираем все ссылки на игры из поля и достаем из них атрибут с ценой
        ElementsCollection href = $$x("//div[@id='search_resultsRows']//a[@href]//div[@data-price-final]");
        List<Integer> price = new ArrayList<>();
        for (int i = 0; i < href.size(); i++) {
            String data = href.get(i).getAttribute("data-price-final");
            // переводим список из стринг в инт
            price.add(Integer.parseInt(data));
        }
        // наша проверка
        for (int i = 3; i < price.size()-1; i++) {
            if (price.get(i) > price.get(i + 1)) {
                System.out.println("Фильтрация неверная");
                break;
            }
        }
    }

    @Test
    public void gameSearchGTA() {
        open("https://store.steampowered.com/");
        $("#store_nav_search_term").setValue("GTA").pressEnter();
        $("#sort_by_trigger").click();
        $(By.id("Price_DESC")).click();// по убыванию

        // обозначаем коллекцию элементов, собираем все ссылки на игры из поля и достаем из них атрибут с ценой
        ElementsCollection href = $$x("//div[@id='search_resultsRows']//a[@href]//div[@data-price-final]");
        List<Integer> price = new ArrayList<>();
        for (int i = 0; i < href.size(); i++) {
            String data = href.get(i).getAttribute("data-price-final");
            // переводим список из стринг в инт
            price.add(Integer.parseInt(data));
        }
        // наша проверка
        for (int i = 4; i < price.size()-1; i++) {
            if (price.get(i) < price.get(i + 1)) {
                System.out.println("Фильтрация неверная");
                break;
            }
        }
    }
}
