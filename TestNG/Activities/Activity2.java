package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    WebElement btn;
    @BeforeClass
    public void driver_instance(){
        driver= new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void get_title(){
String title=driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }
    @Test
    public void click_btn() {
        btn = driver.findElement(By.cssSelector(".ui.black.button"));
        Assert.assertTrue(btn.isDisplayed());
        Assert.assertEquals(btn.getText(), "Black");

    }

    @Test(enabled = false)
    public void testCase3() {
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
    @AfterClass
    public void close(){

        driver.close();
    }
}
