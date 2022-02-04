import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("Sachin");
        driver.findElement((By.name("Password"))).sendKeys("achins");
        String ActualValue = driver.findElement(By.name("Password")).getAttribute("value");
        String Actualvalue = driver.findElement(By.name("email")).getAttribute("value");
        System.out.println(ActualValue);
        System.out.println(Actualvalue);
    }
}
