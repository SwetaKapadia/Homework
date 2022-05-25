package HomeworkWeek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mital Kapadia\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.tesco.com/");
    }
}
