package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegistrationPage {
 WebDriver driver;
 By username = By.id("sign-username");
 By password = By.id("sign-password");
 By signUpButton = By.xpath("//*[@id='signInModal']//button[text()='Sign up']");
 public RegistrationPage(WebDriver driver) {
 this.driver = driver;
 }
 public void register(String user, String pass) {
 driver.findElement(username).sendKeys(user);
 driver.findElement(password).sendKeys(pass);
 driver.findElement(signUpButton).click();
 }
}