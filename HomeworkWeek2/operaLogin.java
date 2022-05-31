package HomeworkWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class operaLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver","C:\\Users\\Mital Kapadia\\IdeaProjects\\Software\\Driver\\operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com");
        Thread.sleep(5000);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("t1e2s3t4");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
}
