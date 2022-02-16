package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2  {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("title of the page: " + title);
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text : " + idLocator.getText());


        WebElement classNameLocator = driver.findElement(By.className("green"));
        System.out.println("Text present: " + classNameLocator.getText());
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text is" + cssLocator.getText());
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text is " + linkTextLocator.getText());
        driver.close();
    }
}