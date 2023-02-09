package browserstack.selenide;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.id;

@Tag("ios")
public class InputTestiOS extends TestBase {
    @Test
    void loginTest() {
        String text = "Test text";
        step("Click on button", () -> {
            $(id("Text Button")).click();
        });
        step("Fill field", () -> {
            $(id("Text Input")).click();
            $(id("Text Input")).sendKeys(text);
            $(id("Text Input")).pressEnter();
        });
        step("Check result", () -> {
            $(id("Text Output")).shouldHave(text(text));
        });
    }
}
