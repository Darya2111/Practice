package steam.Tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class Games extends BaseTest {

    @Test
    public void gameSearchSims() {
 //       Configuration.timeout=80000;
        Configuration.pageLoadTimeout=3000;
        open("https://store.steampowered.com/");
        $("#store_nav_search_term").setValue("The sims").pressEnter();
        $(By.id("sort_by_trigger")).click();
        $(By.id("Price_ASC")).click();  // по возрастанию
        // надо сделать проверку сортировки

        List<String> links = new ArrayList<>();
        ElementsCollection href = $$x("//div[@id='search_resultsRows']//a[@href]");
        for (SelenideElement element : href) {
            links.add(element.getAttribute("href"));

        }
    }
    @Test
    public void gameSearchGTA() {
        open("https://store.steampowered.com/");
        $("#store_nav_search_term").setValue("GTA").pressEnter();
        $("#sort_by_trigger").click();
        $(By.id("Price_DESC")).click();  // по убыванию

        // надо сделать проверку сортировки

        // обозначаем коллекцию элементов
        ElementsCollection href = $$x("//div[@id='search_resultsRows']//a[@href]//div[@data-price-final]");
        List<String> price = new ArrayList<>();
        for (int i = 0; i < href.size(); i++){
            String data = href.get(i).getAttribute("data-price-final");
            price.add(data);
        }
    }
}
