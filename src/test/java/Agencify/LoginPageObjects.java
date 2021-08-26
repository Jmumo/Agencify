package Agencify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

    public LoginPageObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//*[@text = 'Email']")
    public AndroidElement EmailTextBox;

    @FindBy(xpath = "//*[@text = 'Password']")
    public AndroidElement PasswordTextBox;

    @FindBy(id = "com.turnkeyafrica.agencify:id/btn_sign_in")
    public AndroidElement LoginButton;

    @FindBy(id = "com.turnkeyafrica.agencify:id/profileImage")
    public AndroidElement ProfileButton;

    @FindBy(className = "android.view.View")
    public AndroidElement LogoutButton;

    @FindBy(xpath = "//*[@text = 'Login']")
    public  AndroidElement SigninButton;

}
