import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        Properties prop = new Properties();
        FileInputStream fl = new FileInputStream("C:\\Users\\Sachin Agnihotri\\ideaProjects\\Maven_TestNG\\Testdata.properties");
        prop.load(fl);
        System.out.println(prop.getProperty("url"));
        String vURL = prop.getProperty("url");
        String vusername = prop.getProperty("username");
        driver.get(vURL);
        driver.findElement(By.name("email")).sendKeys(vusername);

    }
}
