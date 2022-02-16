package Activities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Activity1 {
    AndroidDriver<MobileElement> driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }
    @Test
    public void calculation(){
        MobileElement digit_4=driver.findElementById("digit_4");
        digit_4.click();
        MobileElement multiply=driver.findElementById("op_mul");
        multiply.click();
        MobileElement digit_6=driver.findElementById("digit_6");
        digit_6.click();
        MobileElement equlasbutton=driver.findElementById("eq");
        equlasbutton.click();
        String result = driver.findElement(MobileBy.id("result")).getText();
        System.out.println(result);

        // Assertion
        Assert.assertEquals(result, "24");
    }

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }



}
