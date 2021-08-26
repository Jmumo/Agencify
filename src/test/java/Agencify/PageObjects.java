package Agencify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
    public PageObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(id = "com.androidsample.generalstore:id/nameField")
    public AndroidElement InputBox;
    @FindBy(id = "com.androidsample.generalstore:id/radioFemale")
    public AndroidElement RadioButton;
    @FindBy(id = "android:id/text1")
    public AndroidElement DropButton;
    @FindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public AndroidElement ShopButton;
    @FindBy(id = "com.androidsample.generalstore:id/rvProductList")
    public AndroidElement ShoppingList;
    @FindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    public AndroidElement ShoppingCart;
    @FindBy(id = "com.androidsample.generalstore:id/productName")
    public AndroidElement FinalProduct;
    @FindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
    public  AndroidElement FinalProductPrice;
    @FindBy(className = "android.widget.Button")
    public AndroidElement VisitWebsite;
//    @FindBy(xpath = "")


}
