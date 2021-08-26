package Agencify;

import io.appium.java_client.android.AndroidDriver;

public class Utilities {
    AndroidDriver driver;

    public Utilities(AndroidDriver driver) {
        this.driver = driver;
    }

    public void ScrollView(String Text) {
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + Text + "\"));");
    }
}
