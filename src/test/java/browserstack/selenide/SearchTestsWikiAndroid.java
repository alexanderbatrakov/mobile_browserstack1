package browserstack.selenide;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.className;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.id;

@Tag("android")
public class SearchTestsWikiAndroid extends TestBase {

    @Test
    void searchTest() {
        back();
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia:id/search_src_text")).sendKeys("BrowserStack");
        });
        step("Verify article opened", () ->
                $$(id("org.wikipedia:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    void openPageTest() {
        back();
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia:id/search_src_text")).sendKeys("BrowserStack");
        });
        step("Open page", () -> {
            $(id("org.wikipedia:id/page_list_item_title")).click();
        });

        step("Verify article opened", () -> {
            $(className("android.widget.TextView")).shouldHave(text("BrowserStack"));
        });
    }

}
