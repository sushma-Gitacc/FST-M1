package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        firstName.sendKeys("sushma");
        lastName.sendKeys("chinta");
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("sushma@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//textarea")).sendKeys("Description");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        driver.close();
    }
}