package HomeworkWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mital Kapadia\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("t1e2s3t4");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
}
