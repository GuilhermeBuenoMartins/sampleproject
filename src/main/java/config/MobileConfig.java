package config;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileConfig {

    private static final String URL = "http://localhost:4723/wd/hub";

    private static final String APP = "apps/app-android-calculator.apk";

    private static final String PLATFORM_NAME = "Android";

    private static final String DEVICE_NAME = "Pixel 2 XL API 29";

    public AndroidDriver<MobileElement> getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", new File(APP));
        capabilities.setCapability("platformName", PLATFORM_NAME);
        capabilities.setCapability("deviceName", DEVICE_NAME);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("disableAndroidWatch", true);
        return new AndroidDriver<MobileElement>(new URL(URL), capabilities);
    }
}
