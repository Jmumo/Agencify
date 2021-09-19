package Agencify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_ClientsPageObjects {
    public My_ClientsPageObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @FindBy(id = "com.turnkeyafrica.agencify:id/myClientsFragment")
    public AndroidElement My_ClientsButton;
    @FindBy(xpath = "//*[@text = 'Login']")
    public  AndroidElement SigninButton;
    @FindBy(xpath = "//*[@text = 'Email']")
    public AndroidElement EmailTextBox;
    @FindBy(xpath = "//*[@text = 'Password']")
    public AndroidElement PasswordTextBox;
    @FindBy(id = "com.turnkeyafrica.agencify:id/btn_sign_in")
    public AndroidElement LoginButton;
    @FindBy(id = "com.turnkeyafrica.agencify:id/fab")
    public AndroidElement CTAClientButton;
    @FindBy(xpath = "//*[@text = 'Create Client']")
    public AndroidElement CreateClientOption;
    @FindBy(id = "com.turnkeyafrica.agencify:id/text_input_end_icon")
    public AndroidElement ClientTypeDropDown;
    @FindBy(className = "android.widget.ImageButton")
    public AndroidElement ClassTrial;
    @FindBy(id = "com.turnkeyafrica.agencify:id/clientType")
    AndroidElement ClientType;
    @FindBy(id = "com.turnkeyafrica.agencify:id/name")
    AndroidElement CorporateClient;


}
