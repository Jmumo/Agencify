package Agencify;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Utilities {
    AndroidDriver driver;

    public Utilities(AndroidDriver driver) {
        this.driver = driver;
    }

    public void ScrollView(String Text) {
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + Text + "\"));");
    }
    public void TapOptionsById(String Text){
        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(driver.findElementById(Text)))).perform();
    }
}
