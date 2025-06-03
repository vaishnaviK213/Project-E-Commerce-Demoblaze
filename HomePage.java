package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
 WebDriver driver;
 By signUp = By.id("signin2");
 By login = By.id("login2");
 By phoneCategory = By.xpath("//*[@id='itemc' and text()='Phones']");
 By laptopCategory = By.xpath("//a[text()='Laptops']");
 By monitorCategory = By.xpath("//a[text()='Monitors']");
 public HomePage(WebDriver driver) {
 this.driver = driver;
 }
 public void clickSignUp() {
 driver.findElement(signUp).click();
 }
public void clickLogin() {
 driver.findElement(login).click();
 }
 public void navigateToPhones() {
 driver.findElement(phoneCategory).click();
 }
 public void navigateToLaptops() {
 driver.findElement(laptopCategory).click();
 }
 public void navigateToMonitors() {
 driver.findElement(monitorCategory).click();
 }
}