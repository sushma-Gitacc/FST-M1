package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
        System.out.println("Title : " + driver.getTitle());
        driver.close();

    }

}
