package Activities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
public class Activity2 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 20);
    }
    @Test
    public void aboutUs() throws InterruptedException {
        driver.get("https://www.training-support.net/");

        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));
        String pageTitle = driver
                .findElementByXPath("//android.view.View[@text='Training Support']")
                .getText();
        System.out.println("Title on Homepage: " + pageTitle);
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[@text='About Us']")));
        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@text='About Us']");
        aboutButton.click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(
               MobileBy.xpath("//android.view.View[@text='About Us']")));

        String newPageTitle = driver
                .findElementByXPath("//android.view.View[@text='About Us']")
                .getText();
        System.out.println("Title on new page: " + newPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    }

}
