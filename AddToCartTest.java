package tests;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import pages.*;
import utils.BaseTest;
public class AddToCartTest extends BaseTest {
 public static void main(String[] args) throws InterruptedException, IOException {
 AddToCartTest test = new AddToCartTest();
 test.setup();
 HomePage home = new HomePage(test.driver);
 ProductPage product = new ProductPage(test.driver);
 CartPage cart = new CartPage(test.driver);
 CheckoutPage checkout = new CheckoutPage(test.driver);
 Thread.sleep(3000);
 home.navigateToPhones();
 Thread.sleep(3000);
 product.clickFirstProduct();
 Thread.sleep(3000);
 product.clickAddToCart();
 Thread.sleep(3000);
 Alert alert = test.driver.switchTo().alert();
 alert.accept();
 cart.goToCart();
 Thread.sleep(3000);
 cart.clickPlaceOrder();
 Thread.sleep(3000);
 checkout.fillCheckoutDetails("Shreyalii", "India", "Mumbai", "12345678910abc", 
"January", "2024");
 checkout.clickPurchase();
 // Screenshot
 File screenshot = ((TakesScreenshot) test.driver).getScreenshotAs(OutputType.FILE);
 FileHandler.copy(screenshot, new File("FinalOkScreenshot.jpeg"));
 System.out.println("Screenshot Captured");
 test.tearDown();
 }
}