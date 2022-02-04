import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ScrollupandDown {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js =(JavascriptExecutor)driver;
        Thread.sleep(3000);
        js.executeScript("window.scollTo(0,300");
        Thread.sleep(3000);
        js.executeScript("window.scollTo(0,document.body.scrollHeight)");
    }
}
