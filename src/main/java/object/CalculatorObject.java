package object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class CalculatorObject {

    private AppiumDriver<MobileElement> driver;

    public CalculatorObject(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.setDriver(driver);
    }

    @AndroidFindBy(id="android_result_text")
    private RemoteWebElement resultTxt;

    @AndroidFindBy(id="android_field_first_number")
    private RemoteWebElement firstNumberTf;

    @AndroidFindBy(id="android_field_second_number")
    private RemoteWebElement secondNumberTf;

    @AndroidFindBy(id="android_button_sum")
    private RemoteWebElement sumBtn;

    @AndroidFindBy(id="android_button_sub")
    private RemoteWebElement subtractBtn;

    @AndroidFindBy(id="android_button_mult")
    private RemoteWebElement multiplyBtn;

    @AndroidFindBy(id="android_button_div")
    private RemoteWebElement divideBtn;

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public void setDriver(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public RemoteWebElement getResultTxt() {
        return resultTxt;
    }

    public RemoteWebElement getFirstNumberTf() {
        return firstNumberTf;
    }

    public RemoteWebElement getSecondNumberTf() {
        return secondNumberTf;
    }

    public RemoteWebElement getSumBtn() {
        return sumBtn;
    }

    public RemoteWebElement getSubtractBtn() {
        return subtractBtn;
    }

    public RemoteWebElement getMultiplyBtn() {
        return multiplyBtn;
    }

    public RemoteWebElement getDivideBtn() {
        return divideBtn;
    }
}
