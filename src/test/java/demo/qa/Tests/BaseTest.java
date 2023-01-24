package demo.qa.Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    static void setUp() {
        // тут можно поменять браузер
        Configuration.browser = "chrome";
        //Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        open("/automation-practice-form");
    }

    @AfterEach
    void tearDown(){
        Selenide.closeWebDriver();
    }
}
