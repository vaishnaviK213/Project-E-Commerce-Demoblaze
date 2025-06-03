package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckoutPage {
 WebDriver driver;
 By name = By.id("name");
 By country = By.id("country");
 By city = By.id("city");
 By creditCard = By.id("card");
 By month = By.id("month");
 By year = By.id("year");
 By purchaseButton = By.xpath("//*[@id='orderModal']//button[text()='Purchase']");
 public CheckoutPage(WebDriver driver) {
 this.driver = driver;
 }
 public void fillCheckoutDetails(String n, String c, String ci, String card, String m, String y) {
 driver.findElement(name).sendKeys(n);
 driver.findElement(country).sendKeys(c);
 driver.findElement(city).sendKeys(ci);
 driver.findElement(creditCard).sendKeys(card);
 driver.findElement(month).sendKeys(m);
 driver.findElement(year).sendKeys(y);
 }
 public void clickPurchase() {
 driver.findElement(purchaseButton).click();
 }
}
