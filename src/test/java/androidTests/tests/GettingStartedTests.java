package androidTests.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.id;

public class GettingStartedTests extends TestBase {

    @Test
    void gettingStartedTest() {
        String firstPageText = "The Free Encyclopedia …in over 300 languages";
        String secondPageText = "New ways to explore";
        String thirdPageText = "Reading lists with sync";
        String fourthPageText = "Send anonymous data";
        String textHeaderLocator = "org.wikipedia.alpha:id/primaryTextView";
        String buttonLocator = "org.wikipedia.alpha:id/fragment_onboarding_forward_button";
        step("Check first page", () -> {
            $(id(textHeaderLocator)).shouldHave(text(firstPageText));
        });
        step("Go to  second page", () -> {
            $(id(buttonLocator)).click();
        });
        step("Check second page", () -> {
            $(id(textHeaderLocator)).shouldHave(text(secondPageText));
        });
        step("Go to third page", () -> {
            $(id(buttonLocator)).click();
        });
        step("Check third page", () -> {
            $(id(textHeaderLocator)).shouldHave(text(thirdPageText));
        });
        step("Go to fourth page", () -> {
            $(id(buttonLocator)).click();
        });
        step("Check fourth page", () -> {
            $(id(textHeaderLocator)).shouldHave(text(fourthPageText));
        });
        step("Go to  main page", () -> {
            $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
        step("Check main page opened", () -> {
            $(id("org.wikipedia.alpha:id/view_announcement_text")).should(exist);
        });
    }
}
