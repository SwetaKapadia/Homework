package HomeworkWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Mital Kapadia\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
}
