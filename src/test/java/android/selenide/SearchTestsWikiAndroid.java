package android.selenide;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.id;

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
        String xPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.TextView[2]";
        back();
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia:id/search_src_text")).sendKeys("Michael Phelps");
        });
        step("Open page", () -> {
            $(id("org.wikipedia:id/page_list_item_title")).click();
        });

        step("Verify article opened", () -> {
                $(By.xpath(xPath)).shouldHave(text("American swimmer (born 1985)"));
    });
    }

}
