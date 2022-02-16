package Activities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_1 {

        public static void main(String[] args) {


            WebDriver driver = new FirefoxDriver();


            driver.get("https://www.training-support.net");
System.out.println("opened the website");

            driver.close();
        }

    }


