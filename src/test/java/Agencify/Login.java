package Agencify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Login extends Base {
    @Test
    public void Login() throws IOException, InterruptedException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);


//        driver.findElementsByClassName("android.view.View").get(3).click();
        loginPageObjects.SigninButton.click();
        loginPageObjects.EmailTextBox.sendKeys("nicholas.muratha@turnkeyafrica.com");
        loginPageObjects.PasswordTextBox.sendKeys("Online123!@#");
        loginPageObjects.LoginButton.click();
        loginPageObjects.ProfileButton.click();
        loginPageObjects.LogoutButton.click();


        startserver().stop();
    }
}
