package Agencify;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Ecommerce_tc_2 extends Base {
    @Test
    public void test() throws IOException, InterruptedException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("AppName");

        PageObjects page = new PageObjects(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page.InputBox.sendKeys("hello");
        driver.hideKeyboard();
        page.RadioButton.click();
        page.DropButton.click();
        Utilities scroll = new Utilities(driver);
        scroll.ScrollView("Kenya");
//        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Kenya\"));");
        driver.findElementByAndroidUIAutomator("text(\"Kenya\")").click();
        page.ShopButton.click();

        driver.findElementsByXPath("//*[@text = 'ADD TO CART']").get(0).click();
        driver.findElementsByXPath("//*[@text = 'ADD TO CART']").get(0).click();
        page.ShoppingCart.click();
        Thread.sleep(4000);
       int Count = driver.findElementsById("com.androidsample.generalstore:id/productPrice").size();
        Double sum = 0.0;
       for (int i = 0;i<Count;i++ ){
          String Amount_of_FinalProduct = driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(i).getText();
          Double Amount_Final = Double.parseDouble(Amount_of_FinalProduct.substring(1));
          sum = sum + Amount_Final;
      }
         String FinalProductPrice = page.FinalProductPrice.getText();
         Double FinalProductPrice1 =Double.parseDouble(FinalProductPrice.substring(1));
        Assert.assertEquals(FinalProductPrice1,sum);

        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(driver.findElementByClassName("android.widget.CheckBox")))).perform();

        page.VisitWebsite.click();
        startserver().stop();

}
}