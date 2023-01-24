package steam;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.impl.WebElementSelector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;

public class Games {
    @BeforeAll
    static void setUp() {
        // тут можно поменять браузер
        Configuration.browser = "chrome";
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void gameSearch() throws InterruptedException {
        open("https://store.steampowered.com/");
        $("#store_nav_search_term").setValue("The sims").pressEnter();
        $(By.id("sort_by_trigger")).click();
    }
}
