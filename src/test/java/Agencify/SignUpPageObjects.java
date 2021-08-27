package Agencify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObjects {
    public SignUpPageObjects(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath = "//*[@text = 'Join now']")
    public  AndroidElement SignUpButton;

    @FindBy(id = "com.turnkeyafrica.agencify:id/customerEmailAddress")
    public AndroidElement EmailInputBox;

    @FindBy(id = "com.turnkeyafrica.agencify:id/customerMobileNo")
    public AndroidElement MobileNumberInputBox;

    @FindBy(id = "com.turnkeyafrica.agencify:id/password")
    public  AndroidElement PasswordInputBox;

    @FindBy(id = "com.turnkeyafrica.agencify:id/text_input_end_icon")
    public AndroidElement SeePasswordButton;

    @FindBy(id = "com.turnkeyafrica.agencify:id/checkBox")
    public AndroidElement TermsCheckbox;

    @FindBy(id = "com.turnkeyafrica.agencify:id/btn_sign_up")
    public AndroidElement JoinNowButton;

    @FindBy(id = "com.turnkeyafrica.agencify:id/textinput_error")
    public AndroidElement EmailError;

    @FindBy(id = "com.turnkeyafrica.agencify:id/textinput_error")
    public AndroidElement MobileError;

    @FindBy(id = "com.turnkeyafrica.agencify:id/textinput_error")
    public AndroidElement ShortPasswordError;

    @FindBy(id = "com.turnkeyafrica.agencify:id/textinput_error")
    public AndroidElement PasswordError;

    @FindBy(xpath = "//android.widget.Toast")
    public AndroidElement CheckboxToast;

}
