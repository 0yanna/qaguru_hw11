package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("simple")
public class SimpleTest {
    @Test
     void selenideSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("selenide.org"));
    }
    @Test
    void selenideSearchSecondTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("selenide.org"));
    }
}
