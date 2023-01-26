package steam.Tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import steam.Tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Games extends BaseTest {

    @Test
    public void gameSearchSims() {
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
        $(By.id("sort_by_trigger")).click();
        $(By.id("Price_DESC")).click();  // по убыванию

        // надо сделать проверку сортировки

        // обозначаем коллекцию элементов
        ElementsCollection href = $$x("//div[@id='search_resultsRows']/a[@href]");
        List<String> links = new ArrayList<>();
        for (SelenideElement element : href) {
            links.add(element.getAttribute("href"));
        }
        System.out.println();
        int a = 0;
    }
}
