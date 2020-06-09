package action;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import object.CalculatorObject;
import org.openqa.selenium.Keys;

public class CalculatorAction extends CalculatorObject {


    public CalculatorAction(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public Boolean fillUpFirstNumberFt(Integer number) {
        getFirstNumberTf().click();
        getFirstNumberTf().clear();
        getDriver().getKeyboard().sendKeys(number.toString());
        return true;
    }

    public Boolean fillUpSecondNumberFt(Integer number) {
        getSecondNumberTf().click();
        getSecondNumberTf().clear();
        getDriver().getKeyboard().sendKeys(number.toString());
        return true;
    }

    public Boolean clickSumBtn(){
        getSumBtn().click();
        return true;
    }

    public Boolean clickSubtractBtn() {
        getSubtractBtn().click();
        return true;
    }

    public Boolean clickMultiplyBtn() {
        getMultiplyBtn().click();
        return true;
    }

    public Boolean clickDivideBtn() {
        getDivideBtn().click();
        return true;
    }

    public Integer getResult() {
        return Integer.parseInt(getResultTxt().getText());
    }

    public Boolean closeKeyboard() {
        getDriver().getKeyboard().pressKey(Keys.RETURN);
        return true;
    }

    public Boolean quitDriver() {
        getDriver().quit();
        setDriver(null);
        return true;
    }

}
