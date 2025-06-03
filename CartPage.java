package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {
 WebDriver driver;
 By cartLink = By.id("cartur");
 By placeOrderButton = By.xpath("//*[@id='page-wrapper']//button[text()='Place Order']");
 public CartPage(WebDriver driver) {
 this.driver = driver;
 }
 public void goToCart() {
 driver.findElement(cartLink).click();
 }
 public void clickPlaceOrder() {
 driver.findElement(placeOrderButton).click();
 }
}
