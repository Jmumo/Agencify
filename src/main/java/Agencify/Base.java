package Agencify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static AndroidDriver<AndroidElement> driver;
    public static AppiumDriverLocalService service;

    public static AndroidDriver<AndroidElement> capabilities(String Apk) throws IOException {

//        AppiumDriverLocalService service=null;
        String FileInput = System.getProperty("user.dir");
//        FileInputStream properties = new FileInputStream(FileInput.concat("/src/main/java"));
        FileInputStream properties = new FileInputStream("src/main/java/Agencify/global.properties");
        Properties props = new Properties();
        props.load(properties);
//        "src/main/java/Agencify/global.properties"

        service = AppiumDriverLocalService.buildDefaultService();
        File appDir = new File("src");
        File file = new File(appDir, (String) props.get(Apk));
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, props.get("device"));
        cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//        service.start();
        driver = new AndroidDriver<>(cap);

        return driver;
    }

    public AppiumDriverLocalService startserver() {
        service = AppiumDriverLocalService.buildDefaultService();
        if (service.isRunning()) {
            return service;
        }
        service.start();
        return service;
    }


    public static void getScreenShot(String s) throws IOException
    {
        File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir").concat("/Screenshots")+"\\"+s+".png"));
    }

    @BeforeTest
    public void killNodes() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("taskkill /F /IM node.exec");
        Thread.sleep(4000);
    }

}
