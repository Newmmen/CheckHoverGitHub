package githubhover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckHoverGitHub {
    @BeforeEach
    void openGitHub() {
        open("https://github.com/");
        $("html").hover();

    }

    @Test
    void checkHoverGitHub() {
        $("div.HeaderMenu").$(withTagAndText("summary", "Pricing")).hover();
        $("div.HeaderMenu").$(byTagAndText("a", "Compare plans")).click();
        $("div.application-main ").$(withTagAndText("h1", "Choose the plan that")).shouldBe(visible);

    }

}
