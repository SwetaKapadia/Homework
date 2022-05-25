package HomeworkWeek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Mital Kapadia\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.tesco.com/");
}}
