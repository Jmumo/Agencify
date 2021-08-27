package Agencify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Login extends Base {
    @Test
    public void LoginWithNoEmail() throws IOException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.SigninButton.click();
        loginPageObjects.PasswordTextBox.sendKeys("turnkey123");
        loginPageObjects.LoginButton.click();
        String NoPassWordError = loginPageObjects.PaaswordError.getText();
        Assert.assertEquals(NoPassWordError,"Doesn't look like an email");
        startserver().stop();
    }

    @Test
    public void LoginWithNoPassword() throws IOException, InterruptedException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.SigninButton.click();
        loginPageObjects.EmailTextBox.sendKeys("agencify@agent.com");
        loginPageObjects.LoginButton.click();

        startserver().stop();
    }


    @Test
    public void Login() throws IOException, InterruptedException {
        startserver();
        AndroidDriver<AndroidElement> driver = capabilities("Agencify");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.SigninButton.click();
        loginPageObjects.EmailTextBox.sendKeys("agencify@agent.com");
        loginPageObjects.PasswordTextBox.sendKeys("turnkey123");
        loginPageObjects.LoginButton.click();
        loginPageObjects.ProfileButton.click();
        loginPageObjects.LogoutButton.click();
        startserver().stop();
    }
}
