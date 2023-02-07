package android.selenide;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.id;

public class LoginTestiOS extends TestBase{
    @Test
    void loginTest (){
        step("Fill login", () -> {
            $(id("Login input")).click();
            $(id("Login input")).setValue("Test_login");
            $(id("Login input")).pressEnter();
        });
        step("Fill password", () -> {
            $(id("Password input")).click();
            $(id("Password input")).sendKeys("Test_password");
            $(id("Login button")).click();
        });
    }
}
