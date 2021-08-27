package Agencify;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SignUp extends Base {

    @Test
    public void SignUpWithNoEmail() throws IOException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SignUpPageObjects PageObjects = new SignUpPageObjects(driver);
        PageObjects.SignUpButton.click();
        PageObjects.MobileNumberInputBox.sendKeys("0710595143");
        PageObjects.PasswordInputBox.sendKeys("33608681");
        Utilities Tap = new Utilities(driver);
        Tap.TapOptionsById("com.turnkeyafrica.agencify:id/checkBox");
        PageObjects.JoinNowButton.click();
        String EmailError = PageObjects.EmailError.getText();
        System.out.println(EmailError);
        Assert.assertEquals(EmailError,"Doesn't look like an email");
        startserver().stop();
    }

    @Test
    public void SignUpWithNoPhnNo() throws IOException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SignUpPageObjects PageObjects = new SignUpPageObjects(driver);
        PageObjects.SignUpButton.click();
        PageObjects.EmailInputBox.sendKeys("john.mumo@turnkeyafrica.com");
        PageObjects.PasswordInputBox.sendKeys("33608681");
        Utilities Tap = new Utilities(driver);
        Tap.TapOptionsById("com.turnkeyafrica.agencify:id/checkBox");
        PageObjects.JoinNowButton.click();
        String MobileError = PageObjects.MobileError.getText();
        Assert.assertEquals(MobileError,"Invalid mobile number");
        startserver().stop();
    }
    @Test
    public void SignUpWithNopassword() throws IOException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SignUpPageObjects PageObjects = new SignUpPageObjects(driver);
        PageObjects.SignUpButton.click();
        PageObjects.EmailInputBox.sendKeys("john.mumo@turnkeyafrica.com");
        PageObjects.MobileNumberInputBox.sendKeys("0710595143");
        Utilities Tap = new Utilities(driver);
        Tap.TapOptionsById("com.turnkeyafrica.agencify:id/checkBox");
        PageObjects.JoinNowButton.click();
        String PasswordError = PageObjects.PasswordError.getText();
        Assert.assertEquals(PasswordError, "Password must not be empty");
        startserver().stop();
    }

    @Test
    public void SignUpWithNoCheckBoxClicked() throws IOException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SignUpPageObjects PageObjects = new SignUpPageObjects(driver);
        PageObjects.SignUpButton.click();
        PageObjects.EmailInputBox.sendKeys("john.mumo@turnkeyafrica.com");
        PageObjects.MobileNumberInputBox.sendKeys("0710595143");
        PageObjects.PasswordInputBox.sendKeys("33608681");
        PageObjects.JoinNowButton.click();
        String CheckBoxToastError = PageObjects.CheckboxToast.getAttribute("name");
        Assert.assertEquals(CheckBoxToastError, "Please accept terms and privacy policy");
        startserver().stop();
    }
    @Test
    public void SignUpWithWithShortPassWord() throws IOException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SignUpPageObjects PageObjects = new SignUpPageObjects(driver);
        PageObjects.SignUpButton.click();
        PageObjects.EmailInputBox.sendKeys("john.mumo@turnkeyafrica.com");
        PageObjects.MobileNumberInputBox.sendKeys("0710595143");
        PageObjects.PasswordInputBox.sendKeys("3360");
        Utilities Tap = new Utilities(driver);
        Tap.TapOptionsById("com.turnkeyafrica.agencify:id/checkBox");
        PageObjects.JoinNowButton.click();
        String ShortPasswordError = PageObjects.ShortPasswordError.getText();
        Assert.assertEquals(ShortPasswordError, "Password must be at least 8 characters");
        startserver().stop();
    }


    }
