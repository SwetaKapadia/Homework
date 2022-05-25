package HomeworkWeek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mital Kapadia\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tesco.com/");
    }
}
