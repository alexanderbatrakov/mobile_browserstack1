package drivers;

import com.codeborne.selenide.WebDriverProvider;
import lombok.SneakyThrows;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.URL;

public class BrowserstackDriverIOS implements WebDriverProvider {

    @SneakyThrows
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        
        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", "alexbatrakov_7vk3d4");
        mutableCapabilities.setCapability("browserstack.key", "JqmWzJN9mxmfnsbqUpYd");

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", "bs://2699c5a94c9e3e05f656e65f523ff8caea813609");
        //bs://0af93fe636add84884ba9631e69d7fe4f7e4c9e1

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", "iPhone 11 Pro");
        mutableCapabilities.setCapability("os_version", "13");

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", "First Java Project");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "first_test");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        return new RemoteWebDriver(new URL("http://hub.browserstack.com/wd/hub"), mutableCapabilities);
    }
}
