package Agencify;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class My_Clients extends Base{
    @Test
    public void creatIndividualClient() throws IOException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        My_ClientsPageObjects MyclientsPageObjects = new My_ClientsPageObjects(driver);
        Utilities Tap = new Utilities(driver);
        MyclientsPageObjects.SigninButton.click();
        MyclientsPageObjects.EmailTextBox.sendKeys("agencify@agent.com");
        MyclientsPageObjects.PasswordTextBox.sendKeys("turnkey123");
        MyclientsPageObjects.LoginButton.click();
        MyclientsPageObjects.My_ClientsButton.click();
        Thread.sleep(10000);
        MyclientsPageObjects.ClassTrial.click();
        MyclientsPageObjects.CreateClientOption.click();
        MyclientsPageObjects.ClientType.click();
        Integer Text = driver.findElementsById("com.turnkeyafrica.agencify:id/name").size();
        System.out.println(Text);
        startserver().stop();


    }
}
