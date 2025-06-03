package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest {
 protected WebDriver driver;
 public void setup() {
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.demoblaze.com/");
 }
 public void tearDown() {
 if (driver != null) {
 driver.quit();
 }
 }
}