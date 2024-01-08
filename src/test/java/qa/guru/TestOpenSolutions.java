package qa.guru;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestOpenSolutions {

    @Test
    void openSolutionsTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".border-bottom").$(byText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" + "developer platform"));
        //sleep(5000);
    }
}
