import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("D:/WbTable.html");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.xpath("/html/body/table/tr[4]/td[1]")).getText());
    }
}
